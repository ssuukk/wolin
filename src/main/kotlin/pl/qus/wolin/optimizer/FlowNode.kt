package pl.qus.wolin.pl.qus.wolin.optimizer

import org.antlr.v4.runtime.ParserRuleContext
import pl.qus.wolin.WolinStateObject
import pl.qus.wolin.components.FieldType
import tornadofx.urlEncoded

class DestPair(
    var node: FlowNode,
    var ref: String
)

{
    override fun toString(): String {
        return "${ref?:""}${node.contents?.getUid()}"
    }
}
class FlowNode (
    var contents: ParserRuleContext? = null,

    var incomingLeft: DestPair? = null,
    var incomingRight: DestPair? = null,
    var goesInto: MutableList<DestPair> = mutableListOf(),

    var referenced: Boolean = false,
    var opcode: String = "",
    var nodeNum: Int = 0,
    var type: Type = Type.NODE,
    var redundant: Boolean = false
) {
    enum class Type {ENTRY, EXIT, NODE}

    val isSimple get() = incomingRight == null
    val isNode get() = type == Type.NODE
    val isNotEntry get() = type != Type.ENTRY
    val isNotExit get() = type != Type.EXIT
    val isEntry get() = type == Type.ENTRY
    val leftIsComplex get() = incomingLeft?.node?.incomingLeft != null && incomingLeft?.node?.incomingRight != null
    val rightIsComplex get() = incomingRight?.node?.incomingLeft != null && incomingRight?.node?.incomingRight != null
    val uid get() = contents?.getUid()
    val goesIntoOne get(): Boolean = goesInto.count { it.ref == ""} == 1


    fun replaceWith(better: DestPair, all: MutableList<FlowNode>) {
        if(incomingRight != null)
            throw java.lang.Exception("Can't replace complex reg")

        val inRef = incomingLeft?.ref
        val outRef = goesInto.firstOrNull()?.ref

        // szukamy teraz rejestrów, które szły do redundant
        all.filter { it.goesInto.any { it.node == this } /*&& it != better.node*/ }.forEach { inputToRedundant ->
            inputToRedundant.goesInto.filter { it.node == this }.forEach {
                // teraz idą do lepszego
                val goesInto = this.goesInto.firstOrNull()?.node
                if(goesInto != null) {
                    it.node = goesInto
                    it.ref = combineRefs(inRef ?: "", outRef ?: "")
                }
            }
        }

        // szukamy rejestrów, które miały redundant za źródło
        all.filter { it.incomingLeft?.node == this }.forEach {
            // teraz mają better za źródło
            it.incomingLeft?.node = better.node
            it.incomingLeft?.ref = combineRefs(inRef ?: "", outRef ?: "")
        }

        all.filter { it.incomingRight?.node == this }.forEach {
            // teraz mają better za źródło
            it.incomingRight?.node = better.node
            it.incomingRight?.ref = combineRefs(inRef ?: "", outRef ?: "")
        }

        redundant = true
    }

    fun revReplaceWith(better: DestPair, all: MutableList<FlowNode>) {
        // skopiować przychodzące
        better.node.incomingLeft = incomingLeft
        better.node.incomingRight = incomingRight

        
        val fromRedundantRef = this.goesInto.first().ref

        val leftToRedundantRef = this.incomingLeft?.ref
        val rightToRedundantRef = this.incomingRight?.ref

        // szukamy teraz rejestrów, które szły do redundant
        all.filter { it.goesInto.any { it.node == this } && it != better.node }.forEach { inputToRedundant ->
            inputToRedundant.goesInto.filter { it.node == this }.forEach {
                // teraz idą do lepszego
                it.node = better.node
            }
        }

        better.node.incomingLeft?.ref = combineRefs(fromRedundantRef, leftToRedundantRef ?: "")
        better.node.incomingRight?.ref = combineRefs(fromRedundantRef, rightToRedundantRef ?: "")

        better.node.incomingLeft?.node?.goesInto?.firstOrNull { it.node.uid == better.node.uid }?.let {
            it.ref = better.node.incomingLeft?.ref ?: ""
        }

        better.node.incomingRight?.node?.goesInto?.firstOrNull { it.node.uid == better.node.uid }?.let {
            it.ref = better.node.incomingRight?.ref ?: ""
        }


        redundant = true
    }

    private fun combineRefs(inRef: String, outRef: String): String {
        return if(inRef == ""  && outRef == "")
            ""
        else if(inRef == "&" && outRef == "*")
            ""
        else if(inRef == "*" && outRef == "&")
            ""
        else if(inRef != "" && outRef == "")
            inRef
        else if(outRef != "" && inRef == "")
            outRef
        else
            throw Exception("Podwojna referenca/dereferencja")
    }

    override fun toString(): String {
        return "'${contents!!.getUid()}' ${type.name} re'd=$referenced ${contents?.text} <- ${incomingLeft?.node?.contents?.text} + ${incomingRight?.node?.contents?.text}"
    }

    fun walkDownToSource(finalState: WolinStateObject) {

        val leftKnowsAboutMe = incomingLeft?.node?.goesInto?.any {
            it.node.contents!!.getUid() == this.contents!!.getUid()
        }

        if(leftKnowsAboutMe != true) {
            val toMe = DestPair(this, this.incomingLeft?.ref ?: "")
            incomingLeft?.node?.goesInto?.add(toMe)
        }

        val rightKnowsAboutMe = incomingRight?.node?.goesInto?.any {
            it.node.contents!!.getUid() == this.contents!!.getUid()
        }

        if(rightKnowsAboutMe != true) {
            val toMe = DestPair(this, this.incomingRight?.ref ?: "")
            incomingRight?.node?.goesInto?.add(toMe)
        }

        val meInVariablary = finalState.variablary.values.firstOrNull { it.name == this.contents!!.getUid() }

//        if(incomingLeft != null) {
//            type = Type.NODE
//        }

        if(contents?.text?.contains("__returnValue") == true) {
            type = Type.EXIT
        }

        if(meInVariablary?.fieldType == FieldType.ARGUMENT) {
            type = Type.ENTRY
        }

        if(incomingLeft == null && incomingRight == null) {
            type = Type.ENTRY
        } else {
            incomingLeft!!.node.walkDownToSource(finalState)
            incomingRight?.node?.walkDownToSource(finalState)
        }
    }
}


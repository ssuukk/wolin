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

    val hasOneInput get() = incomingRight == null
    val isNode get() = type == Type.NODE
    val isNotEntry get() = type != Type.ENTRY
    val isNotExit get() = type != Type.EXIT
    val isEntry get() = type == Type.ENTRY
    val leftIsComplex get() = incomingLeft?.node?.incomingLeft != null && incomingLeft?.node?.incomingRight != null
    val rightIsComplex get() = incomingRight?.node?.incomingLeft != null && incomingRight?.node?.incomingRight != null
    val uid get() = contents?.getUid()
    val goesIntoOne get(): Boolean = goesInto.count { it.ref == ""} == 1


    fun replaceWith(better: DestPair, all: MutableList<FlowNode>, isMutable: Boolean) {
        if(incomingRight != null)
            throw java.lang.Exception("Can't replace complex reg")

        val inRef = incomingLeft?.ref
        val outRef = goesInto.firstOrNull()?.ref

        // szukamy teraz rejestrów, które szły do redundant
        all.filter { it.goesInto.any { it.node.uid == this.uid } /*&& it != better.node*/ }.forEach { comingToRedundant ->
            // usuwamy z nich, że szły do redundant:
            comingToRedundant.goesInto.removeIf { it.node.uid == this.uid }
            if(comingToRedundant.uid == better.node.uid) {
                // 1. jeżeli comingToRedundant == better, to dodajemy do niego:
                comingToRedundant.goesInto.addAll(this.goesInto)
            } else {
                // 2. else comingToRedundant.goesInto = better
                comingToRedundant.goesInto = mutableListOf(better)
            }
        }

        // szukamy rejestrów, które miały redundant za źródło
        all.filter { it.incomingLeft?.node?.uid == this.uid }.forEach {
            // teraz mają better za źródło
            it.incomingLeft?.node = better.node
            it.incomingLeft?.ref = combineRefs(inRef ?: "", outRef ?: "")
        }
        all.filter { it.incomingRight?.node?.uid == this.uid }.forEach {
            // teraz mają better za źródło
            it.incomingRight?.node = better.node
            it.incomingRight?.ref = combineRefs(inRef ?: "", outRef ?: "")
        }

        redundant = true
    }

    fun revReplaceWith(better: DestPair, all: MutableList<FlowNode>, isMutable: Boolean): ReplacementPair {
        // skopiować przychodzące

        // TODO jeżeli mutable - utworzyć nowe entry
        better.node.incomingLeft = incomingLeft
        better.node.incomingRight = incomingRight

        val fromRedundantRef = this.goesInto.first().ref

        val leftToRedundantRef = this.incomingLeft?.ref
        val rightToRedundantRef = this.incomingRight?.ref

        // szukamy teraz rejestrów, które szły do redundant
        all.filter { it.goesInto.any { it.node.uid == this.uid } && it != better.node }.forEach { inputToRedundant ->
            inputToRedundant.goesInto.filter { it.node.uid == this.uid }.forEach {
                // teraz idą do lepszego
                it.node = better.node
            }
        }

        // jeżeli this goes into better...

        val finalBetter = if(isMutable) {
            val new = FlowNode(contents = better.node.contents).apply {
                all.add(this)
            }

            new.incomingLeft = this.incomingLeft
            new.incomingRight = this.incomingRight
            new.goesInto = better.node.goesInto

            new
        } else {

            better.node.incomingLeft?.ref = combineRefs(fromRedundantRef, leftToRedundantRef ?: "")

            better.node.incomingRight?.ref = combineRefs(fromRedundantRef, rightToRedundantRef ?: "")

            better.node.incomingLeft?.node?.goesInto?.firstOrNull { it.node.uid == better.node.uid }?.let {
                it.ref = better.node.incomingLeft?.ref ?: ""
            }

            better.node.incomingRight?.node?.goesInto?.firstOrNull { it.node.uid == better.node.uid }?.let {
                it.ref = better.node.incomingRight?.ref ?: ""
            }

            better.node
        }

        redundant = true

        return ReplacementPair(this, finalBetter)
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
            throw Exception("Podwojna referenca/dereferencja in=$inRef out=$outRef")
    }

    override fun toString(): String {
        return "${goesInto.size} <- ${contents!!.getUid()} ${type.name} <- ${incomingLeft?.node?.uid} + ${incomingRight?.node?.uid}"
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


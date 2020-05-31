package pl.qus.wolin.pl.qus.wolin.optimizer

import org.antlr.v4.runtime.ParserRuleContext

class FlowNode (
    //var thiz: Register? = null,
    var left: FlowNode? = null,
    var right: FlowNode? = null,
    var leftRef: String = "",
    var rightRef: String = "",
    var canBeRemoved: Boolean = false,
    var contents: ParserRuleContext? = null
) {
    val hasNoSources get() = left == null
    val leftAggregates get() = left?.left != null && left?.right != null
    val rightAggregates get() = right?.left != null && right?.right != null

    override fun toString(): String {
        return "${contents?.text} <- ${left?.contents?.text} + ${right?.contents?.text}"
    }

    fun deepLeft(): FlowNode? {
        return when {
            hasNoSources -> {
                canBeRemoved = false
                this // tylko źródłowy nołd nie ma src
            }
            leftRef != "" -> {
                canBeRemoved = false
                left // jest referencja, nie da się
            }
            leftAggregates -> {
                left?.canBeRemoved = false
                left // koniec, powyżej nołd agregujący
            }
            else -> {
                canBeRemoved = true
                left!!.deepLeft()
            }
        }
    }

    fun deepRight(): FlowNode? {
        return when {
            hasNoSources -> {
                canBeRemoved = false
                this // tylko źródłowy nołd nie ma src
            }
            rightRef != "" -> {
                canBeRemoved = false
                left // jest referencja, nie da się
            }
            rightAggregates -> {
                right?.canBeRemoved = false
                right // koniec, powyżej nołd agregujący
            }
            right == null -> {
                null
            }
            else -> {
                canBeRemoved = true
                right!!.deepLeft()
            }
        }
    }

}


fun testTree() {
//    val what = FlowNode(Register(name="what"), null, null)
//    val imm0 = FlowNode(Register(name="#0"), null, null)
//    val r3 = FlowNode(Register(name="r3"), what, null)
//    val r4 = FlowNode(Register(name="r4"), imm0, null)
//    val r2 = FlowNode(Register(name="r2"), r3, r4)
//    val r1 = FlowNode(Register(name="r1"), r2, null)
//    val ret = FlowNode(Register(name="ret"), r1, null, "&")
//
//    val regs = listOf(what, imm0, r3, r4, r2, r1, ret)
//
//    val lewyDlaR2 = r2.deepLeft()
//    val prawyDlaR2 = r2.deepRight() //
//    val dlaRet = ret.deepLeft() // argument można zastąpić...
//    val dlaR1 = r1.deepLeft() // r1 można zastąpić...
//
//    regs.filter { it.thiz?.canBeRemoved == true }.forEach {
//        println("Mozna usunac: ${it.thiz?.name}, zastępując jego wystąpienia: ${it.deepLeft()?.thiz?.name}")
//    }
//
//    println("tu!")
}
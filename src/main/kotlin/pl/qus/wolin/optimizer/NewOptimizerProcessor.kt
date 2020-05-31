package pl.qus.wolin.pl.qus.wolin.optimizer

import org.antlr.v4.runtime.ParserRuleContext
import pl.qus.wolin.PseudoAsmParser

class NewOptimizerProcessor {
    val newRegs = HashMap<String,FlowNode>()

    fun findRednundantRegs(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        println("== looking for registers ==")
        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val template = linie.next()

                val target = template.target(0)
                val left = template.arg(0)
                val right = template.arg(1)

                if(target!=null) {
                    var leftRef = ""
                    var rightRef = ""
                    val leftNode = if(left==null) null
                    else if(!newRegs.containsKey(left.getUid())) {
                        leftRef = left.operand().referencer()?.firstOrNull()?.text ?: ""
                        val new = FlowNode(left = null, right = null, contents = left, canBeRemoved = false)
                        newRegs[left.getUid()] = new
                        new
                    }
                    else newRegs[left.getUid()]

                    val rightNode = if(right==null) null
                    else if(!newRegs.containsKey(right.getUid())) {
                        rightRef = right.operand().referencer()?.firstOrNull()?.text ?: ""
                        val new = FlowNode(left = null, right = null, contents = right, leftRef = leftRef, rightRef = rightRef)
                        newRegs[right.getUid()] = new
                        new
                    }
                    else newRegs[right.getUid()]
                    if(!newRegs.containsKey(target.getUid())) {
                        newRegs[target.getUid()] = FlowNode(left = leftNode, right = rightNode, contents = target, canBeRemoved = false)
                    }
                }
            }
        }

        newRegs.values.forEach {
            it.deepLeft()
            it.deepRight()
        }

        newRegs.values.filter{ it.canBeRemoved }.forEach {
            it.canBeRemoved = it.contents?.isReg() ?: false
        }

        newRegs.values.filter { it.canBeRemoved }.forEach {
            println("Can be removed: ${it}")
        }
    }

}


fun ParserRuleContext.getUid(): String {
    return when(this) {
        null -> ""
        is PseudoAsmParser.TargetContext -> {
            if(this.operand().name(0)?.identifier()?.isEmpty == false)
                this.operand().name(0).identifier().text
            else if(!this.operand().value().isEmpty)
                this.operand().value().text
            else
                throw java.lang.Exception("Nie wiem, jak przerobić ${this.text}")

        }
        is PseudoAsmParser.ArgContext -> {
            if(this.operand().name(0)?.identifier()?.isEmpty == false)
                this.operand().name(0).identifier().text
            else if(!this.operand().value().isEmpty)
                this.operand().value().text
            else
                throw java.lang.Exception("Nie wiem, jak przerobić ${this.text}")
        }
        else -> throw java.lang.Exception("Nie wiem, jak to przerobić")
    }
}

private fun ParserRuleContext.isReg(): Boolean {
    return when(this) {
        is PseudoAsmParser.TargetContext -> {
            val stos = this.operand()?.value()?.addressed()?.identifier()?.simpleIdentifier(0)?.text ?: ""
            val nazwa =this.operand()?.name(0)?.identifier()?.simpleIdentifier(0)?.text ?: ""

            return stos.isNotEmpty() && nazwa.isNotEmpty()
        }
        is PseudoAsmParser.ArgContext -> {
            val stos = this.operand()?.value()?.addressed()?.identifier()?.simpleIdentifier(0)?.text ?: ""
            val nazwa =this.operand()?.name(0)?.identifier()?.simpleIdentifier(0)?.text ?: ""

            return stos.isNotEmpty() && nazwa.isNotEmpty()
        }
        else -> {
            false
        }
    }
}

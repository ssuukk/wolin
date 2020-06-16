package pl.qus.wolin.pl.qus.wolin.optimizer

import org.antlr.v4.runtime.ParserRuleContext
import pl.qus.wolin.PseudoAsmParser
import pl.qus.wolin.WolinStateObject
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStreamWriter

class ReplacementPair(
    val thiz: FlowNode,
    val withThat: FlowNode
)

class NewOptimizerProcessor(private val finalState: WolinStateObject) {
    val newRegs = mutableListOf<FlowNode>()
    val redundantRegs = mutableListOf<FlowNode>()
    val pairs = mutableListOf<ReplacementPair>()

    val nonAssignOpcodes = listOf("bne", "beq", "label", "setup", "string")

    fun buildFlowTree(
        ctx: PseudoAsmParser.PseudoAsmFileContext
    ) {
        println("== gathering registers ==")
        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val line = linie.next()

                val opcode = line.instrukcja().simpleIdentifier().text

                if (opcode == "label" || opcode == "setup" || opcode == "function")
                    continue

                val targetContext = line.target(0)
                val leftContext = line.arg(0)
                val rightContext = line.arg(1)

                val leftRef = leftContext?.operand()?.referencer()?.firstOrNull()?.text ?: ""
                val rightRef = rightContext?.operand()?.referencer()?.firstOrNull()?.text ?: ""

                val leftNode =
                    if (leftContext == null) null
                    else
                        obtain(leftContext).apply {
                            referenced = referenced || opcode != "free" && opcode != "alloc"
                            contents = leftContext
                        }

                val rightNode =
                    if (rightContext == null) null
                    else {
                        obtain(rightContext).apply {
                            referenced = true
                            contents = rightContext
                        }
                    }

                targetContext?.let { tc ->
                    val existing = newRegs.lastOrNull { it.uid == tc.getUid() }
                    existing?.referenced = true
                }

                if (targetContext != null && !nonAssignOpcodes.contains(opcode)/* && targetRef != "&"*/) {
                    obtainTarget(targetContext, opcode).apply {
                        referenced = true
                        incomingLeft = if (leftNode != null) DestPair(leftNode, leftRef) else null
                        incomingRight = if (rightNode != null) DestPair(rightNode, rightRef) else null
                        contents = targetContext
                    }
                } else if (opcode == "alloc" || opcode == "free") {
                    obtain(line.arg(0)).apply {
                        contents = line.arg(0)
                    }
                }
            }
        }

        // create tree
        newRegs.forEach {
            it.walkDownToSource(finalState)
            it.walkDownToSource(finalState)
        }

        graphViz(newRegs, "initial")

        newRegs.filter { !it.referenced }.forEach {
            it.redundant = true
        }

        redundantRegs.addAll(newRegs.filter { it.redundant })

        newRegs.removeIf {
            it.redundant
        }
    }

    fun optimizeGraph() {
        do {
            val redundant = newRegs.firstOrNull {
                it.isNotEntry && it.hasOneInput && !isMutable(it) && optimizeAllowed(it)
            }

            if (redundant != null) {
                redundant.incomingLeft?.let { better ->
                    newRegs.filter { it.uid == redundant.uid }.forEach { red ->
                        println("REPLACE ${red.uid} with ${better.node.uid}")
                        red.replaceWith(better, newRegs, isMutable(better.node))
                        pairs.add(ReplacementPair(red, better.node))
                    }
                }

                redundantRegs.addAll(newRegs.filter { it.redundant })

                newRegs.removeIf {
                    it.redundant
                }
            }
        } while (redundant != null)

        // "backwards" replace
        do {
            val redundant = newRegs.firstOrNull {
                !it.hasOneInput && it.goesInto.size == 1 && !isMutable(it) && optimizeAllowed(it)
            }

            if (redundant != null) {
                val better = redundant.goesInto.first()
                println("BK REPLACE ${redundant.uid} with ${better.node.uid}")
                pairs.add(redundant.revReplaceWith(better, newRegs, isMutable(better.node)))

                redundantRegs.addAll(newRegs.filter { it.redundant })

                newRegs.removeIf {
                    it.redundant
                }
            }
        } while (redundant != null)

        graphViz(newRegs, "optimized")
    }

    private fun isMutable(b: FlowNode): Boolean {
        val zmienna = finalState.variablary.values.firstOrNull { it.name == b.uid }
        val incoming = newRegs.count { it.uid == b.uid && it.incomingLeft?.ref == "" }
        return if (zmienna != null) !zmienna.immutable else (incoming > 1)
    }

    private fun optimizeAllowed(b: FlowNode): Boolean {
        val zmienna = finalState.variablary.values.firstOrNull { it.name == b.uid }
        return if (zmienna != null) !zmienna.dontOptimize else true
    }


    fun replaceRedundantAllocs(ctx: PseudoAsmParser.PseudoAsmFileContext, finalState: WolinStateObject) {
        println("== looking for allocs of redundant registers ==")

        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val line = linie.next()

                val opcode = line.instrukcja().simpleIdentifier().text
                val targetUid = (line.target()?.firstOrNull() as ParserRuleContext?)?.getUid()
                val arg1Uid = (line.arg()?.getOrNull(0) as ParserRuleContext?)?.getUid()
                val arg2Uid = (line.arg()?.getOrNull(1) as ParserRuleContext?)?.getUid()

                if ((opcode == "alloc" || opcode == "free") && redundantRegs.any { it.uid == arg1Uid }) {
                    println("usuwam: ${line.text}")
                    line.children.clear()
                }
            }
        }
    }

    fun replacePairs(ctx: PseudoAsmParser.PseudoAsmFileContext, finalState: WolinStateObject) {
        pairs.forEach { pair ->

            ctx.linia()?.iterator()?.let { linie ->
                while (linie.hasNext()) {
                    val line = linie.next()

                    //val opcode = line.instrukcja().simpleIdentifier().text
                    val targetUid = (line.target()?.firstOrNull() as ParserRuleContext?)?.getUid()
                    val arg1Uid = (line.arg()?.getOrNull(0) as ParserRuleContext?)?.getUid()
                    val arg2Uid = (line.arg()?.getOrNull(1) as ParserRuleContext?)?.getUid()

                    if(targetUid == pair.thiz.uid) {
                        line.target(0).children = pair.withThat.contents!!.children
                    }

                    if(arg1Uid == pair.thiz.uid) {
                        line.arg(0).children = pair.withThat.contents!!.children
                    }

                    if(arg2Uid == pair.thiz.uid) {
                        line.arg(1).children = pair.withThat.contents!!.children
                    }
                }
            }
        }
    }

    fun removeIdentities(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        println("== looking for registers ==")
        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val line = linie.next()

                if (line.children.isNotEmpty()) {
                    val opcode = line.instrukcja().simpleIdentifier().text
                    val targetUid = (line.target()?.firstOrNull() as ParserRuleContext?)?.getUid()
                    val arg1Uid = (line.arg()?.getOrNull(0) as ParserRuleContext?)?.getUid()
                    val arg2Uid = (line.arg()?.getOrNull(1) as ParserRuleContext?)?.getUid()

                    if (opcode == "let" && arg2Uid == null) {
                        if (targetUid == arg1Uid) {
                            line.children.clear()
                        }
                    }
                }
            }
        }
    }

    fun obtain(c: ParserRuleContext): FlowNode {
        val existing = newRegs.lastOrNull { it.uid == c.getUid() }
        return if (existing != null)
            existing
        else {
            val nowy = FlowNode(contents = c)
            newRegs.add(nowy)
            nowy
        }
    }

    fun obtainTarget(c: ParserRuleContext, opcode: String): FlowNode {
        val existing = newRegs.lastOrNull { it.uid == c.getUid() }
        return if (existing != null && (existing.incomingLeft == null || existing.incomingLeft?.ref == "&"))
            existing.apply { this.opcode = opcode } // pierwsze przypisanie
        else {
            val nowy =
                FlowNode(contents = c, nodeNum = existing?.nodeNum?.inc() ?: 0).apply { this.opcode = opcode }
            newRegs.add(nowy)
            nowy
        }
    }

    private fun graphViz(newRegs: List<FlowNode>, nazwa: String) {
        // bin\dot -Tpng graph.dot > output.png
        val ostream = OutputStreamWriter(FileOutputStream(File("src/main/wolin/$nazwa.dot")))
        ostream.write(
            "digraph mygraph{\n" +
                    " node [shape=plaintext]\n"
        )

        newRegs.forEach {
            if (it.incomingLeft != null) {
                val label = "${it.opcode}\nv=[${it.incomingLeft?.ref}],..."
                ostream.write("\"{${it.incomingLeft!!.node.contents!!.getUid()}}\" -> \"{${it.contents!!.getUid()}}\"")
                ostream.write("[label=\"${label}\"]")
            }
            if (it.incomingRight != null) {
                val label = "${it.opcode}\nv=...,[${it.incomingRight?.ref}]"
                ostream.write("\"{${it.incomingRight!!.node.contents!!.getUid()}}\" -> \"{${it.contents!!.getUid()}}\"")
                ostream.write("[label=\"${label}\"]")
            }
        }

        ostream.write("}\n")
        ostream.close()
    }

}


fun ParserRuleContext.getUid(): String {
    return when (this) {
        null -> ""
        is PseudoAsmParser.TargetContext -> {
            if (this.operand().name(0)?.identifier()?.isEmpty == false)
                this.operand().name(0).identifier().text
            else if (!this.operand().value().isEmpty)
                this.operand().value().text
            else
                throw java.lang.Exception("Nie wiem, jak przerobić ${this.text}")

        }
        is PseudoAsmParser.ArgContext -> {
            if (this.operand().name(0)?.identifier()?.isEmpty == false)
                this.operand().name(0).identifier().text
            else if (!this.operand().value().isEmpty)
                this.operand().value().text
            else
                throw java.lang.Exception("Nie wiem, jak przerobić ${this.text}")
        }
        else -> throw java.lang.Exception("Nie wiem, jak to przerobić")
    }
}

fun ParserRuleContext.isReg(): Boolean {
    return when (this) {
        is PseudoAsmParser.TargetContext -> {
            val stos = this.operand()?.value()?.addressed()?.identifier()?.simpleIdentifier(0)?.text ?: ""
            val nazwa = this.operand()?.name(0)?.identifier()?.simpleIdentifier(0)?.text ?: ""

            return stos.isNotEmpty() && nazwa.isNotEmpty()
        }
        is PseudoAsmParser.ArgContext -> {
            val stos = this.operand()?.value()?.addressed()?.identifier()?.simpleIdentifier(0)?.text ?: ""
            val nazwa = this.operand()?.name(0)?.identifier()?.simpleIdentifier(0)?.text ?: ""

            return stos.isNotEmpty() && nazwa.isNotEmpty()
        }
        else -> {
            false
        }
    }
}


package pl.qus.wolin.pl.qus.wolin.optimizer

import org.antlr.v4.runtime.ParserRuleContext
import pl.qus.wolin.PseudoAsmParser
import pl.qus.wolin.WolinStateObject
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStreamWriter

class Chain(var elements: List<FlowNode> = listOf()) {
    val first get() = elements.first()
    val last get() = elements.last()
    val second get() = elements[1]
    val penultimate get() = elements[elements.size - 2]
    val size get() = elements.size

    fun dump(): String = elements.joinToString(" -> ") { it.uid!! }

    fun preppend(pre: FlowNode) {
        elements = listOf(pre) + elements
    }

    fun append(app: FlowNode) {
        elements = elements + app
    }

    fun contains(drugi: Chain): Boolean {
        val ten = elements.map { it.uid!! }
        val tamten = drugi.elements.map { it.uid!! }

        return ten.containsAll(tamten)
    }

    fun getReplacementPair(): Pair<FlowNode, FlowNode> {
        //pierwszy element wstawiamy do kodu w miejscu, gdzie pojawia się przedostatni
        (1..elements.size - 2).forEach {
            elements[it].redundant = true
        }
        return Pair(penultimate, first)
    }

//    fun getReplacementRef(): String {
//        (0..elements.size-2).forEach { i->
//            val ten = elements[i]
//            val nast = elements[1+1]
//        }
//    }
}

class NewOptimizerProcessor(private val finalState: WolinStateObject) {
    val newRegs = mutableListOf<FlowNode>()
    val chains = mutableListOf<Chain>()

    val nonAssignOpcodes = listOf("bne", "beq", "label", "setup", "string")

    fun buildFlowTree(
        ctx: PseudoAsmParser.PseudoAsmFileContext
    ) {
        println("== gathering registers ==")
        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val line = linie.next()

                val opcode = line.instrukcja().simpleIdentifier().text

                val targetContext = line.target(0)
                val leftContext = line.arg(0)
                val rightContext = line.arg(1)

                val leftRef = leftContext?.operand()?.referencer()?.firstOrNull()?.text ?: ""
                val rightRef = rightContext?.operand()?.referencer()?.firstOrNull()?.text ?: ""
                val targetRef = targetContext?.operand()?.referencer()?.firstOrNull()?.text ?: ""

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

        graphViz(newRegs, "first")

        sposób2()

        graphViz(newRegs, "second")

//        findTriplets()
//        findLongChains()
//        // TODO - usunąć łańcuchy zawarte w innych
//
//        chains.forEach {
//            it.getReplacementPair()
//        }
//
//        newRegs.filter { !it.referenced }.forEach {
//            it.redundant = true
//        }
//
//        newRegs.filter { it.redundant }.forEach {
//            println("Redundant:${it.uid}")
//        }
//
//        graphViz(newRegs,"first")
//
//        chains.forEach {
//            // penultimate zastąpić first
//            it.first.goesInto = mutableListOf(DestPair(it.last, "x"))
//            if(it.last.incomingLeft?.node == it.penultimate) {
//                it.last.incomingLeft = DestPair(it.first,"x")
//            }
//            if(it.last.incomingRight?.node == it.penultimate) {
//                it.last.incomingRight = DestPair(it.first,"x")
//            }
//        }
//        newRegs.removeAll { it.redundant }

        graphViz(newRegs, "second")

    }

    private fun isMutable(b: FlowNode): Boolean {
        val zmienna = finalState.variablary.values.firstOrNull { it.name == b.uid }
        val incoming = newRegs.count { it.uid == b.uid && it.incomingLeft?.ref == "" }
        return if (zmienna != null) !zmienna.immutable else (incoming > 1)
    }

//    private fun findTriplets() {
//        println("== Looking for triplets ==")
//        newRegs.forEach { a ->
//            a.goesInto.forEach { aDestination ->
//                val aToBRef = aDestination.ref
//                val b = aDestination.node
//                b.goesInto.forEach { bDestination ->
//                    val bToCRef = bDestination.ref
//
//                    val c = bDestination.node
//
//                    //                    A goesInto * B(isSimple,isNode) goesInto & C ==> A goesInto C
//                    if (b.isSimple && b.isNode && !isMutable(b) && aToBRef == "*" && bToCRef == "&") {
//                        // W C zamieniamy B na A
//                        // B usuwamy
//                        chains.add(Chain(mutableListOf(a, b, c)))
//                        println("A prio 1: $aToBRef${a.uid} -> $bToCRef${b.uid} -> ${c.uid}   ==>   replace ${b.uid} with ${a.uid}")
//                    }
////                    A goesInto & B(isSimple,isNode) goesInto * C ==> A goesInto C
//                    if (b.isSimple && b.isNode && !isMutable(b) && aToBRef == "&" && bToCRef == "*") {
//                        // W C zamieniamy B na A
//                        // B usuwamy
//                        chains.add(Chain(mutableListOf(a, b, c)))
//                        println("B prio 2: $aToBRef${a.uid} -> $bToCRef${b.uid} -> ${c.uid}   ==>   replace ${b.uid} with ${a.uid}")
//                    }
//                    //A goesInto .B(isSimple, isNode) goesInto .C ==? A goesInto C
//                    if (b.isSimple && b.isNode && !isMutable(b) && aToBRef == "" && bToCRef == "") {
//                        // W C zamieniamy B na A
//                        // B usuwamy
//                        chains.add(Chain(mutableListOf(a, b, c)))
//                        println("C prio 3: ${a.uid} -> ${b.uid} -> ${c.uid}   ==>      replace ${b.uid} with ${a.uid}")
//                    }
////                    A goesInto . B(isSimple,isNode) goesInto ref C  ==> A goesInto ref C
//                    if (b.isSimple && b.isNode && !isMutable(b) && aToBRef == "" && bToCRef != "") {
//                        // W C zamieniamy B na bToCRef A
//                        // B usuwamy
//                        chains.add(Chain(mutableListOf(a, b, c)))
//                        println("D prio 4: ${a.uid} -> $bToCRef${b.uid} -> ${c.uid}   ==>      replace ${b.uid} with ${bToCRef}${a.uid}")
//                    }
//                    if (b.isSimple && b.isNode && !isMutable(b) && aToBRef != "" && bToCRef == "") {
//                        // W C zamieniamy B na bToCRef A
//                        // B usuwamy
//                        chains.add(Chain(mutableListOf(a, b, c)))
//                        println("D prio 4: ${a.uid} -> $bToCRef${b.uid} -> ${c.uid}   ==>      replace ${b.uid} with ${bToCRef}${a.uid}")
//                    }
////                    A goesInto ref B(isSimple,isNode) goesInto ref C ==> A goesInto ref C
//
//                }
//            }
//        }
//    }

//    private fun findLongChains() {
//        println("== Extending triplets ==")
//
//        do {
//            val i = chains.iterator()
//
//            var changed = false
//
//            while (i.hasNext()) {
//                val thiz = i.next()
//
////        it.B = this.A
////        a -> b -> c oraz x -> a -> b   ==>   x -> a -> b -> c->
//                val preppendable = chains.firstOrNull { it.second.uid == thiz.first.uid }
//
////        this.C = it.B
////        a -> b -> c oraz b -> c -> d  ==>  a -> b -> c -> d ->
//                val appendable = chains.firstOrNull { thiz.last.uid == it.penultimate.uid }
//
//                if (preppendable != null) {
//                    println("${preppendable.first.uid} => ${thiz.dump()}")
//                    thiz.preppend(preppendable.first)
//                    changed = true
//                }
//                if (appendable != null) {
//                    println("${thiz.dump()} => ${appendable.last.uid}")
//                    thiz.append(appendable.last)
//                    changed = true
//                }
//            }
//        } while (changed)
//
//        println("== All chains ==")
//        chains.forEach {
//            println(it.dump())
//        }
//
//        println("== To delete ==")
//
//        val toBeDelated = mutableListOf<Chain>()
//
//        chains.forEach { ten ->
//            chains.forEach { tamten ->
//                val same = toBeDelated.any {
//                    it.contains(ten) && it.size == ten.size
//                }
//                if (ten != tamten && tamten.contains(ten) && !same) {
//                    toBeDelated.add(ten)
//                }
//            }
//        }
//
//        toBeDelated.forEach {
//            chains.remove(it)
//        }
//
//        println("== Cleaned chains ==")
//        chains.forEach {
//            println(it.dump())
//        }
//
//    }

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

    fun sposób2() {
        //        1. odszukać REDUNDANT, który nie jest entry i który ma tylko jedno wejście "BETTER"
        do {
            val redundant = newRegs.firstOrNull {
                it.isNotEntry && it.isSimple && !isMutable(it) //&& it.goesInto.size > 0
            }

            redundant?.incomingLeft?.let { better ->
                newRegs.filter { it.uid == redundant.uid }.forEach {
                    it.replaceWith(better, newRegs)
                    println("REPLACE ${redundant.uid} with ${better.node.uid}")
                }
                newRegs.removeIf { it.redundant }
            }
        } while (redundant != null)

        // "backwards" replace
        newRegs
            .filter { !it.isSimple && it.goesInto.size == 1 && !isMutable(it) }
            .forEach { redundant ->
                //1. znajdź composite REDUNDANT, które idzie do jednego nołda BETTER
                val better = redundant.goesInto.first()
                redundant.revReplaceWith(better, newRegs)
                println("BK REPLACE ${redundant.uid} with ${better.node.uid}")
            }

        newRegs.removeIf { it.redundant }

        // todo musimy zastąpić w każdym miejscu
        //
        /*

        18 w 19:

        add SP(4)<__wolin_reg19>[ubyte*] = what[ubyte*], i[uword] // long index, single byte per element array (tutaj)
        let SP(2)<__wolin_reg18>[ubyte*] = SP(0)<__wolin_reg19>[ubyte*] // przez sprawdzacz typow - non-fast array
        let char[ubyte] = &SP(0)<__wolin_reg18>[ubyte*] // przez sprawdzacz typow - process assignment

        add SP(4)<__wolin_reg19>[ubyte*] = what[ubyte*], i[uword] // long index, single byte per element array (tutaj)
        let char[ubyte] = &SP(0)<__wolin_reg19>[ubyte*] // przez sprawdzacz typow - process assignment

        czyli szukamy, gdzie 18 występuje w left lub right i zastępujemy 19

        PLUS

        jeżeli podmieniliśmy rejestr, do którego podstawiamy, to musimy go dodac jako nowy root

        LET B = A
        ADD B = 5, 6

        daje

        ADD A = 5,6
        plus nowy root A

         */

    }


    fun replaceRedundantRemoveAllocs(ctx: PseudoAsmParser.PseudoAsmFileContext, finalState: WolinStateObject) {
        println("== looking for registers ==")
        val redundantRegs = newRegs.filter { it.redundant }
        val replacablePairs = chains.map { it.getReplacementPair() }

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
                } else {
                    val arg1Pair = replacablePairs.firstOrNull { it.first.uid == arg1Uid }
                    val arg2Pair = replacablePairs.firstOrNull { it.first.uid == arg2Uid }
                    val targetPair = replacablePairs.firstOrNull { it.first.uid == targetUid }

                    if (arg1Pair != null) {
                        line.arg(0).children = arg1Pair.second.contents!!.children
                    }

                    if (arg2Pair != null) {
                        line.arg(1).children = arg2Pair.second.contents!!.children
                    }

                    if (targetPair != null) {
                        line.target(0).children = targetPair.second.contents!!.children
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
            val nowy = FlowNode(contents = c, nodeNum = existing?.nodeNum?.inc() ?: 0).apply { this.opcode = opcode }
            newRegs.add(nowy)
            nowy
        }
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


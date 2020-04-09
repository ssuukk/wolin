package pl.qus.wolin

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import java.lang.IndexOutOfBoundsException
import java.lang.NullPointerException
import java.util.*
import kotlin.math.abs

class OptimizerVisitor : PseudoAsmParserBaseVisitor<PseudoAsmStateObject>() {
    val state = PseudoAsmStateObject()

    val registers = mutableMapOf<Int, Register>()

    val nonAssignOpcodes = listOf("bne", "beq")


    /**
     * Zebranie wszystkich możliwych rejestrów
     */
    fun gatherAllSPRegs(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        println("== looking for registers ==")
        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val template = linie.next()

                if (template.instrukcja().simpleIdentifier().text == "alloc") {
                    val r = createReg(template)
                    if (r != null) {
                        registers[r.numer] = r
                        println("Reg found: reg${r.numer} (${r.wielkość}b)")
                    }
                }
            }
        }
    }


    fun markSingleAssignmentRegs(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        println("== looking for single-assignment registers ==")
        registers.forEach {
            checkIfOnlyOneAssignment(ctx, it.value.numer)
        }
        registers
            .filter { it.value.argContext == null && it.value.canBeRemoved }
            .forEach { it.value.canBeRemoved = true }

        registers.filter { it.value.canBeRemoved }.forEach {
            println("Redundant reg: $it")
        }
    }

    fun replaceSingleAssignmentRegWithItsValue(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        val xxx = registers.filter { it.value.canBeRemoved }.map { it.value.numer }
        val toDo = Stack<Int>()
        toDo.addAll(xxx)

        while (toDo.isNotEmpty()) {
            val reg = toDo.pop()

            do {
                println("=== Replace pass for reg$reg ===")

                replaceAllOccurencesOfSingleAssignRegistersWithTheirValues(ctx, reg)
            } while (state.replaced)
        }
    }

    fun markRegIfStillUsed(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        // sprawdzić, czy dany rejestr występuje tylko jako free/alloc +ew. let rejestr =

        println("=== Checking if reg still present after replace ===")

        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val linia = linie.next()

                val target = extractTarget(linia)
                val firstArg = extractReg(linia, 0)
                val secondArg = extractReg(linia, 1)

                val instrukcja = linia.instrukcja().simpleIdentifier().text

                //val targetDeref = linia.target(0)?.operand()?.referencer(0)?.text

                if (instrukcja != "alloc" && instrukcja != "free") {
                    if (firstArg != null) {
                        println("Nie można usunąć ${firstArg.numer} bo ma first arg w ${linia.text}")
                        registers[firstArg.numer]?.canBeRemoved = false
                    }

                    if (secondArg != null && instrukcja != "let") {
                        println("Nie można usunąć ${secondArg.numer} bo ma second arg  w ${linia.text}")
                        registers[secondArg.numer]?.canBeRemoved = false
                    }

                    // włączenie tego uniemożliwa reverse-pair
//                    if (instrukcja != "let" && target != null) {
//                        println("Nie można usunąć ${target.numer} bo nie let i ma target w ${linia.text}")
//                        registers[target.numer]?.canBeRemoved = false
//                    }

                }
            }
        }
    }


    fun moveFreeBehindLastOp(regNr: Int) {
        /*
add SP(0)<__wolin_reg10>[ubyte*] = SP(0)<__wolin_reg10>[ubyte*], &*__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]
reg9 - SP(2)
reg8 - SP(3)
free SP<__wolin_reg10>, #2
reg9 - SP(0)
reg8 - SP(1)
add __wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte] = __wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte], #1[ubyte]
let &SP(-2)<__wolin_reg10>[ubyte*] = &*__wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte]

przenosząc rejest SP(n) w dół kodu muszę dodać do każdego rejestru <=n wielkość tego rejestru, czyli:

add SP(0)<__wolin_reg10>[ubyte*] = SP(0)<__wolin_reg10>[ubyte*], &*__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]
reg9 - SP(2)
reg8 - SP(3)
stąd przeniosłem reg10 o wielkości 2 ------->
reg9 - SP(0+2)                              |
reg8 - SP(1+2)                              |
add __wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte] = __wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte], #1[ubyte]
let &SP(-2+2)<__wolin_reg10>[ubyte*] = &*__wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte]
free SP<__wolin_reg10>, #2 <-----------------

         */
    }


    fun optimizeReverseAssigns(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        /*
Czyli

op A = *
let B = A

daje

zastąpić wszystkie wuystąpienia A przez B
op B = *

1. znaleźć targety
2. zobaczyć, czy po nich jest podstawienie coś = target
         */

        val targetsToBeReplaced = mutableMapOf<Int, Register>()
        println("== Optimizing reverse values ==")

        state.reversePhase = true

        ctx.children.iterator().let { linieIterator ->
            while (linieIterator.hasNext()) {
                val current = linieIterator.next()
                if (current is PseudoAsmParser.LiniaContext) {

                    val target = extractTarget(current)
                    val source = extractReg(current, 0)
                    if(target != null)
                        targetsToBeReplaced[target.numer] = target

                    val instrukcja = current.instrukcja().simpleIdentifier().text

                    if(instrukcja == "let" && source != null && targetsToBeReplaced[source.numer] != null) {
                        targetsToBeReplaced[source.numer]!!.targetContext = current.target()[0]
                        linieIterator.remove()
                    }
                }
            }
        }

        targetsToBeReplaced.filter { it.value.targetContext != null }.map{ it.value }.forEach {
            println("Mamy reverse-parę: zastąpić ${it.name} tym: ${it.targetContext!!.text}")
            registers[it.numer]!!.canBeRemoved = true
            registers[it.numer]!!.argContext = null
        }
    }

    fun sanitizeDerefs(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        println("== Consolidating subsequent alloc/free ==")

        ctx.children.iterator().let { linieIterator ->
            while (linieIterator.hasNext()) {
                val current = linieIterator.next()
                if (current is PseudoAsmParser.LiniaContext) {

                    val targetOps = try { current.target()[0].operand().referencer().map { it.text } } catch (ex: IndexOutOfBoundsException) { null }
                    val arg0Ops = try { current.arg()[0].operand().referencer().map { it.text } } catch (ex: IndexOutOfBoundsException) { null }
                    val arg1Ops = try { current.arg()[1].operand().referencer().map { it.text } } catch (ex: IndexOutOfBoundsException) { null }

                    if(targetOps?.contains("&") == true) {
                        val typeRef=current.target()[0].operand().typeName()[0].referencer()
                        if(typeRef.size == 0)
                            current.target()[0].operand().children.removeAll { it.text == "&" }
                    }

                    if(arg0Ops?.contains("&") == true) {
                        val typeRef=current.arg()[0].operand().typeName()[0].referencer()
                        if(typeRef.size == 0)
                            current.arg()[0].operand().children.removeAll { it.text == "&" }
                    }

                    if(arg1Ops?.contains("&") == true) {
                        val typeRef=current.arg()[1].operand().typeName()[0].referencer()
                        if(typeRef.size == 0)
                            current.arg()[1].operand().children.removeAll { it.text == "&" }
                    }





                    if(targetOps?.contains("*") == true && targetOps.contains("&")) {
                        current.target()[0].operand().children.removeAll { it.text == "&" || it.text == "*" }
                    }

                    if(arg0Ops?.contains("*") == true && arg0Ops.contains("&")) {
                        current.arg()[0].operand().children.removeAll { it.text == "&" || it.text == "*" }
                    }

                    if(arg1Ops?.contains("*") == true && arg1Ops.contains("&")) {
                        current.arg()[1].operand().children.removeAll { it.text == "&" || it.text == "*" }
                    }
                }
            }
        }
    }

    fun consolidateAllocs(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        println("== Consolidating subsequent alloc/free ==")

        var previous: PseudoAsmParser.LiniaContext? = null

        ctx.children.iterator().let { linieIterator ->
            while (linieIterator.hasNext()) {
                val current = linieIterator.next()
                if (current is PseudoAsmParser.LiniaContext) {

                    // jeśli free/alloc lub przypisanie do danego rejestru, to usunąć i przesunąć wektory


                    val currentOp = current.instrukcja().simpleIdentifier().text
                    val prevOp = previous?.instrukcja()?.simpleIdentifier()?.text

                    val currentStack = try {
                        extractStackType(getFirstArg(current).getChild(0) as PseudoAsmParser.OperandContext)
                    } catch (ex: Exception) {
                        null
                    }
                    val prevStack = try {
                        extractStackType(getFirstArg(previous!!).getChild(0) as PseudoAsmParser.OperandContext)
                    } catch (ex: Exception) {
                        null
                    }

                    if ((currentStack == prevStack) && (currentOp == "free" || currentOp == "alloc") && (prevOp == "free" || prevOp == "alloc")) {
                        val currentSize =
                            getSecondArg(current).text.removePrefix("#").toInt() * if (currentOp == "free") 1 else -1
                        val prevSize =
                            getSecondArg(previous!!).text.removePrefix("#").toInt() * if (prevOp == "free") 1 else -1

                        val consolidatedSum = currentSize + prevSize

                        val consolidatedOp = if (consolidatedSum > 0)
                            "free"
                        else
                            "alloc"

                        println("$prevOp $prevSize and $currentOp $currentSize gives $consolidatedOp $consolidatedSum")

                        // linia.instrukcja.simpleIdentifier
                        val operandContext =
                            previous!!.getChild(0)!!.getChild(0) as PseudoAsmParser.SimpleIdentifierContext
                        operandContext.children[0] = createTerminalNode(consolidatedOp)

                        val valueContext =
                            getSecondArg(previous!!).getChild(0).getChild(0).getChild(0) as PseudoAsmParser.ImmediateContext

                        valueContext.children[1] = createTerminalNode(abs(consolidatedSum).toString())

                        linieIterator.remove()
                    } else {
                        previous = current
                    }
                }
            }
        }
    }

    fun removeAndShiftArgs(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        registers.filter { it.value.canBeRemoved }.map { it.value }.forEach { removedRegistr ->
            ctx.children.iterator().let { linieIterator ->
                while (linieIterator.hasNext()) {
                    val linia = linieIterator.next()
                    if (linia is PseudoAsmParser.LiniaContext) {

                        // jeśli free/alloc lub przypisanie do danego rejestru, to usunąć i przesunąć wektory

                        val instrukcja = linia.instrukcja().simpleIdentifier().text
                        val target = extractTarget(linia)

                        val refType = linia.target(0)?.operand()?.referencer()?.firstOrNull()?.text ?: ""

                        if (instrukcja == "alloc" && state.insideOptimizedReg == -1) {
                            val r = createReg(linia)
                            if (r != null && r.numer == removedRegistr.numer) {
                                state.insideOptimizedReg = r.numer
                                println("usuwam alloc ${r.numer}")
                                linieIterator.remove()
                            }
                        } else if (instrukcja == "free" && state.insideOptimizedReg == removedRegistr.numer) {
                            val r = createReg(linia)
                            if (r != null && r.numer == removedRegistr.numer) {
                                state.insideOptimizedReg = -1
                                println("usuwam free ${removedRegistr.numer}")
                                linieIterator.remove()
                            }
                        } else if (target?.numer == removedRegistr.numer && (instrukcja == "let" || linia.arg().size == 1) && refType != "&") {
                            println("usuwam pierwsze podstawienie do ${removedRegistr.numer}: ${linia.text}")
                            linieIterator.remove()
                        } else if (state.insideOptimizedReg == removedRegistr.numer) {
                            /*
                            przy wyrugowaniu rejestru wszystkie odwołania do rejestrów leżących POD NIM na stosie muszą mieć zmniejszane indeksy
                                    o rozmiar tego rejestru aż do momentu, kiedy tenże rejestr byłby faktycznie zwolniony

                            np:

                            było:
                            alloc <r.temp13>, #n, ale usunęliśmy

                            po tym allocu
                            SP(x)<r.temp12> MUSI PRZEJść W: SP(x-n)<r.temp12>

                            odejmowanie kończymy, gdy napotkamy

                            `free <r.temp13>
                            */

                            // jeśli target, arg1 albo arg2 to SP(x)<__wolin_regYY> gdzie YY < removedRegister.numer
                            // to x = x-removedRegister.size

                            val firstArg = extractReg(linia, 0)
                            val secondArg = extractReg(linia, 1)
                            val target = extractTarget(linia)

                            if (firstArg != null && firstArg.numer < removedRegistr.numer) {
                                val vector = extractSPVector(linia.arg(0).operand()) - removedRegistr.wielkość
                                val child = getFirstArg(linia)
                                changeVector(
                                    (child as PseudoAsmParser.ArgContext).children[0] as PseudoAsmParser.OperandContext,
                                    vector
                                )
                            }

                            if (secondArg != null && secondArg.numer < removedRegistr.numer) {
                                val vector = extractSPVector(linia.arg(1).operand()) - removedRegistr.wielkość
                                val child = getSecondArg(linia)
                                changeVector(
                                    (child as PseudoAsmParser.ArgContext).children[0] as PseudoAsmParser.OperandContext,
                                    vector
                                )
                            }

                            if (target != null && target.numer < removedRegistr.numer) {
                                val vector = extractSPVector(linia.target(0).operand()) - removedRegistr.wielkość
                                changeVector(
                                    (linia.children[1] as PseudoAsmParser.TargetContext).children[0] as PseudoAsmParser.OperandContext,
                                    vector
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    private fun changeVector(operand: PseudoAsmParser.OperandContext, vector: Int) {
        if (vector < 0) {
            println("regx moved beyond 'free regx' in ${operand.text}")
            //throw Exception("regx moved beyond 'free regx' fo4 ${operand.text}")
        }
        val indeks =
            if (operand.children[0] is PseudoAsmParser.ReferencerContext)
                (((operand.children[1] as PseudoAsmParser.ValueContext).children[0] as PseudoAsmParser.AddressedContext).children[2] as PseudoAsmParser.IndexContext)
            else
                (((operand.children[0] as PseudoAsmParser.ValueContext).children[0] as PseudoAsmParser.AddressedContext).children[2] as PseudoAsmParser.IndexContext)

        val node = indeks.children[0] as TerminalNodeImpl
        (node.symbol as CommonToken).text = vector.toString()
    }

    private fun replaceAllOccurencesOfSingleAssignRegistersWithTheirValues(
        ctx: PseudoAsmParser.PseudoAsmFileContext,
        regNr: Int
    ) {
        // TODO - tu trzeba zwiększać przesunięcia zapamiętanych rejestrów stosu funkcji przy wywołaniach

        state.replaced = false

        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val linia = linie.next()

                val firstArg = extractReg(linia, 0)
                val secondArg = extractReg(linia, 1)

                val target = extractTarget(linia)

                val instrukcja = linia.instrukcja().simpleIdentifier().text

                val targetDeref = linia.target(0)?.operand()?.referencer(0)?.text

                if (instrukcja != "free" && instrukcja != "alloc") {
//                    if(regNr == 14 || regNr == 27) {
//                        println("Debug: obrabiam $regNr, sprawdzam target: $target")
//                    }
                    if (target?.numer == regNr && targetDeref == "&") {
                        println("====================================================================")
                        println("oper *replace* = arg, arg\n${linia.text}")

                        val ta = linia.target(0)
                        val correctedTarget = replaceInTarget(linia.target(0), registers[regNr]!!.argContext?.get(0)?.operand() ?: registers[regNr]!!.targetContext!!.operand()!!)

                        val kopia = PseudoAsmParser.TargetContext(
                            correctedTarget.ruleContext as ParserRuleContext,
                            correctedTarget.invokingState
                        )

                        kopia.copyFrom(correctedTarget)

                        linia.children[1] = correctedTarget

                        print("${linia.text}")
                        state.replaced = true

                    } else if (target?.numer == regNr && state.reversePhase) {
                        println("====================================================================")
                        println("reverse oper *replace* = arg, arg\n${linia.text}")

                        val ta = linia.target(0)
                        val correctedTarget = replaceInTarget(linia.target(0), registers[regNr]!!.argContext?.get(0)?.operand() ?: registers[regNr]!!.targetContext!!.operand()!!)

                        val kopia = PseudoAsmParser.TargetContext(
                            correctedTarget.ruleContext as ParserRuleContext,
                            correctedTarget.invokingState
                        )

                        kopia.copyFrom(correctedTarget)

                        linia.children[1] = correctedTarget

                        print("${linia.text}")
                        state.replaced = true
                    }

                        if(firstArg?.numer == regNr && secondArg == null && registers[regNr]?.argContext?.size == 2){
                        println("====================================================================")
                        println("oper target = *replace* INDEXED\n${linia.text}")

                        replaceInArg(linia.arg(0), registers[regNr]!!.argContext?.get(0)?.operand() ?: registers[regNr]!!.targetContext!!.operand())
                        val correctedFirstArgX = registers[regNr]!!
                        val correctedFirstArg = correctedFirstArgX.argContext?.get(0) ?: correctedFirstArgX.targetContext!!

                        val kopia = PseudoAsmParser.ArgContext(
                            correctedFirstArg.ruleContext as ParserRuleContext,
                            correctedFirstArg.invokingState
                        )
                        kopia.copyFrom(correctedFirstArg)

                        setFirstArg(linia, correctedFirstArg)

                        // nie ma drugiego argumentu, trzeba go dodać
                        linia.children = linia.children.dropLast(1) // remove LF
                        linia.children.add(createTerminalNode(","))
                        linia.children.add(kopia)
                        linia.children.add(createTerminalNode("\n"))

                        replaceInArg(null, registers[regNr]!!.argContext?.get(1)?.operand() ?: registers[regNr]!!.targetContext!!.operand())
                        val correctedSecondArgX = registers[regNr]!!
                        val correctedSecondArg = correctedSecondArgX.argContext?.get(1) ?: correctedSecondArgX.targetContext!!

                        val kopia2 = PseudoAsmParser.ArgContext(
                            correctedSecondArg.ruleContext as ParserRuleContext,
                            correctedSecondArg.invokingState
                        )
                        kopia2.copyFrom(correctedSecondArg)

                        setSecondArg(linia, correctedSecondArg)


                        print("${linia.text}")
                        state.replaced = true


                    }
                    else if (firstArg?.numer == regNr) {
                        println("====================================================================")
                        println("oper target = *replace*, arg\n${linia.text}")

                        replaceInArg(linia.arg(0), registers[regNr]!!.argContext?.get(0)?.operand() ?: registers[regNr]!!.targetContext!!.operand())
                        val correctedFirstArgX = registers[regNr]!!
                        val correctedFirstArg = correctedFirstArgX.argContext?.get(0) ?: correctedFirstArgX.targetContext!!

                        val kopia = PseudoAsmParser.ArgContext(
                            correctedFirstArg.ruleContext as ParserRuleContext,
                            correctedFirstArg.invokingState
                        )
                        kopia.copyFrom(correctedFirstArg)

                        setFirstArg(linia, correctedFirstArg)

                        print("${linia.text}")
                        state.replaced = true
                    }

                    if (secondArg?.numer == regNr) {
                        println("====================================================================")
                        println("oper target = arg, *replace*\n${linia.text}")
                        replaceInArg(linia.arg(1), registers[regNr]!!.argContext?.get(0)?.operand() ?: registers[regNr]!!.targetContext!!.operand())
                        val correctedSecondArgX = registers[regNr]!!
                        val correctedSecondArg = correctedSecondArgX.argContext?.get(0) ?: correctedSecondArgX.targetContext!!

                        setSecondArg(linia, correctedSecondArg)

                        print("${linia.text}")
                        state.replaced = true
                    }
                }
            }
        }
    }

    fun optimizeLoops() {
        /*
        label __wolin_lab_loop_start_1

        alloc XXX, #n

        free XXX, #n

        label __wolin_lab_loop_end_1
         */
    }

//    private fun replaceInArg(
//        intoThisField: PseudoAsmParser.ArgContext,
//        thisarg: Register
//    ): Register {
//        //val thisField = thisarg.argContext!!
//        val thisFieldOperand = thisarg.argContext?.operand() ?: thisarg.targetContext?.operand()!!
//
//        val intoReference = intoThisField.operand().referencer()
//        val thisReference = thisFieldOperand.referencer()
//
//        val referenceryRazem = intoReference + thisReference
//        if (thisFieldOperand.children[0] is PseudoAsmParser.ReferencerContext) {
//            // usunąć pierwszy kontekst referencera, zastąpić go referenceryRazem, dopisać resztę
//            val stareDzieci = thisFieldOperand.children.drop(1)
//            thisFieldOperand.children = referenceryRazem + stareDzieci
//        } else {
//            val stareDzieci = thisFieldOperand.children
//            thisFieldOperand.children = referenceryRazem + stareDzieci
//        }
//
//        return thisarg
//    }


    private fun replaceInArg(
        intoThisField: PseudoAsmParser.ArgContext?,
        thisFieldOperand: PseudoAsmParser.OperandContext
    ) {
        val intoReference = intoThisField?.operand()?.referencer()
        val thisReference = thisFieldOperand.referencer()

        val referenceryRazem = if(intoReference != null) intoReference + thisReference else thisReference
        if (thisFieldOperand.children[0] is PseudoAsmParser.ReferencerContext) {
            // usunąć pierwszy kontekst referencera, zastąpić go referenceryRazem, dopisać resztę
            val stareDzieci = thisFieldOperand.children.drop(1)
            thisFieldOperand.children = referenceryRazem + stareDzieci
        } else {
            val stareDzieci = thisFieldOperand.children
            thisFieldOperand.children = referenceryRazem + stareDzieci
        }
    }



//    private fun replaceInTarget(
//        intoThisField: PseudoAsmParser.TargetContext,
//        thisarg: Register
//    ): PseudoAsmParser.TargetContext {
//        val thisFieldOperand = thisarg.argContext?.operand() ?: thisarg.targetContext?.operand()!!
//
//        val intoReference = intoThisField.operand().referencer()
//        val thisReference = thisFieldOperand.referencer()
//        val zwrotka =
//            PseudoAsmParser.TargetContext(intoThisField.ruleContext as ParserRuleContext, intoThisField.invokingState)
//
//        val referenceryRazem = intoReference + thisReference
//        if (thisFieldOperand.children[0] is PseudoAsmParser.ReferencerContext) {
//            // usunąć pierwszy kontekst referencera, zastąpić go referenceryRazem, dopisać resztę
//            val stareDzieci = thisFieldOperand.children.drop(1)
//            thisFieldOperand.children = referenceryRazem + stareDzieci
//        } else {
//            val stareDzieci = thisFieldOperand.children
//            thisFieldOperand.children = referenceryRazem + stareDzieci
//        }
//
//        zwrotka.children = thisarg.argContext?.children ?: thisarg.targetContext?.children!!
//
//        return zwrotka
//    }


    private fun replaceInTarget(
        intoThisField: PseudoAsmParser.TargetContext,
        thisFieldOperand: PseudoAsmParser.OperandContext
    ): PseudoAsmParser.TargetContext {
        val intoReference = intoThisField.operand().referencer()
        val thisReference = thisFieldOperand.referencer()
        val zwrotka =
            PseudoAsmParser.TargetContext(intoThisField.ruleContext as ParserRuleContext, intoThisField.invokingState)

        val referenceryRazem = intoReference + thisReference
        if (thisFieldOperand.children[0] is PseudoAsmParser.ReferencerContext) {
            // usunąć pierwszy kontekst referencera, zastąpić go referenceryRazem, dopisać resztę
            val stareDzieci = thisFieldOperand.children.drop(1)
            thisFieldOperand.children = referenceryRazem + stareDzieci
        } else {
            val stareDzieci = thisFieldOperand.children
            thisFieldOperand.children = referenceryRazem + stareDzieci
        }

        zwrotka.children = listOf(thisFieldOperand)

        return zwrotka
    }


    /**
     * Sprawdzenie, czy rejestr ma tylko jedno, proste podstawienie
     */
    private fun checkIfOnlyOneAssignment(ctx: PseudoAsmParser.PseudoAsmFileContext, nr: Int) {
        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val linia = linie.next()

                val instrukcja = linia.instrukcja().simpleIdentifier().text

                val firstArg = extractReg(linia, 0)
                val target = extractTarget(linia)

                val targetRef = linia.target()?.firstOrNull()?.operand()?.referencer()?.firstOrNull()?.text

                if (instrukcja == "alloc") {
                    if (firstArg?.numer == nr) {
                        state.insideOptimizedReg = nr
                    }
                } else if (instrukcja == "free") {
                    if (firstArg?.numer == nr) {
                        state.insideOptimizedReg = -1
                    }
                } else if (state.insideOptimizedReg == nr && target?.numer == nr) {
                    // sprawdzić, czy jest to proste podstawienie, jeśli nie - ustawić redundant na false

                    when {
                        targetRef == "&" && instrukcja == "let" -> {
                            // this is a dereference? ignore
                        }
                        nonAssignOpcodes.contains(instrukcja) -> {
                            // this is a non-assignment opcode (bne, beq)? ignore
                        }
                        target.argContext != null -> {
                            // already assigned?
                            target.canBeRemoved = false
                        }
                        instrukcja == "let" -> {
                            // first assignment
                            target.canBeRemoved = true
                            target.argContext = linia.arg()
                        }
                        else -> {
                            // other kind of target
                            target.canBeRemoved = false
                        }
                    }
                }
            }
        }
    }

    private fun extractTarget(template: PseudoAsmParser.LiniaContext): Register? {
        val stos = template.target(0)?.operand()?.value()?.addressed()?.identifier()?.simpleIdentifier(0)?.text // SP
        val nazwa = template.target(0)?.operand()?.name(0)?.identifier()?.simpleIdentifier(0)?.text // __wolin_reg3

        return when {
            nazwa == null -> null
            stos == "SP" -> {
                val numer = Integer.parseInt(nazwa.substring(11))
                registers[numer]
            }
            else -> null
        }

    }

    private fun extractReg(template: PseudoAsmParser.LiniaContext, nr: Int): Register? {
        val stos = template.arg(nr)?.operand()?.value()?.addressed()?.identifier()?.simpleIdentifier(0)?.text // SP
        val nazwa = template.arg(nr)?.operand()?.name(0)?.identifier()?.simpleIdentifier(0)?.text // __wolin_reg3

        return when {
            nazwa == null -> null
            stos == "SP" -> {
                val numer = Integer.parseInt(nazwa.substring(11))
                registers[numer]
            }
            else -> null
        }
    }

    private fun extractStackType(ctx: PseudoAsmParser.OperandContext): String? {
        return ctx.value()?.addressed()?.identifier()?.simpleIdentifier(0)?.text
    }


    private fun extractAllocSize(template: PseudoAsmParser.LiniaContext, stack: String): Int? {
        val stos = template.arg(0)?.operand()?.value()?.addressed()?.identifier()?.simpleIdentifier(0)?.text
        val wielkość = template.arg(1)?.operand()?.value()?.immediate()

        return when (stos) {
            stack -> wielkość?.IntegerLiteral()!!.text.toInt()
            else -> null
        }
    }

    private fun extractSPVector(ctx: PseudoAsmParser.OperandContext): Int {
        val wektor = ctx.value()?.addressed()?.index(0)?.text
        return Integer.parseInt(wektor)
    }

    private fun createReg(template: PseudoAsmParser.LiniaContext): Register? {
        val stos = template.arg(0)?.operand()?.value()?.addressed()?.identifier()?.simpleIdentifier(0)?.text // SP
        val nazwa = template.arg(0)?.operand()?.name(0)?.identifier()?.simpleIdentifier(0)?.text // __wolin_reg3
        val wielkość = template.arg(1)?.operand()?.value()?.immediate()?.IntegerLiteral()?.text

        return if (stos == "SP") {
            val reg = Register()

            reg.numer = Integer.parseInt(nazwa!!.substring(11))
            reg.wielkość = Integer.parseInt(wielkość!!)
            reg.name = nazwa
            reg
        } else null
    }

    fun copy(ctx: ParseTree): ParseTree {
        return when (ctx) {
            is ParserRuleContext -> {
                val nowa = ctx.javaClass.getDeclaredConstructor(ParserRuleContext::class.java, Int::class.java)
                    .newInstance(ctx.parent, ctx.invokingState) // dodać argsy
                nowa.copyFrom(ctx)
                nowa.children = ctx.children?.map { copy(it) }?.toMutableList()

                nowa
            }
            is TerminalNode -> {
                val kopia = object : Token {
                    val textCopy = ctx.text.substring(0)

                    override fun getTokenSource(): TokenSource {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun getType(): Int {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun getStopIndex(): Int {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun getText(): String {
                        return textCopy
                    }

                    override fun getChannel(): Int {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun getTokenIndex(): Int {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun getCharPositionInLine(): Int {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun getStartIndex(): Int {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun getLine(): Int {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun getInputStream(): CharStream {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                }
                TerminalNodeImpl(kopia)
            }
            else -> {
                TODO()
            }
        }
    }


    fun createTerminalNode(contents: String): ParseTree {
        val kopia = object : Token {
            //val textCopy = ctx.text.substring(0)

            override fun getTokenSource(): TokenSource {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun getType(): Int {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun getStopIndex(): Int {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun getText(): String {
                return contents
            }

            override fun getChannel(): Int {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun getTokenIndex(): Int {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun getCharPositionInLine(): Int {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun getStartIndex(): Int {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun getLine(): Int {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun getInputStream(): CharStream {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }
        return TerminalNodeImpl(kopia)
    }


    fun getFirstArg(linia: PseudoAsmParser.LiniaContext): ParseTree {
        return if (linia.target().isNotEmpty())
            linia.children[3]
        else
            linia.children[1]
    }

    fun getSecondArg(linia: PseudoAsmParser.LiniaContext): ParseTree {
        return if (linia.target().isNotEmpty())
            linia.children[5]
        else
            linia.children[3]
    }

    fun setFirstArg(linia: PseudoAsmParser.LiniaContext, child: ParserRuleContext) {
        if (linia.target().isNotEmpty())
            linia.children[3] = child
        else
            linia.children[1] = child
    }

    fun setSecondArg(linia: PseudoAsmParser.LiniaContext, child: ParserRuleContext) {
        if (linia.target().isNotEmpty())
            linia.children[5] = child
        else
            linia.children[3] = child
    }


}


class Register {
    var numer: Int = -1
    var wielkość: Int = -1
    var canBeRemoved: Boolean = true // czy naprawdę można go usunąć
    var argContext: List<PseudoAsmParser.ArgContext>? = null // jaką zawiera wartość
    var targetContext: PseudoAsmParser.TargetContext? = null // jaką zawiera wartość
    var name: String = ""

    override fun toString(): String {
        return "reg $numer, canBeRemoved=$canBeRemoved, content1=${argContext?.getOrNull(0)?.text}, content2=${argContext?.getOrNull(1)?.text}"
    }
}

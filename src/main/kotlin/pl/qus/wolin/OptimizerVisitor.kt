package pl.qus.wolin

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import pl.qus.wolin.exception.ReplaceInArgException

class OptimizerVisitor : PseudoAsmParserBaseVisitor<PseudoAsmStateObject>() {
    val state = PseudoAsmStateObject()

    val registers = mutableMapOf<Int, Register>()


    // TODO
    // błąd optymalizatora!
    // kiedy do SP zapisujemy rejestr SPF, lub inny, to po napotkaniu alloc SPF musimy dodać do wektora tego rejestru n
    // a po napotkaniu free SPF musimy odjąć od wektora tego rejestru n!
    //
    // np:
    // let SP(0)<__wolin_reg18>[any*] = SPF(0)<pl.qus.wolin.main..testowa>[any*] // przez sprawdzacz typow - simple id from var
    // napotykamy alloc SPF, #3
    // więc w SP(0) powinno być teraz:
    // SPF(3)<pl.qus.wolin.main..testowa>[any*]

    /**
     * Zebranie wszystkich możliwych rejestrów
     */
    fun gatherAllSPRegs(ctx: PseudoAsmParser.PseudoAsmFileContext) {
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
        registers.forEach {
            checkIfOnlyOneAssignment(ctx, it.value.numer)
        }
        registers.filter { it.value.singleAssign }.forEach {
            println("Single assignment:${it}")
        }
    }

    fun replaceSingleAssignmentRegWithItsValue(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        do {
            println("=== Replace pass ===")
            registers.filter { it.value.singleAssign }.forEach {
                replaceAllOccurencesOfSingleAssignRegistersWithTheirValues(ctx, it.value.numer)
            }
        } while (state.replaced)
    }

    fun unmarkIrreplacableRegs(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        // sprawdzić, czy dany rejestr występuje tylko jako free/alloc +ew. let rejestr =
        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val template = linie.next()

                val target = extractTarget(template)
                val firstArg = extractReg(template, 0)
                val secondArg = extractReg(template, 1)

                val instrukcja = template.instrukcja().simpleIdentifier().text

                val targetDeref = template.target(0)?.operand()?.referencer(0)?.text

                if (instrukcja != "alloc" && instrukcja != "free") {
//                    if (firstArg != null) {
//                        println("Nie można usunąć ${firstArg.numer} bo ma first arg w $instrukcja")
//                        registers[firstArg.numer]?.canBeRemoved = false
//                    }

                    if (secondArg != null) {
                        println("Nie można usunąć ${secondArg.numer} bo ma second arg  w $instrukcja")
                        registers[secondArg.numer]?.canBeRemoved = false
                    }

                    if (instrukcja != "let" && instrukcja != "bit" && target != null) {
                        println("Nie można usunąć ${target.numer} bo nie let i ma target w $instrukcja")
                        registers[target.numer]?.canBeRemoved = false
                    }

                    val exTar = registers[target?.numer]

                    if (targetDeref == "&") {
                        println("Nie można usunąć ${target!!.numer} bo target deref jest & (arc cont:${exTar?.argContext?.text})")
                        registers[target.numer]?.canBeRemoved = false
                    }
                }
            }
        }
    }

    fun markReplacablePointerTargets(ctx: PseudoAsmParser.PseudoAsmFileContext) {
/*
    1) zmienna w adresie

    alloc SP<__wolin_reg2>, #2
    let SP(0)<__wolin_reg2>[ubyte*] = 53269[ubyte*]
    bit &SP(0)<__wolin_reg2>[ubyte*] = #4[ubyte], #1 // mamy docelowy w trybie & - wstawić
    free SP<__wolin_reg2>, #2

    powinno dać:
    bit 53269[ubyte] = #4[ubyte], #1 // mamy docelowy w trybie & - wstawić

    2) pozostałe zmienne

    alloc SP, #2
    let SP(0)[ubyte*] = SP(2)[ubyte*]
    bit &SP(0)[ubyte*] = #4[ubyte]
    free SP, #2

    powinno dać:
    bit SP(2)[ubyte] = #4[ubyte]

     jeśli rejestr jest wkaźnikiem i podstawiliśmy do niego wartość
     to każde podstawienie &reg[typ*] do tego rejestru można zastąpić przez .reg[typ]

 */

        val pointerRegs = registers
            .filter { !it.value.canBeRemoved && it.value.firstAssignIsPointer() }
            .filter { extractStackType(it.value.argContext?.operand()!!) != "SPF" }

        registers.forEach { it.value.canBeRemoved = false }
        pointerRegs.forEach { it.value.canBeRemoved = true }

        do {
            pointerRegs.forEach {
                replaceAllOccurencesOfPointerRegister(ctx, it.key)
            }
        } while (state.replaced)

        removeAndShiftArgs(ctx)
    }


    fun optimizeReturns() {
        /*
label __wolin_pl_qus_wolin_suma
alloc SP<__wolin_reg3>, #2
let SP(0)<__wolin_reg3>[ubyte*] = *SPF(1)<pl.qus.wolin.suma.a>[ubyte]
add &SP(0)<__wolin_reg3>[ubyte*] = &SP(0)<__wolin_reg3>[ubyte*], SPF(0)<pl.qus.wolin.suma.b>[ubyte]
let SPF(2)<returnValue>[ubyte] = SP(0)<__wolin_reg3>[ubyte*]
free SP<__wolin_reg3>, #2
free SPF, #2
ret

1. sprawdzamy, co jest podstawiane do <returnValue> -- reg3

2. zastępujemy wszystkie wystąpienia reg3 przez returnValue i usuwamy to podstawienie:

label __wolin_pl_qus_wolin_suma
let SPF(2)<returnValue>[ubyte] = *SPF(1)<pl.qus.wolin.suma.a>[ubyte]
add &SP(0)<__wolin_reg3>[ubyte*] = SPF(2)<returnValue>[ubyte], SPF(0)<pl.qus.wolin.suma.b>[ubyte]
free SPF, #2
ret


         */
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

                        val consolidatedOp = if(consolidatedSum > 0)
                            "free"
                        else
                            "alloc"

                        println("$currentSize + $prevSize = $consolidatedSum")

                        // linia.instrukcja.simpleIdentifier
                        val operandContext =previous!!.getChild(0)!!.getChild(0) as PseudoAsmParser.SimpleIdentifierContext
                        operandContext.children[0] = createTerminalNode(consolidatedOp)

                        val valueContext = getSecondArg(previous!!).getChild(0).getChild(0).getChild(0) as PseudoAsmParser.ImmediateContext

                        valueContext.children[1] = createTerminalNode(consolidatedSum.toString())

                        linieIterator.remove()
                    } else {
                        previous = current
                    }


                    /*
freeSP<>,#4  // x = x+4
allocSP<>,#2 // x = x-2

// suma = 4 - 2 = 2 -> freeSP #2

freeSP<>,#2  // x = x-4
allocSP<>,#4 // x = x+2

// suma = -4 + 2 = -2 -> allocSP #2

 */
                    //linieIterator.
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
                        } else if (/*(instrukcja == "let" || instrukcja == "bit") &&*/target?.numer == removedRegistr.numer && linia.arg().size == 1 && refType != "&") {
                            println("usuwam pierwsze podstawienie do ${removedRegistr.numer}")
                            linieIterator.remove()
                        } else if (state.insideOptimizedReg == removedRegistr.numer) {
                            // todo - przesunąć rejestry
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
        val indeks =
            if (operand.children[0] is PseudoAsmParser.ReferencerContext)
                (((operand.children[1] as PseudoAsmParser.ValueContext).children[0] as PseudoAsmParser.AddressedContext).children[2] as PseudoAsmParser.IndexContext)
            else
                (((operand.children[0] as PseudoAsmParser.ValueContext).children[0] as PseudoAsmParser.AddressedContext).children[2] as PseudoAsmParser.IndexContext)

        val node = indeks.children[0] as TerminalNodeImpl
        (node.symbol as CommonToken).text = vector.toString()
    }

    private fun replaceAllOccurencesOfPointerRegister(
        ctx: PseudoAsmParser.PseudoAsmFileContext,
        regNr: Int
    ) {
        state.replaced = false

        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val linia = linie.next()

                val instrukcja = linia.instrukcja().simpleIdentifier().text


                if (instrukcja != "free" && instrukcja != "alloc") {
                    val targetReferencer = linia.target(0)?.operand()?.referencer(0)?.text

                    val target = extractTarget(linia)
                    val firstArg = extractReg(linia, 0)
                    val secondArg = extractReg(linia, 1)

                    val a1Referencer = linia.arg(0)?.operand()?.referencer(0)?.text
                    val a2Referencer = linia.arg(1)?.operand()?.referencer(0)?.text

                    if (target?.numer == regNr && targetReferencer == "&") {
                        println("\nMogę zastąpić tu pointer:${linia.text}")
                        try {
                            val correctedTarget = replaceInTarget(linia.target(0), registers[regNr]!!.argContext!!)

                            val kopia = PseudoAsmParser.ArgContext(
                                correctedTarget.ruleContext as ParserRuleContext,
                                correctedTarget.invokingState
                            )
                            kopia.copyFrom(correctedTarget)

                            linia.children[1] = correctedTarget
                            print("Po zastąpieniu:${linia.text}")
                            state.replaced = true
                        } catch (ex: java.lang.Exception) {
                            println("BŁĄD PODMIANY POINTERA TARGET!")
                        }
                    }

                    if (firstArg?.numer == regNr && a1Referencer == "&") {
                        println("\nMogę zastąpić tu pierwszy arg:${linia.text}")
                        try {
                            val corrected1arg = replaceInArg(linia.arg(0), registers[regNr]!!.argContext!!)

                            val kopia = PseudoAsmParser.ArgContext(
                                corrected1arg.ruleContext as ParserRuleContext,
                                corrected1arg.invokingState
                            )
                            kopia.copyFrom(corrected1arg)
                            setFirstArg(linia, corrected1arg)
                            print("Po zastąpieniu:${linia.text}")
                            state.replaced = true
                        } catch (ex: java.lang.Exception) {
                            println("BŁĄD PODMIANY POINTERA ARG1!")
                        }
                    }
                    if (secondArg?.numer == regNr && a2Referencer == "&") {
                        println("\nMogę zastąpić tu drugi arg:${linia.text}")
                        try {
                            val corrected1arg = replaceInArg(linia.arg(1), registers[regNr]!!.argContext!!)

                            val kopia = PseudoAsmParser.ArgContext(
                                corrected1arg.ruleContext as ParserRuleContext,
                                corrected1arg.invokingState
                            )
                            kopia.copyFrom(corrected1arg)
                            setSecondArg(linia, corrected1arg)
                            print("Po zastąpieniu:${linia.text}")
                            state.replaced = true
                        } catch (ex: java.lang.Exception) {
                            println("BŁĄD PODMIANY POINTERA ARG2!")
                        }
                    }

                }
            }
        }
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

                val instrukcja = linia.instrukcja().simpleIdentifier().text

//                if (instrukcja == "free") {
//                    val spfDelta = extractAllocSize(linia, "SPF")
//                    if(spfDelta!=null) {
//                        registers.forEach { spfRegContext ->
//                            try {
//                                // TODO sprawdzić, czy to na SPF, jak tak - przesunąć
//                                val reg = extractStackType(spfRegContext.value.argContext!!.operand())
//                                if(reg == "SPF") {
//                                    val operandContext = spfRegContext.value.argContext?.children?.get(0) as PseudoAsmParser.OperandContext
//                                    val currentVector = extractSPVector(spfRegContext.value.argContext!!.operand())
//                                    val newVector = currentVector-spfDelta
//                                    //println("przesuwam rejestrze ${spfRegContext.key} wektor SPF: $newVector!")
//                                    changeVector(operandContext, newVector)
//                                    spfRegContext.value.argContext?.children?.set(0,copy(operandContext))
//                                }
//                            } catch (ex: Exception) {
//
//                            }
//                        }
//                    }
//                }
//                else if (instrukcja == "alloc") {
//                    val spfDelta = extractAllocSize(linia, "SPF")
//                    if(spfDelta!=null) {
//                        registers.forEach { spfRegContext ->
//                            try {
//                                // TODO sprawdzić, czy to na SPF, jak tak - przesunąć
//                                val reg = extractStackType(spfRegContext.value.argContext!!.operand())
//                                if(reg == "SPF") {
//                                    val operandContext = spfRegContext.value.argContext?.children?.get(0) as PseudoAsmParser.OperandContext
//                                    val currentVector = extractSPVector(spfRegContext.value.argContext!!.operand())
//                                    val newVector = currentVector+spfDelta
//                                    //println("przesuwam rejestrze ${spfRegContext.key} wektor SPF: $newVector!")
//                                    changeVector(operandContext, newVector)
//                                    spfRegContext.value.argContext?.children?.set(0,copy(operandContext))
//                                }
//                            } catch (ex: Exception) {
//
//                            }
//                        }
//                    }
//                }
//                else /*
                if (instrukcja != "free" && instrukcja != "alloc") {
                    if (firstArg?.numer == regNr) {
                        println("====================================================================")
                        println("oper target = *replace*, arg\n${linia.text}")
//                        try {
                            val correctedFirstArg = replaceInArg(linia.arg(0), registers[regNr]!!.argContext!!)

                            val kopia = PseudoAsmParser.ArgContext(
                                correctedFirstArg.ruleContext as ParserRuleContext,
                                correctedFirstArg.invokingState
                            )
                            kopia.copyFrom(correctedFirstArg)

                            setFirstArg(linia, correctedFirstArg)

                            print("${linia.text}")
                            state.replaced = true
//                        } catch (ex: ReplaceInArgException) {
//                            println("************ Błąd optymalizacji!")
//                        }
                    }
                    if (secondArg?.numer == regNr) {
                        println("====================================================================")
                        println("oper target = arg, *replace*\n${linia.text}")
//                        try {
                            val correctedSecondArg = replaceInArg(linia.arg(1), registers[regNr]!!.argContext!!)
                            setSecondArg(linia, correctedSecondArg)

                            print("${linia.text}")
                            state.replaced = true
//                        } catch (ex: java.lang.Exception) {
//                            println("************ Błąd optymalizacji!")
//                        }
                    }
                }
            }
        }
    }

    private fun replaceInArg(
        destination: PseudoAsmParser.ArgContext,
        source: PseudoAsmParser.ArgContext
    ): PseudoAsmParser.ArgContext {

        val s = source.text
        val d = destination.text
        val sourceTypeRef = source.operand().typeName().firstOrNull()?.referencer()?.firstOrNull()?.text


        if (destination.operand().referencer(0)?.text == "&" && source.operand().referencer(0)?.text == "*") {
            // &(destination) a source jest *X -> X
            ((source.children[0] as PseudoAsmParser.OperandContext).children[0] as PseudoAsmParser.ReferencerContext).children.clear()
            println("drop pointer &*")
        }
        else if(destination.operand().referencer(0)?.text == "&" &&  sourceTypeRef == "*") {
            println("dereferencing pointer")
        }
        else if (destination.operand().referencer(0)?.text == "&" && source.operand().referencer(0)?.text == null) {
            // &(destination) a source jest X -> błąd
            throw ReplaceInArgException("Can't insert $s into &(.)")
        } else if (destination.operand().referencer(0)?.text == "*" && source.operand().referencer(0)?.text == "*") {
            // *(destination) a source jest *X -> błąd
            throw ReplaceInArgException("Can't insert $s* into *(.)")
        } else if (destination.operand().referencer(0)?.text == "*" && source.operand().referencer(0)?.text == null) {
            // *(destination) a source jest X -> *X
            //source.operand().referencer().add(PseudoAsmParser.ReferencerContext())
            println("pointer")
        } else {
            println("straight replace")
            // else -> X
        }

        return source
    }


    private fun replaceInTarget(
        destination: PseudoAsmParser.TargetContext,
        source: PseudoAsmParser.ArgContext
    ): PseudoAsmParser.TargetContext {

        val s = source.text
        val d = destination.text


        if (destination.operand().referencer(0)?.text == "&" && source.operand().referencer(0)?.text == "*") {
            // &(destination) a source jest *X -> X
            ((source.children[0] as PseudoAsmParser.OperandContext).children[0] as PseudoAsmParser.ReferencerContext).children.clear()
            println("&*")
        } else if (destination.operand().referencer(0)?.text == "&" && source.operand().referencer(0)?.text == null) {
            // &(destination) a source jest X -> błąd
            throw Exception("Can't optimize")
        } else if (destination.operand().referencer(0)?.text == "*" && source.operand().referencer(0)?.text == "*") {
            // *(destination) a source jest *X -> błąd
            throw Exception("Can't optimize")
        } else if (destination.operand().referencer(0)?.text == "*" && source.operand().referencer(0)?.text == null) {
            // *(destination) a source jest X -> *X
            //source.operand().referencer().add(PseudoAsmParser.ReferencerContext())
            println("wskaźnik")
        } else {
            println("1:1")
            // else -> X
        }

        val zw = PseudoAsmParser.TargetContext(destination.ruleContext as ParserRuleContext, destination.invokingState)
        zw.children = source.children
        //return source
        return zw
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

                val nazwa = linia.arg(0)?.operand()?.name(0)?.identifier()?.simpleIdentifier(0)?.text // __wolin_reg3

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
                        linia.arg().size > 1 -> target.singleAssign = false
                        instrukcja == "let" -> {
                            target.singleAssign = true
                            if (targetRef == null)
                                target.argContext = linia.arg(0)
//                            else
//                                println("tu!")
                        }
                        else -> target.singleAssign = false
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

    fun dumpRedundantRegs() {
        registers.filter { it.value.singleAssign }.forEach {
            println(it.value)
        }
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

    fun setFirstArg(linia: PseudoAsmParser.LiniaContext, child: PseudoAsmParser.ArgContext) {
        if (linia.target().isNotEmpty())
            linia.children[3] = child
        else
            linia.children[1] = child
    }

    fun setSecondArg(linia: PseudoAsmParser.LiniaContext, child: PseudoAsmParser.ArgContext) {
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
    var argContext: PseudoAsmParser.ArgContext? = null // jaką zawiera wartość
    var singleAssign: Boolean = true // czy można usunąć
    var name: String = ""

    override fun toString(): String {
        return "reg $numer, redundant=$singleAssign, content=${argContext?.text}"
    }

    fun firstAssignIsPointer(): Boolean {
        return argContext?.operand()?.referencer()?.firstOrNull()?.REFERENCE() != null
                || argContext?.operand()?.typeName()?.firstOrNull()?.referencer()?.firstOrNull()?.REFERENCE() != null
    }

}

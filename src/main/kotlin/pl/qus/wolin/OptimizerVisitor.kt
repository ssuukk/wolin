package pl.qus.wolin

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import java.lang.IndexOutOfBoundsException
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

                    if (secondArg != null) {
                        println("Nie można usunąć ${secondArg.numer} bo ma second arg  w ${linia.text}")
                        registers[secondArg.numer]?.canBeRemoved = false
                    }

                    if (instrukcja != "let" && target != null) {
                        println("Nie można usunąć ${target.numer} bo nie let i ma target w ${linia.text}")
                        registers[target.numer]?.canBeRemoved = false
                    }

//                    if (targetDeref == "&") {
//                        println("Nie można usunąć ${target!!.numer} bo target deref jest & (arc cont:${exTar?.argContext?.text})")
//                        registers[target.numer]?.canBeRemoved = false
//                    }
                }
            }
        }
    }

    fun markReplacablePointerTargets(ctx: PseudoAsmParser.PseudoAsmFileContext) {

        println("== Marking replacable pointer regs ==")
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
            .filter { it.value.firstAssignIsPointer() }

//        val pointerRegs = registers
//            .filter { !it.value.canBeRemoved && it.value.firstAssignIsPointer() }
//            .filter { extractStackType(it.value.argContext?.operand()!!) != "SPF" }

        registers.forEach { it.value.canBeRemoved = false }
        pointerRegs.forEach {
            it.value.canBeRemoved = true
            println("Pointer reg can be removed:${it.value}")
        }

        do {
            pointerRegs.forEach {
                println("Trying to replace pointer ${it.value}")
                replaceAllOccurencesOfPointerRegister(ctx, it.key)
                if (!state.replaced)
                    it.value.canBeRemoved = false
            }
        } while (state.replaced)

        removeAndShiftArgs(ctx)
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





                    if(targetOps?.contains("*") == true && targetOps?.contains("&")) {
                        current.target()[0].operand().children.removeAll { it.text == "&" || it.text == "*" }
                    }

                    if(arg0Ops?.contains("*") == true && arg0Ops?.contains("&")) {
                        current.arg()[0].operand().children.removeAll { it.text == "&" || it.text == "*" }
                    }

                    if(arg1Ops?.contains("*") == true && arg1Ops?.contains("&")) {
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

                        println("$currentSize + $prevSize = $consolidatedSum")

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
                        } else if (/*(instrukcja == "let" || instrukcja == "bit") &&*/target?.numer == removedRegistr.numer && linia.arg().size == 1 && refType != "&") {
                            println("usuwam pierwsze podstawienie do ${removedRegistr.numer}")
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
                    val targetTypeReferencer =
                        linia.target(0)?.operand()?.typeName()?.firstOrNull()?.referencer()?.firstOrNull()?.text
                    val destinationTypeReferencer =
                        registers[regNr]!!.argContext!!.operand()?.typeName()?.firstOrNull()?.referencer()
                            ?.firstOrNull()?.text

                    val target = extractTarget(linia)
                    val firstArg = extractReg(linia, 0)
                    val secondArg = extractReg(linia, 1)

                    val a1Referencer = linia.arg(0)?.operand()?.referencer(0)?.text
                    val a2Referencer = linia.arg(1)?.operand()?.referencer(0)?.text

                    if (target?.numer == regNr && (targetReferencer == "&" /*|| (targetReferencer.isNullOrBlank() && targetTypeReferencer == "*")*/)) {
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
                            println(ex.message)
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
                            println(ex.message)
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
                            println(ex.message)
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

                val target = extractTarget(linia)

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

                val targetDeref = linia.target(0)?.operand()?.referencer(0)?.text

                if (instrukcja != "free" && instrukcja != "alloc") {
                    if (target?.numer == regNr && targetDeref == "&") {
                        println("====================================================================")
                        println("oper *replace* = arg, arg\n${linia.text}")

                        val correctedTarget = replaceInTarget(linia.target(0), registers[regNr]!!.argContext!!)

                        val kopia = PseudoAsmParser.TargetContext(
                            correctedTarget.ruleContext as ParserRuleContext,
                            correctedTarget.invokingState
                        )

                        kopia.copyFrom(correctedTarget)

                        linia.children[1] = correctedTarget

                        print("${linia.text}")
                        state.replaced = true

                    }
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
        intoThisField: PseudoAsmParser.ArgContext,
        thisField: PseudoAsmParser.ArgContext
    ): PseudoAsmParser.ArgContext {

        //TODO - ponieważ nie upraszczam referencji od razu, potrzebny tu mechanizm, który je będzie kumulował,
        // bo w tej chwili, jeżeli wstawię *xx to pola &xx, to & zostanie nadpisany *, a potrzebuje zostawić je oba

        val s = thisField.text
        val d = intoThisField.text
        val sourceTypeRef = thisField.operand().typeName().firstOrNull()?.referencer()?.firstOrNull()?.text

/*
        if (intoThisField.operand().referencer(0)?.text == "&" && thisField.operand().referencer(0)?.text == "*") {
            // &(destination) a source jest *X -> X
            ((thisField.children[0] as PseudoAsmParser.OperandContext).children[0] as PseudoAsmParser.ReferencerContext).children.clear()
            println("drop pointer &*")
        }
        else if(intoThisField.operand().referencer(0)?.text == "&" &&  sourceTypeRef == "*") {
            println("dereferencing pointer")
        }
        else if (intoThisField.operand().referencer(0)?.text == "&" && thisField.operand().referencer(0)?.text == null) {
            // &(destination) a source jest X -> błąd

            // dereferencja nie-pointera, ok - po prostu wstawiamy wartość

            val a = thisField.operand().value().immediate().text

//            throw ReplaceInArgException("Can't insert $s into &(.)")
//            ((source.children[0] as PseudoAsmParser.OperandContext).children[0] as PseudoAsmParser.ReferencerContext).children.clear()
//            println("drop pointer &*")
        } else if (intoThisField.operand().referencer(0)?.text == "*" && thisField.operand().referencer(0)?.text == "*") {
            // *(destination) a source jest *X -> błąd
            throw ReplaceInArgException("Can't insert $s* into *(.)")
        } else if (intoThisField.operand().referencer(0)?.text == "*" && thisField.operand().referencer(0)?.text == null) {
            // *(destination) a source jest X -> *X
            //source.operand().referencer().add(PseudoAsmParser.ReferencerContext())
            println("pointer")
        } else {
            println("straight replace")
            // else -> X
        }
*/

        val intoReference = intoThisField.operand().referencer()
        val thisReference = thisField.operand().referencer()

        val referenceryRazem = intoReference + thisReference
        if (thisField.operand().children[0] is PseudoAsmParser.ReferencerContext) {
            // usunąć pierwszy kontekst referencera, zastąpić go referenceryRazem, dopisać resztę
            val stareDzieci = thisField.operand().children.drop(1)
            thisField.operand().children = referenceryRazem + stareDzieci
        } else {
            val stareDzieci = thisField.operand().children
            thisField.operand().children = referenceryRazem + stareDzieci
        }

        return thisField
    }


    private fun replaceInTarget(
        intoThisField: PseudoAsmParser.TargetContext,
        thisField: PseudoAsmParser.ArgContext
    ): PseudoAsmParser.TargetContext {

        //TODO - ponieważ nie upraszczam referencji od razu, potrzebny tu mechanizm, który je będzie kumulował,
        // bo w tej chwili, jeżeli wstawię *xx to pola &xx, to & zostanie nadpisany *, a potrzebuje zostawić je oba

/*
        val s = thisField.text
        val d = intoThisField.text


        if (intoThisField.operand().referencer(0)?.text == "&" && thisField.operand().referencer(0)?.text == "*") {
            // &(destination) a source jest *X -> X
            ((thisField.children[0] as PseudoAsmParser.OperandContext).children[0] as PseudoAsmParser.ReferencerContext).children.clear()
            println("&*")
        } else if (intoThisField.operand().referencer(0)?.text == "&" && thisField.operand().referencer(0)?.text == null && thisField.operand().typeName().firstOrNull()?.referencer()?.firstOrNull()?.text == null) {
            //val a = source.operand().typeName().firstOrNull()?.referencer()?.firstOrNull()?.text
            throw Exception("Can't put plain (${thisField.text}) value into &")
        } else if (intoThisField.operand().referencer(0)?.text == "*" && thisField.operand().referencer(0)?.text == "*") {
            // *(destination) a source jest *X -> błąd
            throw Exception("Can't put pointer value (${thisField.text}) into *")
        } else if (intoThisField.operand().referencer(0)?.text == "*" && thisField.operand().referencer(0)?.text == null) {
            // *(destination) a source jest X -> *X
            //source.operand().referencer().add(PseudoAsmParser.ReferencerContext())
            println("wskaźnik")
        } else {
            println("1:1")
            // else -> X
        }
*/

        val intoReference = intoThisField.operand().referencer()
        val thisReference = thisField.operand().referencer()
        val zwrotka =
            PseudoAsmParser.TargetContext(intoThisField.ruleContext as ParserRuleContext, intoThisField.invokingState)

        val referenceryRazem = intoReference + thisReference
        if (thisField.operand().children[0] is PseudoAsmParser.ReferencerContext) {
            // usunąć pierwszy kontekst referencera, zastąpić go referenceryRazem, dopisać resztę
            val stareDzieci = thisField.operand().children.drop(1)
            thisField.operand().children = referenceryRazem + stareDzieci
        } else {
            val stareDzieci = thisField.operand().children
            thisField.operand().children = referenceryRazem + stareDzieci
        }


        zwrotka.children = thisField.children

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
                            target.argContext = linia.arg(0)
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
    //var singleAssign: Boolean = true // czy można usunąć
    var name: String = ""

    override fun toString(): String {
        return "reg $numer, canBeRemoved=$canBeRemoved, content=${argContext?.text}"
    }

    fun firstAssignIsPointer(): Boolean {
        return argContext?.operand()?.referencer()?.firstOrNull()?.REFERENCE() != null
                || argContext?.operand()?.typeName()?.firstOrNull()?.referencer()?.firstOrNull()?.REFERENCE() != null
    }

}

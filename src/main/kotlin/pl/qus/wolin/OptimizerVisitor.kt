package pl.qus.wolin

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import sun.awt.SunHints
import javax.smartcardio.TerminalFactory

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

    fun checkAllOccurencesReplaced(ctx: PseudoAsmParser.PseudoAsmFileContext) {
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
                    if (firstArg != null) {
                        println("Nie można usunąć ${firstArg.numer}")
                        registers[firstArg.numer]?.canBeRemoved = false
                    }

                    if (secondArg != null) {
                        println("Nie można usunąć ${secondArg.numer}")
                        registers[secondArg.numer]?.canBeRemoved = false
                    }

                    if (instrukcja != "let" && target != null) {
                        println("Nie można usunąć ${target.numer}")
                        registers[target.numer]?.canBeRemoved = false
                    }

                    if (targetDeref == "&") {
                        println("Nie można usunąć ${target!!.numer}")
                        registers[target!!.numer]?.canBeRemoved = false
                    }
                }
            }
        }
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
        ctx.children.iterator().let { linieIterator ->
            while (linieIterator.hasNext()) {
                val linia = linieIterator.next()

                if (linia is PseudoAsmParser.LiniaContext) {

                    // jeśli free/alloc lub przypisanie do danego rejestru, to usunąć i przesunąć wektory

                    val instrukja = linia.instrukcja().simpleIdentifier().text

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

    fun removeAndShift(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        registers.filter { it.value.canBeRemoved }.map { it.value }.forEach { removedRegistr ->
            ctx.children.iterator().let { linieIterator ->
                while (linieIterator.hasNext()) {
                    val linia = linieIterator.next()
                    if (linia is PseudoAsmParser.LiniaContext) {

                        // jeśli free/alloc lub przypisanie do danego rejestru, to usunąć i przesunąć wektory

                        val instrukja = linia.instrukcja().simpleIdentifier().text
                        val target = extractTarget(linia)

                        if (instrukja == "alloc" && state.insideOptimizedReg == -1) {
                            val r = createReg(linia)
                            if (r != null && r.numer == removedRegistr.numer) {
                                state.insideOptimizedReg = r.numer
                                println("usuwam alloc ${r.numer}")
                                linieIterator.remove()
                            }
                        } else if (instrukja == "free" && state.insideOptimizedReg == removedRegistr.numer) {
                            val r = createReg(linia)
                            if (r != null && r.numer == removedRegistr.numer) {
                                state.insideOptimizedReg = -1
                                println("usuwam free ${removedRegistr.numer}")
                                linieIterator.remove()
                            }
                        } else if (instrukja == "let" && target?.numer == removedRegistr.numer && linia.arg().size == 1) {
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
                                changeVector(
                                    (linia.children[3] as PseudoAsmParser.ArgContext).children[0] as PseudoAsmParser.OperandContext,
                                    vector
                                )
                            }

                            if (secondArg != null && secondArg.numer < removedRegistr.numer) {
                                val vector = extractSPVector(linia.arg(1).operand()) - removedRegistr.wielkość
                                changeVector(
                                    (linia.children[5] as PseudoAsmParser.ArgContext).children[0] as PseudoAsmParser.OperandContext,
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

                if (instrukcja == "free") {
                    val spfDelta = extractAllocSize(linia, "SPF")
                    if(spfDelta!=null) {
                        registers.forEach { spfRegContext ->
                            try {
                                // TODO sprawdzić, czy to na SPF, jak tak - przesunąć
                                val reg = extractStackType(spfRegContext.value.argContext!!.operand())
                                if(reg == "SPF") {
                                    val operandContext = spfRegContext.value.argContext?.children?.get(0) as PseudoAsmParser.OperandContext
                                    val currentVector = extractSPVector(spfRegContext.value.argContext!!.operand())
                                    val newVector = currentVector-spfDelta
                                    //println("przesuwam rejestrze ${spfRegContext.key} wektor SPF: $newVector!")
                                    changeVector(operandContext, newVector)
                                    spfRegContext.value.argContext?.children?.set(0,copy(operandContext))
                                }
                            } catch (ex: Exception) {

                            }
                        }
                    }
                }
                else if (instrukcja == "alloc") {
                    val spfDelta = extractAllocSize(linia, "SPF")
                    if(spfDelta!=null) {
                        registers.forEach { spfRegContext ->
                            try {
                                // TODO sprawdzić, czy to na SPF, jak tak - przesunąć
                                val reg = extractStackType(spfRegContext.value.argContext!!.operand())
                                if(reg == "SPF") {
                                    val operandContext = spfRegContext.value.argContext?.children?.get(0) as PseudoAsmParser.OperandContext
                                    val currentVector = extractSPVector(spfRegContext.value.argContext!!.operand())
                                    val newVector = currentVector+spfDelta
                                    //println("przesuwam rejestrze ${spfRegContext.key} wektor SPF: $newVector!")
                                    changeVector(operandContext, newVector)
                                    spfRegContext.value.argContext?.children?.set(0,copy(operandContext))
                                }
                            } catch (ex: Exception) {

                            }
                        }
                    }
                }
                else /*if (instrukcja != "free" && instrukcja != "alloc")*/ {
                    if (firstArg?.numer == regNr) {
                        println("Mogę zastąpić tu pierwszy:${linia.text}")
                        try {
                            val correctedFirstArg = replaceInArg(linia.arg(0), registers[regNr]!!.argContext!!)

                            val kopia = PseudoAsmParser.ArgContext(correctedFirstArg.ruleContext as ParserRuleContext, correctedFirstArg.invokingState)
                            kopia.copyFrom(correctedFirstArg)

                            linia.children[3] = correctedFirstArg
                            print("Po zastąpieniu:${linia.text}")
                            state.replaced = true
                        } catch (ex: java.lang.Exception) {
                            // tego nie da się podmienić
                        }
                    }
                    if (secondArg?.numer == regNr) {
                        println("Mogę zastąpić tu drugi:${linia.text}")
                        try {
                            val correctedSecondArg = replaceInArg(linia.arg(1), registers[regNr]!!.argContext!!)
                            linia.children[5] = correctedSecondArg
                            print("Po zastąpieniu:${linia.text}")
                            state.replaced = true
                        } catch (ex: java.lang.Exception) {
                            // tego nie da się podmienić
                        }
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

        return source
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
                        instrukcja == "let" /*&& nazwa != "returnValue"*/ -> {
                            // first arg == null -> not SP reg, shouldn't be opimized
                            target.singleAssign = true
                            target.argContext = linia.arg(0)
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
                val kopia = object: Token {
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
}

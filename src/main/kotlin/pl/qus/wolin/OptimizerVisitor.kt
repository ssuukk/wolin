package pl.qus.wolin

class OptimizerVisitor:  PseudoAsmParserBaseVisitor<PseudoAsmStateObject>() {
    val state = PseudoAsmStateObject()

    val registers = mutableMapOf<Int, Register>()

    fun gatherRegs(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val template = linie.next()

                if(template.instrukcja().simpleIdentifier().text == "alloc") {
                    val r = createReg(template)
                    if(r!=null) {
                        registers[r.numer] = r
                        println("wykryte:${r.wielkość},${r.numer}")
                    }
                }
            }
        }
    }

    fun markRemovableRegisters(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        registers.forEach {
            checkSingleReg(ctx, it.value.numer)
        }
    }

    fun replaceInFile(ctx: PseudoAsmParser.PseudoAsmFileContext, regNr: Int) {
        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val template = linie.next()

                val firstArg = extractReg(template, 0)
                val secondArg = extractReg(template, 1)

                val instrukcja = template.instrukcja().simpleIdentifier().text

                if(instrukcja != "free" && instrukcja != "alloc") {

                    if (firstArg?.numer == regNr) {
                        println("Mogę zastąpić tu pierwszy:${template.text}")
                        try {
                            replaceInArg(template.arg(0), registers[regNr]!!.argContext!!)
                        }
                        catch (ex: java.lang.Exception) {
                            // tego nie da się podmienić
                        }
                    }
                    if (secondArg?.numer == regNr) {
                        println("Mogę zastąpić tu drugi:${template.text}")
                        try {
                            template.arg()[1] = replaceInArg(template.arg(1), registers[regNr]!!.argContext!!)
                        }
                        catch (ex: java.lang.Exception) {
                            // tego nie da się podmienić
                        }
                    }
                }

            }
        }
    }

    private fun replaceInArg(destination: PseudoAsmParser.ArgContext, source: PseudoAsmParser.ArgContext): PseudoAsmParser.ArgContext {
        if(destination.operand().referencer(0)?.text == "&" && source.operand().referencer(0)?.text=="*") {
            // &(destination) a source jest *X -> X
            source.operand().referencer().clear()
            println("&*")
        }
        else if(destination.operand().referencer(0)?.text == "&" && source.operand().referencer(0)?.text==null) {
            // &(destination) a source jest X -> błąd
            throw Exception("Can't optimize")
        }
        else if(destination.operand().referencer(0)?.text == "*" && source.operand().referencer(0)?.text=="*") {
            // *(destination) a source jest *X -> błąd
            throw Exception("Can't optimize")
        }
        else if(destination.operand().referencer(0)?.text == "*" && source.operand().referencer(0)?.text==null) {
            // *(destination) a source jest X -> *X
            //source.operand().referencer().add(PseudoAsmParser.ReferencerContext())
            println("wskaźnik")
        }
        else {
            println("1:1")
            // else -> X
        }

        return source
    }

    private fun checkSingleReg(ctx: PseudoAsmParser.PseudoAsmFileContext, nr: Int) {
        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val template = linie.next()

                val instrukcja = template.instrukcja().simpleIdentifier().text

                val firstArg = extractReg(template, 0)
                val target = extractTarget(template)

                if(instrukcja == "alloc") {
                    if(firstArg?.numer == nr) {
                        state.insideOptimizedReg = true
                    }
                }
                else if(instrukcja == "free") {
                    if(firstArg?.numer == nr) {
                        state.insideOptimizedReg = false
                    }
                }
                else if(state.insideOptimizedReg && target?.numer == nr) {
                    // sprawdzić, czy jest to proste podstawienie, jeśli nie - ustawić redundant na false
                    when {
                        template.arg().size>1 -> target.candidate = false
                        instrukcja == "let" -> {
                            target.candidate = true
                            target.argContext = template.arg(0)
                        }
                        else -> target.candidate = false
                    }
                }
            }
        }
    }

    fun extractTarget(template: PseudoAsmParser.LiniaContext): Register? {
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

    fun extractReg(template: PseudoAsmParser.LiniaContext, nr: Int): Register? {
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

    fun createReg(template: PseudoAsmParser.LiniaContext): Register? {
        val stos = template.arg(0)?.operand()?.value()?.addressed()?.identifier()?.simpleIdentifier(0)?.text // SP
        val nazwa = template.arg(0)?.operand()?.name(0)?.identifier()?.simpleIdentifier(0)?.text // __wolin_reg3
        val wielkość = template.arg(1)?.operand()?.value()?.immediate()?.IntegerLiteral()?.text

        return if(stos == "SP") {
            val reg = Register()

            reg.numer = Integer.parseInt(nazwa!!.substring(11))
            reg.wielkość = Integer.parseInt(wielkość!!)
            reg
        } else null
    }

    fun dumpRedundantRegs() {
        registers.filter { it.value.candidate }.forEach {
            println(it.value)
        }
    }
}

class Register {
    var numer: Int = -1
    var wielkość: Int = -1
    var processed: Boolean = false // czy już próbowaliśmy go rugować
    var argContext: PseudoAsmParser.ArgContext? = null // jaką zawiera wartość
    var candidate: Boolean = true // czy można usunąć

    override fun toString(): String {
        return "reg $numer, redundant=$candidate, content=${argContext?.text}"
    }
}

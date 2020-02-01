package pl.qus.wolin

import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import pl.qus.wolin.components.*
import pl.qus.wolin.exception.FunctionNotFound
import pl.qus.wolin.exception.RegTypeMismatchException
import pl.qus.wolin.exception.VariableNotFound
import java.lang.Exception

enum class Pass {
    SYMBOLS, DECLARATION, TRANSLATION
}

class WolinVisitor(
    private val nazwaPliku: String,
    pass: Pass,
    private val tokenStream: CommonTokenStream
) : KotlinParserBaseVisitor<WolinStateObject>() {
    val state = WolinStateObject(pass)

    override fun visitFunctionBody(ctx: KotlinParser.FunctionBodyContext): WolinStateObject {
        if (ctx.block() != null)
            ctx.block()?.let {
                visitBlock(it)
            }
        else błędzik(ctx, "Unknown function body type")

        println("visiting function ${state.currentFunction?.fullName}")

        state.fnDeclFreeStackAndRet(state.currentFunction!!)

        state.rem("freeing call stack")
        //state.currentFunction?.releaseCalledFunctionsStack(state)

        state.rem("return from function body")
        when {
            state.currentFunction?.returnAddress != -1 -> state.code("goto ${state.currentFunction?.returnAddress}[adr]")
            state.currentFunction?.isInterrupt == true -> state.code("reti")
            else -> state.code("ret")
        }

        return state
    }

    override fun visitControlStructureBody(ctx: KotlinParser.ControlStructureBodyContext): WolinStateObject {
        when {
            ctx.expression() != null -> visitExpression(ctx.expression())
            ctx.block() != null -> visitBlock(ctx.block())
            else -> błędzik(ctx, "Unknown control structure")
        }

        return state
    }

    fun statementProcessor(it: KotlinParser.StatementContext, retVal: Zmienna? = null) {

        // wynik całego przypisania to Unit!

        when {
            // ========================================================
            it.blockLevelExpression() != null -> it.blockLevelExpression()?.let {

                state.allocReg("for expression")

                when {
                    it.expression()?.assignmentOperator()?.size != 0 -> {
                        if (state.pass != Pass.SYMBOLS) {

                            val operator = it.expression()?.assignmentOperator(0)

                            when {
                                operator?.ASSIGNMENT() != null -> {

                                    processAssignment(it,
                                        { visitDisjunction(it.expression()?.disjunction(0)!!) },
                                        { visitDisjunction(it.expression()?.disjunction(1)!!) }
                                    )

                                    state.switchType(Typ.unit, "assignment")
                                }
                                operator?.BIT_ASSIGNMENT() != null -> {
                                    processBitOp(
                                        it,
                                        { visitDisjunction(it.expression()?.disjunction(0)!!) },
                                        { visitDisjunction(it.expression()?.disjunction(1)!!) },
                                        BitOp.SetBit
                                    )

                                    state.switchType(Typ.unit, "bit op")
                                }
                                operator?.BIT_DEASSIGNMENT() != null -> {
                                    processBitOp(
                                        it,
                                        { visitDisjunction(it.expression()?.disjunction(0)!!) },
                                        { visitDisjunction(it.expression()?.disjunction(1)!!) },
                                        BitOp.ClearBit
                                    )

                                    state.switchType(Typ.unit, "bit op")
                                }
                                operator?.BIT_AND_ASSIGNMENT() != null -> {
                                    processBitOp(
                                        it,
                                        { visitDisjunction(it.expression()?.disjunction(0)!!) },
                                        { visitDisjunction(it.expression()?.disjunction(1)!!) },
                                        BitOp.AndBit
                                    )

                                    state.switchType(Typ.unit, "&= op")
                                }
                                operator?.BIT_OR_ASSIGNMENT() != null -> {
                                    processBitOp(
                                        it,
                                        { visitDisjunction(it.expression()?.disjunction(0)!!) },
                                        { visitDisjunction(it.expression()?.disjunction(1)!!) },
                                        BitOp.OrBit
                                    )

                                    state.switchType(Typ.unit, "|= op")

                                }
                                else -> {
                                    błędzik(it, "Unknown assignment operator in block")
                                }
                            }
                        }
                    }
                    it.expression() != null -> if (state.pass != Pass.SYMBOLS) {
                        visitExpression(it.expression())
                    }
                    else -> błędzik(it, "Unknown block level expression")
                }

                state.inferTopOperType()

                state.freeReg("for expression")

                if (retVal != null) {
                    state.code("let ${state.varToAsm(retVal)} = ${state.currentRegToAsm()} // assign block 'return value' to target variable")
                }
            }
            // ========================================================
            it.declaration() != null -> it.declaration()?.let {
                state.allocReg("for declaration ${it.text.replace("\n", "\\n")}")

                visitDeclaration(it)

                state.inferTopOperType()

                state.freeReg("for declaration ${it.text.replace("\n", "\\n")}")
            }
            // ========================================================
            else -> błędzik(it, "Unknown block level expression")
        }

    }

//    private fun dereferenceVariable(lewaStrona: KotlinParser.DisjunctionContext): WolinStateObject {
//        val simpleIdentifiers = mutableListOf<ParseTree>()
//
//        //println("lewa strona:${dump(lewaStrona,1)}")
//
//        lewaStrona.traverseFilter(simpleIdentifiers) {
//            it is KotlinParser.SimpleIdentifierContext
//        }
//
//        val isArray = lewaStrona.any {
//            it is KotlinParser.ArrayAccessContext
//        }
//
//        val isObject = lewaStrona.any {
//            it is KotlinParser.MemberAccessOperatorContext
//        }
//
//        when {
//            isObject -> {
//                błędzik(lewaStrona,"Nie umiem obsłużyć podstawienia do pola obiektu")
//                return state
//            }
//            isArray -> {
//                state.rem(" left side disjunction - prawie dobrze")
//
//                visitDisjunction(lewaStrona)
//                state.assignStack.assignLeftSideVar = state.currentReg
//                state.assignStack.arrayAssign = true
//
//                return state
//            }
//            else -> {
////                val ctx = simpleIdentifiers.first() as KotlinParser.SimpleIdentifierContext
////                val zmienna = state.findVarInVariablaryWithDescoping(ctx.Identifier().text)
////                state.assignStack.assignLeftSideVar = zmienna
////                state.switchType(zmienna.type, "by znajdźSimpleIdW")
//                visitDisjunction(lewaStrona)
//                state.assignStack.assignLeftSideVar = state.currentReg
//                state.assignStack.arrayAssign = false
//
//                return state
//            }
//        }
//    }


    override fun visitBlock(ctx: KotlinParser.BlockContext): WolinStateObject {
        state.currentScopeSuffix += "."

        val blockValue = state.allocReg("for block 'return value' ${ctx.text.replace("\n", "\\n")}")

        ctx.statements()?.statement()?.forEach {
            statementProcessor(it)
        }

        if (state.assignStack.isNotEmpty() && state.pass == Pass.TRANSLATION && !blockValue.type.isUnit) {
            checkTypeAndAddAssignment(
                ctx,
                state.assignStack.assignRightSideFinalVar,
                blockValue,
                "visit block",
                RegOper.VALUE,
                RegOper.VALUE
            )
        }

        state.freeReg(
            "for block 'return value' ${ctx.text.replace(
                "\n",
                "\\n"
            )}, type = ${state.currentWolinType}"
        )

        state.currentScopeSuffix = state.currentScopeSuffix.dropLast(1)

        return state
    }

    override fun visitExpression(ctx: KotlinParser.ExpressionContext): WolinStateObject {
        when {
            ctx.assignmentOperator().size == 1 -> {
                when {
                    ctx.assignmentOperator().first().ASSIGNMENT() != null -> {
                        processAssignment(ctx,
                            //{ dereferenceVariable(ctx.disjunction(0)) /*visitDisjunction(ctx.disjunction(0)) */ },
                            { visitDisjunction(ctx.disjunction(0)) },
                            { visitDisjunction(ctx.disjunction(1)) })
                    }
                    else -> błędzik(ctx, "Unknown assignment operator in expression")
                }
                //visitAssignmentOperator(ctx.assignmentOperator().first())
            }
            ctx.assignmentOperator().size > 1 -> błędzik(ctx, "don't know how to handle assignment operator >1")
            ctx.disjunction().size == 1 -> ctx.disjunction().firstOrNull()?.let {
                visitDisjunction(it)
            }
            else -> błędzik(ctx, "Unknown expression")
        }

        return state
    }


    override fun visitDisjunction(ctx: KotlinParser.DisjunctionContext): WolinStateObject {
        // nie ma or
        if (ctx.conjunction()?.size == 1)
            ctx.conjunction()?.firstOrNull()?.let {
                visitConjunction(it) // conjunction = and*
            }
        else {
            processTypePreservingOp(
                { visitConjunction(ctx.conjunction(0)) },
                { visitConjunction(ctx.conjunction(1)) },
                simpleResultFunction("or", Typ.bool),
                "or operation"
            )
        }

        return state
    }

    override fun visitConjunction(ctx: KotlinParser.ConjunctionContext): WolinStateObject {
        if (ctx.equalityComparison()?.size == 1)
            ctx.equalityComparison()?.firstOrNull()?.let {
                visitEqualityComparison(it)
            }
        else {
            processTypePreservingOp(
                { visitEqualityComparison(ctx.equalityComparison(0)) },
                { visitEqualityComparison(ctx.equalityComparison(1)) },
                simpleResultFunction("and", Typ.bool),
                "and operation"
            )
        }
        return state
    }

    override fun visitEqualityComparison(ctx: KotlinParser.EqualityComparisonContext): WolinStateObject {
        when {
            ctx.comparison().size == 1 -> ctx.comparison().firstOrNull()?.let {
                visitComparison(it)
            }
            ctx.equalityOperation().size > 1 -> błędzik(ctx, "equality op size > 1")
            ctx.equalityOperation().size == 1 -> {

                val oper = when (ctx.equalityOperation(0).text) {
                    "==" -> "evaleq"
                    "!=" -> "evalneq"
                    "<" -> "evallt"
                    ">" -> "evalgt"
                    "<=" -> "evaleqlt"
                    ">=" -> "evaleqgt"
                    else -> "unknown eq"
                }

                processTypeChangingOp(
                    { visitComparison(ctx.comparison(0)) },
                    { visitComparison(ctx.comparison(1)) },
                    { akt, lewy, prawy ->
                        state.code(
                            "$oper ${state.varToAsm(akt, RegOper.AMPRESAND)} = ${state.varToAsm(
                                lewy,
                                RegOper.AMPRESAND
                            )}, ${state.varToAsm(prawy, RegOper.AMPRESAND)} // two sides"
                        )

                        Typ.bool
                    },
                    "equality check: $oper"
                )
            }
            else -> błędzik(ctx, "Unknown eq comparison")
        }

        return state
    }

    override fun visitComparison(ctx: KotlinParser.ComparisonContext): WolinStateObject {
        when {
            ctx.namedInfix().size == 1 -> visitNamedInfix(ctx.namedInfix().first())
            ctx.comparisonOperator() != null -> {
                val oper = ctx.comparisonOperator()!!

                when {
                    oper.GE() != null -> {
                        processTypeChangingOp(
                            { visitNamedInfix(ctx.namedInfix(0)) },
                            { visitNamedInfix(ctx.namedInfix(1)) },
                            { wynik, lewa, prawa ->
                                state.code(
                                    "evalgteq ${state.varToAsm(wynik)} = ${state.varToAsm(lewa)}, ${state.varToAsm(
                                        prawa
                                    )}"
                                )
                                Typ.bool
                            },
                            "for >="
                        )
                    }
                    oper.LE() != null -> {
                        processTypeChangingOp(
                            { visitNamedInfix(ctx.namedInfix(0)) },
                            { visitNamedInfix(ctx.namedInfix(1)) },
                            { wynik, lewa, prawa ->
                                state.code(
                                    "evalgteq ${state.varToAsm(wynik)} = ${state.varToAsm(prawa)}, ${state.varToAsm(
                                        lewa
                                    )}"
                                )
                                Typ.bool
                            },
                            "for <="
                        )
                    }
                    oper.LANGLE() != null -> {
                        processTypeChangingOp(
                            { visitNamedInfix(ctx.namedInfix(0)) },
                            { visitNamedInfix(ctx.namedInfix(1)) },
                            { wynik, lewa, prawa ->
                                state.code(
                                    "evalless ${state.varToAsm(wynik, RegOper.AMPRESAND)} = ${state.varToAsm(
                                        lewa,
                                        RegOper.AMPRESAND
                                    )}, ${state.varToAsm(
                                        prawa, RegOper.AMPRESAND
                                    )}"
                                )
                                Typ.bool
                            },
                            "for <"
                        )
                    }
                    oper.RANGLE() != null -> {
                        processTypeChangingOp(
                            { visitNamedInfix(ctx.namedInfix(0)) },
                            { visitNamedInfix(ctx.namedInfix(1)) },
                            { wynik, lewa, prawa ->
                                state.code(
                                    "evalless ${state.varToAsm(wynik, RegOper.AMPRESAND)} = ${state.varToAsm(
                                        prawa,
                                        RegOper.AMPRESAND
                                    )}, ${state.varToAsm(
                                        lewa, RegOper.AMPRESAND
                                    )}"
                                )
                                Typ.bool
                            },
                            "for >"
                        )
                    }
                    else ->
                        błędzik(ctx, "Unknown comparison 2")

                }
            }
            else -> błędzik(ctx, "Unknown comparison")
        }

        return state
    }

    override fun visitEqualityOperation(ctx: KotlinParser.EqualityOperationContext): WolinStateObject {
        println("")

        state.rem(" tu porównanie")

        return state
    }


    override fun visitNamedInfix(ctx: KotlinParser.NamedInfixContext): WolinStateObject {
        when {
            ctx.inOperator().size > 0 -> błędzik(ctx, "In operator size > 0")
            ctx.elvisExpression().size == 1 -> ctx.elvisExpression().firstOrNull()?.let {
                visitElvisExpression(it)
            }
            else -> błędzik(ctx, "Unknown named infix")
        }

        return state
    }

    override fun visitElvisExpression(ctx: KotlinParser.ElvisExpressionContext): WolinStateObject {
        when {
            ctx.ELVIS().size > 0 -> błędzik(ctx, "elvis op size > 0")
            ctx.infixFunctionCall().size == 1 -> ctx.infixFunctionCall().firstOrNull()?.let {
                visitInfixFunctionCall(it)
            }
            else -> błędzik(ctx, "unknown Elvis expression")
        }

        return state
    }

    override fun visitInfixFunctionCall(ctx: KotlinParser.InfixFunctionCallContext): WolinStateObject {
        when {
            ctx.rangeExpression().size == 1 -> ctx.rangeExpression().firstOrNull()?.let {
                visitRangeExpression(it)
            }
            ctx.simpleIdentifier().size > 0 -> błędzik(
                ctx,
                "Unknown infix function call simple id: ${ctx.simpleIdentifier().first().text}"
            )
            else -> błędzik(ctx, "Unknown infix function call else")
        }

        return state
    }

    override fun visitRangeExpression(ctx: KotlinParser.RangeExpressionContext): WolinStateObject {
        when {
            ctx.RANGE().size > 0 -> błędzik(ctx, "range op size > 0")
            ctx.additiveExpression().size == 1 -> ctx.additiveExpression().firstOrNull()?.let {
                visitAdditiveExpression(it)
            }
            else -> błędzik(ctx, "Unknown range expression")
        }
        return state
    }

    override fun visitAdditiveExpression(ctx: KotlinParser.AdditiveExpressionContext): WolinStateObject {
        when {
            ctx.additiveOperator().size > 0 -> {

                try {
                    processTypePreservingOp(
                        { visitMultiplicativeExpression(ctx.multiplicativeExpression(0)) },
                        { visitMultiplicativeExpression(ctx.multiplicativeExpression(1)) },
                        simpleResultFunction("add"),
                        "adding operator"
                    )
                } catch (ex: RegTypeMismatchException) {
                    błędzik(
                        ctx,
                        "Type mismatch: ${ctx.multiplicativeExpression(0).text} can't be added to ${ctx.multiplicativeExpression(
                            1
                        ).text}"
                    )
                }
            }
            ctx.multiplicativeExpression().size == 1 -> ctx.multiplicativeExpression()?.firstOrNull()?.let {
                visitMultiplicativeExpression(it)
            }
            else -> błędzik(ctx, "Unknown additiv expression")
        }
        return state
    }

    override fun visitMultiplicativeExpression(ctx: KotlinParser.MultiplicativeExpressionContext): WolinStateObject {
        when {
            ctx.multiplicativeOperation().size > 0 -> {
                val op = ctx.multiplicativeOperation(0)
                when {
                    op?.MULT() != null -> {
                        processTypePreservingOp(
                            { visitPrefixUnaryExpression(ctx.typeRHS(0).prefixUnaryExpression(0)) },
                            { visitPrefixUnaryExpression(ctx.typeRHS(1).prefixUnaryExpression(0)) },
                            simpleResultFunction("mul"),
                            "multiplication"
                        )
                    }
                    op?.DIV() != null -> {
                        processTypePreservingOp(
                            { visitPrefixUnaryExpression(ctx.typeRHS(0).prefixUnaryExpression(0)) },
                            { visitPrefixUnaryExpression(ctx.typeRHS(1).prefixUnaryExpression(0)) },
                            simpleResultFunction("div"),
                            "division"
                        )
                    }
                    op?.MOD() != null -> {
                        processTypePreservingOp(
                            { visitPrefixUnaryExpression(ctx.typeRHS(0).prefixUnaryExpression(0)) },
                            { visitPrefixUnaryExpression(ctx.typeRHS(1).prefixUnaryExpression(0)) },
                            simpleResultFunction("mod"),
                            "modulo"
                        )
                    }
                    else -> błędzik(ctx, "Unknown multiplicative op")
                }
            }
            ctx.typeRHS().size == 1 -> ctx.typeRHS().firstOrNull()?.let {
                visitTypeRHS(it)
            }
            else -> błędzik(ctx, "Don't know how to process multiplicativeExpression")
        }
        return state
    }

//    override fun visitAssignmentOperator(ctx: KotlinParser.AssignmentOperatorContext): WolinStateObject {
//        when {
//            ctx.ASSIGNMENT() != null -> {
//                println("tu!")
//            }
//            else -> {
//                błędzik(ctx, "Unknown assignment operaor")
//            }
//        }
//
//        return state
//    }

    override fun visitTypeRHS(ctx: KotlinParser.TypeRHSContext): WolinStateObject {
        when {
            ctx.prefixUnaryExpression().size == 1 -> ctx.prefixUnaryExpression().firstOrNull()?.let {
                visitPrefixUnaryExpression(it)
            }
            ctx.typeOperation().size > 0 -> {
                błędzik(ctx, "There's a type in second prefixUnaryExpression - obsłużyć!!!")
                /*
             TypeRHSContext
             PrefixUnaryExpressionContext
              PostfixUnaryExpressionContext
               AtomicExpressionContext
                LiteralConstantContext
                 2<<<--- TERMINAL
             TypeOperationContext
              :<<<--- TERMINAL
             PrefixUnaryExpressionContext
              PostfixUnaryExpressionContext
               AtomicExpressionContext
                SimpleIdentifierContext
                 ubyte<<<--- TERMINAL

                 */
            }
            else -> błędzik(ctx, "Unknown TypeRHS")
        }
        return state
    }

    override fun visitPrefixUnaryExpression(ctx: KotlinParser.PrefixUnaryExpressionContext): WolinStateObject {
        when {
            ctx.prefixUnaryOperation().size > 0 -> {
                ctx.prefixUnaryOperation()?.forEach {
                    when {
                        it.DECR() != null -> {

                            błędzik(
                                ctx,
                                "Nie umiem wykonać prefix unary operation dla --"
                            )

//                            when {
//                                atomEx.simpleIdentifier() != null -> {
//                                    val identifier = atomEx.simpleIdentifier()?.Identifier()?.text
//                                        ?: throw Exception("No identifier for --")
//                                    val zmienna = state.findVarInVariablaryWithDescoping(identifier)
//
//                                    checkTypeAndAddAssignment(ctx, state.currentReg, zmienna, "operator --")
//
//                                    state.code(
//                                        "sub ${state.varToAsm(zmienna)} = ${state.varToAsm(
//                                            zmienna
//                                        )}, #1${zmienna.typeForAsm} // simple id"
//                                    )
//
//                                    state.switchType(zmienna.type, "-- operator")
//                                }
//                                atomEx.literalConstant() != null -> {
//
//                                    parseLiteralConstant(state.currentReg, atomEx.literalConstant())
//
//                                    state.code("sub ${state.currentRegToAsm()} = #${state.currentReg.immediateValue}${state.currentReg.typeForAsm}, #1${state.currentReg.typeForAsm}, add // literal const")
//                                    //state.currentReg.type = "Ubyte"
//                                }
//                                else -> błędzik(atomEx, "Nie wiem jak obsłużyć")
//                            }
                        }
                        it.INCR() != null -> {
//                            when {
//                                atomEx.simpleIdentifier() != null -> {
//                                    val identifier = atomEx.simpleIdentifier()?.Identifier()?.text
//                                        ?: throw Exception("No identifier for ++")
//                                    val zmienna = state.findVarInVariablaryWithDescoping(identifier)
//
//                                    checkTypeAndAddAssignment(ctx, state.currentReg, zmienna, "operator ++")
//
//                                    state.code(
//                                        "add ${state.varToAsm(zmienna)} = ${state.varToAsm(
//                                            zmienna
//                                        )}, #1${zmienna.typeForAsm} // simple id"
//                                    )
//
//                                    state.switchType(zmienna.type, "++ operator")
//                                }
//                                atomEx.literalConstant() != null -> {
//
//                                    parseLiteralConstant(state.currentReg, atomEx.literalConstant())
//
//                                    state.code("add ${state.currentRegToAsm()} = #${state.currentReg.immediateValue}${state.currentReg.typeForAsm}, #1${state.currentReg.typeForAsm}, add // literal const")
//                                    //state.currentReg.type = "Ubyte"
//                                }
//                                else -> błędzik(atomEx, "Nie wiem jak obsłużyć")
//                            }
                            błędzik(
                                ctx,
                                "Nie umiem wykonać prefix unary operation dla ++"
                            )
                        }
                        it.labelDefinition() != null -> {
                            val target = ctx.postfixUnaryExpression().atomicExpression().literalConstant()
                            val returnAt = ctx.prefixUnaryOperation().first().text

                            if (returnAt != "return@")
                                błędzik(
                                    ctx,
                                    "Unknown label definition for '${ctx.text}'"
                                )

                            val wartość = Zmienna(allocation = AllocType.LITERAL, fieldType = FieldType.DUMMY)
                            state.parseLiteralConstant(wartość, target)

                            state.currentFunction?.returnAddress = wartość.intValue.toInt()
                        }
                        else -> {
                            błędzik(
                                ctx,
                                "Nie umiem wykonać prefix unary operation dla '${ctx.text}'"
                            )
                        }
                    }
                }
            }
            ctx.postfixUnaryExpression() != null -> visitPostfixUnaryExpression(ctx.postfixUnaryExpression())
            else -> błędzik(ctx, "Unknown prefix unary exception")
        }

        return state
    }

    override fun visitPostfixUnaryExpression(ctx: KotlinParser.PostfixUnaryExpressionContext): WolinStateObject {
        val atomEx = ctx.atomicExpression()

        when {
            ctx.callableReference() != null -> błędzik(ctx, "Nie wiem co się robi z callable ref")
            ctx.postfixUnaryOperation().size == 0 && atomEx != null -> visitAtomicExpression(atomEx)
            ctx.postfixUnaryOperation().size > 1 -> błędzik(
                ctx,
                "Za dużo postfixUnaryOperation w postfixUnaryExpression"
            )
            ctx.postfixUnaryOperation().size == 1 && atomEx != null -> {
                val prawo = ctx.postfixUnaryOperation().first()

                when {
                    // =================================================================================================
                    prawo.callSuffix() != null -> {
                        val procName =
                            atomEx.simpleIdentifier()?.Identifier()?.text ?: throw Exception("Pusta nazwa procedury")

                        val callSuffix = prawo.callSuffix()

                        val prototyp = try {
                            val klasa = state.findClass(procName)
                            // TODO - tymczasowo dodać do funkcjarium konstruktor bez parametrów przy rejestrowaniu klasy
                            // konstruktor zawiera allokację i zwraca adres
//                            val fnName = state.functiary.keys.first { it == klasa.name }
//                            state.functiary[fnName]!!

                            state.findProc(klasa.name)
                        } catch (ex: Exception) {
                            try {
                                state.findProc(procName)
                            } catch (ex: FunctionNotFound) {
                                state.lambdaTypeToFunction(state.findVarInVariablaryWithDescoping(procName))
                            }
                        }

                        val arguments = callSuffix.valueArguments()

                        if (state.classDerefStack.isNotEmpty() && prototyp.arguments.size - 1 != arguments.valueArgument()?.size)
                            błędzik(ctx, "Wrong number of arguments in method call $procName")
                        else if (state.classDerefStack.isEmpty() && prototyp.arguments.size != arguments.valueArgument()?.size)
                            błędzik(ctx, "Wrong number of arguments in function call $procName")

                        state.switchType(prototyp.type, "function return type 1")
                        //state.inferTopOperType()

                        state.rem("")
                        state.rem("== FN_CALL: ${prototyp.fullName} ========")

                        state.fnCallAllocRetAndArgs(prototyp)

                        if (state.classDerefStack.isNotEmpty()) {
                            state.rem("== FN_CALL: ARG #THIS ${prototyp.fullName}")
                            val found = state.findStackVector(state.callStack, "${prototyp.fullName}.this")

                            state.code(
                                "let SPF(${found.first})[${found.second.type.typeForAsm}] = ${state.varToAsm(state.classDerefStack.peek())}"
                            )
                        }

                        if (prototyp.location != 0)
                            callAsm(ctx, prototyp, arguments)
                        else
                            callNormal(ctx, prototyp, arguments)

                        if (state.currentClass != null)
                            state.code("point HEAP = this")

                        state.rem("== FN_CALL END: ${prototyp.fullName} ========")

                        prototyp.releaseCalledFunction(state)

                        state.rem("")
                    }
                    // =================================================================================================
                    prawo.INCR() != null -> {
                        when {
                            atomEx.simpleIdentifier() != null -> {
                                val identifier = atomEx.simpleIdentifier()?.Identifier()?.text
                                    ?: throw Exception("No identifier for ++")
                                val zmienna = state.findVarInVariablaryWithDescoping(identifier)

                                checkTypeAndAddAssignment(
                                    ctx,
                                    state.currentReg,
                                    zmienna,
                                    "operator ++",
                                    RegOper.VALUE,
                                    RegOper.STAR
                                )

                                state.code(
                                    "add ${state.varToAsm(zmienna)} = ${state.varToAsm(zmienna)}, #1[${zmienna.type.typeForAsm}] // simple id"
                                )

                                state.switchType(zmienna.type, "++ operator", true)
                            }
                            atomEx.literalConstant() != null -> {

                                state.parseLiteralConstant(state.currentReg, atomEx.literalConstant())

                                state.code("add ${state.currentRegToAsm()} = #${state.currentReg.immediateValue}[${state.currentReg.type.typeForAsm}], #1${state.currentReg.type.typeForAsm}, add // literal const")
                                //state.currentReg.type = "Ubyte"
                            }
                            else -> błędzik(atomEx, "Nie wiem jak obsłużyć")
                        }
                    }
                    // =================================================================================================
                    prawo.DECR() != null -> {
                        when {
                            atomEx.simpleIdentifier() != null -> {
                                val identifier = atomEx.simpleIdentifier()?.Identifier()?.text
                                    ?: throw Exception("No identifier for --")
                                val zmienna = state.findVarInVariablaryWithDescoping(identifier)

                                checkTypeAndAddAssignment(
                                    ctx,
                                    state.currentReg,
                                    zmienna,
                                    "operator --",
                                    RegOper.VALUE,
                                    RegOper.VALUE
                                )

                                state.code(
                                    "sub ${state.varToAsm(zmienna)} = ${state.varToAsm(
                                        zmienna
                                    )}, #1[${zmienna.type.typeForAsm}] // simple id"
                                )

                                state.switchType(zmienna.type, "-- operator", true)
                            }
                            atomEx.literalConstant() != null -> {

                                state.parseLiteralConstant(state.currentReg, atomEx.literalConstant())

                                state.code("sub ${state.currentRegToAsm()} = #${state.currentReg.immediateValue}[${state.currentReg.type.typeForAsm}], #1${state.currentReg.type.typeForAsm}, add // literal const")
                                //state.currentReg.type = "Ubyte"
                            }
                            else -> błędzik(atomEx, "Nie wiem jak obsłużyć")
                        }
                    }
                    // =================================================================================================
                    prawo.memberAccessOperator() != null -> {

                        //val dereferenced = state.allocReg("dereferenced var")

                        val returnReg = state.currentReg

                        state.rem(" deref: obiekt --------------------")
                        val dereferenced = state.allocReg("dereference temp"/*,Typ.ubyte*/)
                        visitAtomicExpression(atomEx)


                        val classDeref = if (state.currentWolinType.isClass) {
                            state.code("point HEAP = ${state.varToAsm(dereferenced)}")
                            state.rem("to jest klasa zmieniamy chwilowo aktualną")
                            state.rem("jesli tak, to na gorze heapu jest uniqid klasy")
                            //val akt = state.regFromTop(1)
                            dereferenced.type = state.currentWolinType.copy()
                            state.classDerefStack.push(dereferenced)
                            true
                        } else {
                            false
                        }

                        // TODO tu podstawiamy pod aktualny rejestr instancje jakiejś klasy

                        state.rem(" deref: pole/metoda --------------------")


                        val resultReg = state.allocReg("deref register", Typ.ubyte)

                        //val reg = state.allocReg("for right side of deref")
                        val safeDeref = prawo.memberAccessOperator().QUEST() != null

                        if (safeDeref) {
                            state.code("evaleq costam[bool] = ${state.currentReg}[loc], null // safe deref")
                            state.code("beq costam[bool] = #0, jakis_label[adr] // safe deref")
                        }

                        state.rem(" postfix unary w dereferencji")
                        visitPostfixUnaryExpression(prawo.postfixUnaryExpression())
                        if (classDeref) {
                            //state.currentWolinType.isPointer = true
                            state.rem("tu przywrócić poprzednią klasę")

                            state.rem("==== KROK 1 memberAccessOperator: przypisanie aktualnego do czegoś --------------------")

                            //checkTypeAndAddAssignment(ctx, state.assignStack.assignRightSideFinalVar, state.currentReg, "dereferejcya", RegOper.VALUE, RegOper.VALUE)
                            // było
                            try {
                                checkTypeAndAddAssignment(
                                    ctx,
                                    returnReg,
                                    state.currentReg,
                                    "dereferejcya, right side final = ${state.assignStack.size}",
                                    RegOper.VALUE,
                                    RegOper.VALUE
                                )
                            } catch (ex: UninitializedPropertyAccessException) {

                            }
                            state.classDerefStack.pop()
                        }

                        state.freeReg("deref register")
                        state.freeReg("dereference temp")
                        state.rem(" deref: end deref --------------------")

                        //state.freeReg("dereferenced var")
                    }
                    // =================================================================================================
                    prawo.arrayAccess() != null -> {
                        // ARRAYCODE
                        val currEntReg = state.currentReg
                        state.arrayElementSize = currEntReg.type.arrayElementSize

                        // jeśli indeks 8-bitowy i element nie robic tej allokacji

                        state.codeOn = false
                        visitAtomicExpression(atomEx)
                        state.codeOn = true

                        state.allocReg("arr_deref", state.currentWolinType).apply {
                            type.pointer = true
                        }
                        state.rem(" LEWA strona array access, czyli co to za zmienna")
                        visitAtomicExpression(atomEx)
                        state.rem(" PRAWA strona array access, czyli indeks w nawiasach")
                        visitArrayAccess(prawo.arrayAccess())

                        state.rem(" kod obsługi tablicy")

                        when {
                            state.currentShortArray == null -> {
                                state.rem(" non-fast array, changing top reg to ptr")
                                currEntReg.type.pointer = true

                                checkTypeAndAddAssignment(
                                    ctx,
                                    currEntReg,
                                    state.currentReg,
                                    "non-fast array",
                                    RegOper.VALUE,
                                    RegOper.VALUE
                                )
                            }
                            state.currentShortArray != null && state.currentShortArray!!.allocation == AllocType.NORMAL -> {
                                state.rem(" allocated fast array, changing top reg to ptr")
                                state.code(
                                    "add ${state.varToAsm(currEntReg)} = ${state.varToAsm(state.currentShortArray!!)}, &${state.currentRegToAsm()}"
                                )
                                state.currentShortArray = null
                            }
                            state.currentShortArray != null && state.currentShortArray!!.allocation == AllocType.FIXED -> {
                                state.rem(" fixed fast array, changing top reg to ptr")
                                currEntReg.type.pointer = true
                                state.code(
                                    "add ${state.varToAsm(currEntReg)} = ${state.currentShortArray!!.locationVal}[${state.currentShortArray!!.type.name}*], ${state.currentRegToAsm(
                                        RegOper.AMPRESAND
                                    )}"
                                )
                                state.currentShortArray = null
                            }

                            else -> throw Exception("Dereference of unknown array!")
                        }

                        // jeśli indeks 8-bitowy i element nie robic tej allokacji
                        state.freeReg("arr_deref")
                    }
                    else -> błędzik(ctx, "Nieznany postfixUnaryOp ${prawo.javaClass.simpleName}")
                }
            }
            else -> błędzik(ctx, "null po którejś stronie postfixUnaryExpression")
        }

        return state
    }

    override fun visitArrayAccess(ctx: KotlinParser.ArrayAccessContext): WolinStateObject {
        when (ctx.expression().size) {
            1 -> {

//                if(state.assignStack.isEmpty())
//                    błędzik(ctx, "Problem with array access")

                state.assignStack.firstOrNull()?.isArray = true

                val prevReg = state.currentReg!!

                // ARRAYCODE

                if (state.currentShortArray == null) {
                    state.allocReg("For calculating index", state.currentWolinType)
                } else {
                    state.rem("Short array")
                }

                visitExpression(ctx.expression(0))

                if (state.currentShortArray == null)
                    state.forceTopOregType(Typ.uword.apply { this.pointer = false }) // typ indeksu
                else
                    state.forceTopOregType(Typ.ubyte.apply { this.pointer = false }) // typ indeksu


                // ARRAYCODE
                if (state.currentShortArray == null) {
                    when {
                        state.arrayElementSize > 1 -> {
                            state.code("mul ${state.currentRegToAsm()} = ${state.currentRegToAsm()}, #${state.arrayElementSize} // long index, multi-byte per element array")
                            state.code("add ${state.varToAsm(prevReg)} = ${state.varToAsm(prevReg)}, ${state.currentRegToAsm()} // long index, contd.")
                        }
                        else -> {
                            state.code(
                                "add ${state.varToAsm(prevReg)} = ${state.varToAsm(prevReg)}, ${state.varToAsm(
                                    state.currentReg, RegOper.AMPRESAND
                                )} // long index, single byte per element array"
                            )
                        }
                    }

                    state.freeReg("For calculating index")

                } else {
                    state.rem(" fast array - no additional op")
                    //state.code("add ${state.varToAsm(prevReg)} = ${state.varToAsm(prevReg)}, ${state.currentRegToAsm()}")
                }

                state.rem("**ARRAY Changing current type to prevReg type $prevReg")
                state.currentWolinType = prevReg.type.copy()

                state.rem(" after index")

                state.rem("dereference value at topRegister")
            }
            else -> błędzik(ctx, "wrong number of expressions for array deref")
        }
        return state
    }

//    override fun visitMemberAccessOperator(ctx: KotlinParser.MemberAccessOperatorContext): WolinStateObject {
//        when {
//            ctx.DOT() != null -> {
//                val cos = state.currentReg
//                println("tu!")
//            }
//            ctx.QUEST() != null -> {
//                błędzik(ctx, "Nie wiem jak obsłużyć ?:")
//            }
//        }
//
//        return state
//    }

    override fun visitValueArgument(ctx: KotlinParser.ValueArgumentContext): WolinStateObject {
        state.rem("Prze visit vALUE")

        when {
            ctx.ASSIGNMENT() != null -> błędzik(ctx, "Nie wiem jak obsłużyć assignment v value argument")
            ctx.MULT() != null -> błędzik(ctx, "Nie wiem jak obsłużyć mult v value argument")
            ctx.simpleIdentifier() != null -> błędzik(ctx, "Nie wiem jak obsłużyć simpleId v value argument")
            ctx.expression() != null -> {
                state.rem(" obliczenia dla parametru ${ctx.expression().text}")
                visitExpression(ctx.expression())
            }
        }

        state.rem("po visit value")

        return state
    }

    override fun visitAtomicExpression(ctx: KotlinParser.AtomicExpressionContext): WolinStateObject {
        when {
            ctx.simpleIdentifier() != null -> visitSimpleIdentifier(ctx.simpleIdentifier())
            ctx.literalConstant() != null -> {
                val wartość = Zmienna(allocation = AllocType.LITERAL, fieldType = FieldType.DUMMY)
                state.parseLiteralConstant(wartość, ctx.literalConstant())
                state.code("let ${state.currentRegToAsm()} = ${state.varToAsm(wartość)} // atomic ex")
            }
            ctx.conditionalExpression() != null -> visitConditionalExpression(ctx.conditionalExpression())
            ctx.jumpExpression() != null -> {
                visitJumpExpression(ctx.jumpExpression())
            }
            ctx.tryExpression() != null -> {
                visitTryExpression(ctx.tryExpression())
            }
            ctx.loopExpression() != null -> {
                visitLoopExpression(ctx.loopExpression())
            }
            ctx.functionLiteral() != null -> {
                visitFunctionLiteral(ctx.functionLiteral())
            }
            ctx.thisExpression() != null -> {
                visitThisExpression(ctx.thisExpression())
            }
            else -> błędzik(ctx, "Unknown AtomicExpression")
        }

        return state
    }

    override fun visitThisExpression(ctx: KotlinParser.ThisExpressionContext): WolinStateObject {
        when {
            ctx.LabelReference() != null -> błędzik(ctx, "Don't know how to process this@xxxx")
            ctx.THIS() != null -> {
                val zmienna = state.findVarInVariablaryWithDescoping("this")

                state.allocReg("for statement this")

                checkTypeAndAddAssignment(
                    ctx,
                    state.currentReg,
                    zmienna,
                    "this expression",
                    RegOper.VALUE,
                    RegOper.VALUE
                )

            }
            else -> błędzik(ctx, "Uknown this reference!")
        }

        return state
    }

    override fun visitFunctionLiteral(ctx: KotlinParser.FunctionLiteralContext): WolinStateObject {
        val parametryLambdy = ctx.lambdaParameters()

        val blok = ctx.statements()

        val lambdaName = "lambda_function_${state.lambdaCounter++}"

        val nowaFunkcja = try {
            state.findProc(lambdaName)
        } catch (ex: Exception) {
            Funkcja(fullName = lambdaName)
        }

        // TODO - dodać do skołpu zmienne tej lambdy

        val rememberedFunction = state.currentFunction

        state.currentFunction = nowaFunkcja

        parametryLambdy.lambdaParameter()?.forEachIndexed { index, it ->
            when {
                it.multiVariableDeclaration() != null -> błędzik(ctx, "Nie wiem jak obsłużyć multiVarDecl w lambdzie")
                it.variableDeclaration() != null -> {
                    val decl = it.variableDeclaration()
                    val typ = decl.type()
                    val id = decl.simpleIdentifier().text

                    val arg = if (typ == null) {
                        // TODO - parametr lambdy może być podany bez typu, w takim wypadku musimy go sobie pobrać
                        // z typu zmiennej, do której jest przypisywana ta lambda (assignLeftSideVar)

                        if (state.assignStack.isNotEmpty()) {
                            val funkcja = state.lambdaTypeToFunction(state.assignStack.assignLeftSideVar)
                            val interred = funkcja.arguments[index]
                            state.createAndRegisterVar(id, AllocType.NORMAL, interred.type, FieldType.ARGUMENT)
                        } else {
                            błędzik(ctx, "Can't infer type of lambda!")
                            throw Exception()
                        }
                    } else {
                        state.createAndRegisterVar(id, typ, null, FieldType.ARGUMENT)
                    }

                    if (arg.allocation != AllocType.FIXED) nowaFunkcja.addField(arg)
                }
                else -> {
                    błędzik(ctx, "Może nie błąd, tylko lambda bez parametrów?")
                }
            }
        }

        state.codeOn = false

        state.fnCallAllocRetAndArgs(nowaFunkcja)
        visitStatements(blok)
        state.fnCallReleaseArgs(nowaFunkcja)

        //state.currentFunction?.calledFunctions?.add(nowaFunkcja)

        state.codeOn = true

        nowaFunkcja.type = state.currentWolinType

        nowaFunkcja.lambdaBody = blok

        state.currentFunction = rememberedFunction

        state.toFunctiary(nowaFunkcja)

        val test = state.functionToLambdaType(nowaFunkcja)

        state.switchType(test, "lambda declaration")
        state.inferTopOperType()

        state.code("let ${state.currentRegToAsm()} = ${nowaFunkcja.labelName}[adr]")

        return state
    }

    override fun visitLoopExpression(ctx: KotlinParser.LoopExpressionContext): WolinStateObject {
        when {
            ctx.whileExpression() != null -> visitWhileExpression(ctx.whileExpression())
            ctx.doWhileExpression() != null -> visitDoWhileExpression(ctx.doWhileExpression())
            //ctx.forExpression()
            else -> błędzik(ctx, "Unknown loop expression")
        }

        return state
    }

    override fun visitWhileExpression(ctx: KotlinParser.WhileExpressionContext): WolinStateObject {

        state.loopCounter++

        val condLabel = labelMaker("loopStart", state.loopCounter)

        val afterBodyLabel = labelMaker("loopEnd", state.loopCounter)

        state.allocReg("for while condition", Typ.bool)

        state.code("label $condLabel")

        visitExpression(ctx.expression())

        state.code("bne ${state.currentRegToAsm()} = #1[bool], $afterBodyLabel<label_po_if>[adr]")

        visitControlStructureBody(ctx.controlStructureBody())

        state.code("goto $condLabel[adr]")

        state.code("label $afterBodyLabel")

        state.freeReg("for while condition")

        return state
    }

    override fun visitDoWhileExpression(ctx: KotlinParser.DoWhileExpressionContext): WolinStateObject {

        state.loopCounter++

        val bodyLabel = labelMaker("loopStart", state.loopCounter)

        val afterBodyLabel = labelMaker("loopEnd", state.loopCounter)

        state.code("label $bodyLabel")

        state.forceTopOregType(Typ.bool)

        visitControlStructureBody(ctx.controlStructureBody())

        visitExpression(ctx.expression())

        state.code("beq ${state.currentRegToAsm()} = #1[bool], $bodyLabel<label_po_if>[uword]")

        state.code("label $afterBodyLabel")

        return state
    }

    override fun visitConditionalExpression(ctx: KotlinParser.ConditionalExpressionContext): WolinStateObject {
        when {
            ctx.ifExpression() != null -> visitIfExpression(ctx.ifExpression())
            ctx.whenExpression() != null -> visitWhenExpression(ctx.whenExpression())
            else -> błędzik(ctx, "Unknown conditional")
        }

        return state
    }

    override fun visitWhenExpression(ctx: KotlinParser.WhenExpressionContext): WolinStateObject {
        state.rem("When expression start")


        if (ctx.expression() != null) {
            val resultReg = state.allocReg("for evaluating when top expression")
            state.simpleWhen = false
            visitExpression(ctx.expression())
            state.inferTopOperType()
        } else {
            state.simpleWhen = true
        }

        val resultReg = state.allocReg("for bool result of each condition", Typ.bool)
        //val condReg = state.allocReg("for evaluating each when branch condition") // TODO - dostaje zły typ!

        val valueForAssign = state.allocReg("for value if when assigned")

        if (state.assignStack.isNotEmpty())
            valueForAssign.type = state.assignStack.assignLeftSideVar.type.copy()


//        if (!state.simpleWhen)
//            condReg.type = state.currentWolinType

        // TODO - przy podstawieniu wymysić else!

        if (ctx.whenEntry().size > 0) {
            state.lastWhenEntry = false
            ctx.whenEntry()?.dropLast(1)?.forEach {
                state.rem("normal when condition")
                visitWhenEntry(it)
            }
            state.lastWhenEntry = true
            ctx.whenEntry()?.last()?.let {
                state.rem("last when condition")
                visitWhenEntry(it)
            }
        }
        state.rem("When expression end")

        state.code("label ${labelMaker("whenEndLabel", state.whenCounter++)}")

        if (state.assignStack.isNotEmpty())
            checkTypeAndAddAssignment(
                ctx,
                state.assignStack.assignRightSideFinalVar,
                valueForAssign,
                "when assignment",
                RegOper.AMPRESAND,
                RegOper.VALUE
            )

        state.freeReg("for value if when assigned")

        //state.freeReg("for evaluating each when branch condition")
        state.freeReg("for bool result of each condition")

        if (!state.simpleWhen)
            state.freeReg("for evaluating when top expression")


        return state
    }

    override fun visitWhenEntry(ctx: KotlinParser.WhenEntryContext): WolinStateObject {
        val kondycje = ctx.whenCondition()

        val resultReg = state.regFromTop(2)

        val boolReg = state.regFromTop(1)
        val condReg = state.regFromTop(0)


        state.rem("warunek")
        val whenLabel = labelMaker("whenLabel", state.labelCounter++)
        val nextLabel = labelMaker("whenLabel", state.labelCounter)

        state.code("label $whenLabel")

        kondycje?.firstOrNull()?.let {
            visitWhenCondition(it)
        }

        if (state.simpleWhen)
            state.inferTopOperType()
//        else
//            state.forceTopOregType(resultReg.type)

        if (ctx.ELSE() != null) {
            state.rem("when else branch")
        } else if (state.simpleWhen)
            if (state.lastWhenEntry)
                state.code(
                    "bne ${state.varToAsm(resultReg)} = #1[bool], ${labelMaker(
                        "whenEndLabel",
                        state.whenCounter
                    )}[adr]"
                )
            else
                state.code("bne ${state.varToAsm(resultReg)} = #1[bool], $nextLabel[adr]")
        else {
            state.code("evaleq ${state.varToAsm(boolReg)} = ${state.varToAsm(resultReg)}, ${state.varToAsm(condReg)}")
            if (state.lastWhenEntry)
                state.code(
                    "bne ${state.varToAsm(boolReg)} = #1[bool], ${labelMaker(
                        "whenEndLabel",
                        state.whenCounter
                    )}[adr]"
                )
            else
                state.code("bne ${state.varToAsm(boolReg)} = #1[bool], $nextLabel[adr]")
        }

        state.rem("when operacja")

        val whenTrue = ctx.controlStructureBody()
        if (whenTrue.block() != null) visitBlock(whenTrue.block())
        else if (whenTrue.expression() != null) visitExpression(whenTrue.expression())

        if (!state.lastWhenEntry)
            state.code("goto ${labelMaker("whenEndLabel", state.whenCounter)}[adr]")

        return state
    }

    override fun visitWhenCondition(ctx: KotlinParser.WhenConditionContext): WolinStateObject {
        when {
            ctx.expression() != null -> visitExpression(ctx.expression())
            ctx.rangeTest() != null -> błędzik(ctx, "nie wiem, jak się robi range test we when")
            ctx.typeTest() != null -> błędzik(ctx, "nie wiem, jak się robi type test")
        }

        return state
    }

    override fun visitIfExpression(ctx: KotlinParser.IfExpressionContext): WolinStateObject {
        val warunek = ctx.expression()
        val body = ctx.controlStructureBody()

        val condBoolRes = state.allocReg("condition expression bool result", Typ.bool)

        visitExpression(warunek)

        val valueForAssign = state.allocReg("for value when if assigned")

        if (state.assignStack.isNotEmpty())
            valueForAssign.type = state.assignStack.assignLeftSideVar.type.copy()


        val elseLabel = labelMaker("afterIfExpression", state.labelCounter)
        val endIfLabel = labelMaker("afterWholeIf", state.labelCounter)

        when {
            body.size == 1 -> {
                state.code("bne ${state.varToAsm(condBoolRes)} = #1[bool], $elseLabel<label_po_if>[adr]")
                state.rem(" body dla true")
                visitControlStructureBody(body[0])
                state.rem(" label po if")
                state.code("label $elseLabel")

            }
            body.size == 2 -> {
                //val elseLabel = labelMaker("elseExpression",state.labelCounter)

                state.code("bne ${state.varToAsm(condBoolRes)} = #1[bool], $elseLabel<label_DO_else>[adr]")
                state.rem(" body dla true")
                visitControlStructureBody(body[0])
                state.code("goto $endIfLabel[adr]")
                state.code("label $elseLabel")
                state.rem(" body dla false/else")
                visitControlStructureBody(body[1])
            }
            else -> {
                błędzik(ctx, "Unknown if body size - elseif?")
            }
        }

        state.code("label $endIfLabel")

        if (state.assignStack.isNotEmpty())
            checkTypeAndAddAssignment(
                ctx,
                state.assignStack.assignRightSideFinalVar,
                valueForAssign,
                "assign if expression result",
                RegOper.AMPRESAND,
                RegOper.VALUE
            )

        state.freeReg("for value when if assigned")

        state.freeReg("condition expression bool result")

        state.labelCounter++

        return state
    }

    override fun visitTryExpression(ctx: KotlinParser.TryExpressionContext): WolinStateObject {
        val tryBlock = ctx.block()
        val catchNode = ctx.catchBlock(0)

        state.exceptionsUsed = true

        state.rem(" try")
        state.code("alloc SP<catch_addr>, #2 // catch block entry point")
        state.code("let SP(0)[uword] = ${labelMaker("catch_block_start", state.labelCounter)}[uword]")
        state.code("call __wolin_create_exception_entry[adr]")

        visitBlock(tryBlock)

        state.code("free SPE, #5 // remove exception table entry")
        state.code("goto ${labelMaker("after_catch_block_end", state.labelCounter)}[adr]")
        state.code("")
        state.rem(" catch")
        state.code("label ${labelMaker("catch_block_start", state.labelCounter)}")

        visitBlock(catchNode.block())

        state.code("")
        state.rem(" catch end")
        state.code("label ${labelMaker("after_catch_block_end", state.labelCounter)}")

        state.labelCounter++

        return state
    }

    override fun visitJumpExpression(ctx: KotlinParser.JumpExpressionContext): WolinStateObject {
        when {
            ctx.RETURN() != null -> {
                if (ctx.expression() != null) {
                    visitExpression(ctx.expression())
                }

                val zwrotka = state.findStackVector(state.callStack, state.currentFunction!!.returnName).second

                val refType = if (zwrotka.type.isPointer)
                    RegOper.VALUE
                else
                    RegOper.AMPRESAND

                checkTypeAndAddAssignment(ctx, zwrotka, state.currentReg, "jump expression", RegOper.VALUE, refType)

                state.switchType(state.currentFunction!!.type, "return expression")
            }
            ctx.THROW() != null -> {
                if (ctx.expression() != null) {
                    visitExpression(ctx.expression())
                }

                state.exceptionsUsed = true

                state.code("throw SP(0)[uword] // nie martwimy sie o sotsy, bo te odtworzy obsluga wyjatku")
            }
            ctx.BREAK() != null -> {
                state.code("goto ${labelMaker("loopEnd", state.loopCounter)}[adr]")
                state.switchType(Typ.unit, "break expression")
            }
            ctx.CONTINUE() != null -> {
                state.code("goto ${labelMaker("loopStart", state.loopCounter)}[adr]")
                state.switchType(Typ.unit, "continue expression")
            }
            else -> {
                błędzik(ctx, "Unknown jump expression")
            }
        }

        return state
    }

    override fun visitSimpleIdentifier(ctx: KotlinParser.SimpleIdentifierContext): WolinStateObject {
        when {
            ctx.Identifier() != null -> {
                try {
//                    if(ctx.Identifier().text == "i")
//                        println("tu!")
                    val zmienna = state.findVarInVariablaryWithDescoping(ctx.Identifier().text)

                    if (zmienna.type.shortIndex && zmienna.type.elementOccupiesOneByte) {
                        state.currentShortArray = zmienna
                    } else {
                        if (zmienna.allocation == AllocType.FIXED && zmienna.type.array) {
                            state.code(
                                "let ${state.currentRegToAsm()} = ${zmienna.locationVal}[${zmienna.type.typeForAsm}] // simple id - fixed array var"
                            )
                        } else if (state.assignStack.processingLeftSide) {
                            checkTypeAndAddAssignment(
                                ctx,
                                state.currentReg,
                                zmienna,
                                "//simple id - assign in progress",
                                RegOper.VALUE,
                                RegOper.STAR
                            )
                        } else {
                            state.currentReg.type.pointer = true
                            checkTypeAndAddAssignment(
                                ctx,
                                state.currentReg,
                                zmienna,
                                "simple id from var",
                                RegOper.VALUE,
                                RegOper.STAR
                            )
                        }
                    }

                    state.switchType(zmienna.type, "type from ${zmienna.name}", true)
                } catch (ex: VariableNotFound) {
                    try {
                        val proc = state.findProc(ctx.Identifier().text)
                        checkTypeAndAddAssignment(
                            ctx,
                            state.currentReg,
                            proc,
                            "simple id from var",
                            RegOper.VALUE,
                            RegOper.VALUE
                        )
                        state.switchType(Typ.uword, "function pointer", false)
                    } catch (ex: Exception) {
                        błędzik(ctx, "Unknown variable or proc near ${ctx.parent.parent.text}")
                    }
                }
            }
            else -> {
                błędzik(ctx, "Nie wiem jak obsłużyć ten simpleIdentifier")
            }
        }

        return state
    }

    override fun visitFunctionDeclaration(ctx: KotlinParser.FunctionDeclarationContext): WolinStateObject {
        val name = ctx.identifier()?.text ?: throw Exception("Brak nazwy funkcji")

        val isInterrupt = ctx.modifierList()?.modifier()?.firstOrNull()?.functionModifier()?.INTERRUPT() != null

        val lokacjaLiterał = ctx.locationReference()?.literalConstant()

        val lokacjaAdres = Zmienna("", allocation = AllocType.FIXED, fieldType = FieldType.DUMMY)

        state.switchType(Typ.unit, "function declaration")

        lokacjaLiterał?.let {
            state.parseLiteralConstant(lokacjaAdres, it)
        }

        val functionName = state.nameStitcher(name)

        val nowaFunkcja = try {
            state.findProc(functionName)
        } catch (ex: Exception) {
            val nowa = Funkcja()

            nowa.location = lokacjaAdres.intValue.toInt()
            nowa.fullName = functionName
            nowa.isInterrupt = isInterrupt

            val zwrotka = state.createVar(nowa.returnName, ctx.type(0), null, FieldType.ARGUMENT)

            nowa.fullReturnType = zwrotka
            nowa.type = zwrotka.type.copy()

            if (nowa.isInterrupt && nowa.type != Typ.unit)
                błędzik(ctx, "Return not allowed for interrupt function!")

            nowa
        }

        state.currentFunction = nowaFunkcja


        if (state.currentClass != null && state.pass == Pass.SYMBOLS) {
            val thisArg = state.createAndRegisterVar(
                "this",
                AllocType.NORMAL,
                Typ.byName(state.currentClass!!.name, state),
                FieldType.ARGUMENT
            )
            state.currentFunction?.addField(thisArg)
        }

        ctx.functionValueParameters()?.functionValueParameter()?.forEach {
            visitFunctionValueParameter(it)
        }

        if (nowaFunkcja.isInterrupt && nowaFunkcja.arguments.isNotEmpty())
            błędzik(ctx, "Arguments not allowed for interrupt function!")

        val body = ctx.functionBody()

        if (body != null && nowaFunkcja.location != 0)
            throw Exception("Fixed address function ${nowaFunkcja.fullName} with a body!")

        if (state.currentFunction?.location == 0) {
            state.code(
                "\n" + """// ****************************************
            |// funkcja: ${nowaFunkcja}
            |// ****************************************
        """.trimMargin()
            )

            state.code("function ${state.currentFunction!!.labelName}")
        }
//        if(state.currentClass != null) {
//            //state.code("let __wolin_this_ptr[adr] = SPF(0)<this>[adr] // ustawienie this TODO - zapamiętać poprzedni this!!!!")
//        }

        state.fnDeclAllocStackAndRet(state.currentFunction!!)

        if (state.currentClass != null)
            state.code("point HEAP = this")

        body?.let {
            visitFunctionBody(it)
        }

        state.code("")

        state.toFunctiary(nowaFunkcja)

        state.currentFunction = null

        return state
    }


    override fun visitClassDeclaration(ctx: KotlinParser.ClassDeclarationContext): WolinStateObject {

        state.currentClass = try {
            state.findClass(ctx.simpleIdentifier().text)
        } catch (ex: Exception) {
            val nowa = Klasa(state.nameStitcher(ctx.simpleIdentifier().text))
            state.toClassary(nowa)
            nowa
        }

        val konstruktor = try {
            state.findProc(state.currentClass!!.name)
        } catch (ex: Exception) {
            Funkcja(
                state.currentClass!!.name,
                Typ.byName(state.currentClass!!.name, state)
            )
        }

        state.currentFunction = konstruktor
        ////////////////////////////////////////

        state.code(
            "\n" + """// ****************************************
            |// konstruktor: ${konstruktor}
            |// ****************************************
        """.trimMargin()
        )

        state.code("function ${konstruktor.labelName}")

        state.fnDeclAllocStackAndRet(konstruktor)

        state.code("")

        state.toFunctiary(konstruktor)

        val typZwrotki = Typ(state.currentClass!!.name, false, true)

        val zwrotka =
            state.createAndRegisterVar("${konstruktor.returnName}", AllocType.NORMAL, typZwrotki, FieldType.ARGUMENT)

        val funkcjaAlloc = state.findProc("allocMem").apply {
            if (state.pass == Pass.TRANSLATION) {
                val zKlasarium = state.findClass(state.currentClass!!.name)
                this.arguments[0].intValue = state.getStackSize(zKlasarium.heap).toLong()
                this.arguments[1].intValue = 1
            }
        }

        state.allocReg("for returning this", typZwrotki)

        state.switchType(typZwrotki, "function type 1")
        state.inferTopOperType()
//        state.switchType(funkcjaAlloc.type, "function type 2")

        if (state.pass != Pass.SYMBOLS) {
            easeyCall(ctx, funkcjaAlloc, state.currentReg, true)

            state.rem(" tutaj kod na przepisanie z powyższego rejestru do zwrotki konstruktora")

            val zwrotkaShifted = state.findStackVector(state.callStack, zwrotka.name).second

            checkTypeAndAddAssignment(
                ctx,
                zwrotkaShifted,
                state.currentReg,
                "zwrotka alloc do zwrotki konstruktora",
                RegOper.VALUE,
                RegOper.VALUE
            )
        }
        state.code("point HEAP = ${state.currentRegToAsm()}")

        state.freeReg("for returning this")

        funkcjaAlloc.releaseCalledFunction(state)

        state.initializedClassFields().forEach {
            println("Aktualna klasa: ${state!!.currentClass!!.name}")
            state.rem("inicjalizacja zmiennej ${it.name}")
            doInitCode(it)
        }

        state.fnDeclFreeStackAndRet(konstruktor)

        state.currentFunction = null

        state.rem("return from constructor")
        state.code("ret")

        ////////////////////////////////////////

        val a = ctx.classBody()
        a.classMemberDeclaration()?.forEach {
            it.propertyDeclaration()?.let {
                visitPropertyDeclaration(it)
            }
        }

        val classUniqId = state.classCounter++

        val classId = Zmienna(
            "classUniqId",
            true,
            null,
            AllocType.NORMAL,
            fieldType = FieldType.CLASS,
            typexxx = Typ.ubyte
        ).apply {
            intValue = classUniqId.toLong()
        }

        if (state.pass == Pass.SYMBOLS)
            state.currentClass!!.heap.push(classId)

        // musi być rozdzielone, aby uwzględnić zmienną z id klasy
        a.classMemberDeclaration()?.forEach {
            it.functionDeclaration()?.let {
                visitFunctionDeclaration(it)
            }
        }

        state.currentClass = null

        return state
    }

    override fun visitFunctionValueParameter(ctx: KotlinParser.FunctionValueParameterContext): WolinStateObject {
        val param = ctx.parameter()

        val arg = state.createAndRegisterVar(param.simpleIdentifier().text, param.type(), null, FieldType.ARGUMENT)

        if (state.pass == Pass.SYMBOLS)
            state.currentFunction?.addField(arg)

        return state
    }

    override fun visitTopLevelObject(ctx: KotlinParser.TopLevelObjectContext): WolinStateObject {
        ctx.propertyDeclaration()?.let {
            visitPropertyDeclaration(it)
        }

        ctx.classDeclaration()?.let {
            visitClassDeclaration(it)
        }

        ctx.functionDeclaration()?.let {
            visitFunctionDeclaration(it)
        }

        return state
    }


    override fun visitPropertyDeclaration(ctx: KotlinParser.PropertyDeclarationContext): WolinStateObject {
        val name = ctx.variableDeclaration().simpleIdentifier().text

        val stack = when {
            state.currentFunction != null -> FieldType.LOCAL
            state.currentClass != null -> FieldType.CLASS
            else -> FieldType.DUMMY
        }

        if (ctx.expression() != null) {
            val zmienna = if (ctx.variableDeclaration().type() != null) {
                state.createAndRegisterVar(name, ctx.variableDeclaration().type(), ctx, stack)
            } else
                state.createAndRegisterVar(name, AllocType.NORMAL, state.currentWolinType, stack)

            zmienna.initExpression = ctx.expression()

            if (zmienna.fieldType == FieldType.LOCAL && state.pass != Pass.SYMBOLS) {
                doInitCode(zmienna)
            }
        } else {
            if (ctx.variableDeclaration().type() == null)
                błędzik(ctx, "Variable $name has no type!")

            val zmienna = state.createAndRegisterVar(name, ctx.variableDeclaration().type(), ctx, stack)

            //state.code("let ${state.varToAsm(zmienna)} = ${state.currentRegToAsm()} // podstawic wynik expression do zmiennej $name")
        }

        return state
    }

    override fun visitKotlinFile(ctx: KotlinParser.KotlinFileContext): WolinStateObject {
        // TODO: to powinno być includem dla c64

        state.code("setup HEADER")

        if (state.exceptionsUsed) {
            state.code("setup SPE = 155[ubyte], 53247[uword] // exception stack pointer at 155 = 53247 (was: datasette something)")
            state.code("setup EXPTR = 178[ubyte] // ptr to Exception object when exception occurs (was: datasette buffer)")
            state.code("setup CATCH = 253[ubyte] // jmp adddress for catch")
        }

        if (state.spfUsed)
            state.code("setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959")

        if (state.spUsed)
            state.code("setup SP = 114[ubyte] // (było 143) register stack top = 142")

        state.code("setup HEAP = 176[ubyte]")

        state.initializedStatics().forEach {
            state.rem("inicjalizacja zmiennej ${it.name}")
            doInitCode(it)
        }

        if (state.mainFunction != null) {
            state.rem(" main function entry")
            //state.code("goto ${state.mainFunction!!.labelName}[adr]")

            easeyCall(ctx, state.mainFunction!!, null)
            state.code("ret")
        }

        //state.fileScopeSuffix = nazwaPliku
        ctx.preamble()?.let {
            visitPreamble(it)
        }

        ctx.topLevelObject()?.forEach {
            visitTopLevelObject(it)
        }

//        val test = dump(ctx,0)
//        print(test)


        if (state.exceptionsUsed) {
            state.code(
                "\n" + """// ****************************************
            |// Library modules
            |// ****************************************
        """.trimMargin()
            )

            state.code("")
            state.code("label __wolin_create_exception_entry")
            state.code("alloc SPE, #5")
            state.code("let SPE(0)[uword] = SP(0)[uword] // adres bloku catch, jeśli będzie exception")
            state.code("free SP, #2 //catch_addr")
            state.code("let SPE(2)[ubyte] = SPC[ubyte] // aktualny stos CPU, dwa odejmiemy od niego, jeśli będzie exception")
            state.code("let SPE(3)[ubyte] = SP[ubyte] // aktualny stos wolina")
            state.rem(" TODO - sprawdzić czy jego też trzeba zmniejszyć, bo catch jest wewnątrz allokacji dla statementu!")
            state.code("ret")

            state.code("")
            state.code("label __wolin_throw_exception")
            state.code("bne SPE = __wolin_spe_top, __wolin_process_exception[adr] // jesli mamy blok catch, to go obslugujemy")
            state.code("let __wolin_exception_ptr[adr] = 0[adr]")
            state.code("crash")

            state.code("")
            state.code("label __wolin_process_exception")
            state.code("let __wolin_spe_zp_vector[uword] = SPE(0)[uword] // pobieramy adres bloku catch i ustawimy go jako wektor")
            state.code("add SPE(2)[ubyte] = SPE(2)[ubyte], #2[ubyte] // stos zapamiętaliśmy w podprogramie, musimy go zmniejszyć o adres powrotny")
            state.code("let SPC[ubyte] = SPE(2)[ubyte] // przywrócenie stosu CPU, takiego jak był w bloku try")
            state.code("let SP[ubyte] = SPE(3)[ubyte] // przywrócenie stosu wolina")
            state.code("free SPE, #5")
            state.code("goto __wolin_spe_zp_vector[deref]")
        }

        return state
    }

    override fun visitLiteralConstant(ctx: KotlinParser.LiteralConstantContext): WolinStateObject {
        błędzik(ctx, "visitLiteralConstant should not be reached!")
        //state.rem("***** VISIT LITERAL CONSTANT")

        return state
    }


    override fun visitPreamble(ctx: KotlinParser.PreambleContext): WolinStateObject {
        state.basePackage = ctx.packageHeader()?.identifier()?.text ?: throw Exception("Illegal package name")
        return state
    }

    /*****************************************************************
    Pomocnicze
     *****************************************************************/

    fun błędzik(miejsce: ParseTree, teskt: String = ""): Nothing {
        val interval = miejsce.sourceInterval
        val token = tokenStream.get(interval.a)
        val linia = token.line
        throw Exception("$teskt at $linia in:\"" + miejsce.text + "\"\n" + dump(miejsce, 0))
    }

    fun easeyCall(ctx: ParseTree, functionToCall: Funkcja, destReg: Zmienna?, constructor: Boolean = false) {
        state.rem(" otwarcie stosu na wywolanie ${functionToCall.fullName}")
        state.fnCallAllocRetAndArgs(functionToCall)

        state.rem(" tu podajemy argumenty dla ${functionToCall.fullName}")
        // wypełnić argumenty

        functionToCall.arguments.forEach {
            state.rem(" let ${it.name} = #${it.immediateValue}")

            val found = state.findStackVector(state.callStack, it.name)

            if (it.allocation == AllocType.FIXED) {
                state.code(
                    "let ${it.intValue} = #${it.immediateValue}"
                )
            } else {
                state.code(
                    "let SPF(${found.first})<${found.second.name}>[${found.second.type.typeForAsm}] = #${it.immediateValue}[${it.type.typeForAsm}]"
                )
            }
        }

        state.rem(" po argumentach dla ${functionToCall.fullName}")
        state.code("call ${functionToCall.labelName}[adr]")

        state.fnCallReleaseArgs(functionToCall)

        if (constructor)
        //checkTypeAndAddAssignment(ctx, destReg!!, state.callStack.peek(), "easey call", false, false)
            state.code("let ${state.varToAsmNoType(destReg!!)}[any*] = ${state.varToAsm(state.callStack.peek())}")
        else if (destReg != null)
            checkTypeAndAddAssignment(
                ctx,
                destReg!!,
                state.callStack.peek(),
                "easey call",
                RegOper.VALUE,
                RegOper.VALUE
            )

        //state.currentFunction?.calledFunctions?.add(functionToCall)

    }


    /*****************************************************************
    Masowe uzupełnianie kodu
     *****************************************************************/

    fun doInitCode(zmienna: Zmienna) {
        val nowy = state.allocReg("for var ${zmienna.name} init expression")

        //println("$zmienna -> $nowy")

        visitExpression(zmienna.initExpression!!)

        if (state.pass != Pass.SYMBOLS) {
            state.inferTopOperType()
            state.code("let ${state.varToAsm(zmienna)} = ${state.currentRegToAsm()} // podstawic wynik inicjalizacji expression do zmiennej ${zmienna.name}")
        }

        state.freeReg("for var ${zmienna.name} init expression")
    }

    fun appendLambdas() {
        state.code(
            "\n\n" +
                    """// ****************************************
            |// LAMBDAS
            |// ****************************************
        """.trimMargin()
        )

        state.lambdas().forEach { nowaFunkcja ->

            state.switchType(Typ.unit, "function declaration")

            state.currentFunction = nowaFunkcja

            state.code(
                "\n" + """// ****************************************
            |// lambda: ${nowaFunkcja.fullName}
            |// ****************************************
        """.trimMargin()
            )

            state.code("label ${state.currentFunction!!.labelName}")

            state.fnDeclAllocStackAndRet(state.currentFunction!!)

            //state.allocReg("for lambda ${nowaFunkcja.name} return value",  nowaFunkcja.type?.type ?: "unit")

            state.allocReg("for lambda 'return value' ${state.currentFunction?.fullName}")

            state.currentFunction!!.lambdaBody?.statement()?.forEach {
                val zwrotka = state.findStackVector(state.callStack, state.currentFunction!!.returnName).second
                statementProcessor(it, zwrotka)
            }

            state.freeReg("for lambda 'return value' ${state.currentFunction?.fullName}")

            state.switchType(state.currentFunction!!.type, "return expression")

            state.fnDeclFreeStackAndRet(state.currentFunction!!)

            state.rem("return from lambda function")
            state.code("ret")

            state.code("")

            state.currentFunction = null
        }
    }


    /*****************************************************************
    Przypisania
     *****************************************************************/
    fun processAssignment(ctx: ParseTree, leftFunction: () -> WolinStateObject, rightFunction: () -> WolinStateObject) {


        state.rem("")
        state.rem("== ASSIGNMENT PUSH =======================================") // TODO użyć tego rejestru zamiast assignLeftSideVar
        state.assignStack.push(AssignEntry())
        state.rem("")
        state.rem("== ASSIGNMENT LEFT =======================================") // TODO użyć tego rejestru zamiast assignLeftSideVar
        state.assignStack.assignLeftSideVar = state.allocReg("ASSIGNMENT target")
        try {
            state.rem("(do assignLeftSideVar przypisano ${state.assignStack.assignLeftSideVar})")
        } catch (ex: UninitializedPropertyAccessException) {
        }

        leftFunction()
        state.inferTopOperType() // aktualny typ jest ustawiony źle! To musi być wina prawej funkcji! ROBIONE

        state.rem("== ASSIGNMENT RIGHT =======================================")
        state.assignStack.assignRightSideFinalVar = state.allocReg("ASSIGNMENT value")
        try {
            state.rem("(do assignRightSideFinalVar przypisano ${state.assignStack.assignRightSideFinalVar})")
        } catch (ex: UninitializedPropertyAccessException) {
        }

        rightFunction()
        state.assignStack.assignRightSideFinalVar.type =
            state.currentWolinType.copy() // to ustawia źle aktualny typ, ponieważ to wyrażenie ma


        // typ indeksu, nie faktyczny typ zmiennej
        // więc np x[255] jest ok, ale x[256] daje uword!
        // typ pobierany jest z state.assignStack.assignLeftSideVar
//        rightFinalReg.type.pointer = false // przy podstawieniu konkretnej wartości
//        rightFinalReg.type.array = false

        checkTypeAndAddAssignment(
            ctx,
            state.assignStack.assignLeftSideVar,
            state.assignStack.assignRightSideFinalVar,
            "process assignment",
            RegOper.AMPRESAND,
            RegOper.AMPRESAND
        )

        if (state.assignStack.arrayAssign) {
            state.assignStack.arrayAssign = false
        }


        state.freeReg("ASSIGNMENT value, type = ${state.currentWolinType}")

        state.freeReg("ASSIGNMENT target")

        state.rem("== ASSIGNMENT END =======================================")
        state.rem("== ASSIGNMENT POP =======================================") // TODO użyć tego rejestru zamiast assignLeftSideVar
        state.assignStack.pop()
        state.rem("")
    }

    enum class BitOp {
        SetBit, ClearBit, AndBit, OrBit
    }

    fun processBitOp(
        ctx: ParseTree,
        leftFunction: () -> WolinStateObject,
        rightFunction: () -> WolinStateObject,
        bitOp: BitOp
    ) {


        state.rem("")
        state.rem("== ASSIGNMENT PUSH =======================================") // TODO użyć tego rejestru zamiast assignLeftSideVar
        state.assignStack.push(AssignEntry())
        state.rem("")
        state.rem("== ASSIGNMENT LEFT =======================================") // TODO użyć tego rejestru zamiast assignLeftSideVar
        state.assignStack.assignLeftSideVar = state.allocReg("ASSIGNMENT target")
        try {
            state.rem("(do assignLeftSideVar przypisano ${state.assignStack.assignLeftSideVar})")
        } catch (ex: UninitializedPropertyAccessException) {
        }

        leftFunction()
        state.inferTopOperType() // aktualny typ jest ustawiony źle! To musi być wina prawej funkcji! ROBIONE

        state.rem("== ASSIGNMENT RIGHT =======================================")
        state.assignStack.assignRightSideFinalVar = state.allocReg("ASSIGNMENT value")
        try {
            state.rem("(do assignRightSideFinalVar przypisano ${state.assignStack.assignRightSideFinalVar})")
        } catch (ex: UninitializedPropertyAccessException) {
        }

        rightFunction()
        state.assignStack.assignRightSideFinalVar.type =
            state.currentWolinType.copy()

        checkTypeAndSetBit(
            ctx,
            state.assignStack.assignLeftSideVar,
            state.assignStack.assignRightSideFinalVar,
            "process assignment",
            RegOper.AMPRESAND,
            RegOper.AMPRESAND,
            bitOp
        )

        if (state.assignStack.arrayAssign) {
            state.assignStack.arrayAssign = false
        }

        state.freeReg("ASSIGNMENT value, type = ${state.currentWolinType}")

        state.freeReg("ASSIGNMENT target")

        state.rem("== ASSIGNMENT END =======================================")
        state.rem("== ASSIGNMENT POP =======================================") // TODO użyć tego rejestru zamiast assignLeftSideVar
        state.assignStack.pop()
        state.rem("")
    }

    fun checkTypeAndSetBit(
        ctx: ParseTree,
        doJakiej: Zmienna,
        co: Zmienna,
        comment: String,
        derefDo: RegOper,
        derefCo: RegOper,
        bitOp: BitOp
    ) {
        if (state.pass == Pass.TRANSLATION) {
            when (bitOp) {
                BitOp.SetBit -> {
                    state.code(
                        "bit ${state.varToAsm(doJakiej, derefDo)} = ${state.varToAsm(
                            co,
                            derefCo
                        )}, #1[bool] // przez sprawdzacz typow - $comment"
                    )
                }
                BitOp.ClearBit -> {
                    state.code(
                        "bit ${state.varToAsm(doJakiej, derefDo)} = ${state.varToAsm(
                            co,
                            derefCo
                        )}, #0[bool] // przez sprawdzacz typow - $comment"
                    )
                }
                BitOp.AndBit -> {
                    state.code(
                        "and ${state.varToAsm(doJakiej, derefDo)} = ${state.varToAsm(
                            co,
                            derefCo
                        )} // przez sprawdzacz typow - $comment"
                    )
                }
                BitOp.OrBit -> {
                    state.code(
                        "or ${state.varToAsm(doJakiej, derefDo)} = ${state.varToAsm(
                            co,
                            derefCo
                        )} // przez sprawdzacz typow - $comment"
                    )
                }
            }
        }
    }

    fun checkTypeAndAddAssignment(
        ctx: ParseTree,
        doJakiej: Zmienna,
        co: Zmienna,
        comment: String,
        derefDo: RegOper,
        derefCo: RegOper
    ) {

//        val finalDerefDo = if (derefDo == RegOper.STAR && doJakiej.type.isPointer)
//            RegOper.VALUE
//        else
//            derefDo
//
//        val finalDerefCo = if (derefCo == RegOper.STAR && co.type.isPointer)
//            RegOper.VALUE
//        else if (derefCo == RegOper.AMPRESAND && !co.type.isPointer)
//            RegOper.VALUE
//        else
//            derefCo

        if (state.pass == Pass.TRANSLATION) {
            val można =
                state.canBeAssigned(doJakiej.type, co.type) //|| doJakiej.type.isPointer || co.type.name == "uword"

            if (można) {
                state.code(
                    "let ${state.varToAsm(doJakiej, derefDo)} = ${state.varToAsm(
                        co,
                        derefCo
                    )} // przez sprawdzacz typow - $comment"
                )
            } else {
                błędzik(ctx, "Nie można przypisać $co do zmiennej $doJakiej")
            }
        }
    }


    fun checkTypeAndAddAssignment(
        ctx: ParseTree,
        doJakiej: Zmienna,
        co: Funkcja,
        comment: String,
        derefDo: RegOper,
        derefCo: RegOper
    ) {

        if (state.pass == Pass.TRANSLATION) {
            val można =
                doJakiej.type == Typ.uword //|| doJakiej.type.isPointer || co.type.name == "uword"

            if (można) {
                state.code(
                    "let ${state.varToAsm(
                        doJakiej,
                        derefDo
                    )} = #${co.labelName}[uword] // przez sprawdzacz typow - $comment"
                )
            } else {
                błędzik(ctx, "Nie można przypisać $co do zmiennej $doJakiej")
            }
        }
    }


    fun processTypeChangingOp(
        leftFoot: () -> Unit,
        rightFoot: () -> Unit,
        oper: (Zmienna, Zmienna, Zmienna) -> Typ,
        comment: String = "processTypeChangingOp"
    ) {
        val result = state.currentReg
        val leftReg = state.allocReg("LEFT $comment")
        leftFoot()
        state.inferTopOperType()
        val rightReg = state.allocReg("RIGHT $comment")
        rightFoot()
        state.inferTopOperType()
        val resultType = oper(result, leftReg, rightReg)
        state.freeReg("RIGHT $comment")
        state.freeReg("LEFT $comment")
        state.currentWolinType = resultType
        state.inferTopOperType()
    }


    fun processTypePreservingOp(
        leftFoot: () -> Unit,
        rightFoot: () -> Unit,
        oper: (Zmienna, Zmienna) -> Typ,
        comment: String = "processTypePreservingOp"
    ) {
        val leftReg = state.currentReg
        leftFoot()
        state.inferTopOperType()
        val rightReg = state.allocReg("RIGHT $comment")
        rightFoot()
        state.inferTopOperType()
        val resultType = oper(leftReg, rightReg)
        state.freeReg("RIGHT $comment")
        state.currentWolinType = resultType
        state.inferTopOperType()
    }


    fun simpleResultFunction(op: String, ret: Typ): (Zmienna, Zmienna) -> Typ {
        return { left, right ->

            state.code(
                "$op ${state.varToAsm(left, RegOper.AMPRESAND)} = ${state.varToAsm(
                    left,
                    RegOper.AMPRESAND
                )}, ${state.varToAsm(
                    right, RegOper.AMPRESAND
                )}"
            )

            ret
        }
    }

    fun simpleResultFunction(op: String): (Zmienna, Zmienna) -> Typ {
        return { left, right ->

            state.code(
                "$op ${state.varToAsm(left, RegOper.AMPRESAND)} = ${state.varToAsm(
                    left,
                    RegOper.AMPRESAND
                )}, ${state.varToAsm(
                    right, RegOper.AMPRESAND
                )}"
            )

            state.currentWolinType
        }
    }

    fun callNormal(
        ctx: KotlinParser.PostfixUnaryExpressionContext,
        prototyp: Funkcja,
        arguments: KotlinParser.ValueArgumentsContext
    ) {
        arguments.valueArgument()?.forEachIndexed { i, it ->
            state.rem("== FN_CALL: ARG #$i (${it.text}) ${prototyp.fullName}")
            state.allocReg("for call argument $i", prototyp.arguments[i].type)

            // w valueArgumentContext jest ExpressionContext
            visitValueArgument(it)

            if (prototyp.arguments[i].allocation == AllocType.FIXED) {
                // dla argumentów CPU koelejność musi być A, Y, X!!!
                state.code(
                    "let ${prototyp.arguments[i].locationVal}[${prototyp.arguments[i].type.typeForAsm}] = ${state.currentRegToAsm()}"
                )
                if (prototyp.arguments[i].locationTxt?.startsWith("CPU.") == true)
                    state.code("save ${prototyp.arguments[i].locationTxt}")
            } else {
                val found = state.findStackVector(state.callStack, prototyp.arguments[i].name)

                state.code(
                    "let SPF(${found.first})[${found.second.type.typeForAsm}] = ${state.currentRegToAsm()}"
                )
            }

            state.freeReg("for call argument $i, type = ${prototyp.arguments[i].type}")
        }

        state.switchType(prototyp.type, "function return type 2")

        (prototyp.arguments.size - 1 downTo 0).forEach {
            val arg = prototyp.arguments[it]

            if (arg.allocation == AllocType.FIXED && arg.locationTxt?.startsWith("CPU.") == true) {
                state.code("restore ${arg.locationTxt} // fill register for call")
            }
        }

        state.code(state.getFunctionCallCode(prototyp.fullName))

        if (prototyp.arguments.any { it.allocation == AllocType.FIXED && it.locationTxt == "CPU.X" }) {
            state.code("restore CPU.X // restore SP, as X is used by native call")
        }

        state.fnCallReleaseArgs(prototyp)

        if (!prototyp.type.isUnit) {
            val zwrotka = state.findStackVector(state.callStack, prototyp.returnName).second
            checkTypeAndAddAssignment(
                ctx,
                state.currentReg,
                zwrotka,
                "copy return parameter",
                RegOper.VALUE,
                RegOper.VALUE
            )
        }

    }

    fun callAsm(
        ctx: KotlinParser.PostfixUnaryExpressionContext,
        prototyp: Funkcja,
        arguments: KotlinParser.ValueArgumentsContext
    ) {
        val argPairs = List(prototyp.arguments.size) { i -> Pair(i, prototyp.arguments[i]) }

        val orderedArgs = argPairs.sortedWith(Comparator { arg1, arg2 ->
            val o1 = arg1.second
            val o2 = arg2.second
            // "CPU.A" < "CPU.?"
            if (o1.locationTxt?.contains("A") == true && o2.locationTxt?.contains("A") == false)
                -1
            // "CPU.?" > "CPU.A"
            else if (o1.locationTxt?.contains("A") == false && o2.locationTxt?.contains("A") == true)
                1
            // 0xffff < "CPU.A"
            else if (o1.locationVal != null && o2.locationTxt != null)
                -1
            // "CPU.A" > 0xffff
            else if (o1.locationTxt != null && o2.locationVal != null)
                1
            else if (o1.locationVal != null && o2.locationVal != null)
                o1.locationVal!!.compareTo(o2.locationVal!!)
            else
                o2.locationTxt!!.compareTo(o2.locationTxt!!)
        })

        orderedArgs.forEach {
            state.rem("Arg: ${it.first}: ${it.second}")
        }

        val validArgs = prototyp.arguments.filter { it.allocation == AllocType.FIXED }

        if (validArgs.size != prototyp.arguments.size)
            błędzik(ctx, "Can't use Wolin-style arguments in native calls!")

        state.code("save SP")

        orderedArgs.map { it.first }.forEach { i ->
            val it = arguments.valueArgument()!![i]

            state.rem("== FN_CALL: ARG #$i (${it.text}) ${prototyp.fullName}")
            state.allocReg("for call argument $i", prototyp.arguments[i].type)

            visitValueArgument(it)

//            state.code(
//                "let ${prototyp.arguments[i].location}[${prototyp.arguments[i].type.typeForAsm}] = ${state.currentRegToAsm()}"
//            )

            state.code("save ${state.currentRegToAsm(RegOper.AMPRESAND)} // ${prototyp.arguments[i].location}")

            state.freeReg("for call argument $i, type = ${prototyp.arguments[i].type}")
        }

        state.switchType(prototyp.type, "function return type 2")

        orderedArgs.map { it.first }.reversed().forEach { i ->
            state.code("restore ${prototyp.arguments[i].location}[${prototyp.arguments[i].type.name}]")
        }

        // tutaj: pull w odwróconej kolejności argumentów
        state.code(state.getFunctionCallCode(prototyp.fullName))

        state.fnCallReleaseArgs(prototyp)


        if (!prototyp.type.isUnit && state.assignStack.isNotEmpty()) {
            val zwrotka = state.findStackVector(state.callStack, prototyp.returnName).second

            state.code("let ${state.varToAsm(zwrotka)} = ${prototyp.fullReturnType!!.location}[${prototyp.type.name}] // lokacja wartości zwrotnej")

            state.code("restore SP")

            checkTypeAndAddAssignment(
                ctx,
                state.currentReg,
                zwrotka,
                "copy return parameter",
                RegOper.VALUE,
                RegOper.VALUE
            )
        } else {
            state.code("restore SP")
        }

        state.rem("wywołanie natywnej")
    }

}


fun labelMaker(name: String, count: Int): String = "__wolin_lab_${name}_$count"

package pl.qus.wolin

import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import pl.qus.wolin.components.*
import pl.qus.wolin.exception.FunctionNotFound
import pl.qus.wolin.exception.TypeMismatchException
import java.lang.Exception

enum class Pass {
    DECLARATION, TRANSLATION
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

        state.fnDeclFreeStackAndRet(state.currentFunction!!)

        state.code("ret")

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
            it.blockLevelExpression() != null -> it.blockLevelExpression()?.let {

                state.allocReg("for block level expression ${it.text.replace("\n", "\\n")}")

                when {
                    it.expression()?.assignmentOperator()?.size != 0 -> {
                        val lewaStrona = it.expression()?.disjunction(0)
                        val operator = it.expression()?.assignmentOperator(0)
                        val prawaStrona = it.expression()?.disjunction(1)

                        when {
                            operator?.ASSIGNMENT() != null -> {

                                processAssignment(it,
                                    { znajdźSimpleIdW(lewaStrona!!) },
                                    { visitDisjunction(prawaStrona!!) }
                                )

                                state.switchType(Typ.unit, "assignment")

                            }
                            else -> {
                                błędzik(it, "Unknown assignment operator")
                            }
                        }
                    }
                    it.expression() != null -> visitExpression(it.expression())
                    else -> błędzik(it, "Unknown block level expression")
                }

                state.inferTopOregType()

                if (retVal != null) {
                    state.code("let ${state.varToAsm(retVal)} = ${state.currentRegToAsm()} // LAMBDA return assignment")
                }

                state.freeReg("for block level expression ${it.text.replace("\n", "\\n")}, type = ${state.currentWolinType}")
            }
            it.declaration() != null -> it.declaration()?.let {
                state.allocReg("for declaration ${it.text.replace("\n", "\\n")}")

                visitDeclaration(it)

                state.inferTopOregType()

                state.freeReg("for declaration ${it.text.replace("\n", "\\n")}")
            }
            else -> błędzik(it, "Unknown block level expression")
        }

    }

    private fun znajdźSimpleIdW(lewaStrona: KotlinParser.DisjunctionContext): WolinStateObject {
        val wynik = mutableListOf<ParseTree>()
        lewaStrona.traverseFilter(wynik) {
            it is KotlinParser.SimpleIdentifierContext
        }

        val ctx = wynik.first() as KotlinParser.SimpleIdentifierContext

        val zmienna = state.findVarInVariablaryWithDescoping(ctx.Identifier().text)

        state.assignLeftSideVar = zmienna

        state.switchType(zmienna.type, "by znajdźSimpleIdW")

        return state
    }


    override fun visitBlock(ctx: KotlinParser.BlockContext): WolinStateObject {
        state.currentScopeSuffix += "."

        ctx.statements()?.statement()?.forEach {
            statementProcessor(it)
        }

        state.currentScopeSuffix = state.currentScopeSuffix.dropLast(1)

        return state
    }

    override fun visitExpression(ctx: KotlinParser.ExpressionContext): WolinStateObject {
        when {
            ctx.assignmentOperator().size == 1 -> {
                when {
                    ctx.assignmentOperator().first().ASSIGNMENT() != null -> {
                        processAssignment(ctx, { znajdźSimpleIdW(ctx.disjunction(0)) /*visitDisjunction(ctx.disjunction(0)) */},
                            { visitDisjunction(ctx.disjunction(1)) })
                    }
                    else -> błędzik(ctx, "Unknown assignment operator")
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
        if (ctx.conjunction()?.size == 1)
            ctx.conjunction()?.firstOrNull()?.let {
                visitConjunction(it)
            }
        else błędzik(ctx, "Conjunction size > 1")

        return state
    }

    override fun visitConjunction(ctx: KotlinParser.ConjunctionContext): WolinStateObject {
        if (ctx.equalityComparison()?.size == 1)
            ctx.equalityComparison()?.firstOrNull()?.let {


                visitEqualityComparison(it)


            }
        else błędzik(ctx, "Equality size > 1")

        return state
    }

    override fun visitEqualityComparison(ctx: KotlinParser.EqualityComparisonContext): WolinStateObject {
        when {
            ctx.comparison().size == 1 -> ctx.comparison().firstOrNull()?.let {
                visitComparison(it)
            }
            ctx.equalityOperation().size > 1 -> błędzik(ctx, "equality op size > 1")
            ctx.equalityOperation().size == 1 -> {
                val lewa = ctx.comparison(0)
                val prawa = ctx.comparison(1)

                state.code("// początek equality - lewa noga")

                val oper = when (ctx.equalityOperation(0).text) {
                    "==" -> "evaleq"
                    "!=" -> "evalneq"
                    "<" -> "evallt"
                    ">" -> "evalgt"
                    "<=" -> "evaleqlt"
                    ">=" -> "evaleqgt"
                    else -> "unknown eq"
                }

                val wynik = state.currentReg

                state.code("// lewa strona com")

                val pierwszy = state.allocReg("for comp left side") // nie dostaje właściwego typu!!!

                visitComparison(lewa)

                state.inferTopOregType()

                state.code("// prawa strona")

                val drugi = state.allocReg("for comp right side")

                visitComparison(prawa)

                state.inferTopOregType()

                state.code(
                    "$oper ${state.varToAsm(wynik)} = ${state.varToAsm(pierwszy)}, ${state.varToAsm(
                        drugi
                    )} // two sides"
                )

                state.freeReg("for comp right side, type =${state.currentWolinType}")
                state.freeReg("for comp left side, type =${state.currentWolinType}")

                state.setTopOregType(Typ.bool)

                state.code("// koniec equality")
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
                        val wynik = state.currentReg

                        state.code("//=================================")
                        val lewa = state.allocReg("for GE left calculation")
                        state.code("// lewy namedInfix: co?")
                        visitNamedInfix(ctx.namedInfix(0))
                        state.inferTopOregType()

                        state.code("// prawy namedInfix: od czego?")
                        val prawa = state.allocReg("for GE right calculation")
                        visitNamedInfix(ctx.namedInfix(1))
                        state.inferTopOregType()

                        state.code("evalgteq ${state.varToAsm(wynik)} = ${state.varToAsm(lewa)}, ${state.varToAsm(prawa)}")
                        state.freeReg("for GE right calculation")
                        state.freeReg("for GE left calculation")
                        state.code("//=================================")
                    }
                    oper.LE() != null  -> {
                        val wynik = state.currentReg

                        state.code("//=================================")
                        val lewa = state.allocReg("for LE left calculation")
                        state.code("// lewy namedInfix: co?")
                        visitNamedInfix(ctx.namedInfix(0))
                        state.inferTopOregType()

                        state.code("// prawy namedInfix: od czego?")
                        val prawa = state.allocReg("for LE right calculation")
                        visitNamedInfix(ctx.namedInfix(1))
                        state.inferTopOregType()

                        state.code("evalgteq ${state.varToAsm(wynik)} = ${state.varToAsm(prawa)}, ${state.varToAsm(lewa)}")
                        state.freeReg("for LE right calculation")
                        state.freeReg("for LE left calculation")
                        state.code("//=================================")
                    }
                    oper.LANGLE() != null  -> {
                        val wynik = state.currentReg

                        state.code("//=================================")
                        val lewa = state.allocReg("for LNAGLE left calculation")
                        state.code("// lewy namedInfix: co?")
                        visitNamedInfix(ctx.namedInfix(0))
                        state.inferTopOregType()

                        state.code("// prawy namedInfix: od czego?")
                        val prawa = state.allocReg("for LNAGLE right calculation")
                        visitNamedInfix(ctx.namedInfix(1))
                        state.inferTopOregType()

                        state.code("evalless ${state.varToAsm(wynik)} = ${state.varToAsm(lewa)}, ${state.varToAsm(prawa)}")
                        state.freeReg("for LNAGLE right calculation")
                        state.freeReg("for LNAGLE left calculation")
                        state.code("//=================================")
                    }
                    oper.RANGLE() != null  -> {
                        val wynik = state.currentReg

                        state.code("//=================================")
                        val lewa = state.allocReg("for RNAGLE left calculation")
                        state.code("// lewy namedInfix: co?")
                        visitNamedInfix(ctx.namedInfix(0))
                        state.inferTopOregType()

                        state.code("// prawy namedInfix: od czego?")
                        val prawa = state.allocReg("for RNAGLE right calculation")
                        visitNamedInfix(ctx.namedInfix(1))
                        state.inferTopOregType()

                        state.code("evalless ${state.varToAsm(wynik)} = ${state.varToAsm(prawa)}, ${state.varToAsm(lewa)}")
                        state.freeReg("for RNAGLE right calculation")
                        state.freeReg("for RNAGLE left calculation")
                        state.code("//=================================")
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

        state.code("// tu porównanie")

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
            ctx.simpleIdentifier().size > 0 -> błędzik(ctx, "Unknown infix function call")
            else -> błędzik(ctx, "Unknown infix function call")
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
                processTwoSides(
                    { visitMultiplicativeExpression(ctx.multiplicativeExpression(0)) },
                    { visitMultiplicativeExpression(ctx.multiplicativeExpression(1)) },
                    "add"
                )
                ctx.multiplicativeExpression(0)
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
                        processTwoSides(
                            { visitPrefixUnaryExpression(ctx.typeRHS(0).prefixUnaryExpression(0)) },
                            { visitPrefixUnaryExpression(ctx.typeRHS(1).prefixUnaryExpression(0)) },
                            "mul"
                        )
                    }
                    op?.DIV() != null -> {
                        processTwoSides(
                            { visitPrefixUnaryExpression(ctx.typeRHS(0).prefixUnaryExpression(0)) },
                            { visitPrefixUnaryExpression(ctx.typeRHS(1).prefixUnaryExpression(0)) },
                            "div"
                        )
                    }
                    op?.MOD() != null -> {
                        processTwoSides(
                            { visitPrefixUnaryExpression(ctx.typeRHS(0).prefixUnaryExpression(0)) },
                            { visitPrefixUnaryExpression(ctx.typeRHS(1).prefixUnaryExpression(0)) },
                            "mod"
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

    fun processAssignment(ctx: ParseTree, leftFunction: () -> WolinStateObject, rightFunction: () -> WolinStateObject) {

        state.code("// lewa strona assignment")
        state.allocReg("For assignment left side")

        leftFunction()
        val destinationReg = state.assignLeftSideVar!!
        val destinationType = destinationReg.type

        state.setTopOregType(Typ.ptr)
        state.inferTopOregType()

        state.code("// prawa strona assignment")

        val tempSourceReg = state.allocReg("for value that gets assigned to left side")
        rightFunction()

        //state.inferTopOregType() // aktualny typ jest ustawiony źle! To musi być wina prawej funkcji!

        tempSourceReg.type = destinationType

        val sourceReg = state.findVarInVariablaryWithDescoping(tempSourceReg.name)

        if (!state.canBeAssigned(sourceReg.type, destinationReg.type) && state.pass == Pass.TRANSLATION) {
            throw TypeMismatchException("Attempt to assign ${tempSourceReg.name}:${sourceReg.type} to variable of type ${destinationReg.name}:${destinationReg.type}")
        }

        checkTypeAndAddAssignment(ctx, destinationReg, tempSourceReg)

        state.freeReg("for value that gets assigned to left side, type = ${state.currentWolinType}")

        state.freeReg("For assignment left side")

    }

    private fun processTwoSides(
        leftFunction: () -> WolinStateObject,
        rightFunction: () -> WolinStateObject,
        oper: String
    ) {
        state.code("// lewa strona")

        val pierwszy = state.currentReg

        leftFunction()

        state.code("// prawa strona")

        val drugi = state.allocReg("for right side")
        rightFunction()

        state.code(
            "$oper ${state.varToAsm(pierwszy)} = ${state.varToAsm(pierwszy)}, ${state.varToAsm(
                drugi
            )} // two sides"
        )

        state.inferTopOregType()
        state.freeReg("for right side, type =${state.currentWolinType}")
    }

    override fun visitTypeRHS(ctx: KotlinParser.TypeRHSContext): WolinStateObject {
        when {
            ctx.prefixUnaryExpression().size == 1 -> ctx.prefixUnaryExpression().firstOrNull()?.let {
                visitPrefixUnaryExpression(it)
            }
            ctx.typeOperation().size > 0 -> błędzik(ctx, "Typ op size > 0")
            else -> błędzik(ctx, "Unknown TypeRHS")
        }
        return state
    }

    override fun visitPrefixUnaryExpression(ctx: KotlinParser.PrefixUnaryExpressionContext): WolinStateObject {
        when {
            ctx.prefixUnaryOperation().size > 0 -> błędzik(
                ctx,
                "Nie umiem wykonać prefix unary operation dla '${ctx.text}'"
            )
            ctx.postfixUnaryExpression() != null -> visitPostfixUnaryExpression(ctx.postfixUnaryExpression())
            else -> błędzik(ctx, "Unknown prefix unary exception")
        }

        return state
    }

    override fun visitPostfixUnaryExpression(ctx: KotlinParser.PostfixUnaryExpressionContext): WolinStateObject {
        val atomEx = ctx.atomicExpression()
        val callableRef = ctx.callableReference()
        val postfixOp = ctx.postfixUnaryOperation()

        when {
            callableRef != null -> błędzik(ctx, "Nie wiem co się robi z callable ref")
            postfixOp.size > 1 -> błędzik(ctx, "Za dużo postfixUnaryOperation w postfixUnaryExpression")
            postfixOp.size == 0 && atomEx != null -> visitAtomicExpression(atomEx)
            atomEx != null && postfixOp != null -> {
                val operator = postfixOp.first()

                when {
                    operator.callSuffix() != null -> {
                        val procName =
                            atomEx.simpleIdentifier()?.Identifier()?.text ?: throw Exception("Pusta nazwa procedury")

                        if (postfixOp.size > 1)
                            błędzik(ctx, "Za dużo postfixUnaryOp w postifxOp")

                        val postfixUnaryOperation = postfixOp.first()
                        val callSuffix = postfixUnaryOperation.callSuffix()
                        val arguments = callSuffix.valueArguments()



                        val prototyp = try {
                            val klasa = state.findClass(procName)
                            // TODO - tymczasowo dodać do funkcjarium konstruktor bez parametrów przy rejestrowaniu klasy
                            // konstruktor zawiera allokację i zwraca adres

                            state.functiary.first { it.fullName == klasa.name }
                        } catch (ex: StringIndexOutOfBoundsException) {
                            try {
                                state.findProc(procName)
                            } catch (ex: FunctionNotFound) {
                                state.lambdaTypeToFunction(state.findVarInVariablaryWithDescoping(procName))
                            }
                        }

                        if (prototyp.arguments.size != arguments.valueArgument()?.size)
                            błędzik(ctx, "Wrong number of arguments in function call $procName")

                        state.switchType(prototyp.type, "function type 1")
                        state.inferTopOregType()

                        state.fnCallAllocRetAndArgs(prototyp)

                        if(prototyp.arguments.any { it.allocation == AllocType.FIXED && it.location == "CPU.X" }) {
                            state.code("save CPU.X // save SP, as X is used by native call argument")
                        }

                        arguments.valueArgument()?.forEachIndexed { i, it ->
                            state.code("// obsługa argumentu $i wywołania $procName")
                            state.allocReg("for call argument $i", prototyp.arguments[i].type)

                            // w valueArgumentContext jest ExpressionContext
                            visitValueArgument(it)

                            if (prototyp.arguments[i].allocation == AllocType.FIXED) {
                                // dla argumentów CPU koelejność musi być A, Y, X!!!
                                state.code(
                                    "let ${prototyp.arguments[i].location}${prototyp.arguments[i].typeForAsm} = ${state.currentRegToAsm()}"
                                )
                                if(prototyp.arguments[i].location?.startsWith("CPU.") == true)
                                    state.code("save ${prototyp.arguments[i].location}")
                            } else {
                                val found = state.findStackVector(state.callStack, prototyp.arguments[i].name)

                                state.code(
                                    "let SPF(${found.first})${found.second.typeForAsm} = ${state.currentRegToAsm()}"
                                )
                            }

                            state.freeReg("for call argument $i, type = ${prototyp.arguments[i].type}")
                        }

                        state.switchType(prototyp.type, "function type 2")

                        (prototyp.arguments.size-1 downTo 0).forEach {
                            val arg = prototyp.arguments[it]

                            if(arg.allocation == AllocType.FIXED && arg.location?.startsWith("CPU.") == true) {
                                state.code("restore ${arg.location} // fill register for call")
                            }
                        }

                        state.code(state.getFunctionCallCode(procName))

                        if(prototyp.arguments.any { it.allocation == AllocType.FIXED && it.location == "CPU.X" }) {
                            state.code("restore CPU.X // restore SP, as X is used by native call")
                        }

                        state.fnCallReleaseArgs(prototyp)

                        if (!prototyp.type.isUnit)
                            state.code("let ${state.currentRegToAsm()} = ${state.varToAsm(state.callStack.peek())}// copy return parameter - TODO sprawdzić co jeśli wywołanie funkcji było bez podstawienia!!!")

                        state.fnCallReleaseRet(prototyp)

                        state.code("free SPF <${prototyp.type.type}>, #${prototyp.type.sizeOnStack}")

                        if(state.currentClass!=null)
                            state.code("setup HEAP = this")

                    }
                    operator.INCR() != null -> {
                        when {
                            atomEx.simpleIdentifier() != null -> {
                                val identifier = atomEx.simpleIdentifier()?.Identifier()?.text
                                    ?: throw Exception("No identifier for ++")
                                val zmienna = state.findVarInVariablaryWithDescoping(identifier)
                                state.code(
                                    "add ${state.varToAsm(zmienna)} = ${state.varToAsm(
                                        zmienna
                                    )}, #1[byte] // simple id"
                                )
                                state.switchType(zmienna.type, "++ operator")
                            }
                            atomEx.literalConstant() != null -> {

                                parseLiteralConstant(state.currentReg, atomEx.literalConstant())

                                state.code("let ${state.currentRegToAsm()} = #${state.currentReg.immediateValue}${state.currentReg.typeForAsm}, #1[byte], add // literal const")
                                //state.currentReg.type = "Ubyte"
                            }
                            else -> błędzik(atomEx, "Nie wiem jak obsłużyć")
                        }
                    }
                    ctx.postfixUnaryOperation().size > 1 -> błędzik(ctx, "too many postfix unary ops")
                    ctx.postfixUnaryOperation().size == 1 -> {

                        val lewo = atomEx
                        val prawo = ctx.postfixUnaryOperation()[0]

                        when {
                            prawo.memberAccessOperator() != null -> {

                                state.code("// lewa strona deref")
                                visitAtomicExpression(lewo)
                                state.code("// sprawdzic, czy aktualny typ to klasa")
                                state.code("// jesli tak, to na gorze heapu jest uniqid klasy")

                                // TODO tu podstawiamy pod aktualny rejestr instancje jakiejś klasy
                                // ale nie wiemy co to za klasa,  bo to już tylko ptr
                                // więc nie wiemy jakie ma metody ten ptr!

                                state.code("// prawa strona deref")
                                //visitPostfixUnaryOperation(poKropce)
                                //błędzik(ctx,"nie wiem jak dereferncić")

                                val reg = state.currentReg
                                val safeDeref = prawo.memberAccessOperator().QUEST() != null

                                val costam = prawo.postfixUnaryExpression()
                                if (safeDeref) {
                                    state.code("evaleq costam[bool] = $reg[ptr], null")
                                    state.code("beq costam[bool] = #0, jakis_label[adr]")
                                }

                                state.code("// postfix unary w dereferencji")
                                //visitPostfixUnaryExpression(costam)
                            }
                            prawo.arrayAccess() != null -> {
                                // ARRAYCODE
                                val currEntReg = state.currentReg
                                state.arrayElementSize = currEntReg.type.sizeOnStack

                                // jeśli indeks 8-bitowy i element nie robic tej allokacji

                                state.codeOn = false
                                visitAtomicExpression(lewo)
                                state.codeOn = true

                                state.allocReg("arr_deref", state.currentWolinType)
                                state.code("// LEWA strona array access, czyli co to za zmienna")
                                visitAtomicExpression(lewo)
                                state.code("// PRAWA strona array access, czyli indeks w nawiasach")
                                visitArrayAccess(prawo.arrayAccess())

                                state.code("// kod obsługi tablicy")

                                when {
                                    state.currentShortArray == null -> {
                                        state.code("// non-fast array")
                                        state.code("let ${state.varToAsm(currEntReg)} = ${state.varToAsmNoType(state.currentReg)}[ptr]")
                                    }
                                    state.currentShortArray!!.allocation == AllocType.FIXED -> {
                                        state.code("// fixed fast array - warning - SP(0) cannot get optimized!!!")
                                        state.code("let ${state.varToAsm(currEntReg)} = ${state.currentShortArray!!.location}(0)[ptr]")
                                    }
                                    state.currentShortArray!!.allocation == AllocType.NORMAL -> {
                                        state.code("// allocated fast array - warning - SP(0) cannot get optimized!!!")
                                        state.code("let ${state.varToAsm(currEntReg)} = ${state.currentShortArray!!.name}(0)[ptr]")
                                        state.currentShortArray = null
                                    }
                                    else -> throw Exception("Dereference of unknown array!")
                                }

                                // jeśli indeks 8-bitowy i element nie robic tej allokacji
                                state.freeReg("arr_deref")
                            }
                            else -> błędzik(ctx, "Nieznany postfixUnaryOp")
                        }
                    }
                    else -> błędzik(ctx, "Nieznana prawa strona ${operator.javaClass.simpleName}")
                }
            }
            else -> błędzik(ctx, "null po którejś stronie postfixUnaryExpression")
        }

        return state
    }

    override fun visitArrayAccess(ctx: KotlinParser.ArrayAccessContext): WolinStateObject {
        when {
            ctx.expression().size == 1 -> {
                val prevReg = state.currentReg!!

                // ARRAYCODE

                if(state.currentShortArray == null) {
                    state.allocReg("For calculating index",state.currentWolinType)
                }

                visitExpression(ctx.expression(0))

                if(state.currentShortArray == null)
                    state.setTopOregType(Typ.uword) // typ indeksu
                else
                    state.setTopOregType(Typ.ubyte) // typ indeksu


                // ARRAYCODE
                if(state.currentShortArray == null) {
                    when {
                        state.arrayElementSize > 1 -> {
                            state.code("// long index, multi-byte per element array")
                            state.code("mul ${state.currentRegToAsm()} = ${state.currentRegToAsm()}, #${state.arrayElementSize}")
                            state.code("add ${state.varToAsm(prevReg)} = ${state.varToAsm(prevReg)}, ${state.currentRegToAsm()}")
                        }
                        else -> {
                            state.code("// long index, single byte per element array")
                            state.code("add ${state.varToAsm(prevReg)} = ${state.varToAsm(prevReg)}, ${state.currentRegToAsm()}")
                        }
                    }

                    state.freeReg("For calculating index")

                } else {
                    state.code("// fast array - no additional op")
                    //state.code("add ${state.varToAsm(prevReg)} = ${state.varToAsm(prevReg)}, ${state.currentRegToAsm()}")
                }

                state.code("// after index")

                state.code("//dereference value at topRegister")
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
        state.code("//Prze visit vALUE")

        when {
            ctx.ASSIGNMENT() != null -> błędzik(ctx, "Nie wiem jak obsłużyć assignment v value argument")
            ctx.MULT() != null -> błędzik(ctx, "Nie wiem jak obsłużyć mult v value argument")
            ctx.simpleIdentifier() != null -> błędzik(ctx, "Nie wiem jak obsłużyć simpleId v value argument")
            ctx.expression() != null -> {
                state.code("// obliczenia dla parametru ${ctx.expression().text}")
                visitExpression(ctx.expression())
            }
        }

        state.code("//po visit value")

        return state
    }

    override fun visitAtomicExpression(ctx: KotlinParser.AtomicExpressionContext): WolinStateObject {
        when {
            ctx.simpleIdentifier() != null -> visitSimpleIdentifier(ctx.simpleIdentifier())
            ctx.literalConstant() != null -> {
                val wartość = Zmienna(allocation = AllocType.LITERAL, stack = "")
                parseLiteralConstant(wartość, ctx.literalConstant())
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
            ctx.LabelReference() != null -> błędzik(ctx,"Don't know how to process this@xxxx")
            ctx.THIS() != null -> {
                val zmienna = state.findVarInVariablaryWithDescoping("this")

                state.allocReg("for statement this")

                checkTypeAndAddAssignment(ctx,state.currentReg, zmienna)

            }
            else -> błędzik(ctx, "Uknown this reference!")
        }

        return state
    }

    override fun visitFunctionLiteral(ctx: KotlinParser.FunctionLiteralContext): WolinStateObject {
        val parametryLambdy = ctx.lambdaParameters()

        val blok = ctx.statements()

        val lambdaName = "lambda_function_${state.lambdaCounter++}"

        val nowaFunkcja = Funkcja(fullName = lambdaName)

        // TODO - dodać do skołpu zmienne tej lambdy

        val rememberedFunction = state.currentFunction

        state.currentFunction = nowaFunkcja

        parametryLambdy.lambdaParameter()?.forEachIndexed {index, it ->
            when {
                it.multiVariableDeclaration() != null -> błędzik(ctx, "Nie wiem jak obsłużyć multiVarDecl w lambdzie")
                it.variableDeclaration() != null -> {
                    val decl = it.variableDeclaration()
                    val typ = decl.type()
                    val id = decl.simpleIdentifier().text

                    val arg = if(typ == null) {
                        // TODO - parametr lambdy może być podany bez typu, w takim wypadku musimy go sobie pobrać
                        // z typu zmiennej, do której jest przypisywana ta lambda (assignLeftSideVar)

                        if(state.assignLeftSideVar != null) {
                            val funkcja = state.lambdaTypeToFunction(state.assignLeftSideVar!!)
                            val interred = funkcja.arguments[index]
                            state.createAndRegisterVar(id, AllocType.NORMAL, interred.type, true, "SPF")
                        } else {
                            błędzik(ctx,"Can't infer type of lambda!")
                            throw Exception()
                        }
                    } else {
                        state.createAndRegisterVar(id, typ, null, true, "SPF")
                    }

                    if (arg.allocation != AllocType.FIXED) nowaFunkcja.arguments.add(arg)
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
        state.fnCallReleaseRet(nowaFunkcja)

        state.codeOn = true

        nowaFunkcja.type = state.currentWolinType

        nowaFunkcja.lambdaBody = blok

        state.currentFunction = rememberedFunction

        state.functiary.add(nowaFunkcja)

        val test = state.functionToLambdaType(nowaFunkcja)

        state.switchType(test, "lambda declaration")
        state.inferTopOregType()

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

        state.code("label $condLabel")

        state.setTopOregType(Typ.bool)

        visitExpression(ctx.expression())

        state.code("bne ${state.currentRegToAsm()} = #1[bool], $afterBodyLabel<label_po_if>[uword]")

        visitControlStructureBody(ctx.controlStructureBody())

        state.code("goto $condLabel[adr]")

        state.code("label $afterBodyLabel")

        return state
    }

    override fun visitDoWhileExpression(ctx: KotlinParser.DoWhileExpressionContext): WolinStateObject {

        state.loopCounter++

        val bodyLabel = labelMaker("loopStart", state.loopCounter)

        val afterBodyLabel = labelMaker("loopEnd", state.loopCounter)

        state.code("label $bodyLabel")

        state.setTopOregType(Typ.bool)

        visitControlStructureBody(ctx.controlStructureBody())

        visitExpression(ctx.expression())

        state.code("beq ${state.currentRegToAsm()} = #1[bool], $bodyLabel<label_po_if>[uword]")

        state.code("label $afterBodyLabel")

        return state
    }

    override fun visitConditionalExpression(ctx: KotlinParser.ConditionalExpressionContext): WolinStateObject {
        when {
            ctx.ifExpression() != null -> visitIfExpression(ctx.ifExpression())
            //ctx.whenExpression() != null -> visitWhenExpression(ctx.whenExpression())
            else -> błędzik(ctx, "Unknown conditional")
        }

        return state
    }

    override fun visitIfExpression(ctx: KotlinParser.IfExpressionContext): WolinStateObject {
        val warunek = ctx.expression()
        val body = ctx.controlStructureBody()

        state.allocReg("equality result", Typ.bool)

        visitExpression(warunek)

        val elseLabel = labelMaker("afterIfExpression", state.labelCounter)

        when {
            body.size == 1 -> {
                state.code("bne ${state.currentRegToAsm()} = #1[bool], $elseLabel<label_po_if>[uword]")
                state.code("// body dla true")
                visitControlStructureBody(body[0])
                state.code("// label po if")
                state.code("label $elseLabel")

            }
            body.size == 2 -> {
                //val elseLabel = labelMaker("elseExpression",state.labelCounter)

                state.code("bne ${state.currentRegToAsm()} = #1[bool], $elseLabel<label_DO_else>[uword]")
                state.code("// body dla true")
                visitControlStructureBody(body[0])
                state.code("label $elseLabel")
                state.code("// body dla false/else")
                visitControlStructureBody(body[1])
            }
            else -> {
                błędzik(ctx, "Unknown if body size - elseif?")
            }
        }

        state.freeReg("equality result")

        state.labelCounter++

        return state
    }

    override fun visitTryExpression(ctx: KotlinParser.TryExpressionContext): WolinStateObject {
        val tryBlock = ctx.block()
        val catchNode = ctx.catchBlock(0)

        state.exceptionsUsed = true

        state.code("// try")
        state.code("alloc SP<catch_addr>, #2 // catch block entry point")
        state.code("let SP(0)[uword] = ${labelMaker("catch_block_start", state.labelCounter)}[uword]")
        state.code("call __wolin_create_exception_entry[adr]")

        visitBlock(tryBlock)

        state.code("free SPE, #5 // remove exception table entry")
        state.code("goto ${labelMaker("after_catch_block_end", state.labelCounter)}[adr]")
        state.code("")
        state.code("// catch")
        state.code("label ${labelMaker("catch_block_start", state.labelCounter)}")

        visitBlock(catchNode.block())

        state.code("")
        state.code("// catch end")
        state.code("label ${labelMaker("after_catch_block_end", state.labelCounter)}")

        state.labelCounter++

        return state
    }

    fun checkTypeAndAddAssignment(ctx: ParseTree, doJakiej: Zmienna, co: Zmienna) {
        if(state.pass == Pass.TRANSLATION) {
            val można = state.canBeAssigned(doJakiej.type, co.type) || doJakiej.type.type == "ptr" || co.type.type == "uword"

            if(można) {
                state.code("let ${state.varToAsm(doJakiej)} = ${state.varToAsm(co)} // przez sprawdzacz typów")
            } else {
                błędzik(ctx, "Nie można przypisać ${co.type} do zmiennej typu ${doJakiej.type}")
            }
        }
    }

    override fun visitJumpExpression(ctx: KotlinParser.JumpExpressionContext): WolinStateObject {
        when {
            ctx.RETURN() != null -> {
                if (ctx.expression() != null) {
                    visitExpression(ctx.expression())
                }

                val zwrotka = state.callStack[0]

                checkTypeAndAddAssignment(ctx, zwrotka, state.currentReg)

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

                val zmienna = state.findVarInVariablaryWithDescoping(ctx.Identifier().text)


                    if(zmienna.type.shortIndex && zmienna.type.elementOccupiesOneByte) {
                        //state.code("// short - musimy tylko zapamiętać zmienną $zmienna")
                        state.currentShortArray = zmienna
                    }
                    else {
                        state.code(
                            "let ${state.currentRegToAsm()} = ${state.varToAsm(zmienna)} // simple id from var"
                        )
                    }


//                state.code(
//                    "let ${state.currentRegToAsm()} = ${state.varToAsm(zmienna)} // simple id from var"
//                )

                state.switchType(zmienna.type, "type from ${zmienna.name}")
            }
            else -> {
                błędzik(ctx, "Nie wiem jak obsłużyć ten simpleIdentifier")
            }
        }


        return state
    }

    override fun visitFunctionDeclaration(ctx: KotlinParser.FunctionDeclarationContext): WolinStateObject {
        val nowaFunkcja =
            Funkcja()

        val name = ctx.identifier()?.text ?: throw Exception("Brak nazwy funkcji")

        val lokacjaLiterał = ctx.locationReference()?.literalConstant()

        val lokacjaAdres = Zmienna("", allocation = AllocType.FIXED, stack = "dummy")

        state.switchType(Typ.unit, "function declaration")

        lokacjaLiterał?.let {
            parseLiteralConstant(lokacjaAdres, it)
        }

        nowaFunkcja.location = lokacjaAdres.intValue?.toInt()
        nowaFunkcja.fullName = state.nameStitcher(name)

        state.currentFunction = nowaFunkcja

        val zwrotka = state.createAndRegisterVar("returnValue", ctx.type(0), null, true, "SPF")

        nowaFunkcja.type = zwrotka.type

        if(state.currentClass != null) {
            val thisArg = state.createAndRegisterVar("this", AllocType.NORMAL, Typ.byName(state.currentClass!!.name, state), true, "SPF")
            state.currentFunction?.arguments?.add(thisArg)
       }

        ctx.functionValueParameters()?.functionValueParameter()?.forEach {
            visitFunctionValueParameter(it)
        }

        val body = ctx.functionBody()

        if (body != null && nowaFunkcja.location != null)
            throw Exception("Fixed address function with a body!")

        state.code(
            "\n" + """// ****************************************
            |// funkcja: ${nowaFunkcja}
            |// ****************************************
        """.trimMargin()
        )

        state.code("label ${state.currentFunction!!.labelName}")

//        if(state.currentClass != null) {
//            //state.code("let __wolin_this_ptr[adr] = SPF(0)<this>[adr] // ustawienie this TODO - zapamiętać poprzedni this!!!!")
//        }

        state.fnDeclAllocStackAndRet(state.currentFunction!!)

        if(state.currentClass!=null)
            state.code("setup HEAP = this")

        body?.let {
            visitFunctionBody(it)
        }

        state.code("")

        state.functiary.add(nowaFunkcja)

        state.currentFunction = null

        return state
    }


    override fun visitClassDeclaration(ctx: KotlinParser.ClassDeclarationContext): WolinStateObject {
        state.currentClass = Klasa(state.nameStitcher(ctx.simpleIdentifier().text))

        state.toClassary(state.currentClass!!)

        val konstruktor = Funkcja(
            state.currentClass!!.name,
            Typ.byName(state.currentClass!!.name, state)
        )


        ////////////////////////////////////////

        state.code(
            "\n" + """// ****************************************
            |// konstruktor: ${konstruktor}
            |// ****************************************
        """.trimMargin()
        )

        state.code("label ${konstruktor.labelName}")

        state.fnDeclAllocStackAndRet(konstruktor)

        state.code("")

        state.functiary.add(konstruktor)

        val zwrotka = state.createAndRegisterVar("returnValue", AllocType.NORMAL, Typ.ptr, true, "SPF")

        val funkcjaAlloc = state.findProc("allocMem").apply {
            if(state.pass == Pass.TRANSLATION) {
                val zKlasarium = state.findClass(state.currentClass!!.name)
                this.arguments[0].intValue = state.getStackSize(zKlasarium.heap).toLong()
                this.arguments[1].intValue = 1
            }
        }

        state.allocReg("for returning this",funkcjaAlloc.type)

        state.switchType(funkcjaAlloc.type, "function type 1")
        state.inferTopOregType()
        state.switchType(funkcjaAlloc.type, "function type 2")

        easeyCall(ctx, funkcjaAlloc, state.currentReg)

        state.code("// tutaj kod na przepisanie z powyższego rejestru do zwrotki konstruktora")
        checkTypeAndAddAssignment(ctx, zwrotka, state.currentReg)

        state.code("ret")

        ////////////////////////////////////////
        state.freeReg("for returning this")

        state.fnDeclFreeStackAndRet(konstruktor)

        val a = ctx.classBody()
        a.classMemberDeclaration()?.forEach {
            it.propertyDeclaration()?.let {
                visitPropertyDeclaration(it)
            }
        }

        val classUniqId = state.classCounter++

        val zmienna = Zmienna(
            "classUniqId",
            true,
            null,
            AllocType.NORMAL,
            stack = "HEAP",
            type = Typ.ubyte
        ).apply {
            intValue = classUniqId.toLong()
        }

        state.currentClass!!.heap.push(zmienna)

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

        val arg = state.createAndRegisterVar(param.simpleIdentifier().text, param.type(), null, true, "SPF")
        state.currentFunction?.arguments?.add(arg)


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

        if (ctx.variableDeclaration().type() == null)
            błędzik(ctx, "Variable $name has no type!")

        val stack = if(state.currentClass != null) "HEAP" else ""

        val zmienna = state.createAndRegisterVar(name, ctx.variableDeclaration().type(), ctx, false, stack)

        if (ctx.expression() != null) {
            visitExpression(ctx.expression())
            state.code("let ${zmienna.name}[${zmienna.type}] = ${state.currentRegToAsm()} // podstawic wynik expression do zmiennej $name")
        }

        return state
    }

    override fun visitKotlinFile(ctx: KotlinParser.KotlinFileContext): WolinStateObject {

        // TODO: to powinno być includem dla c64
        if (state.exceptionsUsed) {
            state.code("setup SPE = 155[ubyte], 53247[uword] // exception stack pointer at 155 = 53247 (was: datasette something)")
            state.code("setup EXPTR = 178[ubyte] // ptr to Exception object when exception occurs (was: datasette buffer)")
            state.code("setup CATCH = 253[ubyte] // jmp adddress for catch")
        }

        if (state.spfUsed)
            state.code("setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959")

        if (state.spUsed)
            state.code("setup SP = 142[ubyte] // register stack top = 142")

        if (state.mainFunction != null) {
            state.code("// main function entry")
            state.code("goto ${state.mainFunction!!.labelName}[adr]")
        }

        state.fileScopeSuffix = nazwaPliku
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
            state.code("// TODO - sprawdzić czy jego też trzeba zmniejszyć, bo catch jest wewnątrz allokacji dla statementu!")
            state.code("ret")

            state.code("")
            state.code("label __wolin_throw_exception")
            state.code("bne SPE = __wolin_spe_top, __wolin_process_exception // jesli mamy blok catch, to go obslugujemy")
            state.code("let __wolin_exception_ptr[ptr] = #0[uword]")
            state.code("crash")

            state.code("")
            state.code("label __wolin_process_exception")
            state.code("let __wolin_spe_zp_vector[uword] = SPE(0)[uword] // pobieramy adres bloku catch i ustawimy go jako wektor")
            state.code("add SPE(2)[ubyte] = SPE(2)[ubyte], #2[ubyte] // stos zapamiętaliśmy w podprogramie, musimy go zmniejszyć o adres powrotny")
            state.code("let SPC[ubyte] = SPE(2)[ubyte] // przywrócenie stosu CPU, takiego jak był w bloku try")
            state.code("let SP[ubyte] = SPE(3)[ubyte] // przywrócenie stosu wolina")
            state.code("free SPE, #5")
            state.code("goto __wolin_spe_zp_vector[ptr]")
        }

        return state
    }

    override fun visitLiteralConstant(ctx: KotlinParser.LiteralConstantContext): WolinStateObject {
        state.code("/// ***** VISIT LITERAL CONSTANT")
        return state
    }


    override fun visitPreamble(ctx: KotlinParser.PreambleContext): WolinStateObject {
        state.basePackage = ctx.packageHeader()?.identifier()?.text ?: throw Exception("Illegal package name")
        return state
    }


    fun parseNumberGuessType(reg: Zmienna, text: String, radix: Int): Zmienna {
        val wynik = java.lang.Long.parseLong(text, radix)
        reg.intValue = wynik

        if (reg.type.isUnit) {
            when (wynik) {
                in 0..255 -> reg.type = Typ.byName("ubyte", state)
                in 0..65535 -> reg.type = Typ.byName("uword", state)
                in -127..128 -> reg.type = Typ.byName("byte", state)
                in -32768..32767 -> reg.type = Typ.byName("word", state)

                else -> throw Exception("Value out of range")
            }
        }

        state.switchType(reg.type, "guess number type")

        return reg
    }

    fun parseLiteralConstant(reg: Zmienna, const: KotlinParser.LiteralConstantContext) {
        if (const.BinLiteral() != null) {

        } else if (const.BooleanLiteral() != null) {
            reg.type = Typ.byName("bool", state)
            if (const.text.toLowerCase() == "true") reg.intValue = 1 else reg.intValue = 0
        } else if (const.CharacterLiteral() != null) {
            reg.type = Typ.byName("ubyte", state)
            reg.intValue = const.text.first().toLong()
        } else if (const.HexLiteral() != null) {
            parseNumberGuessType(reg, const.text.drop(2), 16)
        } else if (const.IntegerLiteral() != null) {
            parseNumberGuessType(reg, const.text, 10)
        } else if (const.LongLiteral() != null) {
            parseNumberGuessType(reg, const.text, 10)
        } else if (const.NullLiteral() != null) {
            reg.intValue = 0L
            reg.type = Typ.byName("any?", state)
        } else if (const.RealLiteral() != null) {
            reg.type = Typ.byName("float", state)
            reg.floatValue = 3.14f
            state.floats.add(3.14f)
        } else if (const.stringLiteral() != null) {
            reg.type = Typ.byName("string", state)
            reg.stringValue = const.text
            state.strings.add(const.text)
        } else {
            błędzik(const, "Unknown literal")
        }

        state.switchType(reg.type, "parse literal constant")
    }

    fun błędzik(miejsce: ParseTree, teskt: String = "") {
        val interval = miejsce.sourceInterval
        val token = tokenStream.get(interval.a)
        val linia = token.line
        throw Exception("$teskt at $linia in:\"" + miejsce.text + "\"\n" + dump(miejsce, 0))
    }


    fun appendLambdas() {

        state.code(
            "\n\n" +
                    """// ****************************************
            |// LAMBDAS
            |// ****************************************
        """.trimMargin()
        )

        state.functiary.filter { it.lambdaBody != null }.forEach { nowaFunkcja ->

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

            state.currentFunction!!.lambdaBody?.statement()?.forEach {
                val zwrotka = state.callStack[0]
                statementProcessor(it, zwrotka)
            }

            state.switchType(state.currentFunction!!.type, "return expression")

            state.fnDeclFreeStackAndRet(state.currentFunction!!)

            state.code("ret")

            state.code("")

            state.currentFunction = null
        }
    }


    fun easeyCall(ctx: ParseTree, funkcjaAlloc: Funkcja, destReg: Zmienna) {
        state.code("// otwarcie stosu na wywolanie ${funkcjaAlloc.fullName}")
        state.fnCallAllocRetAndArgs(funkcjaAlloc)

        state.code("// tu podajemy argumenty dla ${funkcjaAlloc.fullName}")
        // wypełnić argumenty

        funkcjaAlloc.arguments.forEach {
            state.code("// let ${it.name} = #${it.immediateValue}")

            val found = state.findStackVector(state.callStack, it.name)

            if (it.allocation == AllocType.FIXED) {
                state.code(
                    "let ${it.intValue} = #${it.immediateValue}"
                )
            } else {
                state.code(
                    "let SPF(${found.first})${found.second.typeForAsm} = #${it.immediateValue}${it.typeForAsm}"
                )
            }
        }

        state.code("// po argumentach dla ${funkcjaAlloc.fullName}")
        state.code("call ${funkcjaAlloc.labelName}[adr]")

        state.fnCallReleaseArgs(funkcjaAlloc)

        checkTypeAndAddAssignment(ctx, destReg, state.callStack.peek())

        state.fnCallReleaseRet(funkcjaAlloc)

        state.code("free SPF <${funkcjaAlloc.type.type}>, #${funkcjaAlloc.type.sizeOnStack} // free return value of ${funkcjaAlloc.fullName} from call stack")
    }
}



fun labelMaker(name: String, count: Int): String = "__wolin_lab_${name}_$count"

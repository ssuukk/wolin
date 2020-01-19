package pl.qus.wolin

import pl.qus.wolin.components.*
import pl.qus.wolin.exception.*
import java.lang.Exception
import java.util.*

class SpecStack(val stackName: String) : Stack<Zmienna>()

class WolinStateObject(val pass: Pass) {
    private var tekstProgramu: String = ""

    val stackDumpOn = false
    var codeOn = true
    var commentOn = true

    private var variablary = hashMapOf<String, Zmienna>()
    private var functiary = hashMapOf<String, Funkcja>()
    private var classary = hashMapOf<String, Klasa>()

    val operStack = SpecStack("SP")
    val callStack = SpecStack("SPF")
    val classDerefStack = Stack<Zmienna>()
    val assignStack = AssignStack()

    var strings = mutableListOf<String>()
    var floats = mutableListOf<Float>()

    var mainFunction: Funkcja? = null

    var currentWolinType = Typ.unit
    var labelCounter = 0
    var loopCounter = 0
    var lambdaCounter = 0
    var whenCounter = 0
    var stackVarCounter = 0
    var classCounter = 0

    var basePackage = ""
    var currentScopeSuffix = ""
    var currentClass: Klasa? = null
    var currentFunction: Funkcja? = null
    var currentShortArray: Zmienna? = null

    //var stringCount = 0L
    var exceptionsUsed = false

    val spUsed get() = variablary.any { it.value.fieldType == FieldType.OP_STACK }

    val spfUsed get() = functiary.isNotEmpty()

    // potencjalnie wymagające stosu
    var arrayElementSize: Int = 0
    var simpleWhen = true
    var lastWhenEntry = false
    var whenBranchResult: Zmienna? = null

    init {
        if (classary.isEmpty()) {
            classary["any"] = AnyKlasa()
        }
    }

    /*****************************************************************
    Generalny kod
     *****************************************************************/

    fun copy(state: WolinStateObject) {
        state.variablary = variablary
        state.exceptionsUsed = exceptionsUsed
        state.classary = classary
        state.functiary = functiary
        state.mainFunction = mainFunction
//            declarationVisitor.state.strings = symbolsVisitor.state.strings
//            declarationVisitor.state.floats = symbolsVisitor.state.floats
    }

    fun code(kod: String) {
        if (codeOn && pass == Pass.TRANSLATION)
            tekstProgramu += "$kod\n"
    }

    fun rem(c: String) {
        if (commentOn && pass == Pass.TRANSLATION)
            tekstProgramu += "// $c\n"

    }

    fun dumpCode() = tekstProgramu

    /*****************************************************************
    Variablary etc.
     *****************************************************************/
    fun createVar(
        name: String,
        typeContext: KotlinParser.TypeContext?,
        propertyCtx: KotlinParser.PropertyDeclarationContext?,
        //isArgument: Boolean = false,
        fieldType: FieldType
    ): Zmienna {
        if (typeContext == null) {
            return Zmienna(
                name = nameStitcher(name),
                allocation = AllocType.NORMAL,
                fieldType = fieldType,
                typexxx = Typ.unit
            )
        }

        val array = typeContext.typeReference()?.arrayDeclaration()

        val shortIndex = typeContext.typeReference()?.arrayDeclaration()?.userType()?.text == "ubyte"

        val fnType = typeContext.functionType()

        val type = when {
            typeContext.typeReference()?.userType()?.text != null -> Typ.byName(
                typeContext.typeReference()!!.userType()!!.text,
                this
            )
            typeContext.nullableType()?.typeReference()?.userType()?.text != null -> Typ.byName(
                typeContext.nullableType()!!.typeReference()!!.userType()!!.text,
                this
            )
            fnType?.functionTypeParameters() != null -> {
                val fnTypePars =
                    fnType.functionTypeParameters().type().map { findQualifiedType(it.text) }.joinToString(",")

                //val fnTypePars = findQualifiedType(fnType.functionTypeParameters()!!.text)
                val fnTypeRec = findQualifiedType(fnType.type()!!.text)

                Typ.byName("($fnTypePars)->$fnTypeRec", this)
            }
            else -> throw Exception("Typ not specified for $name")
        }

        type.array = array != null

        type.shortIndex = shortIndex

        // TODO - musimy znaleźć dany typ w skołpie!!!


//        if(fnType?.functionTypeParameters() != null) {
//            val fnTypePars = findQualifiedType(fnType?.functionTypeParameters()?.text ?: "NULL")
//            val fnTypeRec = findQualifiedType(fnType?.type()?.text ?: "NULL")
//
//            val fnTypeTx = Typ.byName("$fnTypePars->$fnTypeRec", this)
//        }


        val parenthsized = typeContext.nullableType()?.parenthesizedType()

        if (parenthsized != null)
            throw Exception("Don't know how to process partenthsized type!")

        val mods = propertyCtx?.modifierList()

        //val loc = typeContext.typeReference()?.locationReference()?.text
        val locRef = typeContext.typeReference()?.locationReference()
        val nullableTypeLocRef = typeContext.nullableType()?.typeReference()?.locationReference()

        val typ = when {
            locRef != null || nullableTypeLocRef != null -> AllocType.FIXED
            mods?.modifier()?.filter { it.text == "const" }?.size ?: 0 != 0 -> AllocType.LITERAL
            else -> AllocType.NORMAL
        }

        val zmienna = Zmienna("", allocation = typ, fieldType = fieldType)

        zmienna.immutable = propertyCtx?.VAL() != null || fieldType == FieldType.ARGUMENT

        val location = locRef?.literalConstant() ?: nullableTypeLocRef?.literalConstant()
        val otherLocation = locRef?.userType()?.text

        if(location != null) {
            val locationVal = Zmienna(allocation = AllocType.FIXED, fieldType = FieldType.DUMMY)
            parseLiteralConstant(locationVal, location)
            zmienna.locationVal = locationVal.intValue.toInt()
        }
        zmienna.locationTxt = otherLocation
        zmienna.name = nameStitcher(name, fieldType == FieldType.ARGUMENT)
        zmienna.type = type

        var pomiń = 0
        if (basePackage.isNotEmpty()) pomiń = basePackage.length + 1
        //if (fileScopeSuffix.isNotEmpty()) pomiń += fileScopeSuffix.length + 1


        if (!zmienna.immutable && zmienna.allocation == AllocType.LITERAL)
            throw Exception("var can't be const!")

        if (propertyCtx?.expression() != null && zmienna.allocation == AllocType.LITERAL) {
            throw Exception("przeliczyć wartość const:${propertyCtx.expression().text} dla ${zmienna.name}")
        }

        val bezSkopuPliku = if (zmienna.name.startsWith(basePackage)) zmienna.name.drop(pomiń) else zmienna.name

        if (!bezSkopuPliku.contains(".") && zmienna.allocation != AllocType.FIXED)
            zmienna.fieldType = FieldType.STATIC

//        if(zmienna.allocation == AllocType.FIXED)
//            zmienna.type.pointer = true

        return zmienna
    }

    fun createAndRegisterVar(
        name: String,
        typeContext: KotlinParser.TypeContext?,
        propertyCtx: KotlinParser.PropertyDeclarationContext?,
        fieldType: FieldType
    ): Zmienna {
        val zmienna = createVar(name, typeContext, propertyCtx, fieldType)

        toVariablary(zmienna)

        if (zmienna.fieldType == FieldType.CLASS) {
            currentClass!!.toHeapAndVariablary(zmienna)
            zmienna.inClass = currentClass
        }

        if (fieldType != FieldType.ARGUMENT && currentFunction?.locals?.none {it.name == zmienna.name} == true) {
            if(currentFunction?.isInterrupt == true)
                throw InterruptFunctionWithLocals("Local variables are not allowed in interrupt functions!")
            else
                currentFunction?.addField(zmienna)
        }

        return zmienna
    }

    fun createAndRegisterVar(
        name: String,
        alloc: AllocType,
        typ: Typ,
        //isArgument: Boolean,
        fieldType: FieldType
    ): Zmienna {
        val zmienna = Zmienna("", allocation = alloc, fieldType = fieldType, typexxx = typ)

        zmienna.immutable = fieldType == FieldType.ARGUMENT
        zmienna.name = nameStitcher(name, fieldType == FieldType.ARGUMENT)

        var pomiń = 0
        if (basePackage.isNotEmpty()) pomiń = basePackage.length + 1
        //if (fileScopeSuffix.isNotEmpty()) pomiń += fileScopeSuffix.length + 1

        val bezSkopuPliku = if (zmienna.name.startsWith(basePackage)) zmienna.name.drop(pomiń) else zmienna.name

        if (!zmienna.immutable && zmienna.allocation == AllocType.LITERAL)
            throw Exception("var can't be const!")

        if (!bezSkopuPliku.contains(".") && zmienna.allocation != AllocType.FIXED)
            zmienna.fieldType = FieldType.STATIC

        toVariablary(zmienna)
        if (zmienna.fieldType == FieldType.CLASS) {
            currentClass!!.toHeapAndVariablary(zmienna)
            zmienna.inClass = currentClass
        }

        return zmienna
    }

    //    fun addString(str: String) {
//        strings.add(str)
//        stringCount++
//    }

    fun toVariablary(zmienna: Zmienna) {
        if (!variablary.containsKey(zmienna.name))
            variablary[zmienna.name] = zmienna
    }

    fun toClassary(klasa: Klasa) {
        if (!classary.containsKey(klasa.name))
            classary[klasa.name] = klasa
    }

    fun toFunctiary(proc: Funkcja) {
        if (!functiary.containsKey(proc.fullName))
            functiary[proc.fullName] = proc
    }

    fun findClass(nazwa: String): Klasa {
        if (classary.containsKey(nazwa))
            return classary[nazwa]!!

        var gdzieJesteśmy = nameStitcher("")

        var klasa: Klasa?

        do {
            val pattern = "$gdzieJesteśmy.$nazwa"

            klasa = classary[pattern]

            val ostKropka = gdzieJesteśmy.lastIndexOf(".")
            gdzieJesteśmy = gdzieJesteśmy.substring(0, ostKropka)
        } while (klasa == null)

        return klasa
    }

    fun initializedStatics(): List<Zmienna> =
        variablary.filter { it.value.fieldType == FieldType.STATIC && it.value.initExpression != null }.map{ it.value }

    fun initializedClassFields(): List<Zmienna> =
        variablary.filter { it.value.fieldType == FieldType.CLASS && it.value.initExpression != null }.map{ it.value }

    fun lambdas(): List<Funkcja> =
        functiary.values.filter { it.lambdaBody != null }

    fun findVarInVariablaryWithDescoping(nazwa: String): Zmienna {
        var gdzieJesteśmy = nameStitcher("")

        var zmienna: Zmienna? = variablary[nazwa]

        if (zmienna != null)
            return zmienna

        if(classDerefStack.isNotEmpty()) {
            val claz = findClass(classDerefStack.peek().type.name)
            zmienna = findStackVector(claz.heap,claz.name+"."+nazwa).second
        }

        if (zmienna != null)
            return zmienna


        do {

            val pattern = "$gdzieJesteśmy.$nazwa"

            //println("Dla findVarInVariablaryWithDescoping - zmienna:$nazwa, pATTERN = $pattern")


            zmienna = variablary[pattern]

            // aby znaleźć zmienną w scope pliku
            if (zmienna == null && gdzieJesteśmy == basePackage) {
                //val ind = "$gdzieJesteśmy.$fileScopeSuffix.$nazwa"
                val ind = "$gdzieJesteśmy.$nazwa"
                zmienna = variablary[ind]
            }


            if (zmienna == null) {
                val ostKropka = gdzieJesteśmy.lastIndexOf(".")

                if (ostKropka == -1) {
                    throw Exception("Undefined variable: $nazwa")
                }
                gdzieJesteśmy = gdzieJesteśmy.substring(0, ostKropka)
            }

        } while (zmienna == null)

        gdzieJesteśmy = nameStitcher("")

        if (currentFunction != null && zmienna.name.startsWith(gdzieJesteśmy)) {
            zmienna.fieldType = FieldType.LOCAL
        }

        return zmienna
    }

//    fun varToAsmAutoDeref(register: Zmienna): String =
//        ""+(if(register.type.isPointer) "&" else "") + varToAsmNoType(register) + "[${register.type.typeForAsm}]"

    fun varToAsm(register: Zmienna, derefType: RegOper = RegOper.VALUE): String {
        val finalDeref =
            if (derefType == RegOper.STAR && register.type.isPointer)
                RegOper.VALUE
            else if (derefType == RegOper.AMPRESAND && !register.type.isPointer)
                RegOper.VALUE
            else
                derefType

        return when (finalDeref) {
            RegOper.AMPRESAND -> "&"
            RegOper.VALUE -> ""
            RegOper.STAR -> "*"
        } + varToAsmNoType(register) + "[${register.type.typeForAsm}]"
    }

    fun varToAsmNoType(zmienna: Zmienna): String {

        return when {
            zmienna.fieldType != FieldType.DUMMY && zmienna.fieldType != FieldType.STATIC -> {
                val stos = when (zmienna.fieldType) {
                    FieldType.OP_STACK -> operStack
                    FieldType.LOCAL -> callStack
                    FieldType.ARGUMENT -> callStack
                    FieldType.CLASS -> zmienna.inClass!!.heap //currentClass!!.heap // TODO - czasem musimy znaleźć to w klasie derefe, nie current!
                    else -> throw Exception("Unknown field type: ${zmienna.fieldType}!")
                }
                "${stos.stackName}(${findStackVector(stos, zmienna.name).first})<${zmienna.name}>"
            }
            zmienna.type.name == "string" -> labelMaker("stringConst", strings.indexOf(zmienna.stringValue))
            zmienna.type.name == "float" -> {
                val znal = floats.indexOf(zmienna.floatValue)
                println("sd")
                labelMaker("floatConst", floats.indexOf(zmienna.floatValue))
            }

            zmienna.allocation == AllocType.FIXED -> "${zmienna.locationVal ?: zmienna.locationTxt}"
            zmienna.allocation == AllocType.LITERAL -> "#${zmienna.immediateValue}"
            else -> "${zmienna.labelName}<${zmienna.name}>"
        }
    }


    /*****************************************************************
    Stos
     *****************************************************************/

    fun dumpStack(stos: SpecStack) {
        if (stackDumpOn) {
            var wynik = "========\n"


            if (stos.size > 0) {

                val stackPointer = 255 - findStackVector(stos, stos.firstElement().name).first

                stos.toList().reversed().forEach {
                    wynik += "${stackPointer + findStackVector(
                        stos,
                        it.name
                    ).first}[${it.type.typeForAsm}] (${it.name}) ${it.comment}\n"
                }
            }
            wynik += "========\n\n"

            code(wynik)
        }
    }

    fun findStackVector(stos: SpecStack, name: String): Pair<Int, Zmienna> {
        var vector = 0

        val found: Zmienna

        var i = stos.size - 1

        //var test = name.endsWith(".${stos[i].name}") || stos[i].name == name

        try {
            while (stos[i].name != name && !(name.endsWith(".${stos[i].name}"))) {
                //test = name.endsWith(".${stos[i].name}") || stos[i].name == name
                vector += stos[i].type.sizeOnStack
                i--
            }
        } catch (ex: ArrayIndexOutOfBoundsException) {
            throw(VariableNotFound("Variable $name not found on stack ${stos.stackName}"))
        }

        found = stos[i]

        return Pair(vector, found)
    }

    fun getStackSize(stos: MutableList<Zmienna>): Int {
        return stos.sumBy { it.type.sizeOnStack }
    }

    /*****************************************************************
    Związane z FUNKCJAMI
     *****************************************************************/
    fun functionToLambdaType(funkcja: Funkcja): Typ {
        return Typ.byName(funkcja
            .arguments.joinToString(",", "(", ")") { findQualifiedType(it.type.toString()) } +
                "->" + findQualifiedType(funkcja.type.toString()), this)
    }

    fun lambdaTypeToFunction(zmienna: Zmienna): Funkcja {
        val funkcja = Funkcja(fullName = zmienna.name)

        val zwrotkaIArgsy = zmienna.type.name.split("->")

        val args = zwrotkaIArgsy[0].drop(1).dropLast(1).split(",")
        val retVal = zwrotkaIArgsy[1]

        val retZmienna =
            Zmienna(
                funkcja.returnName,
                true,
                null,
                AllocType.NORMAL,
                fieldType = FieldType.LOCAL,
                typexxx = Typ.byName(retVal, this)
            )

        toVariablary(retZmienna)

        funkcja.type = retZmienna.type.copy()

            args.forEachIndexed { index, argType ->
            val lambdaArg =
                Zmienna(
                    "lambdaArg$index",
                    true,
                    null,
                    AllocType.NORMAL,
                    fieldType = FieldType.LOCAL,
                    typexxx = Typ.byName(argType, this)
                )

            toVariablary(lambdaArg)

            funkcja.addField(lambdaArg)
        }

        return funkcja
    }

    fun fnCallAllocRetAndArgs(funkcja: Funkcja) {

        if (pass == Pass.SYMBOLS) return

        var zliczacz = 0

        if (!funkcja.type.isUnit) {
            callStack.add(
                Zmienna(
                    name = funkcja.returnName,
                    immutable = false,
                    allocation = AllocType.NORMAL,
                    fieldType = FieldType.LOCAL,
                    typexxx = funkcja.type
                )
            )
            zliczacz += funkcja.type.sizeOnStack
        }

        funkcja.fields.forEach { zmienna ->
            if (zmienna.allocation != AllocType.FIXED) {
                callStack.add(zmienna)
                zliczacz += zmienna.type.sizeOnStack
            }
        }

        code("alloc SPF, #$zliczacz")

    }

    fun fnCallReleaseArgs(funkcja: Funkcja) {
        if (pass == Pass.SYMBOLS) return

        funkcja.fields.forEach {
            if (it.allocation != AllocType.FIXED) {
                callStack.pop()
            }
        }
    }

    fun fnCallReleaseRet(funkcja: Funkcja) {
        if (pass == Pass.SYMBOLS) return

        if (!funkcja.type.isUnit) {
            rem("***** fnCallReleaseRet usuwanie zwrotki ${funkcja.fullName} ze stosu")
            callStack.pop()
        }
    }

    fun fnDeclAllocStackAndRet(funkcja: Funkcja) {
        if (pass == Pass.SYMBOLS) return

        if (!funkcja.type.isUnit) {
            callStack.add(
                Zmienna(
                    name = funkcja.returnName,
                    immutable = false,
                    allocation = AllocType.NORMAL,
                    fieldType = FieldType.LOCAL,
                    typexxx = funkcja.type
                )
            )
        }

        funkcja.fields.forEach { zmienna ->
            if (zmienna.allocation != AllocType.FIXED) {
                callStack.add(zmienna)
            }
        }
    }

    fun fnDeclFreeStackAndRet(funkcja: Funkcja) {
        if (pass == Pass.SYMBOLS) return

        var suma = 0

        funkcja.fields.forEach {
            if (it.allocation != AllocType.FIXED) {
                val zmienna = callStack.pop()
                suma += zmienna.type.sizeOnStack
            }
        }

        if (suma > 0)
            code("free SPF<${funkcja.fullName}.__fnargs>, #$suma // free fn arguments and locals for ${funkcja.fullName}")

        if (!funkcja.type.isUnit) {
            rem("***** fnDeclFreeStackAndRet usuwanie zwrotki ${funkcja.fullName} ze stosu")
            callStack.pop()
        }

        code("// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!")
    }

    fun findProc(nazwa: String): Funkcja {
        var funkcja: Funkcja? = functiary[nazwa]

        if(funkcja != null)
            return funkcja

        if(classDerefStack.isNotEmpty())
            funkcja = functiary["${classDerefStack.peek()!!.type.name}.$nazwa"]

        if(funkcja != null)
            return funkcja

        var gdzieJesteśmy = nameStitcher("")

        do {
            val pattern = "$gdzieJesteśmy.$nazwa"

            val key = functiary.keys.firstOrNull { it == pattern }
            funkcja = functiary[key]

            val ostKropka = gdzieJesteśmy.lastIndexOf(".")
            try {
                gdzieJesteśmy = gdzieJesteśmy.substring(0, ostKropka)
            } catch (ex: StringIndexOutOfBoundsException) {
                throw FunctionNotFound("Couldn't find procedure $nazwa")
            }
        } while (funkcja == null)

        return funkcja
    }

    fun functionLocals(function: Funkcja): List<Zmienna> =
        variablary.filter { it.key.startsWith(function.fullName) && it.value.fieldType != FieldType.CLASS }.map { it.value }

    /*****************************************************************
    Związane z REJESTRAMI
     *****************************************************************/
    val currentReg get() = operStack.peek()

    fun regFromTop(ile: Int): Zmienna = operStack.asReversed()[ile]

    fun allocReg(comment: String = "", typex: Typ = Typ.unit): Zmienna {
        val name = "__wolin_reg$stackVarCounter"

//        if(stackVarCounter == 12) {
//            println("tu!")
//        }

        val type = typex.copy()

        if (variablary[name] != null) {
            //rem("Using already known ${variablary[name]}")
        }
        else
            rem("$name not yet in variablary")

        val rejestr = variablary[name] ?: Zmienna(
            name,
            allocation = AllocType.NORMAL,
            fieldType = FieldType.OP_STACK
        )

        if (pass == Pass.SYMBOLS)
            rejestr.type = Typ.unit
        else if (!type.isUnit && rejestr.type.isUnit)
            rejestr.type = type

        rejestr.comment = comment
        operStack.push(rejestr)

        toVariablary(rejestr)

        if (!rejestr.type.isUnit && pass == Pass.TRANSLATION) {
            var linia = "alloc SP<${rejestr.name}>, #${rejestr.type.sizeOnStack}"
            if (comment.isNotBlank()) linia += " // $comment"
            code(linia)
        }

        stackVarCounter++
        dumpStack(operStack)
        return rejestr
    }

    fun freeReg(comment: String = "") {
        val zmienna = operStack.peek()

        if (!zmienna.type.isUnit && pass == Pass.TRANSLATION) {
            var linia = "free SP<${zmienna.name}>, #${zmienna.type.sizeOnStack}"
            if (comment.isNotBlank()) linia += " // $comment"
            code(linia)
        }

        operStack.pop()

        dumpStack(operStack)
    }

    fun currentRegToAsm(deref: RegOper = RegOper.VALUE): String = varToAsm(currentReg, deref)

    fun parseNumberGuessType(reg: Zmienna, text: String, radix: Int): Zmienna {
        val wynik = java.lang.Long.parseLong(text, radix)
        reg.intValue = wynik

        if (reg.type.isUnit) {
            when (wynik) {
                in 0..255 -> reg.type = Typ.byName("ubyte", this)
                in 0..65535 -> reg.type = Typ.byName("uword", this)
                in -127..128 -> reg.type = Typ.byName("byte", this)
                in -32768..32767 -> reg.type = Typ.byName("word", this)

                else -> throw Exception("Value out of range: $wynik")
            }
        }

        //state.switchType(reg.type, "guess number type")

        return reg
    }

    fun parseLiteralConstant(reg: Zmienna, const: KotlinParser.LiteralConstantContext) {
        if (const.BinLiteral() != null) {

        } else if (const.BooleanLiteral() != null) {
            reg.type = Typ.bool
            if (const.text.toLowerCase() == "true") reg.intValue = 1 else reg.intValue = 0
        } else if (const.CharacterLiteral() != null) {
            reg.type = Typ.ubyte
            reg.intValue = const.text.first().toLong()
        } else if (const.HexLiteral() != null) {
            parseNumberGuessType(reg, const.text.drop(2), 16)
        } else if (const.IntegerLiteral() != null) {
            parseNumberGuessType(reg, const.text, 10)
        } else if (const.LongLiteral() != null) {
            parseNumberGuessType(reg, const.text, 10)
        } else if (const.NullLiteral() != null) {
            reg.intValue = 0L
            reg.type = Typ.byName("any?", this)
        } else if (const.RealLiteral() != null) {
            reg.type = Typ.float
            reg.floatValue = 3.14f
            floats.add(3.14f)
        } else if (const.stringLiteral() != null) {
            reg.type = Typ.byName("string", this)
            reg.stringValue = const.text
            strings.add(const.text)
        } else {
            throw UnknownLiteral("Unknown literal")
        }

        switchType(reg.type, "parse literal constant")
        //state.switchType(reg.type, "parse literal constant")
    }


    /*****************************************************************
    Bieżący typ
     *****************************************************************/

    fun forceTopOregType(wolinType: Typ) {
        val top = operStack.peek()

        top.type = wolinType.copy()
        rem("FORCE TOP: $top -> $wolinType")
    }

//    fun inferTopOregType() {
//        val top = operStack.peek()
//
//        top.type = currentWolinType
//        rem("INFER TOP: $top -> $currentWolinType")
//    }

    fun inferTopOperType() {
        if(pass == Pass.SYMBOLS)
            return

        val top = operStack.peek()

        if (top.type == currentWolinType) {
            rem("top type already set: $top")
        } else if (top.type.isUnit) {
            top.type = currentWolinType.copy()
            rem("infer top: $top -> $currentWolinType")
        } else if (!top.type.canBeAssigned(currentWolinType))
            throw RegTypeMismatchException("Attempt to reassign $currentWolinType to $top")
    }

    fun switchType(newType: Typ, reason: String, pointerize: Boolean = false) {
        currentWolinType = newType.copy()
        currentWolinType.pointer = pointerize
        code("// switchType to:$newType by $reason")
    }


    /*****************************************************************
    Związane z typami
     *****************************************************************/

    fun findQualifiedType(typeName: String): String {
        val fromClasses =
            classary.values.firstOrNull {
                it.name == typeName
            } ?: classary.values.firstOrNull {
                it.name.endsWith(".$typeName")
            }

        return when {
            primitives.contains(typeName) -> typeName
            typeName.contains("->") -> typeName
            fromClasses != null -> fromClasses.name
            else -> throw Exception("Can't find type $typeName")
        }
    }

    fun canBeAssigned(doJakiej: Typ, co: Typ): Boolean {

        val typyZgodne = doJakiej.name == co.name ||
                if (co.isClass) {
                    val doTegoKlasa = classary[doJakiej.name] ?: throw Exception("Unknown class $doJakiej (=$co)")
                    val tenKlasa = classary[co.name] ?: throw Exception("Unknown class $co ($doJakiej=)")

                    doJakiej.name == co.name || doTegoKlasa.hasChild(tenKlasa.name)
                } else
                    false

        return when {
            // typy identyczne?
            typyZgodne -> {
                // pointer do zmiennej lub zmienna do pointera
                if (co.isPointer || doJakiej.isPointer)
                    true
                // docelowa nullowalna? No to ok!
                else if (doJakiej.nulable)
                    true
                // docelowa nienullowalna, no to musimy sprawdzić
                else !doJakiej.nulable
            }
            else -> false
        }
    }

    fun nameStitcher(name: String, isArgument: Boolean = false): String {
        return nameStitcher(name, currentFunction?.fullName, isArgument)
    }

    fun nameStitcher(name: String, functionName: String?, isArgument: Boolean = false): String {
        var pack =
            when {
                functionName != null -> "$functionName."
                currentClass != null -> "${currentClass!!.name}."
                else -> "$basePackage." //+ if (fileScopeSuffix.isNotBlank()) "$fileScopeSuffix." else ""
            }

        if (!isArgument)
            pack += currentScopeSuffix

        pack += name

        return pack
    }

    fun getFunctionCallCode(nazwa: String): String {
        val (proc, lambda) = try {
            Pair(findProc(nazwa), false)
        } catch (ex: FunctionNotFound) {
            Pair(lambdaTypeToFunction(findVarInVariablaryWithDescoping(nazwa)), true)
        }

        val call = when {
            proc.location != 0 -> "call ${proc.location}[adr] // ${proc.fullName}\n"
            lambda -> "call ${proc.labelName}[deref] // lambda call\n"
            else -> "call ${proc.labelName}[adr]\n"
        }

        switchType(proc.type, "function call", false)

        return call
    }


    /*****************************************************************
    Związane z runtime
     *****************************************************************/

    fun appendStatics() {

        code(
            "\n\n" + """// ****************************************
            |// STATIC SPACE
            |// ****************************************
        """.trimMargin()
        )

        code("label __wolin_indirect_jsr")
        code("goto 65535[adr]")

        variablary.filter { it.value.fieldType == FieldType.STATIC }.forEach {
            code("label ${it.value.labelName}")
            code("alloc ${it.value.immediateValue}[${it.value.type.typeForAsm}]  // ${it.value.name}")
        }

        strings.forEachIndexed { i, str ->
            code("string ${labelMaker("stringConst", i)}[uword] = /$$str")
        }

        floats.forEachIndexed { i, float ->
            code("float ${labelMaker("floatConst", i)}[uword] = %$float")
        }
    }



}

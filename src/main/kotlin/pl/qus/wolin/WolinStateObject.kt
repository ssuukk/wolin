package pl.qus.wolin

import pl.qus.wolin.components.*
import pl.qus.wolin.exception.FunctionNotFound
import pl.qus.wolin.exception.RegTypeMismatchException
import pl.qus.wolin.exception.VariableNotFound
import java.lang.Exception
import java.util.*

class SpecStack(val stackName: String) : Stack<Zmienna>()

class WolinStateObject(val pass: Pass) {
    private var tekstProgramu: String = ""

    val stackDumpOn = false
    var codeOn = true
    var commentOn = true

    var variablary = hashMapOf<String, Zmienna>()
    var functiary = mutableListOf<Funkcja>()
    var classary = hashMapOf<String, Klasa>()

    val operStack = SpecStack("SP")
    val callStack = SpecStack("SPF")

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

    val spfUsed get() = variablary.any { it.value.fieldType == FieldType.FUNCTION }

    // potencjalnie wymagające stosu

    val assignStack = AssignStack()

    var arrayElementSize: Int = 0

    var simpleWhen = true
    var lastWhenEntry = false
    var whenBranchResult : Zmienna? = null

    init {
        if(classary.isEmpty()) {
            classary["Any"] = AnyKlasa()
        }
    }

    /*****************************************************************
    Generalny kod
     *****************************************************************/

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
        argument: Boolean = false,
        stack: FieldType
    ): Zmienna {
        if (typeContext == null) {
            return Zmienna(
                name = nameStitcher(name),
                allocation = AllocType.NORMAL,
                fieldType = stack,
                type = Typ.unit
            )
        }

        val array = typeContext.typeReference()?.arrayDeclaration()

        val shortIndex = typeContext.typeReference()?.arrayDeclaration()?.userType()?.text == "ubyte"

        val loc = typeContext.typeReference()?.locationReference()?.text
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

        val nullableTypeLoc = typeContext.nullableType()?.typeReference()?.locationReference()?.text

        val parenthsized = typeContext.nullableType()?.parenthesizedType()

        if (parenthsized != null)
            throw Exception("Don't know how to process partenthsized type!")

        val mods = propertyCtx?.modifierList()

        val typ = when {
            loc != null || nullableTypeLoc != null -> AllocType.FIXED
            mods?.modifier()?.filter { it.text == "const" }?.size ?: 0 != 0 -> AllocType.LITERAL
            else -> AllocType.NORMAL
        }

        val zmienna = Zmienna("", allocation = typ, fieldType = stack)

        zmienna.immutable = propertyCtx?.VAL() != null || argument == true
        zmienna.location = loc ?: nullableTypeLoc
        zmienna.name = nameStitcher(name, argument)
        zmienna.type = type

        var pomiń = 0
        if (basePackage.isNotEmpty()) pomiń = basePackage.length + 1
        //if (fileScopeSuffix.isNotEmpty()) pomiń += fileScopeSuffix.length + 1

        val bezSkopuPliku = if (zmienna.name.startsWith(basePackage)) zmienna.name.drop(pomiń) else zmienna.name

        if (!zmienna.immutable && zmienna.allocation == AllocType.LITERAL)
            throw Exception("var can't be const!")

        if (propertyCtx?.expression() != null && zmienna.allocation == AllocType.LITERAL) {
            throw Exception("przeliczyć wartość const:${propertyCtx.expression().text} dla ${zmienna.name}")
        }

        if (!bezSkopuPliku.contains(".") && zmienna.allocation != AllocType.FIXED)
            zmienna.fieldType = FieldType.STATIC

        return zmienna
    }

    fun createAndRegisterVar(
        name: String,
        typeContext: KotlinParser.TypeContext?,
        propertyCtx: KotlinParser.PropertyDeclarationContext?,
        argument: Boolean = false,
        fieldType: FieldType
    ): Zmienna {
        val zmienna = createVar(name, typeContext, propertyCtx, argument, fieldType)

        toVariablary(zmienna)

        if (zmienna.fieldType == FieldType.CLASS) {
            currentClass!!.toHeapAndVariablary(zmienna)
        }

        return zmienna
    }

    fun createAndRegisterVar(
        name: String,
        alloc: AllocType,
        typ: Typ,
        argument: Boolean,
        fieldType: FieldType
    ): Zmienna {
        val zmienna = Zmienna("", allocation = alloc, fieldType = fieldType, type = typ)

        zmienna.immutable = argument == true
        zmienna.name = nameStitcher(name, argument)

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
        }

        return zmienna
    }

    //    fun addString(str: String) {
//        strings.add(str)
//        stringCount++
//    }

    fun toVariablary(zmienna: Zmienna) {
        if(zmienna.name == "pl.qus.wolin.allocMem.returnValue") {
            println("tutaj!")
        }
        if (!variablary.containsKey(zmienna.name))
            variablary[zmienna.name] = zmienna
    }


    fun toClassary(klasa: Klasa) {
        if (!classary.containsKey(klasa.name))
            classary[klasa.name] = klasa
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

    fun findVarInVariablaryWithDescoping(nazwa: String): Zmienna {
        var gdzieJesteśmy = nameStitcher("")

        var zmienna: Zmienna? = variablary[nazwa]

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

        if(currentFunction != null && zmienna.name.startsWith(gdzieJesteśmy)) {
            zmienna.fieldType = FieldType.FUNCTION
        }

        return zmienna
    }

    fun varToAsm(zmienna: Zmienna): String = varToAsmNoType(zmienna) + zmienna.typeForAsm

    fun varToAsmNoType(zmienna: Zmienna): String {

        return when {
            zmienna.fieldType != FieldType.DUMMY && zmienna.fieldType != FieldType.STATIC -> {
                val stos = when (zmienna.fieldType) {
                    FieldType.OP_STACK -> operStack
                    FieldType.FUNCTION -> callStack
                    FieldType.CLASS -> currentClass!!.heap
                    else -> throw Exception("Variable is on unknown stack ${zmienna.fieldType}!")
                }
                "${stos.stackName}(${findStackVector(stos, zmienna.name).first})<${zmienna.name}>"
            }
            zmienna.type.type == "string" -> labelMaker("stringConst", strings.indexOf(zmienna.stringValue))
            zmienna.type.type == "float" -> {
                val znal = floats.indexOf(zmienna.floatValue)
                println("sd")
                labelMaker("floatConst", floats.indexOf(zmienna.floatValue))
            }
            zmienna.allocation == AllocType.FIXED -> "${zmienna.location}"
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
                    ).first}${it.typeForAsm} (${it.name}) ${it.comment}\n"
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

        val zwrotkaIArgsy = zmienna.type.type.split("->")

        val args = zwrotkaIArgsy[0].drop(1).dropLast(1).split(",")
        val retVal = zwrotkaIArgsy[1]

        val retZmienna =
            Zmienna(
                "returnValue",
                true,
                null,
                AllocType.NORMAL,
                fieldType = FieldType.FUNCTION,
                type = Typ.byName(retVal, this)
            )

        toVariablary(retZmienna)

        funkcja.type = retZmienna.type

        funkcja.arguments = args.mapIndexed { index, argType ->
            val lambdaArg =
                Zmienna(
                    "lambdaArg$index",
                    true,
                    null,
                    AllocType.NORMAL,
                    fieldType = FieldType.FUNCTION,
                    type = Typ.byName(argType, this)
                )

            toVariablary(lambdaArg)

            lambdaArg
        }.toMutableList()

        return funkcja
    }

    fun fnCallAllocRetAndArgs(funkcja: Funkcja) {

        if(pass == Pass.SYMBOLS) return

        var zliczacz = 0

        if (!funkcja.type.isUnit) {
            callStack.add(
                Zmienna(
                    name = "returnValue",
                    immutable = false,
                    allocation = AllocType.NORMAL,
                    fieldType = FieldType.FUNCTION,
                    type = funkcja.type
                )
            )
            zliczacz += funkcja.type.sizeOnStack
        }

//        funkcja.arguments.forEach { zmienna ->
//            if (zmienna.allocation != AllocType.FIXED) {
//                callStack.add(zmienna)
//                zliczacz += zmienna.type.sizeOnStack
//            }
//        }

        //if(pass == Pass.TRANSLATION) {
            functionLocals(funkcja).forEach { zmienna ->
                if (zmienna.allocation != AllocType.FIXED) {
                    callStack.add(zmienna)
                    zliczacz += zmienna.type.sizeOnStack
                }
            }
        //}

        code("alloc SPF, #$zliczacz")

    }

    fun fnCallReleaseArgs(funkcja: Funkcja) {
        if(pass == Pass.SYMBOLS) return

        //if(pass == Pass.TRANSLATION) {
            functionLocals(funkcja).forEach {
                if (it.allocation != AllocType.FIXED) {
                    callStack.pop()
                }
            }
        //}

//        funkcja.arguments.forEach {
//            if (it.allocation != AllocType.FIXED) {
//                callStack.pop()
//            }
//        }
    }

    fun fnCallReleaseRet(funkcja: Funkcja) {
        if(pass == Pass.SYMBOLS) return

        if (!funkcja.type.isUnit)
            callStack.pop()
    }

    fun fnDeclAllocStackAndRet(funkcja: Funkcja) {
        if(pass == Pass.SYMBOLS) return

        if (!funkcja.type.isUnit) {
            callStack.add(
                Zmienna(
                    name = "returnValue",
                    immutable = false,
                    allocation = AllocType.NORMAL,
                    fieldType = FieldType.FUNCTION,
                    type = funkcja.type
                )
            )
        }

//        // zalatwiane przez functionLocals
//        funkcja.arguments.forEach { zmienna ->
//            if (zmienna.allocation != AllocType.FIXED) {
//                callStack.add(zmienna)
//            }
//        }

        //if(pass == Pass.TRANSLATION) {
            functionLocals(funkcja).forEach { zmienna ->
                if (zmienna.allocation != AllocType.FIXED) {
                    callStack.add(zmienna)
                }
            }
        //}
    }

    fun fnDeclFreeStackAndRet(funkcja: Funkcja) {
        if(pass == Pass.SYMBOLS) return

        var suma = 0

        //if(pass == Pass.TRANSLATION) {
            functionLocals(funkcja).forEach {
                if (it.allocation != AllocType.FIXED) {
                    val zmienna = callStack.pop()
                    suma += zmienna.type.sizeOnStack
                }
            }
        //}

//        funkcja.arguments.forEach {
//            if (it.allocation != AllocType.FIXED) {
//                val zmienna = callStack.pop()
//                suma += zmienna.type.sizeOnStack
//            }
//        }

        if (suma > 0)
            code("free SPF, #$suma // free fn arguments and locals for ${funkcja.fullName}")

        if (!funkcja.type.isUnit)
            callStack.pop()

        code("// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!")
    }

    fun findProc(nazwa: String): Funkcja {
        var gdzieJesteśmy = nameStitcher("")

        var funkcja: Funkcja?

        do {
            val pattern = "$gdzieJesteśmy.$nazwa"

            funkcja = functiary.firstOrNull { it.fullName == pattern }

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

    fun allocReg(comment: String = "", type: Typ = Typ.unit): Zmienna {
        val name = "__wolin_reg$stackVarCounter"

//        if(stackVarCounter == 10) {
//            println("tu!")
//        }

        if(variablary[name] != null)
            rem("Using already known $name")
        else
            rem("$name not yet in variablary")

        val rejestr = variablary[name] ?: Zmienna(
            name,
            allocation = AllocType.NORMAL,
            fieldType = FieldType.OP_STACK
        )

        if (!type.isUnit && rejestr.type.isUnit)
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

    fun currentRegToAsm(): String = varToAsm(currentReg)


    /*****************************************************************
    Bieżący typ
     *****************************************************************/

    fun forceTopOregType(wolinType: Typ) {
        val top = operStack.peek()

        top.type = wolinType
        rem("FORCE TOP: $top -> $wolinType")
    }

//    fun inferTopOregType() {
//        val top = operStack.peek()
//
//        top.type = currentWolinType
//        rem("INFER TOP: $top -> $currentWolinType")
//    }

    fun inferTopOperType() {
        val top = operStack.peek()

        if(top.type == currentWolinType) {
            rem("SAFE INFER TOP: $top -> no change")
        } else if (top.type.isUnit) {
            top.type = currentWolinType
            rem("SAFE INFER TOP: $top -> $currentWolinType")
        }
        else if (!top.type.canBeAssigned(currentWolinType))
            throw RegTypeMismatchException("Attempt to reassign $currentWolinType to $top")
    }

    fun switchType(newType: Typ, reason: String) {
        currentWolinType = newType
        code("// switchType to:$newType by $reason")
    }


    /*****************************************************************
    Związane z typami
     *****************************************************************/

    fun findQualifiedType(typeName: String): String {
        val fromClasses =
            classary.values.firstOrNull {
                it.name == typeName
            } ?:
            classary.values.firstOrNull {
            it.name.endsWith(".$typeName")
        }

        return when {
            typeName == "byte" -> "byte"
            typeName == "ubyte" -> "ubyte"
            typeName == "word" -> "word"
            typeName == "uword" -> "uword"
            typeName == "bool" -> "bool"
            typeName == "float" -> "float"
            typeName.contains("->") -> typeName
            fromClasses != null -> fromClasses.name
            else -> throw Exception("Can't find type $typeName")
        }
    }

    fun canBeAssigned(doJakiej: Typ, co: Typ): Boolean {

        val typyZgodne = doJakiej.type == co.type ||
                if (co.isClass) {
                    val doTegoKlasa = classary[doJakiej.type] ?: throw Exception("Unknown class $doJakiej (=$co)")
                    val tenKlasa = classary[co.type] ?: throw Exception("Unknown class $co ($doJakiej=)")

                    doJakiej.type == co.type || doTegoKlasa.hasChild(tenKlasa.name)
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

    fun nameStitcher(name: String, argument: Boolean = false): String {
        return nameStitcher(name, currentFunction?.fullName, argument)
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
            lambda -> "call ${proc.labelName}[ptr] // lambda call\n"
            else -> "call ${proc.labelName}[adr]\n"
        }

        switchType(proc.type, "function call")

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
            code("alloc ${it.value.immediateValue}${it.value.typeForAsm}  // ${it.value.name}")
        }

        strings.forEachIndexed { i, str ->
            code("string ${labelMaker("stringConst", i)}[uword] = /$$str")
        }

        floats.forEachIndexed { i, float ->
            code("float ${labelMaker("floatConst", i)}[uword] = %$float")
        }
    }
}

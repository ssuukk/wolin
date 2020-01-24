package pl.qus.wolin

import pl.qus.wolin.exception.NoRuleException
import java.lang.Exception

class RuleMatcherVisitor : PseudoAsmParserBaseVisitor<PseudoAsmStateObject>() {
    var counter: Int = 0

    val state = PseudoAsmStateObject()

    override fun visitPseudoAsmFile(ctx: PseudoAsmParser.PseudoAsmFileContext): PseudoAsmStateObject {

        state.matched = null

        ctx.linia()?.iterator()?.let { linie ->
            while (linie.hasNext()) {
                val template = linie.next()

                matched(template, state.assemblerLine!!)

                if (state.matched != null) {
                    processParams(state.matched!!, state.assemblerLine!!)
                    break
                }
            }

            if (state.matched == null) throw NoRuleException("Couldn't match line: ${state.assemblerLine?.text}")
            else {
//                println("Line ${state.assemblerLine!!.text}")
//                println("Matched by: ${state.matched!!.text}")
            }
        }

        return state
    }

    fun matched(template: PseudoAsmParser.LiniaContext, data: PseudoAsmParser.LiniaContext) {
/*
let SP(?a)[uword] = SP(?b)[uword]
 lda {a},x
 sta {b},x
 lda {a}+1,x
 sta {b}+1,x
 */

        state.pary.clear()

        if (template.instrukcja().text == data.instrukcja().text) {
            state.matched = template
        }

        if (template.target(0) != null && data.target(0) != null) {
            val targetMatch = operandsMatch(template.target(0)?.operand(), data.target(0)?.operand())

            if (targetMatch.first && state.matched != null) {
                state.matched = template
                state.pary.addAll(targetMatch.second)
            } else
                state.matched = null
        } else if (template.target(0) == null && data.target(0) == null && state.matched != null) {
            state.matched = template
        } else
            state.matched = null

        if (template.arg(0) != null && data.arg(0) != null) {
            val arg1Match = operandsMatch(template.arg(0)?.operand(), data.arg(0)?.operand())

            if (arg1Match.first && state.matched != null) {
                state.matched = template
                state.pary.addAll(arg1Match.second)
            } else
                state.matched = null
        }

        if (template.arg(1) != null && data.arg(1) != null) {
            val arg2Match = operandsMatch(template.arg(1)?.operand(), data.arg(1)?.operand())

            if (arg2Match.first && state.matched != null) {
                state.matched = template
                state.pary.addAll(arg2Match.second)
            } else
                state.matched = null
        }
    }

    private fun testReferencers(
        r1: PseudoAsmParser.ReferencerContext?,
        r2: PseudoAsmParser.ReferencerContext?
    ): Boolean {

        val deref1 = r1?.DEREFERENCE()?.symbol?.text
        val deref2 = r2?.DEREFERENCE()?.symbol?.text

        val ref1 = r1?.REFERENCE()?.symbol?.text
        val ref2 = r2?.REFERENCE()?.symbol?.text

        return deref1 == deref2 && ref1 == ref2
    }

    private fun operandsMatch(
        templateOp: PseudoAsmParser.OperandContext?,
                                      dataOp: PseudoAsmParser.OperandContext?

    ): Pair<Boolean, MutableList<Pair<String, String?>>> {
        val pary = mutableListOf<Pair<String, String?>>()

        return if (templateOp != null && dataOp != null) {
            var match = true

//            if(templateOp.referencer().firstOrNull()?.text == "&") {
//                val a = templateOp.text
//                val b = dataOp.text
//
//                println("tu!")
//            }
//
//            println("${templateOp.referencer().firstOrNull()?.text} vs ${dataOp.referencer().firstOrNull()?.text}")

            match = match && testReferencers(templateOp.referencer().getOrNull(0), dataOp.referencer().getOrNull(0))

            match = match && testReferencers(templateOp.typeName(0)?.referencer()?.getOrNull(0), dataOp.typeName(0)?.referencer()?.getOrNull(0))

            // typ się zgadza?
            if (templateOp.typeName(0)?.jocker() == null)
                match = match && templateOp.typeName(0)?.text == dataOp.typeName(0)?.text
            else
                pary.add(Pair(templateOp.typeName(0)!!.jocker()!!.simpleIdentifier()!!.text, dataOp.typeName(0)?.text))

            // zgadza się wartość bezpośrednia?
            if (templateOp.value()?.immediate()?.jocker() == null)
                match =
                    match && templateOp.value()?.immediate()?.IntegerLiteral()?.text == dataOp.value()?.immediate()?.IntegerLiteral()?.text
            else {
                val integer = dataOp.value()?.immediate()?.IntegerLiteral()?.text
                val label = dataOp.value()?.immediate()?.identifier()?.text

                pary.add(
                    Pair(
                        templateOp.value()!!.immediate()!!.jocker()!!.simpleIdentifier()!!.text,
                        if(integer.isNullOrBlank()) label else integer
                    )
                )
            }

            // zgadza się lokacja lub nazwa?
            if (templateOp.value()?.addressed()?.jocker() == null) {
                match =
                    match && templateOp.value()?.addressed()?.absAddress()?.IntegerLiteral()?.text == dataOp.value()?.addressed()?.absAddress()?.IntegerLiteral()?.text

                match =
                    match && templateOp.value()?.addressed()?.identifier()?.text == dataOp.value()?.addressed()?.identifier()?.text

            } else {
                val value =
                    dataOp.value().addressed()?.absAddress()?.IntegerLiteral()?.text
                        ?: dataOp.value()?.addressed()?.identifier()?.text
                pary.add(
                    Pair(
                        templateOp.value()?.addressed()?.jocker()!!.simpleIdentifier()!!.text,
                        value
                    )
                )
            }

            // zgadza się wektor tablicy?
            if (templateOp.value()?.addressed()?.index(0)?.jocker() == null)
                match =
                    match && templateOp.value()?.addressed()?.index(0)?.text == dataOp.value()?.addressed()?.index(0)?.text
            else
                pary.add(
                    Pair(
                        templateOp.value()?.addressed()?.index(0)?.jocker()!!.simpleIdentifier()!!.text,
                        dataOp.value()?.addressed()?.index(0)?.text
                    )
                )

            Pair(match, pary)
        } else
            Pair(false, pary)
    }

    fun processParams(template: PseudoAsmParser.LiniaContext, data: PseudoAsmParser.LiniaContext): Boolean {
        //var mosAsm = template.assemblerBody(0)?.multiLineStringLiteral()?.multiLineStringContent(0)?.text!!
        var mosAsm =
            template.assemblerBody(0)?.multiLineStringLiteral()?.children?.drop(1)?.dropLast(1)?.map { it.text }?.joinToString(
                ""
            )!!
        state.pary
            .filter { it.second != null }
            .map { it as Pair<String, String> }
            .forEach {
                mosAsm = mosAsm.replace("{${it.first}}", it.second)
            }

        if (mosAsm.contains("{counter}")) {
            mosAsm = mosAsm.replace("{counter}", "$counter")
            counter++
        }

        state.code("; ${data.text}")
        state.code(mosAsm)
        state.code("")

        return false
    }

}
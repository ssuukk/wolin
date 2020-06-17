package pl.qus.wolin

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.tree.TerminalNodeImpl


fun extractStackTypeFromOperand(ctx: PseudoAsmParser.OperandContext): String? {
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

fun extractSPVectorFromOperand(ctx: PseudoAsmParser.OperandContext): Int {
    val wektor = ctx.value()?.addressed()?.index(0)?.text
    return Integer.parseInt(wektor)
}

fun copyTree(ctx: ParseTree): ParseTree {
    return when (ctx) {
        is ParserRuleContext -> {
            val nowa = ctx.javaClass.getDeclaredConstructor(ParserRuleContext::class.java, Int::class.java)
                .newInstance(ctx.parent, ctx.invokingState) // dodać argsy
            nowa.copyFrom(ctx)
            nowa.children = ctx.children?.map { copyTree(it) }?.toMutableList()

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

fun changeVectorInOperand(operand: PseudoAsmParser.OperandContext, vector: Int) {
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


fun replaceInArg(
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


fun replaceInTarget(
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

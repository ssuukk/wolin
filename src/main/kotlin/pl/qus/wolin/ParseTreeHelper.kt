package pl.qus.wolin

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNodeImpl

fun ParseTree.child(nr: Int): ParseTree? = try {
    if (this is ParserRuleContext) {
        this.children[nr]
    } else
        null
} catch (ex: Exception) {
    null
}

val ParseTree.iterable: Iterable<ParseTree>
    get() {
        return object : Iterable<ParseTree> {
            override fun iterator(): Iterator<ParseTree> {
                return when {
                    this@iterable is ParserRuleContext -> return object : Iterator<ParseTree> {
                        var dzieć = -1
                        override fun hasNext(): Boolean {
                            return dzieć < children.size - 1
                        }

                        override fun next(): ParseTree {
                            return this@iterable.children[++dzieć]
                        }

                    }
                    this@iterable is TerminalNodeImpl -> object : Iterator<ParseTree> {
                        override fun hasNext(): Boolean {
                            return false
                        }

                        override fun next(): ParseTree {
                            throw Exception("Terminal node!")
                        }
                    }
                    else -> throw Exception("Don't know how to iterate this!")
                }
            }
        }
    }

fun dump(pt: ParseTree, level: Int): String {
    return " ".repeat(level) + when (pt) {
        is ParserRuleContext -> pt.javaClass.simpleName + "\n" +
                pt.children?.joinToString("") {
                    dump(it, level + 1)
                }
        is TerminalNodeImpl -> "${pt.text}<<<--- TERMINAL\n"
        else -> "???\n"
    }
}

fun ParseTree.traverseFilter(lista: MutableList<ParseTree>, filter: (ParseTree) -> Boolean): MutableList<ParseTree> {
    if(filter(this))
        lista.add(this)

    when (this) {
        is ParserRuleContext -> {
            this.children.forEach {
                it.traverseFilter(lista, filter)
            }
        }
    }

    return lista
}
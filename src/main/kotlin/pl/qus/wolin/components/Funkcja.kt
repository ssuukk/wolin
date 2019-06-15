package pl.qus.wolin.components

import pl.qus.wolin.KotlinParser

class Funkcja(
    var fullName: String = "",
    var type: Typ = Typ.unit,

    var location: Int? = null,
    var arguments: MutableList<Zmienna> = mutableListOf(),
    var lambdaBody: KotlinParser.StatementsContext? = null // dla lambd
)
{
    val labelName: String get() = "__wolin_${fullName.replace(".","_")}"
    var locals: MutableList<Zmienna> = mutableListOf()

    override fun toString(): String {
        return "fun $fullName(${arguments.joinToString()}):${type.type}"
    }
}
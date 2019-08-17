package pl.qus.wolin.components

import pl.qus.wolin.KotlinParser

class Funkcja(
    var fullName: String = "",
    var type: Typ = Typ.unit,

    var location: Int = 0,
    var lambdaBody: KotlinParser.StatementsContext? = null // dla lambd
)
{

    val arguments: List<Zmienna>
        get() = fields.filter { it.fieldType == FieldType.ARGUMENT }
    val locals: List<Zmienna>
        get() = fields.filter { it.fieldType != FieldType.ARGUMENT }

    val labelName: String get() = "__wolin_${fullName.replace(".","_")}"
    var fields: MutableList<Zmienna> = mutableListOf()

    fun addField(nowa: Zmienna) {
        if(fields.none { it.name == nowa.name})
            fields.add(nowa)
    }

    override fun toString(): String = "fun $fullName(${arguments.joinToString()}):${type.name}"
}
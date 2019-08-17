package pl.qus.wolin.components

import pl.qus.wolin.KotlinParser

class Zmienna(
    var name: String = "",
    var immutable: Boolean = true,
    var location: String? = null,
    var allocation: AllocType,
    var comment: String = "",
    var fieldType: FieldType,
    var type: Typ = Typ.unit,
    var initExpression: KotlinParser.ExpressionContext? = null
)

{
    var intValue: Long = 0L
    var stringValue: String = ""
    var floatValue: Float = 0f
    var inClass: Klasa? = null

    override fun toString(): String {
        return "$name: $type = $immediateValue ($comment)"
    }

    val labelName: String get() = "__wolin_${name.replace(".","_")}"

    val typeForAsm: String
        get() = when {
            type.isPointer -> "[ptr]"
            type.array -> "[ptr]"
            type.isFunctional -> "[ptr]"
            type.name == "bool" -> "[bool]"
            type.name == "byte" -> "[byte]"
            type.name == "ubyte" -> "[ubyte]"
            type.name == "word" -> "[word]"
            type.name == "uword" -> "[uword]"
            type.name == "float" -> "[float]"
            else -> "[ptr]"
        }

    val immediateValue: String get() = when {
        type.name == "bool" -> if(intValue == 0L) "0" else "1"
        type.name == "byte" -> "$intValue"
        type.name == "ubyte" -> "$intValue"
        type.name == "word" -> "$intValue"
        type.name == "uword" -> "$intValue"
        type.name == "float" -> "$floatValue"
        type.isPointer -> "$intValue"
        type.isFunctional -> "$intValue"
        else -> "65535"
    }
}
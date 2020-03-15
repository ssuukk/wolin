package pl.qus.wolin.components

import pl.qus.wolin.KotlinParser

class Zmienna(
    var name: String = "",
    var immutable: Boolean = true,
    var locationTxt: String? = null,
    var allocation: AllocType,
    var comment: String = "",
    var fieldType: FieldType,
    private var typexxx: Typ = Typ.unit,
    var initExpression: KotlinParser.ExpressionContext? = null,
    var locationVal: Int? = null
)

{
    var intValue: Long = 0L
    var stringValue: String = ""
    var floatValue: Float = 0f
    var inClass: Klasa? = null

    var type: Typ
        get() {
            return typexxx
        }
        set(value) {
            typexxx = value
        }


    override fun toString(): String {
        return "$name: $type = $immediateValue /* $comment */"
    }

    val labelName: String get() = "__wolin_${name.replace(".","_")}"

    val location: String get() = "${locationVal ?: locationTxt}"

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
package pl.qus.wolin.components

class Zmienna(
    var name: String = "",
    var immutable: Boolean = true,
    var location: String? = null,
    var allocation: AllocType,
    var comment: String = "",
    var fileStatic: Boolean = false,
    var stack: String,
    var type: Typ = Typ.unit
)

{
    var intValue: Long = 0L
    var stringValue: String = ""
    var floatValue: Float = 0f

    override fun toString(): String {
        return "$name: $type = $immediateValue"
    }

    val labelName: String get() = "__wolin_${name.replace(".","_")}"

    val typeForAsm: String
        get() = when {
            type.isPointer -> "[ptr]"
            type.array -> "[ptr]"
            type.isFunctional -> "[ptr]"
            type.type == "bool" -> "[bool]"
            type.type == "byte" -> "[byte]"
            type.type == "ubyte" -> "[ubyte]"
            type.type == "word" -> "[word]"
            type.type == "uword" -> "[uword]"
            type.type == "float" -> "[float]"
            else -> "[ptr]"
        }

    val immediateValue: String get() = when {
        type.type == "bool" -> if(intValue == 0L) "0" else "1"
        type.type == "byte" -> "$intValue"
        type.type == "ubyte" -> "$intValue"
        type.type == "word" -> "$intValue"
        type.type == "uword" -> "$intValue"
        type.type == "float" -> "$floatValue"
        type.isPointer -> "$intValue"
        type.isFunctional -> "$intValue"
        else -> "65535"
    }
}
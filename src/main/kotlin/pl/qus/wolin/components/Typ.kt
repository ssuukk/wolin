package pl.qus.wolin.components

import pl.qus.wolin.WolinStateObject

class Typ(val type: String, val nulable: Boolean, var isPointer: Boolean = false) {

    var array: Boolean = false
    var shortIndex: Boolean = false

    companion object {
        val unit get() = Typ("unit", false)
        val bool get() = Typ("bool", false)
        val ubyte get() = Typ("ubyte", false)
        val uword get() = Typ("uword", false)

        fun byName(name: String, state: WolinStateObject): Typ {
            // TODO - musimy znaleźć dany typ w skołpie!!!

            val clearName =if (name.endsWith("?")) {
                name.dropLast(1)
            } else {
                name
            }

            val qualifiedName = state.findQualifiedType(clearName)
            return Typ(qualifiedName, name.endsWith("?"))
        }
    }

    val isUnit get() = type == "unit"

    val elementOccupiesOneByte: Boolean
        get() = if(array) {
            when(type) {
                "bool" -> true
                "ubyte" -> true
                "byte" -> true
                else -> false
            }
        } else throw Exception("elementOccupiesOneByte called on non-array!")

    val sizeOnStack: Int
        get() = when {
            array -> 2
            isPointer -> 2
            type == "unit" -> 0
            type == "bool" -> 1
            type == "byte" -> 1
            type == "ubyte" -> 1
            type == "float" -> 4 // http://6502.org/source/floats/wozfp1.txt
            type == "" -> throw Exception("Empty type!!!")
            else -> 2
        }

    override fun equals(other: Any?): Boolean = if (other is Typ) {
        other.type == this.type && other.nulable == this.nulable && other.isPointer == this.isPointer
    } else super.equals(other)

    override fun toString(): String = type + if (nulable) "?" else ""
}
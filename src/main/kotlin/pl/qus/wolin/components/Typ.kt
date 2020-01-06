package pl.qus.wolin.components

import pl.qus.wolin.WolinStateObject

data class Typ(
    val name: String,
    val nulable: Boolean,
    var pointer: Boolean = false,
    var array: Boolean = false,
    var shortIndex: Boolean = false

) {

    val isPointer: Boolean
        get() {
            return when {
                array -> true
                isFunctional -> true
                primitives.contains(name) -> pointer
                else -> true
            }
        }

    fun copy(): Typ {
        return Typ(
            name, nulable, pointer, array, shortIndex
        )
    }

    companion object {
        val unit get() = Typ("unit", false)
        val bool get() = Typ("bool", false)
        val ubyte get() = Typ("ubyte", false)
        val uword get() = Typ("uword", false)
        val float get() = Typ("float", false)

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

    val isUnit get() = name == "unit"

    val isClass get() = name.contains(".")

    val isFunctional get() = name.contains("->")

    val elementOccupiesOneByte: Boolean
        get() = if(array) {
            when(name) {
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
            name == "unit" -> 0
            name == "bool" -> 1
            name == "byte" -> 1
            name == "ubyte" -> 1
            name == "float" -> 4 // http://6502.org/source/floats/wozfp1.txt
            name == "" -> throw Exception("Empty type!!!")
            else -> 2
        }

    val arrayElementSize: Int
        get() = when (name) {
            "unit" -> 0
            "bool" -> 1
            "byte" -> 1
            "ubyte" -> 1
            "float" -> 4 // http://6502.org/source/floats/wozfp1.txt
            "" -> throw Exception("Empty type!!!")
            else -> 2
        }

    override fun equals(other: Any?): Boolean = if (other is Typ) {
        other.name == this.name && other.nulable == this.nulable && other.isPointer == this.isPointer
    } else super.equals(other)

    fun canBeAssigned(other: Any?): Boolean = if (other is Typ) {
        other.name == this.name && other.nulable == this.nulable
    } else super.equals(other)

    override fun toString(): String = name + if (nulable) "?" else "" + if (isPointer) "*" else ""

    val arrayElementType: Typ
        get() = Typ(name, nulable, isPointer)

    val typeForAsm: String
        get() =
            when {
                array -> "$name"
                isFunctional -> "any"
                isUnit -> "unit"
                primitives.contains(name) -> name
                else -> "any"
            } + if(isPointer) "*" else ""

}
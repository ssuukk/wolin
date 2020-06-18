package pl.qus.wolin.components

import pl.qus.wolin.KotlinParser
import pl.qus.wolin.WolinStateObject
import pl.qus.wolin.hex
import java.lang.Exception

class Funkcja(
    var fullName: String = "",
    var type: Typ = Typ.unit,

    var location: Int = 0,
    var lambdaBody: KotlinParser.StatementsContext? = null // dla lambd
) {

    var iscc65: Boolean = false
    var isExternal: Boolean = false
    //var startReg: Int = -1

    var fullReturnType: Zmienna? = null

    var returnAddress: Int = -1

    var isInterrupt: Boolean = false

    val returnName: String
        get() = "$fullName.__returnValue"

    val arguments: List<Zmienna>
        get() = fields.filter { it.fieldType == FieldType.ARGUMENT }
    val locals: List<Zmienna>
        get() = fields.filter { it.fieldType != FieldType.ARGUMENT }

    val labelName: String get() =
        when {
            isExternal -> fullName.split(".").last()
            iscc65 -> "_"+fullName.split(".").last()
            else -> "__wolin_${fullName.replace(".", "_")}"
        }
    var fields: MutableList<Zmienna> = mutableListOf()

    //val calledFunctions = mutableListOf<Funkcja>()

    fun addField(nowa: Zmienna) {
        if (fields.none { it.name == nowa.name })
            fields.add(nowa)
    }

    override fun toString(): String = "fun $fullName(${arguments.joinToString()}):${type.name}"

    fun releaseCalledFunction(state: WolinStateObject) {
        try {
            state.fnCallReleaseRet(this)
            if (this.type != Typ.unit)
                state.code("free SPF <${this.returnName}>, #${this.type.sizeOnStack} // free return value of ${this.fullName} from call stack")
        } catch (ex: Exception) {
            val a = state.currentFunction?.fullName
            println("Release called function Błąd$$$$ $a")
        }

    }


//    fun releaseCalledFunctionsStack(state: WolinStateObject) {
//        calledFunctions.forEach {
//            try {
//                state.fnCallReleaseRet(it)
//                if(it.type != Typ.unit)
//                    state.code("free SPF <${it.returnName}>, #${it.type.sizeOnStack} // free return value of ${it.fullName} from call stack")
//            } catch (ex: Exception) {
//                val a = state.currentFunction?.fullName
//                println("tu")
//            }
//        }
//        calledFunctions.clear()
//    }
}
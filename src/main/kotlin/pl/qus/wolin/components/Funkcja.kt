package pl.qus.wolin.components

import pl.qus.wolin.KotlinParser
import pl.qus.wolin.WolinStateObject
import java.lang.Exception

class Funkcja(
    var fullName: String = "",
    var type: Typ = Typ.unit,

    var location: Int = 0,
    var lambdaBody: KotlinParser.StatementsContext? = null // dla lambd
)
{

    var returnAddress: Int = -1

    var isInterrupt: Boolean = false

    val returnName: String
        get() = "$fullName.__returnValue"

    val arguments: List<Zmienna>
        get() = fields.filter { it.fieldType == FieldType.ARGUMENT }
    val locals: List<Zmienna>
        get() = fields.filter { it.fieldType != FieldType.ARGUMENT }

    val labelName: String get() = "__wolin_${fullName.replace(".","_")}"
    var fields: MutableList<Zmienna> = mutableListOf()

    val calledFunctions = mutableListOf<Funkcja>()

    fun addField(nowa: Zmienna) {
        if(fields.none { it.name == nowa.name})
            fields.add(nowa)
    }

    override fun toString(): String = "fun $fullName(${arguments.joinToString()}):${type.name}"

    fun releaseCalledFunctionsStack(state: WolinStateObject) {
        calledFunctions.forEach {
            try {
                state.fnCallReleaseRet(it)
                if(it.type != Typ.unit)
                    state.code("free SPF <${it.returnName}>, #${it.type.sizeOnStack} // free return value of ${it.fullName} from call stack")
            } catch (ex: Exception) {
                val a = state.currentFunction?.fullName
                println("tu")
            }
        }
        calledFunctions.clear()
    }
}
package pl.qus.wolin

class PseudoAsmStateObject {
    var replaced: Boolean = false
    var insideOptimizedReg: Int = -1
    var assemblerLine: PseudoAsmParser.LiniaContext? = null
    var matched: PseudoAsmParser.LiniaContext? = null
    var tekstProgramu: String = ""

    val pary = mutableListOf<Pair<String,String?>>()

    fun code(kod: String) {
            tekstProgramu += "$kod\n"
    }

    fun dumpCode() = tekstProgramu

}
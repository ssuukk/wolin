package pl.qus.wolin.pl.qus.wolin

import pl.qus.wolin.Pass
import pl.qus.wolin.PseudoAsmParser
import pl.qus.wolin.WolinStateObject
import pl.qus.wolin.components.Funkcja
import java.io.OutputStream

class StackOpsSanitizer(outStream: OutputStream) {
    val wolinState = WolinStateObject(Pass.TRANSLATION)
    var insideFunction: Funkcja? = null

    var functionCode = mutableListOf<PseudoAsmParser.LiniaContext>()

    val writer = outStream.bufferedWriter()

    fun startWork(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        val i = ctx.linia()?.iterator()

        while(i?.hasNext() == true) {
            val linia = i.next()

            if(insideFunction == null) {
                println("nie w funkcji - zrzucić linię, jak jest")
                writer.write(linia.children.joinToString(" ") { it.text })
            } else {
                functionCode.add(linia)
            }

            if(linia.instrukcja().text == "function") {
                val nazwaFunkcji = linia.arg(0).text
                insideFunction = wolinState.findFunctionByLabel(nazwaFunkcji)
                //println("mamy funkcję: $prawdziwaFunkcja")
            } else if(linia.instrukcja().text == "endfunction") {
                processWholeFunction()
                insideFunction = null
            }

        }

        writer.flush()
        writer.close()
    }

    private fun processWholeFunction() {
        var pendingFreeFunction = false

        wolinState.fnDeclAllocStackAndRet(insideFunction!!)

        functionCode.forEach { linia ->



            if(linia.instrukcja().text == "call") {
                pendingFreeFunction = true
            } else if (linia.instrukcja().text == "alloc" && linia.arg(0).operand().value().addressed().text == "SPF") {
                val nazwaFunkcji = linia.arg(0).operand().name(0).identifier().text
                val funkcjaDoAllokacji = wolinState.findFunctionByLabel(nazwaFunkcji)
                wolinState.fnCallAllocRetAndArgs(funkcjaDoAllokacji!!)
                println("tu!")
            } else if (linia.instrukcja().text == "free" && linia.arg(0).operand().value().addressed().text == "SPF") {

            }
            writer.write(linia.children.joinToString(" ") { it.text })
        }

        functionCode.clear()

        wolinState.fnDeclFreeStackAndRet(insideFunction!!)
    }
}

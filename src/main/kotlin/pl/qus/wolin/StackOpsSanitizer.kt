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


            if(linia.instrukcja().text == "function") {
                val nazwaFunkcji = linia.arg(0).text
                insideFunction = wolinState.findFunctionByLabel(nazwaFunkcji)
                //println("mamy funkcję: $prawdziwaFunkcja")
            } else if(linia.instrukcja().text == "endfunction") {
                processWholeFunction()
                insideFunction = null
            }

            if(insideFunction == null) {
                writer.write(linia.children.joinToString(" ") { it.text })
            } else {
                functionCode.add(linia)
            }

        }

        writer.flush()
        writer.close()
    }

    private fun processWholeFunction() {
        var pendingFreeFunction = false
        var calledFunction : Funkcja? = null

        writer.newLine()

        wolinState.fnDeclAllocStackAndRet(insideFunction!!)

        println("=====================================================")
        println("Przetwarzanie ${insideFunction!!.labelName}")

        functionCode.forEach { linia ->

            if(pendingFreeFunction) {
                println("po wywolaniu ${calledFunction?.labelName}, usuwam stos, ktory normalnie by sama usunela")
                // było wywołanie funkcji, a ta funkcja skasowała swój stos, mogła pozostać zwrotka!
                wolinState.fnCallReleaseArgs(calledFunction!!)
                pendingFreeFunction = false
            }


            if(linia.instrukcja().text == "call") {
                if(calledFunction == null) {
                    val nazwaFunkcji = linia.arg(0).operand()!!.value().text
                    calledFunction = wolinState.findFunctionByLabel(nazwaFunkcji)
                }
                println("funkcja wywoluje: ${calledFunction?.labelName}")
                pendingFreeFunction = true
            } else if (linia.instrukcja().text == "alloc" && linia.arg(0).operand().value().addressed().text == "SPF") {
                // będzie wywołanie funkcji, zapamiętajmy, jakiej
                val nazwaFunkcji = linia.arg(0).operand().name(0).identifier().text
                calledFunction = wolinState.findFunctionByLabel(nazwaFunkcji)
                wolinState.fnCallAllocRetAndArgs(calledFunction!!)
                println("funkcja wywola: ${calledFunction?.labelName} i allokuje jej stos")
            } else if (linia.instrukcja().text == "free" && linia.arg(0).operand().value().addressed().text == "SPF") {
                // to jest zwalnianie parametrów funkcji, w której jesteśmy!
                // ALBO zwalnianie zwrotki wywołanej funkcji!
                val nazwaFunkcji = linia.arg(0).operand().name(0).identifier().text
                when (nazwaFunkcji) {
                    insideFunction!!.labelName -> {
                        println("koniec funkcji przetwarzanej, zwalnianie jej stosu (${insideFunction?.labelName})")
                    }
                    calledFunction!!.labelName -> {
                        println("zwalnianie zwrotki funkcji, ktora wywolala przetwarzana ${calledFunction?.labelName}")
                    }
                    else -> {
                        throw Exception("Nie wiem co zwalniane!")
                    }
                }
            }
            writer.write(linia.children.joinToString(" ") { it.text })
        }

        functionCode.clear()

        //wolinState.fnDeclFreeStackAndRet(insideFunction!!)
        wolinState.callStack.clear() // nic już nas nie obchodzi stos funckji
    }
}

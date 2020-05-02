package pl.qus.wolin.pl.qus.wolin

import pl.qus.wolin.Pass
import pl.qus.wolin.PseudoAsmParser
import pl.qus.wolin.WolinStateObject
import pl.qus.wolin.WolinVisitor
import pl.qus.wolin.components.Funkcja
import java.io.OutputStream

class StackOpsSanitizer(outStream: OutputStream) {
    val wolinState = WolinStateObject(Pass.TRANSLATION)
    var insideFunction: Funkcja? = null

    var functionCode = mutableListOf<PseudoAsmParser.LiniaContext>()

    private val writer = outStream.bufferedWriter()

    fun startWork(ctx: PseudoAsmParser.PseudoAsmFileContext) {
        val i = ctx.linia()?.iterator()

        while(i?.hasNext() == true) {
            val linia = i.next()


            if(linia.instrukcja().text == "function") {
                val nazwaFunkcji = linia.arg(0).text
                insideFunction = wolinState.findFunctionByLabel(nazwaFunkcji)
                //println("mamy funkcję: $prawdziwaFunkcja")
            } else if(linia.instrukcja().text == "endfunction") {
                shuffleAllocs()
                processVectors()
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

    private fun shuffleAllocs() {
        // 1. znaleźć alloc/free, które są w pętli i przenieść je poza pętle
        // "__wolin_lab_...
        WolinVisitor.loopStartLabel
        WolinVisitor.loopEndLabel
        // 2. znaleźć rejestry, które są używane po free, przenieść free za nie, uważać na granice pętli

        // nie można zwalniać rejestru z niższym numerem przed wyższym


        /*

        function __wolin_pl_qus_wolin_strLen
        let SPF(0)<pl.qus.wolin.strLen..len>[ubyte] = #0[ubyte]
        alloc SP<__wolin_reg4> , #1
        label __wolin_lab_loop_start_1
        alloc SP<__wolin_reg6> , #2
        add SP(0)<__wolin_reg6>[ubyte*] = SPF(1)<pl.qus.wolin.strLen.what>[ubyte*] , SPF(0)<pl.qus.wolin.strLen..len>[ubyte]
        free SP<__wolin_reg6> , #2
        evalneq SP(0)<__wolin_reg4>[bool] = &SP(-1)<__wolin_reg6>[ubyte*] , #0[ubyte]
        bne SP(0)<__wolin_reg4>[bool] = #1[bool] , __wolin_lab_loop_end_1<label_po_if>[uword]
        add SPF(0)<pl.qus.wolin.strLen..len>[ubyte] = SPF(0)<pl.qus.wolin.strLen..len>[ubyte] , #1[ubyte]
        goto __wolin_lab_loop_start_1[uword]
        label __wolin_lab_loop_end_1
        free SP<__wolin_reg4> , #1
        let SPF(3)<pl.qus.wolin.strLen.__returnValue>[ubyte] = SPF(0)<pl.qus.wolin.strLen..len>[ubyte]
        free SPF<__wolin_pl_qus_wolin_strLen> , #3
        endfunction


Po przesunięciach:


        function __wolin_pl_qus_wolin_strLen
        let SPF(0)<pl.qus.wolin.strLen..len>[ubyte] = #0[ubyte]

        alloc SP<__wolin_reg4> , #1
        alloc SP<__wolin_reg6> , #2

        label __wolin_lab_loop_start_1
        add SP(0)<__wolin_reg6>[ubyte*] = SPF(1)<pl.qus.wolin.strLen.what>[ubyte*] , SPF(0)<pl.qus.wolin.strLen..len>[ubyte]
        evalneq SP(0)<__wolin_reg4>[bool] = &SP(-1)<__wolin_reg6>[ubyte*] , #0[ubyte]
        bne SP(0)<__wolin_reg4>[bool] = #1[bool] , __wolin_lab_loop_end_1<label_po_if>[uword]
        add SPF(0)<pl.qus.wolin.strLen..len>[ubyte] = SPF(0)<pl.qus.wolin.strLen..len>[ubyte] , #1[ubyte]
        goto __wolin_lab_loop_start_1[uword]
        label __wolin_lab_loop_end_1

        free SP<__wolin_reg6> , #2
        free SP<__wolin_reg4> , #1

        let SPF(3)<pl.qus.wolin.strLen.__returnValue>[ubyte] = SPF(0)<pl.qus.wolin.strLen..len>[ubyte]
        free SPF<__wolin_pl_qus_wolin_strLen> , #3
        endfunction




         */
    }

    private fun processVectors() {
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

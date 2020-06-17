package pl.qus.wolin.pl.qus.wolin.steps

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import pl.qus.wolin.PseudoAsmLexer
import pl.qus.wolin.PseudoAsmParser
import pl.qus.wolin.WolinVisitor
import pl.qus.wolin.components.Funkcja
import java.io.BufferedWriter
import java.io.InputStream
import java.io.OutputStream

class SanitizerStep: CompilerProcess() {
    private var insideFunction: Funkcja? = null

    private var functionCode = mutableListOf<PseudoAsmParser.LiniaContext>()


    override fun process(istream: InputStream, ostream: OutputStream) {
        val asmLexer = PseudoAsmLexer(ANTLRInputStream(istream))
        val asmTokens = CommonTokenStream(asmLexer)
        val asmParser = PseudoAsmParser(asmTokens)
        val asmContext = asmParser.pseudoAsmFile()
        val writer = ostream.bufferedWriter()

        startWork(asmContext, writer)


    }


    private fun startWork(ctx: PseudoAsmParser.PseudoAsmFileContext, writer: BufferedWriter) {
        val i = ctx.linia()?.iterator()

        while(i?.hasNext() == true) {
            val linia = i.next()


            if(linia.instrukcja().text == "function") {
                val nazwaFunkcji = linia.arg(0).text
                insideFunction = state!!.findFunctionByLabel(nazwaFunkcji)
                //println("mamy funkcję: $prawdziwaFunkcja")
            } else if(linia.instrukcja().text == "endfunction") {
                shuffleAllocs()
                processVectors(writer)
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

        Zasada:
        jeżeli w OBRĘBIE TEGO SAMEGO POZIOMU SKOŁPU jest dellokacja i allokacja tej samej wielkości, i nie są one
        ROZDZIELONE INNYM SKOŁPEM, np:


        alloc SP<A>, #x
        yyy <A>
        free SP<A>, #x
        .
        .
        .
        alloc SP<B>, #x
        xxx <B>
        free SP<B>, #x


        to usuwamy obie, a następnie możemy zastąpić wystąpienia zmiennej allokowanej
        deallokowaną i zwalnianie dellokowanej pierwszą:


        alloc SP<A>, #x
        yyy <A>
        .
        .
        .
        xxx <A>
        free SP<A>, #x


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


        /*
        _scope_ loop , 1
	label __wolin_lab_loop_start_1
	evalless SP(0)<__wolin_reg2>[bool] = SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] , #100[ubyte]
	bne SP(0)<__wolin_reg2>[bool] = #1[bool] , __wolin_lab_loop_end_1<label_po_if>[uword]
	bne *SPF(0)<pl.qus.wolin.scopeTest.war>[bool] = #1[bool] , __wolin_lab_else_branch_1<label_DO_else>[uword]
	alloc SP<__wolin_reg11> , #1

	_scope_ loop , 2
		label __wolin_lab_loop_start_2
		evalless SP(0)<__wolin_reg11>[bool] = #10[ubyte] , SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte]
		bne SP(0)<__wolin_reg11>[bool] = #1[bool] , __wolin_lab_loop_end_2<label_po_if>[uword]
		add SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] = SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] , #1[ubyte]
		goto __wolin_lab_loop_start_2[uword]
	_endscope_ loop , 2

	label __wolin_lab_loop_end_2
	free SP<__wolin_reg11> , #1
	goto __wolin_lab_if_end_1[uword]
	label __wolin_lab_else_branch_1
	alloc SP<__wolin_reg18> , #1

	_scope_ loop , 3
		label __wolin_lab_loop_start_3
		evalless SP(0)<__wolin_reg18>[bool] = SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] , #20[ubyte]
		bne SP(0)<__wolin_reg18>[bool] = #1[bool] , __wolin_lab_loop_end_3<label_po_if>[uword]
		add SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte] = SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte] , #1[ubyte]
		goto __wolin_lab_loop_start_3[uword]
	_endscope_ loop , 3

	label __wolin_lab_loop_end_3
	free SP<__wolin_reg18> , #1
	label __wolin_lab_if_end_1
	goto __wolin_lab_loop_start_1[uword]
_endscope_ loop , 1
         */

    }

    private fun processVectors(writer: BufferedWriter) {
        var pendingFreeFunction = false
        var calledFunction : Funkcja? = null

        writer.newLine()

        state!!.fnDeclAllocStackAndRet(insideFunction!!)



        println("=====================================================")
        println("Przetwarzanie ${insideFunction!!.labelName}")

        functionCode.forEach { linia ->

            if(pendingFreeFunction) {
                println("po wywolaniu ${calledFunction?.labelName}, usuwam stos, ktory normalnie by sama usunela")
                // było wywołanie funkcji, a ta funkcja skasowała swój stos, mogła pozostać zwrotka!
                state!!.fnCallReleaseArgs(calledFunction!!)
                pendingFreeFunction = false
            }


            if(linia.instrukcja().text == "call") {
                if(calledFunction == null) {
                    val nazwaFunkcji = linia.arg(0).operand()!!.value().text
                    calledFunction = state!!.findFunctionByLabel(nazwaFunkcji)
                }
                println("funkcja wywoluje: ${calledFunction?.labelName}")
                pendingFreeFunction = true
            } else if (linia.instrukcja().text == "alloc" && linia.arg(0).operand().value().addressed().text == "SPF") {
                // będzie wywołanie funkcji, zapamiętajmy, jakiej
                val nazwaFunkcji = linia.arg(0).operand().name(0).identifier().text
                calledFunction = state!!.findFunctionByLabel(nazwaFunkcji)
                state!!.fnCallAllocRetAndArgs(calledFunction!!)
                println("funkcja wywola: ${calledFunction?.labelName} i allokuje jej stos")
            } else if (linia.instrukcja().text == "free" && linia.arg(0).operand().value().addressed().text == "SPF") {
                // to jest zwalnianie parametrów funkcji, w której jesteśmy!
                // ALBO zwalnianie zwrotki wywołanej funkcji!
                when (linia.arg(0).operand().name(0).identifier().text) {
                    insideFunction!!.labelName -> {
                        println("koniec funkcji przetwarzanej, zwalnianie jej stosu (${insideFunction?.labelName})")
                    }
                    calledFunction!!.returnName -> {
                        println("zwalnianie zwrotki funkcji, ktora wywolala przetwarzana ${calledFunction?.labelName}")
                    }
                    else -> {
                        throw Exception("Nie wiem co zwalniane, linia=${linia.text}!")
                    }
                }
            }
            writer.write(linia.children.joinToString(" ") { it.text })
        }

        functionCode.clear()

        //state.fnDeclFreeStackAndRet(insideFunction!!)
        state!!.callStack.clear() // nic już nas nie obchodzi stos funckji
    }
}
package pl.qus.wolin.pl.qus.wolin.steps

import org.antlr.v4.runtime.CommonTokenStream
import pl.qus.wolin.Main
import pl.qus.wolin.PseudoAsmLexer
import pl.qus.wolin.PseudoAsmParser
import pl.qus.wolin.pl.qus.wolin.optimizer.NewOptimizerProcessor
import pl.qus.wolin.pl.qus.wolin.optimizer.OptimizerProcessor
import java.io.InputStream
import java.io.OutputStream
import org.antlr.v4.runtime.ANTLRInputStream

class OptimizerStep(
    var newOpt: NewOptimizerProcessor? = null
): CompilerProcess() {
    override fun process(istream: InputStream, ostream: OutputStream) {
        val newOptimizer = true

        val asmLexer = PseudoAsmLexer(ANTLRInputStream(istream))
        val asmTokens = CommonTokenStream(asmLexer)
        val asmParser = PseudoAsmParser(asmTokens)
        val asmContext = asmParser.pseudoAsmFile()
        val optimizer = OptimizerProcessor()

        if (newOptimizer) {
            if(newOpt == null) newOpt = NewOptimizerProcessor(state!!)
            newOpt?.buildFlowTree(asmContext)
            newOpt?.optimizeGraph()
            newOpt?.removeRedundantAllocs(asmContext, state!!)
            newOpt?.replacePairs(asmContext, state!!)
            newOpt?.removeIdentities(asmContext)
        } else {
            // zebrać wszystkie rejestry
            optimizer.gatherAllSPRegs(asmContext)
            // sprawdzić które kwalifikują się do usunięcia
            optimizer.markSingleAssignmentRegs(asmContext)
            // tu można wygenerować ponownie plik tekstowy, pewnie nawet trzeba, tu się przesuwa funkcyjne rejestry
            optimizer.replaceSingleAssignmentRegWithItsValue(asmContext)
            // sprawdzić, czy dany rejestr występuje tylko jako free/alloc +ew. let rejestr =, tylko odflaguje
            optimizer.markRegIfStillUsed(asmContext)
            // usuwa oflagowane rejestry
            optimizer.removeAndShiftArgs(asmContext)

            optimizer.optimizeReverseAssigns(asmContext)
            optimizer.replaceSingleAssignmentRegWithItsValue(asmContext)
            optimizer.markRegIfStillUsed(asmContext)
            optimizer.removeAndShiftArgs(asmContext)

            optimizer.sanitizeDerefs(asmContext)
            //optimizer.consolidateAllocs(asmContext)
        }

        ostream.use {
            asmContext.linia().iterator().forEach {
                val linia = it.children.map { it.text }.joinToString(" ")
                ostream.write(linia.toByteArray())
            }
        }
    }
}
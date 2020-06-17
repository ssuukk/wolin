package pl.qus.wolin.pl.qus.wolin.steps

import org.antlr.v4.runtime.CommonTokenStream
import pl.qus.wolin.PseudoAsmLexer
import pl.qus.wolin.PseudoAsmParser
import pl.qus.wolin.pl.qus.wolin.optimizer.NewOptimizerProcessor
import java.io.InputStream
import java.io.OutputStream
import org.antlr.v4.runtime.ANTLRInputStream

class OptimizerStep(
    var newOpt: NewOptimizerProcessor? = null
) : CompilerProcess() {
    override fun process(istream: InputStream, ostream: OutputStream) {

        val asmLexer = PseudoAsmLexer(ANTLRInputStream(istream))
        val asmTokens = CommonTokenStream(asmLexer)
        val asmParser = PseudoAsmParser(asmTokens)
        val asmContext = asmParser.pseudoAsmFile()

        if (newOpt == null) newOpt = NewOptimizerProcessor(state!!)
        newOpt?.buildFlowTree(asmContext)
        newOpt?.optimizeGraph()
        newOpt?.removeRedundantAllocs(asmContext, state!!)
        newOpt?.replacePairs(asmContext, state!!)
        newOpt?.removeIdentities(asmContext)

        ostream.use {
            asmContext.linia().iterator().forEach {
                val linia = it.children.map { it.text }.joinToString(" ")
                ostream.write(linia.toByteArray())
            }
        }
    }
}
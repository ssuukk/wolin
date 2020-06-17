package pl.qus.wolin.pl.qus.wolin.steps

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import pl.qus.wolin.PseudoAsmLexer
import pl.qus.wolin.PseudoAsmParser
import pl.qus.wolin.RuleMatcherVisitor
import pl.qus.wolin.asmFileLine
import pl.qus.wolin.exception.NoRuleException
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.io.OutputStream

class TargetStep: CompilerProcess() {
    override fun process(istream: InputStream, ostream: OutputStream) {
        val templateStream = FileInputStream(File("src/main/wolin/template.asm"))

        val asmLexer = PseudoAsmLexer(ANTLRInputStream(istream))
        val asmTokens = CommonTokenStream(asmLexer)
        val asmParser = PseudoAsmParser(asmTokens)
        val asmContext = asmParser.pseudoAsmFile()

        val templateLexer = PseudoAsmLexer(ANTLRInputStream(templateStream))
        val templateTokens = CommonTokenStream(templateLexer)
        val templateParser = PseudoAsmParser(templateTokens)
        val templateContext = templateParser.pseudoAsmFile()
        val templateVisitor = RuleMatcherVisitor()

        asmContext.linia().forEach {
            templateVisitor.state.assemblerLine = it
            try {
                templateVisitor.visit(templateContext)
            } catch (ex: NoRuleException) {
                println("No rule for parsing:${ex.message}")
            } catch (ex: Exception) {
                println("Syntax error in rule file translateAsm")
                throw ex
            } finally {
                asmFileLine++
            }
        }

        ostream.use {
            it.write(templateVisitor.state.dumpCode().toByteArray())
        }

    }
}
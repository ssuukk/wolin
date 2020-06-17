package pl.qus.wolin.pl.qus.wolin.steps

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import pl.qus.wolin.KotlinLexer
import pl.qus.wolin.KotlinParser
import pl.qus.wolin.Pass
import pl.qus.wolin.WolinVisitor
import java.io.*

class PseudoAsmStep: CompilerProcess() {
    override fun process(istream: InputStream, ostream: OutputStream) {
        // Get our lexer
        val lexer = KotlinLexer(ANTLRInputStream(istream))

        // Get a list of matched tokens
        val tokens = CommonTokenStream(lexer)

        // Pass the tokens to the parser
        val parser = KotlinParser(tokens)

        // Specify our entry point
        val fileContext = parser.kotlinFile()

        val symbolsVisitor = WolinVisitor(Pass.SYMBOLS, tokens)

        val declarationVisitor = WolinVisitor(Pass.DECLARATION, tokens)

        val translationVisitor = WolinVisitor(Pass.TRANSLATION, tokens)

        //try {

        // przygotowanie

        println("== PASS 1 - gathering symbols ==")

        symbolsVisitor.visit(fileContext)

        println("== PASS 2 - type inference ==")

        // zebranie typów dla rejestrów
        val mainName = symbolsVisitor.state.findFunction("main")// { it == "main" || it.endsWith(".main")}
        symbolsVisitor.state.copyInto(declarationVisitor.state)
        declarationVisitor.state.mainFunction = mainName

        declarationVisitor.visit(fileContext)
        declarationVisitor.appendLambdas()

        println("== PASS 3 - code generation ==")

        // właściwa translacja
        declarationVisitor.state.copyInto(translationVisitor.state)
        val wynik = translationVisitor.visit(fileContext)

        translationVisitor.appendLambdas()
        wynik.appendStatics()

        //val ostream = BufferedOutputStream(FileOutputStream(File("src/main/wolin/assembler.asm")))

        ostream.use {
            it.write(wynik.dumpCode().toByteArray())
        }

        this.state = translationVisitor.state
    }

}
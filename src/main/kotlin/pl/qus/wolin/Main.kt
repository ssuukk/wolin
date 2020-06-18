package pl.qus.wolin

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import pl.qus.wolin.pl.qus.wolin.steps.OptimizerStep
import pl.qus.wolin.pl.qus.wolin.steps.PseudoAsmStep
import pl.qus.wolin.pl.qus.wolin.steps.SanitizerStep
import pl.qus.wolin.pl.qus.wolin.steps.TargetStep
import tornadofx.launch
import java.io.*
import java.lang.StringBuilder
import java.net.ServerSocket
import java.net.URL

object Main {
    /*

******************************************
Mapa pamięci
******************************************

http://c64os.com/post/rethinkingthememmap

$DD00 = xxxxxx00 daje VIC w C000-FFFF

lda $DD00
and #%11111100
//ora #%000000xx ;<- your desired VIC bank value, see above
sta $DD00

czyli wtedy:

C000-CFFF - ram
D000-DFFF - I/O, CHAR SET, COLOR BUFFER, SCREEN BUFFER
E000-FFFF - KERNAL, BITMAP

w adresie 1 umieścić:

30, 14	X	1	1	1	0	RAM	RAM	RAM	RAM	RAM	I/O	KERNAL ROM



 The 6510's Perspective                            The VIC-II's Perspective *
+--------------------------------------------+  +--------------------------------------------+
| $E000 - $FFFF - KERNAL ROM              8K |  | $2000 - $3FFF - BITMAP SCREEN BUFFER    8K |
|               - BITMAP SCREEN BUFFER       |  |               - 2 SPRITES                  |
|               - MUSIC BUFFER               |  |                                            |
|               - UNSTRUCTURED FREE SPACE    |  |                                            |
+--------------------------------------------+  +--------------------------------------------+
| $D000 - $DFFF - I/O, CHAR SET           4K |  | $1000 - $1FFF - CHAR SET                4K |
|               - COLOR BUFFER, SCRN BUFFER  |  |               - SCREEN MATRIX              |
+--------------------------------------------+  +--------------------------------------------+
| $B000 - $CFFF - C64 OS KERNAL           8K |  | $0000 - $0FFF - C64 OS KERNAL           4K |
|                                            |  |                                            |
|                                            |  +--------------------------------------------+
|                                            |  Lower three banks, not visible.
+--------------------------------------------+
| $0500 - $AFFF - PAGE ALLOCATED SPACE   42K |  * Updated, thanks to comment poster zu03776.
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
+--------------------------------------------+
| $0000 - $04FF - SYSTEM, STACK, PG MMAP <2K |
+--------------------------------------------+


32 bajty = 256 bitów
1 bit = blok 256 bajtów wolny/zajęty

******************************************
ZEROPAGE
******************************************

C64 - dostępna pamięć:

2-143 - basic: [operations stack pointer=X] (72 words)
155-156 - tape: [exception stack pointer ESP]
176-177 - tape: [heap pointer]
178-179 - tape: [object pointer if exception]
197-246 - screen editor: [unused] only if not using screen editor
251-252 - nothing: [function stack pointer SPF]
253-254 - nothing: [catch pointer for exception]

bajty do wykorzystania:
146 - tape
150 - tape
190 - tape
192 - tape
255 - free

******************************************
6502 specific
******************************************

TRYBY ADRESOWANIA
=================

d,x	Zero page indexed	val = PEEK((arg + X) % 256)	4 - dużo instrukcji
d,y	Zero page indexed	val = PEEK((arg + Y) % 256)	4 - tylko LDA/STA
a,x	Absolute indexed	val = PEEK(arg + X)	4+ - dużo instrykcji
a,y	Absolute indexed	val = PEEK(arg + Y)	4+ - ORA, AND, EOR, ADC, STA, LDA, CMP, SBC, LDX

SP+n -> ZP,X

(d,x)	Indexed indirect	val = PEEK( PEEK((arg + X) % 256) + PEEK((arg + X + 1) % 256) * 256  )	6
pobierz bajt z adresu zapisanego pod adresem d+x na stronie zerowej
tabela wskaźników? wygląda bezużytecznie...

(d),y	Indirect indexed	val = PEEK(PEEK(arg) + PEEK((arg + 1) % 256) * 256 + Y)	5+
pobierz bajt z adresu = adres w d + y
czyli np. czytanie stringu

TIPSY
=====

1.  An automatic compare-to-zero instruction is built into the following 65c02 instructions:
LDA, LDX, LDY,
INC, INX, INY,
DEC, DEX, DEY,
INA, DEA,
AND, ORA, EOR,
ASL, LSR, ROL, ROR,
PLA, PLX, PLY,
SBC, ADC,
TAX, TXA, TAY, TYA, and TSX.

This means that, for example, a CMP #0 after an LDA is redundant, a wasted instruction.  The only time a 65c02 (CMOS) needs a compare-to-zero instruction after one of these is if you want to compare a register that was not involved in the previous instruction; for example,


        DEY
        CPX  #0

http://wilsonminesco.com/6502primer/PgmTips.html


ILLEGAL OPCODES
===============

http://www.zimmers.net/anonftp/pub/cbm/documents/chipdata/64doc

USEFUL MACROS
=============

http://wilsonminesco.com/StructureMacros/

BUGI
====

jmp ($xxFF) - fail, bo pobierze starszy bajt z $xx00

******************************************
try-catch
******************************************

http://www.c64os.com/post?p=76

******************************************
matematyka
******************************************

http://www.crbond.com/download/fltpt65.cba
http://forum.6502.org/viewtopic.php?f=2&t=5724


mnożenie ruskich wieśniaków 13*238

1101	(13)	   11101110		(238)
 110	(6)		  111011100		(476) - lewa parzysta, nie uwzględniamy
  11	(3)		 1110111000		(952)
   1	(1)		11101110000		(1904)

wynik = suma nieparzystych lewych, czyli: 238 + 952 + 1904

według tej pracy:
https://pdfs.semanticscholar.org/ac5b/f27be15e39feda0d5cb0a4ff5d3d597fb586.pdf
najwydajniejszy jest:
https://en.wikipedia.org/wiki/Division_algorithm#Restoring_division

de facto opisane tu:
https://www.atariarchives.org/roots/chapter_10.php

******************************************
Wolin
******************************************

jeżeli
package pl.qus
to:

1) local scope funkcji sum, zmienna a

    pl.qus.sum..a

2) scope parametrów funkcji sum, parametr a

    pl.qus.sum.a

3) scope obiektu Dupa

    pl.qus.Dupa.a - ustawiamy tej zmiennej stos na "HEAP"

4) scope pliku

    pl.qus.a


4. wszystko po throw wyciąć aż do najbliższego labela

throw SP(0)[uword] // nie martwimy sie o sotsy, bo te odtworzy obsluga wyjatku
--free SP<r.temp2>, #2 // for statement throw12345, type = uword
--free SPF, #4 // free fn arguments and locals
--ret
label xxxx

     */


    @JvmStatic
    fun main(args: Array<String>) {

        //server()

        PseudoAsmStep().apply {
            this.inputName = "test.ktk"
            this.outputName = "pseudoasm.qasm"
            execute()
        }
            .chain(OptimizerStep(), "pseudoasm_optimized1.qasm")
            .chain(TargetStep(), "assembler.s")

        //launch<MyApp>(args)
    }


    private fun wolinIntoPseudoAsm(istream: InputStream): WolinStateObject {
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

        val ostream = BufferedOutputStream(FileOutputStream(File("src/main/wolin/assembler.asm")))

        ostream.use {
            it.write(wynik.dumpCode().toByteArray())
        }

        return translationVisitor.state
    }

    fun server() {
        val hostName = "127.0.0.1"
        val portNumber = 64128

        val serverSocket = ServerSocket(64128)
        val echoSocket = serverSocket.accept()
        val out = PrintWriter(echoSocket.getOutputStream(), true);

        val builder = StringBuilder()

        var localServer: Thread? = null

        InputStreamReader(echoSocket.getInputStream()).use {
            println("Soket otwarty!")
            var connected = false
            do {
                var b = it.read()
                if (b == 0x1b) {
                    b = it.read() xor 0x20
                }

                val linia = builder.toString()

                val tokeny = linia.split(" ")
                val token = tokeny[0]

                when {
                    b == 13 -> {
                        //builder.append(b.toChar())
                        println("Przyszła linia: '${linia}'")
                        builder.clear()
                        when (token) {
                            "ATI" -> {
                                out.println("JAM JEST MODEM WIELKI")
                            }
                            "AT" -> {
                                out.println("OK")
                            }
                            "ATD" -> {
                                println("otworzyc: ${tokeny[1]}\n")
                                val url = URL("http://${tokeny[1]}/")
                                val uistream = BufferedReader(InputStreamReader(url.openStream()))

                                connected = true
                                localServer = Thread {
                                    while (connected) {
                                        val char = uistream.readLine()
                                        out.println(char)
                                        print(char)
                                        Thread.sleep(1000)
                                    }
                                }

                                localServer?.start()

                            }
                            "" -> {
                                println("pusta")
                            }
                            else -> {
                                println("Nieznana komenda")
                                out.println("?syntax  error")
                            }
                        }
                    }
                    b < 32 -> {
                        builder.append("<$b>")
                    }
                    b >= 32 -> {
                        //println("${b.toChar()}")
                        builder.append(b.toChar())
                        if (builder.toString() == "+++") {
                            out.println("coming back")
                            builder.clear()
                            connected = false
                        }
                    }
                    else -> {
                        //print("nic ")
                    }
                }


            } while (echoSocket.isBound)

            println("Rozlaczone!")
        }
    }
}

var asmFileLine = 1


//    private fun sanitizePseudoAsmStackOps(
//        asmStream: InputStream,
//        outStream: OutputStream,
//        finalState: WolinStateObject
//    ) {
//        val asmLexer = PseudoAsmLexer(ANTLRInputStream(asmStream))
//        val asmTokens = CommonTokenStream(asmLexer)
//        val asmParser = PseudoAsmParser(asmTokens)
//        val asmContext = asmParser.pseudoAsmFile()
//        val sanitizer = StackOpsSanitizer(outStream)
//        finalState.copyInto(sanitizer.wolinState)
//        sanitizer.startWork(asmContext)
//    }

//        sanitizePseudoAsmStackOps(
//            FileInputStream(File("src/main/wolin/assembler_optX.asm")),
//            FileOutputStream(File("src/main/wolin/assembler_opt1.asm")),
//            finalState
//        )

//        optimizePseudoAsm(
//            FileInputStream(File("src/main/wolin/assembler.asm")),
//            FileOutputStream(File("src/main/wolin/assembler_optX.asm")),
//            finalState
//        )

//    private fun optimizePseudoAsm(
//        asmStream: InputStream,
//        outStream: OutputStream,
//        finalState: WolinStateObject
//    ) {
//        val newOpt = true
//
//        val asmLexer = PseudoAsmLexer(ANTLRInputStream(asmStream))
//        val asmTokens = CommonTokenStream(asmLexer)
//        val asmParser = PseudoAsmParser(asmTokens)
//        val asmContext = asmParser.pseudoAsmFile()
//        val optimizer = OptimizerProcessor()
//
//        if(newOpt) {
//            val newOpt = NewOptimizerProcessor(finalState)
//            newOpt.buildFlowTree(asmContext)
//            newOpt.optimizeGraph()
//            newOpt.removeRedundantAllocs(asmContext, finalState)
//            newOpt.replacePairs(asmContext, finalState)
//            newOpt.removeIdentities(asmContext)
//        }
//        else {
//            // zebrać wszystkie rejestry
//            optimizer.gatherAllSPRegs(asmContext)
//            // sprawdzić które kwalifikują się do usunięcia
//            optimizer.markSingleAssignmentRegs(asmContext)
//            // tu można wygenerować ponownie plik tekstowy, pewnie nawet trzeba, tu się przesuwa funkcyjne rejestry
//            optimizer.replaceSingleAssignmentRegWithItsValue(asmContext)
//            // sprawdzić, czy dany rejestr występuje tylko jako free/alloc +ew. let rejestr =, tylko odflaguje
//            optimizer.markRegIfStillUsed(asmContext)
//            // usuwa oflagowane rejestry
//            optimizer.removeAndShiftArgs(asmContext)
//
//            optimizer.optimizeReverseAssigns(asmContext)
//            optimizer.replaceSingleAssignmentRegWithItsValue(asmContext)
//            optimizer.markRegIfStillUsed(asmContext)
//            optimizer.removeAndShiftArgs(asmContext)
//
//            optimizer.sanitizeDerefs(asmContext)
//            //optimizer.consolidateAllocs(asmContext)
//        }
//
//        outStream.use {
//            asmContext.linia().iterator().forEach {
//                val linia = it.children.map{ it.text }.joinToString(" ")
//                outStream.write(linia.toByteArray())
//            }
//        }
//    }

//        pseudoAsmToTargetAsm(
//            FileInputStream(File("src/main/wolin/assembler_opt1.asm")),
//            FileInputStream(File("src/main/wolin/template.asm"))
//        )


//    private fun pseudoAsmToTargetAsm(asmStream: InputStream, templateStream: InputStream) {
//        val asmLexer = PseudoAsmLexer(ANTLRInputStream(asmStream))
//        val asmTokens = CommonTokenStream(asmLexer)
//        val asmParser = PseudoAsmParser(asmTokens)
//        val asmContext = asmParser.pseudoAsmFile()
//
//        val templateLexer = PseudoAsmLexer(ANTLRInputStream(templateStream))
//        val templateTokens = CommonTokenStream(templateLexer)
//        val templateParser = PseudoAsmParser(templateTokens)
//        val templateContext = templateParser.pseudoAsmFile()
//        val templateVisitor = RuleMatcherVisitor()
//
//        asmContext.linia().forEach {
//            templateVisitor.state.assemblerLine = it
//            try {
//                templateVisitor.visit(templateContext)
//            } catch (ex: NoRuleException) {
//                println("No rule for parsing:${ex.message}")
//            } catch (ex: Exception) {
//                println("Syntax error in rule file translateAsm")
//                throw ex
//            } finally {
//                asmFileLine++
//            }
//        }
//
//        val ostream = BufferedOutputStream(FileOutputStream(File("src/main/wolin/assembler.s")))
//
//        ostream.use {
//            it.write(templateVisitor.state.dumpCode().toByteArray())
//        }
//    }


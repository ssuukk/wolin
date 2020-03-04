package pl.qus.wolin

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import pl.qus.wolin.exception.NoRuleException
import java.io.*

object Main {
    /*


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
C64 specific
******************************************

C64 - dostępna pamięć:

2-143 - basic: SP (72 wordy)

bajty do wykorzystania:
146 - tape
150 - tape
190 - tape
192 - tape
255 - free

wordy do wykorzystania:
155-156 - tape: [ESP]
176-177 - tape: [HEAP]
178-179 - tape: [EXCEPTION OBJECT]
251-252 - free: [FSP]
253-254 - free: [CATCH JUMP ADDRESS]

potencjalnie do wykorzystania:
197-246 - edytor

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


TRY-CATCH
=========

http://www.c64os.com/post?p=76


BUGI
====

jmp ($xxFF) - fail, bo pobierze starszy bajt z $xx00

******************************************
Multiplication
******************************************

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

	1) scope funkcji

		pl.qus.Dupa.sum..a

	2) scope parametrów funkcji

		pl.qus.Dupa.sum.a

	3) scope obiektu

		pl.qus.Dupa.a - ustawiamy tej zmiennej stos na "HEAP"

	4) scope pliku

		pl.qus.a


4. wszystko po throw wyciąć aż do najbliższego labela

throw SP(0)[uword] // nie martwimy sie o sotsy, bo te odtworzy obsluga wyjatku
--free SP<r.temp2>, #2 // for statement throw12345, type = uword
--free SPF, #4 // free fn arguments and locals
--ret
label xxxx


5. ciekawy przypadek dla optymalizacji:


label lambda_function_0

alloc SP<r.temp12>, #1 // for statement a+b
let SP(0)<r.temp12>[ubyte] = SPF(1)<pl.qus.wolin.test.lambda_function_0.a>[ubyte] // simple id from var
alloc SP<r.temp13>, #1 // for right side
let SP(0)<r.temp13>[ubyte] = SPF(0)<pl.qus.wolin.test.lambda_function_0.b>[ubyte] // simple id from var
add SP(1)<r.temp12>[ubyte] = SP(1)<r.temp12>[ubyte], SP(0)<r.temp13>[ubyte] // two sides
free SP<r.temp13>, #1 // for right side, type =ubyte
let SPF(2)<lambdaReturn>[ubyte] = SP(0)<r.temp12>[ubyte] // LAMBDA return assignment
free SP<r.temp12>, #1 // for statement a+b, type = ubyte
free SPF, #2 // free fn arguments and locals for lambda_function_0

ret

1) pl.qus.wolin.test.lambda_function_0.b jest umieszczany w temp13 i tylko czytany, więc zamieniamy wystąpienia temp13 w b, usuwamy podstawienie:

label lambda_function_0

alloc SP<r.temp12>, #1 // for statement a+b
let SP(0)<r.temp12>[ubyte] = SPF(1)<pl.qus.wolin.test.lambda_function_0.a>[ubyte] // simple id from var
// KROK1 allokacja temp13
// KROK1 podstawienie temp13
add SP(1)<r.temp12>[ubyte] = SP(1)<r.temp12>[ubyte], **SPF(0)<pl.qus.wolin.test.lambda_function_0.b>[ubyte]** // two sides
// KROK1 deallokacja temp13
let SPF(2)<lambdaReturn>[ubyte] = SP(0)<r.temp12>[ubyte] // LAMBDA return assignment
free SP<r.temp12>, #1 // for statement a+b, type = ubyte
free SPF, #2 // free fn arguments and locals for lambda_function_0

ret

2) temp12 jest umieszczany w lambdaReturn i natychmiast zwalniany, więc zamieniamy WSZYSTKIE wystąpienia temp12 w lambdaReturn:

label lambda_function_0

// KROK2 allokacja temp12
KROK2 let SPF(2)<lambdaReturn>[ubyte] = SPF(1)<pl.qus.wolin.test.lambda_function_0.a>[ubyte] // simple id from var
// KROK1 allokacja temp13
// KROK1 podstawienie temp13
KROK2 add SPF(2)<lambdaReturn>[ubyte] = SPF(2)<lambdaReturn>[ubyte], **SPF(0)<pl.qus.wolin.test.lambda_function_0.b>[ubyte]** // two sides
// KROK1 deallokacja temp13
KROK2 let SPF(2)<lambdaReturn>[ubyte] = SPF(2)<lambdaReturn>[ubyte] // LAMBDA return assignment
// KROK2 deallokacja temp12
free SPF, #2 // free fn arguments and locals for lambda_function_0

ret

3) eliminujemy tożsamości:

label lambda_function_0

// KROK2 allokacja temp12
KROK2 let SPF(2)<lambdaReturn>[ubyte] = SPF(1)<pl.qus.wolin.test.lambda_function_0.a>[ubyte] // simple id from var
// KROK1 allokacja temp13
// KROK1 podstawienie temp13
KROK2 add SPF(2)<lambdaReturn>[ubyte] = SPF(2)<lambdaReturn>[ubyte], **SPF(0)<pl.qus.wolin.test.lambda_function_0.b>[ubyte]** // two sides
// KROK1 deallokacja temp13
// KROK2 KROK3 tożsamość
// KROK2 deallokacja temp12
free SPF, #2 // free fn arguments and locals for lambda_function_0

ret

4) a jest umieszczany w lambdaReturn, do pierwszego zapisu (włącznie) lambdaReturn możemy posługiwać się a zamiast lambdaReturn po prawej stronie i usuwamy podstawienie:

label lambda_function_0

// KROK2 allokacja temp12
KROK2 KROK4 // podstawienie a do lambdaReturn
// KROK1 allokacja temp13
// KROK1 podstawienie temp13
KROK2 add SPF(2)<lambdaReturn>[ubyte] = SPF(1)<pl.qus.wolin.test.lambda_function_0.a>[ubyte], **SPF(0)<pl.qus.wolin.test.lambda_function_0.b>[ubyte]** // two sides
// KROK1 deallokacja temp13
// KROK2 KROK3 tożsamość
// KROK2 deallokacja temp12
free SPF, #2 // free fn arguments and locals for lambda_function_0

ret

5) w efekcie mamy:

label lambda_function_0
add SPF(2)<lambdaReturn>[ubyte] = SPF(1)<pl.qus.wolin.test.lambda_function_0.a>[ubyte], **SPF(0)<pl.qus.wolin.test.lambda_function_0.b>[ubyte]** // two sides
free SPF, #2 // free fn arguments and locals for lambda_function_0

ret
     */


    // TODO - przesunąć deallokacje SPF za ostatnie użycie danego rejestru
    /*
call __wolin_pl_qus_wolin_allocMem[adr]
free SPF<pl.qus.wolin.allocMem.__returnValue>, #2 <------- musi być na końcu
let SPF(0)<pl.qus.wolin.SomeClass.pl.qus.wolin.SomeClass.__returnValue>[any*] = SPF(2)<pl.qus.wolin.allocMem.__returnValue>[uword]
setup HEAP = SPF(2)<pl.qus.wolin.allocMem.__returnValue>[uword]
<----- tu musi być
     */
    // TODO - przesunąć wektory SPF posługując się stosem funkcji
    /*
call __wolin_pl_qus_wolin_allocMem[adr]
let SPF(2)<pl.qus.wolin.SomeClass.pl.qus.wolin.SomeClass.__returnValue>[any*] = SPF(0)<pl.qus.wolin.allocMem.__returnValue>[uword]
setup HEAP = SPF(0)<pl.qus.wolin.allocMem.__returnValue>[uword]
free SPF<pl.qus.wolin.allocMem.__returnValue>, #2

     */
    // TODO
    // błąd optymalizatora!
    // kiedy do SP zapisujemy rejestr SPF, lub inny, to po napotkaniu alloc SPF musimy dodać do wektora tego rejestru n
    // a po napotkaniu free SPF musimy odjąć od wektora tego rejestru n!
    //
    // np:
    // let SP(0)<__wolin_reg18>[any*] = SPF(0)<pl.qus.wolin.main..testowa>[any*] // przez sprawdzacz typow - simple id from var
    // napotykamy alloc SPF, #3
    // więc w SP(0) powinno być teraz:
    // SPF(3)<pl.qus.wolin.main..testowa>[any*]




    /*


    fun main() {
        val a = 4
        val b = 8

        border = a+b
    }

function __wolin_pl_qus_wolin_main
let SPF(1)<pl.qus.wolin.main..a>[ubyte] = #4[ubyte]
let SPF(0)<pl.qus.wolin.main..b>[ubyte] = #8[ubyte]
alloc SP<__wolin_reg6>, #2
let SP(0)<__wolin_reg6>[ubyte*] = *53280[ubyte]
alloc SP<__wolin_reg7>, #1
add &SP(0)<__wolin_reg7>[ubyte] = &*SPF(1)<pl.qus.wolin.main..a>[ubyte], &*SPF(0)<pl.qus.wolin.main..b>[ubyte]
let &SP(1)<__wolin_reg6>[ubyte*] = &SP(0)<__wolin_reg7>[ubyte]
free SP<__wolin_reg7>, #3
free SPF<pl.qus.wolin.main.__fnargs>, #2
ret

reg6 - jedno podstawienie, a potem deref, więc:

function __wolin_pl_qus_wolin_main
let SPF(1)<pl.qus.wolin.main..a>[ubyte] = #4[ubyte]
let SPF(0)<pl.qus.wolin.main..b>[ubyte] = #8[ubyte]
alloc SP<__wolin_reg7>, #1
add &SP(0)<__wolin_reg7>[ubyte] = &*SPF(1)<pl.qus.wolin.main..a>[ubyte], &*SPF(0)<pl.qus.wolin.main..b>[ubyte]
let &53270[ubyte*] = &SP(0)<__wolin_reg7>[ubyte]
free SP<__wolin_reg7>, #3
free SPF<pl.qus.wolin.main.__fnargs>, #2
ret

sprawdzamy, czy któryś z podstawianych rejestrów jest targetem innej operacji, tutaj reg7

function __wolin_pl_qus_wolin_main
let SPF(1)<pl.qus.wolin.main..a>[ubyte] = #4[ubyte]
let SPF(0)<pl.qus.wolin.main..b>[ubyte] = #8[ubyte]
add &&53270[ubyte*] = &*SPF(1)<pl.qus.wolin.main..a>[ubyte], &*SPF(0)<pl.qus.wolin.main..b>[ubyte]
free SPF<pl.qus.wolin.main.__fnargs>, #2
ret

skoro a i b są val:

function __wolin_pl_qus_wolin_main
add &&53270[ubyte*] = &*#4, &*#8
free SPF<pl.qus.wolin.main.__fnargs>, #2
ret



Optumalizacja operatorów:



     */


    @JvmStatic
    fun main(args: Array<String>) {
// gradlew generateGrammarSource

//        val fi = File("//storage2/pron/obrazy/todo2/_rary")
//        val list = fi.list()
//        val katalogi = list.filter { !it.endsWith(".rar") }
//        val rary = list.filter { it.endsWith(".rar") }.map { it.dropLast(4) }
//        val rozpakowane = rary.filter { katalogi.contains(it) }
//        rozpakowane.forEach { File("//storage2/pron/obrazy/todo2/_rary/$it.rar").delete() }

        parseWolinek(FileInputStream(File("src/main/wolin/test.ktk")))

        optimize(
            FileInputStream(File("src/main/wolin/assembler.asm")),
            FileOutputStream(File("src/main/wolin/assembler_opt1.asm"))
        )

        // ciekawostka. Po ostatnich zmianach mamy:
        /*
        free SP<__wolin_reg5>, #2
        let &SP(-1)<__wolin_reg5>[ubyte*] = &#65[ubyte]

        więc to jest znak, że trzeba przesunąć to:

        let &SP(0)<__wolin_reg5>[ubyte*] = &#65[ubyte]
        free SP<__wolin_reg5>, #2

         */

        translateAsm(
            FileInputStream(File("src/main/wolin/assembler_opt1.asm")),
            FileInputStream(File("src/main/wolin/template.asm"))
        )

    }

    private fun optimize(asmStream: InputStream, outStream: OutputStream) {
        val asmLexer = PseudoAsmLexer(ANTLRInputStream(asmStream))
        val asmTokens = CommonTokenStream(asmLexer)
        val asmParser = PseudoAsmParser(asmTokens)
        val asmContext = asmParser.pseudoAsmFile()
        val visitor = OptimizerVisitor()

        // zebrać wszystkie rejestry
        visitor.gatherAllSPRegs(asmContext)
        // sprawdzić które kwalifikują się do usunięcia
        visitor.markSingleAssignmentRegs(asmContext)
        // tu można wygenerować ponownie plik tekstowy, pewnie nawet trzeba, tu się przesuwa funkcyjne rejestry
        visitor.replaceSingleAssignmentRegWithItsValue(asmContext)
        // sprawdzić, czy dany rejestr występuje tylko jako free/alloc +ew. let rejestr =, tylko odflaguje
        visitor.markRegIfStillUsed(asmContext)
        // usuwa oflagowane rejestry
        visitor.removeAndShiftArgs(asmContext)

        visitor.optimizeReverseAssigns(asmContext)
        visitor.replaceSingleAssignmentRegWithItsValue(asmContext)
        visitor.markRegIfStillUsed(asmContext)
        visitor.removeAndShiftArgs(asmContext)



        //visitor.markReplacablePointerTargets(asmContext)
        //visitor.removeAndShiftTargets(asmContext)


        visitor.sanitizeDerefs(asmContext)
        visitor.consolidateAllocs(asmContext)

        outStream.use {

            asmContext.linia().iterator().forEach {
                var linia = it.instrukcja().text + " "
                if (it.target(0) != null)
                    linia += "${it.target(0).text} = "

                if (it.arg(0) != null)
                    linia += it.arg(0).text

                if (it.arg(1) != null)
                    linia += ", ${it.arg(1).text}"

                outStream.write(linia.toByteArray())
                outStream.write(10)
            }
        }
    }

    private fun translateAsm(asmStream: InputStream, templateStream: InputStream) {
        val asmLexer = PseudoAsmLexer(ANTLRInputStream(asmStream))
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
                println("Syntax error in rule file")
                throw ex
            }
        }

        val ostream = BufferedOutputStream(FileOutputStream(File("src/main/wolin/assembler.s")))

        ostream.use {
            it.write(templateVisitor.state.dumpCode().toByteArray())
        }
    }


    private fun translateAsm(asmContext: PseudoAsmParser.PseudoAsmFileContext, templateStream: InputStream) {
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
                println("Syntax error in rule file")
                throw ex
            }
        }

        val ostream = BufferedOutputStream(FileOutputStream(File("src/main/wolin/assembler.s")))

        ostream.use {
            it.write(templateVisitor.state.dumpCode().toByteArray())
        }
    }


    private fun parseWolinek(istream: InputStream) {
        // Get our lexer
        val lexer = KotlinLexer(ANTLRInputStream(istream))

        // Get a list of matched tokens
        val tokens = CommonTokenStream(lexer)

        // Pass the tokens to the parser
        val parser = KotlinParser(tokens)

        // Specify our entry point
        val fileContext = parser.kotlinFile()

        val symbolsVisitor = WolinVisitor("test", Pass.SYMBOLS, tokens)

        val declarationVisitor = WolinVisitor("test", Pass.DECLARATION, tokens)

        val translationVisitor = WolinVisitor("test", Pass.TRANSLATION, tokens)

        //try {

        // przygotowanie

        println("== PASS 1 - gathering symbols ==")

        symbolsVisitor.visit(fileContext)

        println("== PASS 2 - type inference ==")

        // zebranie typów dla rejestrów
        val mainName = symbolsVisitor.state.findProc("main")// { it == "main" || it.endsWith(".main")}
        symbolsVisitor.state.copy(declarationVisitor.state)
        declarationVisitor.state.mainFunction = mainName

        declarationVisitor.visit(fileContext)
        declarationVisitor.appendLambdas()

        println("== PASS 3 - code generation ==")

        // właściwa translacja
        declarationVisitor.state.copy(translationVisitor.state)
        val wynik = translationVisitor.visit(fileContext)

        translationVisitor.appendLambdas()
        wynik.appendStatics()

        val ostream = BufferedOutputStream(FileOutputStream(File("src/main/wolin/assembler.asm")))

        ostream.use {
            it.write(wynik.dumpCode().toByteArray())
        }

        //println(wynik.dumpCode())
//        } catch (ex: Exception) {
//            println(ex.message)
//        }

    }
}
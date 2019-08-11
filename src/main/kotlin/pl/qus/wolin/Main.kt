package pl.qus.wolin

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import pl.qus.wolin.exception.NoRuleException
import java.io.*

object Main {
    /*

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



TRYBY ADRESOWANIA

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


try catch na podstawie
http://www.c64os.com/post?p=76


BUGI

 jmp ($xxFF) - fail, bo pobierze starszy bajt z $xx00


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



	1) scope funkcji

		pl.qus.Dupa.sum..a

	2) scope parametrów funkcji

		pl.qus.Dupa.sum.a

	3) scope obiektu

		pl.qus.Dupa.a - ustawiamy tej zmiennej stos na "HEAP"

	4) scope pliku

		pl.qus.a




OPTYMALIZACJE

Propozycja algorytmu:

1) wyszykujemy w całym pliku rejestry do wyrugowania i zapamiętujemy je

2) w kolejnym przejściu rugujemy rejestry, przesuwamy indeksy, zapisujemy plik i próbujemy ponownie


OGÓLNE:

przy wyrugowaniu rejestru wszystkie odwołania do rejestrów leżących POD NIM na stosie muszą mieć zmniejszane indeksy
o rozmiar tego rejestru aż do momentu, kiedy tenże rejestr byłby faktycznie zwolniony

np:

było:
alloc <r.temp13>, #n, ale usunęliśmy

po tym allocu
SP(x)<r.temp12> MUSI PRZEJść W: SP(x-n)<r.temp12>

odejmowanie kończymy, gdy napotkamy

free <r.temp13>




UWAGA: jeśli między allokacją a zwolnieniem jest skok do procedury, to trzeba dobrze to zbadać!

1. jeśli między allokacją i zwolnieniem rejestru SP nie ma do niego żadnego podstawienia - usunąć allokacje i zwolnienie.

2. jeśli między allokacją i zwolnieniem jest tylko jedno podstawienie do rejestru i jest to stała lub val, to używać wszędzie tej stałej zamiast rejestru:

alloc temp
let temp = #4
mul x = x, temp
add y = y, temp
free temp

daje:

mul x = x, #4
add y = y, #4

3. skonsolidować następujące po sobie W CIĄGU dealokacje/alllokacje (NIC nie moze byc miedzy nimi, zwlaszcza label):

freeSP<>,#4  // x = x+4
allocSP<>,#2 // x = x-2

// suma = 4 - 2 = 2 -> freeSP #2

freeSP<>,#2  // x = x-4
allocSP<>,#4 // x = x+2

// suma = -4 + 2 = -2 -> allocSP #2

allocSP,#1
allocSP,#1

// daje allocSP,#2

potem dla x mamy:

TXA
CLC
ADC #n
TAX

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


6. Ciekawy przypadek optymalizacji, rugując zmienną reg2 trzeba przenieść deallokację reg3:

label __wolin_pl_qus_wolin_test_main
alloc SP<__wolin_reg2>, #1 // for value that gets assigned to left side
alloc SP<__wolin_reg3>, #1 // arr_deref
let SP(0)<__wolin_reg3>[ubyte] = #5[ubyte] // atomic ex
let SP(1)<__wolin_reg2>[ubyte] = pl.qus.wolin.test.oneByteSmallArray[ptr], SP(0)<__wolin_reg3>[ubyte]
free SP<__wolin_reg3>, #1 // arr_deref
let __wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[ubyte] = SP(0)<__wolin_reg2>[ubyte] // przez sprawdzacz typów
free SP<__wolin_reg2>, #1 // for value that gets assigned to left side, type = ubyte
ret

dalej:

label __wolin_pl_qus_wolin_test_main
alloc SP<__wolin_reg3>, #1 // arr_deref
let SP(0)<__wolin_reg3>[ubyte] = #5[ubyte] // atomic ex
free SP<__wolin_reg3>, #1 // arr_deref ---> ZA WCZEŚNIE ZWALNIANE!!!
let __wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[ubyte] = pl.qus.wolin.test.oneByteSmallArray[ptr], SP(0)<__wolin_reg3>[ubyte]
ret

poprawka:

label __wolin_pl_qus_wolin_test_main
alloc SP<__wolin_reg3>, #1 // arr_deref
let SP(0)<__wolin_reg3>[ubyte] = #5[ubyte] // atomic ex
let __wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[ubyte] = pl.qus.wolin.test.oneByteSmallArray[ptr], SP(0)<__wolin_reg3>[ubyte]
free SP<__wolin_reg3>, #1 // arr_deref ---> PRZESUWAMY DEALLOKACJĘ
ret




TIPSY

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



Fajny opis z illegalami u Bo:

http://www.zimmers.net/anonftp/pub/cbm/documents/chipdata/64doc

Makra do długich skoków itp:

http://wilsonminesco.com/StructureMacros/

     */


    @JvmStatic
    fun main(args: Array<String>) {
// gradlew generateGrammarSource

        parseWolinek(FileInputStream(File("src/main/wolin/test.ktk")))

        translateAsm(
            FileInputStream(File("src/main/wolin/assembler.asm")),
            FileInputStream(File("src/main/wolin/template.asm"))
        )
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
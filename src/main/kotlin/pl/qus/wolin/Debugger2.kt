package pl.qus.wolin

import javafx.application.Platform
import javafx.beans.property.SimpleStringProperty
import org.apache.commons.net.telnet.TelnetClient
import pl.qus.wolin.Main.buildPath
import pl.qus.wolin.Main.labelFileName
import pl.qus.wolin.Main.listingFileName
import java.io.*
import java.net.ConnectException
import java.util.*
import kotlin.collections.HashMap

class Debugger2(val view: MyView): Thread() {
    val comments = HashMap<Int, String>()
    var debugging = true
    val state = CPUState()
    val spTop = 0x72
    val spfTop = 0x9fff
    var line = ""
    var shouldRun = true

    val sortedComments: SortedMap<Int, String> by lazy {
        comments.toSortedMap()
    }

    lateinit var telnetOstream: PrintStream
    lateinit var telnetIstream: InputStream

    override fun run() {
        loadSource()

        val telnet = TelnetClient()

        try {
            telnet.connect("127.0.0.1", 6510)
            telnetOstream = PrintStream(telnet.outputStream)
            telnetIstream = telnet.inputStream

            printAsm("Connected to VICE remote monitor")

            loadLabels()
            obtainRegState()

            //zsendCommand("break 081e")
            //sendCommand("x")

            printAsm("Session initialized")

            do {
                if (debugging) {
                    if(line!= "") {
                        val tokens = line.split(" ").map { it.trim() }

                        when (val command = tokens[0]) {
                            "x" -> {
                                discardIncoming()
                                debugging = false
                                printAsm("Giving baack control to VICE")
                                sendCommand(command)
                            }
                            else -> {
                                sendCommand(line)

                                printAsm(getOutputAndUpdate())
                                dumpSP()
                                dumpSPF()
                            }
                        }
                    }
                    line = ""
                }
                else {
                    debugging = telnetIstream.available() != 0
                    if(debugging) {
                        printAsm("entering interactive mode")
                        printAsm(getOutputAndUpdate())
                        obtainRegState()
                    }
                }
                yield()
            } while (shouldRun)
        }
        catch (ex: ExceptionInInitializerError) {
            printAsm("Problem z debuggerem")
        }
        catch (ex: ConnectException) {
            Platform.runLater {
                view.close()
            }
        }
        finally {
            if (telnet.isConnected)
                telnet.disconnect()

            printAsm("Debugger detached")
        }
    }


    private fun loadLabels() {
        sendCommand("""ll "$buildPath$labelFileName"  """)
        discardIncoming()
    }

    private fun loadSource() {
        try {
            File(buildPath, "$listingFileName").forEachLine {
                val wynik = parseListingLine(it)
                wynik?.let {
                    comments[wynik.first] = wynik.second
                }
            }

            Platform.runLater {
                view.sourceList.items.addAll(sortedComments.values)
            }

            printAsm("Source comments read succesfully")
        } catch (ex: IOException) {
            printAsm("Couldn't read source code, no comments will be available")
        }
    }





    fun setLineBreakpoint(tokens: List<String>) {
        if(tokens.size > 1) {
            val lineNo = tokens[1].toInt()
            val debugLine = comments.entries.firstOrNull {
                it.value.split(":").getOrNull(0)?.trim()?.toIntOrNull() == lineNo
            }
            //printAsm("Szukam linii $lineNo = $debugLine")

            debugLine?.let {
                printAsm("Setting breakpoint to: ${it.key}")
                sendCommand("break ${it.key.hex()}")
                discardIncoming()

            }
        }
    }

    fun sendCommand(command: String) {
        debugging = command.trim() != "x"

        telnetOstream.print("$command                                                                           \n")
        telnetOstream.flush()
    }

    fun discardIncoming() {
        while (telnetIstream.available() != 0) {
            telnetIstream.read()
        }
    }

    private fun readIncoming(): String {
        val sb = StringBuffer()

        sb.append(telnetIstream.read().toChar())

        print("readIncoming czeka na resztę...")

        while (telnetIstream.available() > 0) {
            val ch = telnetIstream.read().toChar()
            sb.append(ch)
            yield()
        }

        println("jest!")

        return sb.toString()
    }

    private fun readIncomingOrEmpty(): String {
        val sb = StringBuffer()

        while (isOutputAvailable()) {
            val ch = telnetIstream.read().toChar()
            sb.append(ch)
            yield()
        }

        return sb.toString()
    }

    fun getOutputAndUpdate(showComment: Boolean = true): String {
        val incoming = readIncomingOrEmpty()
        state.fromPrompt(incoming)
        showIn(state.toString(), view.cpuText)
        if(showComment) showComment()
        //println("Wychodzę z getOutputAndUpdate:'$incoming'")
        return incoming
    }

    fun isOutputAvailable(): Boolean {
        return if (telnetIstream.available() == 0) {
            Thread.sleep(250)
            telnetIstream.available() != 0
        } else
            true
    }



    fun obtainRegState() {
        discardIncoming()
        sendCommand("r")
        val reply = readIncoming()
        val lines = reply.split("\n")

        //            ADDR A  X  Y  SP 00 01 NV-BDIZC LIN CYC  STOPWATCH
        //val text = ".;e5cf 69 ff 10 f3 ff ff 00100010 000 001  934544521"
        val text = lines.firstOrNull { it.startsWith(".;") } ?: ".;0000 00 00 00 00 00 00 00000000 000 000  000000000"

        if(text.startsWith(".;0000")) println("ZONK: obtainRegState dostał '${reply}'")

        state.regsFromDump(text)
        showIn(state.toString(), view.cpuText)
    }

    fun dumpSP() {
        discardIncoming()
        obtainRegState()

        var razem = "ZP stack: $${state.x.hex()} - ${spTop.hex()} size: ${spTop - state.x}\n"

        razem += if(spTop - state.x > 0) {
            sendCommand("m ${state.x.hex()} ${(spTop-1).hex()}")
            getOutputAndUpdate()
        } else {
            "Empty"
        }
        showIn(razem, view.spText)
    }

    fun dumpSPF() {
        discardIncoming()
        sendCommand("m fb fc")

        val reply = readIncoming()

        val lines = reply.split("\n")

        val text = lines.firstOrNull { it.startsWith(">") } ?: ">C:0070  00 00  "

        val pattern = ">.:....  (..) (..)".toRegex()

        val match = pattern.find(text)

        val lo = Integer.parseInt(match?.groupValues?.get(1) ?: "0", 16)
        val hi = Integer.parseInt(match?.groupValues?.get(2) ?: "0", 16)
        val bottom = hi * 256 + lo

        val stackSize = spfTop - bottom

        var razem = "Function stack: ${bottom.hex()} - ${spfTop.hex()} size: ${stackSize}\n"

        razem += if(stackSize > 0) {
            sendCommand("m ${bottom.hex()} ${(spfTop-1).hex()}")
            getOutputAndUpdate()
        } else {
            "empty"
        }
        showIn(razem, view.spfText)
    }

    fun parseListingLine(linia: String):Pair<Int, String>? {
        // 000810  1               ; prepare function stack
        return try {
            if (linia[24] == ';') {
                val adr = Integer.parseInt(linia.substring(0, 6), 16)
                Pair(adr, linia.substring(25))
            } else null
        } catch (ex: Exception) {
            null
        }
    }

    fun showComment() {
        var linia = 0


        while (linia < sortedComments.keys.size) {
            val obecny = sortedComments.keys.elementAtOrNull(linia)
            val następny = sortedComments.keys.elementAtOrNull(linia + 1)

            //println("Szukam: ${state.pc.hex()}, mam: ${obecny?.hex()}, ${następny?.hex()}")
            if (obecny == state.pc) {
                //printAsm("${obecny.value}")
                highlightSource(linia)
                break
            } else if (obecny != null && następny != null && obecny > state.pc && następny < state.pc) {
                highlightSource(linia)
                break
            }
            linia ++
        }
    }

    fun highlightSource(linia: Int) {
        Platform.runLater {
            view.sourceList.scrollTo(linia)
            view.sourceList.selectionModel.select(linia)
        }
    }

    fun sendCommandAsync(s: String) {
        line = s
    }

    fun showIn(s: String?, prop: SimpleStringProperty) {
        s?.let {
            Platform.runLater {
                prop.set(s)
            }
        }
    }

    fun printAsm(s: String?) {
        s?.let {
            val linie = s.split("\n")//.filter { !it.startsWith("(C:") }
            Platform.runLater {

                view.debugList.items.addAll(linie)
                view.debugList.scrollTo(view.debugList.items.size-1)
            }
        }
    }

    class CPUState {
        var a: Int = 0
        var x: Int = 0
        var y: Int = 0
        var sp: Int = 255
        var neg: Boolean = false
        var over: Boolean = false
        var bk: Boolean = false
        var dec: Boolean = false
        var ints: Boolean = false
        var zero: Boolean = false
        var carru: Boolean = false
        var pc: Int = 0


        override fun toString(): String {
            var razem = "PC = $pc (${pc.hex()})\nA = $a (${a.hex()})\nX = $x (${x.hex()})\nY = $y (${y.hex()})\n"
            if(neg) razem += "NEGATIVE "
            if(over) razem += "OVERFLOW "
            if(bk) razem += "BREAK "
            if(dec) razem += "DECIMAL "
            if(ints) razem += "BLOCK_INTERRUPTS "
            if(zero) razem += "ZERO "
            if(carru) razem += "CARRY "

            return razem
        }

        fun fromPrompt(prompt: String) {
            if(prompt.contains(".C:")) {
                val pcPosition = prompt.lastIndexOf(".C:")
                pc = try {
                    Integer.parseInt(prompt.substring(pcPosition + 3, pcPosition + 7), 16)
                } catch (ex: java.lang.Exception) {
                    pc
                }
            }
        }

        fun regsFromDump(text: String) {
            val pattern = ".;.... (..) (..) (..) (..) (..) (..) (........) +".toRegex()

            val match = pattern.find(text)

            a = Integer.parseInt(match?.groupValues?.get(1) ?: "0", 16)
            x = Integer.parseInt(match?.groupValues?.get(2) ?: "0", 16)
            y = Integer.parseInt(match?.groupValues?.get(3) ?: "0", 16)
            sp = Integer.parseInt(match?.groupValues?.get(4) ?: "0", 16)
            val r = match?.groupValues?.get(7) ?: "????????"

            // NV-BDIZC
            neg = r[0] == '1'
            over = r[1] == '1'
            bk = r[3] == '1'
            dec = r[4] == '1'
            ints = r[5] == '1'
            zero = r[6] == '1'
            carru = r[7] == '1'
        }
    }
    /*

https://vice.pokefinder.org/doc/vice_12.html#SEC269

    Szybka ściąga:


m xx 72
>C:0060  00 0a 76 a3  19 00 20 00  00 80 00 00  00 04 00 76   ..v... ........v
>C:0070  00 80 a3                                             ...
(C:$0073)

m xx+n xx+n+data_size-1 // zrzut danej n na stosie
m 61 62
>C:0061  0a 76                                                .v
(C:$0063)

m fb fc // szczyt stosu spf
>C:00fb  00 00                                                ..
(C:$00fd)

m bbaa 9fff          // zrzut stosu SPF
m 9f80 9fff
>C:9f80  00 00 ff ff  ff ff 00 00  00 00 ff ff  ff ff 00 00   ................
>C:9f90  00 00 ff ff  ff ff 00 00  00 00 ff ff  ff ff 00 00   ................
>C:9fa0  00 00 ff ff  ff ff 00 00  00 00 ff ff  ff ff 00 00   ................
>C:9fb0  00 00 ff ff  ff ff 00 00  00 00 ff ff  ff ff 00 00   ................
>C:9fc0  00 00 ff ff  ff ff 00 00  00 00 ff ff  ff ff 00 00   ................
>C:9fd0  00 00 ff ff  ff ff 00 00  00 00 ff ff  ff ff 00 00   ................
>C:9fe0  00 00 ff ff  ff ff 00 00  00 00 ff ff  ff ff 00 00   ................
>C:9ff0  00 00 ff ff  ff ff 00 00  00 00 ff ff  ff ff 00 00   ................
(C:$a000)

>C:9ffb  40 00 af 08  52
m bbaa+yy bbaa+yy+data_size // zrzut danej n na stosie SPF

     */
}

fun Int.hex(): String {
    return Integer.toHexString(this)
}
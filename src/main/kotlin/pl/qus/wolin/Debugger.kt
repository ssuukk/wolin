package pl.qus.wolin

import org.apache.commons.net.telnet.TelnetClient
import java.io.*

object Debugger {
    val comments = HashMap<Int, String>()
    var interactive = true
    val state = CPUState()
    val spTop = 0x72 - 1
    val spfTop = 0x9fff - 1
    val buildPath = "D:\\Projekty\\kotlinek\\src\\main\\wolin\\"
    val objectName = "assembler"

    lateinit var telnetOstream: PrintStream
    lateinit var telnetIstream: InputStream


    fun start() {
        try {
            File(buildPath, "$objectName.lst").forEachLine {
                parseListingLine(it)
            }
            println("Source comments read succesfully")
        } catch (ex: IOException) {
            println("Couldn't read source code, no comments will be available")
        }

        val telnet = TelnetClient()

        try {
            telnet.connect("127.0.0.1", 6510)
            telnetOstream = PrintStream(telnet.outputStream)
            telnetIstream = telnet.inputStream

            println("Connected to VICE remote monitor")

            loadLabels()
            syncState()
            //zsendCommand("break 081e")
            sendCommand("x")

            println("Session initialized")

            val userInputReader = BufferedReader(InputStreamReader(System.`in`))

            do {
                var command = ""
                if (interactive) {
                    do {
                        syncState()
                        val line = userInputReader.readLine()
                        val tokens = line.split(" ").map { it.trim() }
                        command = tokens[0]

                        when (command) {
                            "quit" -> {
                                // nic
                            }
                            "x" -> {
                                interactive = false
                                println("Giving baack control to VICE")
                                sendCommand(command)
                            }
                            "sp" -> {
                                dumpSP()
                            }
                            "spf" -> {
                                dumpSPF()
                            }
                            "stacks" -> {
                                dumpSP()
                                dumpSPF()
                            }
                            "lbreak" -> {
                                setLineBreakpoint(tokens)
                            }
                            else -> {
                                sendCommand(line)
                                processIncoming()
                            }
                        }
                    } while (command != "quit" && command != "x")
                }
                else {
                    interactive =
                        isOutputAvailable(telnetIstream)
                    if(interactive) {
                        println("entering interactive mode")
                        processIncoming()
                    }
                }
            } while (command != "quit")
        } catch (ex: ExceptionInInitializerError) {
            println("Problem z debuggerem")
        } finally {
            if (telnet.isConnected)
                telnet.disconnect()

            println("Debugger detached")
        }
    }

    fun processIncoming(showComment: Boolean = true) {
        val prompt =
            getOutput(telnetIstream)
        state.fromPrompt(prompt)
        if(showComment) state.showComment()
        print(prompt)
    }

    private fun setLineBreakpoint(tokens: List<String>) {
        if(tokens.size > 1) {
            val lineNo = tokens[1].toInt()
            val debugLine = comments.entries.firstOrNull {
                it.value.split(":").getOrNull(0)?.trim()?.toIntOrNull() == lineNo
            }
            println("Szukam linii $lineNo = $debugLine")

            debugLine?.let {
                println("Setting breakpoint to: ${it.key}")
                sendCommand("break ${it.key.hex()}")
                flushIncoming()

            }
        }
    }

    fun sendCommand(command: String) {
        telnetOstream.print("$command                                                                           \n")
        telnetOstream.flush()
    }

    fun flushIncoming() {
        while (isOutputAvailable(telnetIstream)) {
            telnetIstream.read()
        }
    }

    fun getOutput(istream: InputStream): String {
        val sb = StringBuffer()

        while (isOutputAvailable(istream)) {
            val ch = istream.read().toChar()
            sb.append(ch)
        }

        return sb.toString()
    }

    fun isOutputAvailable(istream: InputStream): Boolean {
        return if (istream.available() == 0) {
            Thread.sleep(250)
            istream.available() != 0
        } else
            true
    }

    fun loadLabels() {
        sendCommand("""ll $buildPath$objectName.lbl"  """)
        flushIncoming()
    }

    fun syncState() {
        flushIncoming()
        sendCommand("r")
        val reply =
            getOutput(telnetIstream)
        val lines = reply.split("\n")

        //            ADDR A  X  Y  SP 00 01 NV-BDIZC LIN CYC  STOPWATCH
        //val text = ".;e5cf 69 ff 10 f3 ff ff 00100010 000 001  934544521"
        val text = lines.firstOrNull { it.startsWith(".;") } ?: ".;0000 00 00 00 00 00 00 00000000 000 000  000000000"
        state.fromPattern(text)
    }

    fun dumpSP() {
        flushIncoming()
        syncState()
        println("ZP stack: ${state.x} - $spTop size: ${spTop - state.x+1}")
        if(spTop - state.x > 0) {
            sendCommand("m ${state.x.hex()} ${spTop.hex()}")
            processIncoming(false)
        }
    }

    fun dumpSPF() {
        flushIncoming()
        sendCommand("m fb fc")

        val reply =
            getOutput(telnetIstream)
        val lines = reply.split("\n")

        val text = lines.firstOrNull { it.startsWith(">") } ?: ">C:0070  00 00  "

        val pattern = ">.:....  (..) (..)".toRegex()

        val match = pattern.find(text)

        val lo = Integer.parseInt(match?.groupValues?.get(1) ?: "0", 16)
        val hi = Integer.parseInt(match?.groupValues?.get(2) ?: "0", 16)
        val bottom = hi * 256 + lo

        println("Function stack: $bottom - $spfTop size: ${spfTop - bottom+1}")

        if(spfTop - bottom > 0) {
            sendCommand("m ${bottom.hex()} ${spfTop.hex()}")
            processIncoming(false)
        }
    }

    fun parseListingLine(linia: String) {
        // 000810  1               ; prepare function stack
        try {
            if (linia[24] == ';') {
                val adr = Integer.parseInt(linia.substring(0, 6), 16)
                comments[adr] = linia.substring(25)
            }
        } catch (ex: Exception) {

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

        fun showComment() {
            var currentPc = pc
            if(comments[currentPc]!=null)
                println(comments[currentPc])
            else {
                currentPc --
                do {
                    if(comments[currentPc] != null) {
                        println("${comments[currentPc]} (contd.)")
                        break
                    }
                    currentPc --
                } while (currentPc > 0)
            }
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

        fun fromPattern(text: String) {
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

fun Int.hex(): String = Integer.toHexString(this)
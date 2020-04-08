package pl.qus.wolin.exception

import org.apache.commons.net.telnet.TelnetClient
import java.io.*

object Debugger {

    var interactive = false
    val state = State()
    val spTop = 0x72 - 1
    val spfTop = 0x9fff - 1

    fun start() {
        val telnet = TelnetClient()

        try {
            telnet.connect("127.0.0.1", 6510)

            println("Telnet otwartyy")

            val telnetOstream = PrintStream(telnet.outputStream)
            val telnetIstream = telnet.inputStream
            val userInputReader = BufferedReader(InputStreamReader(System.`in`))

            loadLabels(telnetIstream, telnetOstream)
            extractRegisters(telnetIstream, telnetOstream)
            sendCommand("break 0810", telnetOstream)
            flush(telnetIstream)

            sendCommand("x", telnetOstream)

            do {
                var command = ""
                if (interactive) {
                    do {
                        print(awaitReply(telnetIstream))

                        extractRegisters(telnetIstream, telnetOstream)

                        command = userInputReader.readLine().trim()

                        when (command) {
                            "quit" -> {
                                // nic
                            }
                            "x" -> {
                                interactive = false
                            }
                            "sp" -> {
                                dumpSP(telnetIstream, telnetOstream)
                            }
                            "spf" -> {
                                dumpSPF(telnetIstream, telnetOstream)
                            }
                            else -> {
                                sendCommand(command, telnetOstream)
                            }
                        }
                    } while (command != "quit" && command != "x")
                }
                else {
                    interactive = dataAvailable(telnetIstream)
                    if(interactive)
                        println("entering interactive mode")
                }
            } while (command != "quit")


        } catch (ex: Exception) {
            println("Problem z debuggerem")
        } finally {
            if (telnet.isConnected)
                telnet.disconnect()

            println("Zamykam soket")
        }

    }

    fun sendCommand(command: String, out: PrintStream) {
        out.print("$command                                                                           \n")
        out.flush()
    }

    fun flush(istream: InputStream) {
        while (dataAvailable(istream)) {
            istream.read()
        }
    }

    fun awaitReply(istream: InputStream): String {
        val sb = StringBuffer()

        while (dataAvailable(istream)) {
            val ch = istream.read().toChar()
            sb.append(ch)
        }

        return sb.toString()
    }

    fun dataAvailable(istream: InputStream): Boolean {
        return if (istream.available() == 0) {
            Thread.sleep(250)
            istream.available() != 0
        } else
            true
    }

    fun loadLabels(telnetIstream: InputStream, telnetOstream: PrintStream) {
        sendCommand("""ll "D:\Projekty\kotlinek\src\main\wolin\labels.txt"  """, telnetOstream)
        flush(telnetIstream)
    }

    fun extractRegisters(telnetIstream: InputStream, telnetOstream: PrintStream) {
        flush(telnetIstream)
        sendCommand("r", telnetOstream)
        val reply = awaitReply(telnetIstream)
        val lines = reply.split("\n")

        //            ADDR A  X  Y  SP 00 01 NV-BDIZC LIN CYC  STOPWATCH
        //val text = ".;e5cf 69 ff 10 f3 ff ff 00100010 000 001  934544521"
        val text = lines.firstOrNull { it.startsWith(".;") } ?: ".;0000 00 00 00 00 00 00 00000000 000 000  000000000"
        state.fromPattern(text)
    }

    fun dumpSP(telnetIstream: InputStream, telnetOstream: PrintStream) {
        flush(telnetIstream)
        extractRegisters(telnetIstream, telnetOstream)
        println("SP: ${state.x} - $spTop size: ${spTop - state.x+1}")
        if(spTop - state.x > 0)
            sendCommand("m ${state.x.hex()} ${spTop.hex()}", telnetOstream)
    }

    fun dumpSPF(telnetIstream: InputStream, telnetOstream: PrintStream) {
        flush(telnetIstream)
        sendCommand("m fb fc", telnetOstream)

        val reply = awaitReply(telnetIstream)
        val lines = reply.split("\n")

        val text = lines.firstOrNull { it.startsWith(">") } ?: ">C:0070  00 00  "

        val pattern = ">.:....  (..) (..)".toRegex()

        val match = pattern.find(text)

        val lo = Integer.parseInt(match?.groupValues?.get(1) ?: "0", 16)
        val hi = Integer.parseInt(match?.groupValues?.get(2) ?: "0", 16)
        val bottom = hi * 256 + lo

        println("SPF: $bottom - $spfTop size: ${spfTop - bottom+1}")

        if(spfTop - bottom > 0)
            sendCommand("m ${bottom.hex()} ${spfTop.hex()}", telnetOstream)

    }

    class State {
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
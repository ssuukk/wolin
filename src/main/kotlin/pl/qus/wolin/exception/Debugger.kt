package pl.qus.wolin.exception

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Exception
import java.net.Socket

object Debugger {
//    val socket = Socket("127.0.0.1", 6510)
//    val writer = socket.getOutputStream()
//    val bufWriter = BufferedWriter(OutputStreamWriter(writer))
//    val reader = socket.getInputStream()
//    val bufReader = BufferedReader(InputStreamReader(reader))
//
//    fun start() {
//        try {
//            sendCommand("ewed")
//            //getOutput()
//        } catch (ex: Exception) {
//            println("Problem z debuggerem")
//        }
//
//        socket.close()
//    }
//
//    fun sendCommand(comm: String) {
//        println("Debugger ok")
//        bufWriter.write("d $0800 $0900")
//        bufWriter.newLine()
//    }
//
//    fun getOutput() {
//        println("Debugger ok")
//        println("Probuje pobrac linie")
//        val x = reader.read()
//        //val wynik = bufReader.readLine()
//        println("::::::::::::$x")
//    }

    /*

    Szybka ściąga:

    m x 72 - zrzut stosu SP
    m fb fc - szczyt stosu SPF


d                     // zrzut rejestrów
<linia opisu>
.;0829 aa xx yy sp 00 01 NV-BDIZC LIN CYC
m xx 72              // zrzut stosu SP
>C:0070  00 06 a3
m xx+n xx+n+data_size // zrzut danej n na stosie

m fb fc              // szczyt stosu SPF
>C:00fb  aa bb
m bbaa 9fff          // zrzut stosu SPF
>C:9ffb  40 00 af 08  52
m bbaa+yy bbaa+yy+data_size // zrzut danej n na stosie SPF
d
<linia opisu>
.;0829 aa xx yy sp 00 01 NV-BDIZC LIN CYC
     */
}
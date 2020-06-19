package pl.qus.wolin.pl.qus.wolin.steps

import pl.qus.wolin.Main.buildPath
import pl.qus.wolin.WolinStateObject
import java.io.*


abstract class CompilerProcess {
    var inputName: String = ""
    var outputName: String = ""
    var state: WolinStateObject? = null

    fun chain(next: CompilerProcess, oName: String): CompilerProcess {
        next.inputName = outputName
        next.outputName = oName
        next.state = state
        next.execute()
        return next
    }

    fun execute() {
        val istream = FileInputStream(File("$buildPath$inputName"))
        val ostream = FileOutputStream(File("$buildPath$outputName"))

        process(istream, ostream)

        try {
            istream.close()
        } catch (ex: IOException) {
        }
        try {
            ostream.close()
        } catch (ex: IOException) {
        }
    }

    abstract fun process(istream: InputStream, ostream: OutputStream)
}

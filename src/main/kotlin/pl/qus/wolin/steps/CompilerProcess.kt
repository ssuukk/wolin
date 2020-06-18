package pl.qus.wolin.pl.qus.wolin.steps

import pl.qus.wolin.WolinStateObject
import java.io.*


abstract class CompilerProcess {
    var inputName: String = ""
    var outputName: String = ""
    var state: WolinStateObject? = null

    companion object {
        val workDir = "src/main/wolin/"
    }

    fun chain(next: CompilerProcess, oName: String): CompilerProcess {
        next.inputName = outputName
        next.outputName = oName
        next.state = state
        next.execute()
        return next
    }

    fun execute() {
        val istream = FileInputStream(File("$workDir$inputName"))
        val ostream = FileOutputStream(File("$workDir$outputName"))

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

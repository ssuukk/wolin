package pl.qus.wolin

import javafx.application.Platform
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.scene.control.*
import javafx.scene.layout.VBox
import javafx.scene.text.Font
import org.apache.commons.net.telnet.TelnetClient
import tornadofx.*
import java.io.PrintStream
import kotlin.system.exitProcess

class MyApp : App(MyView::class)

class MyView : View() {
    companion object {
        const val inputFieldId = "inputField"
    }

    override val root: VBox by fxml()

    val spDump: TextArea by fxid()
    val spfDump: TextArea by fxid()
    val cpuDump: TextArea by fxid()
    val commandLine: TextField by fxid()
    val debugList: ListView<String> by fxid()
    val sourceList: ListView<String> by fxid()

    val stepOver: Button by fxid()
    val stepInto: Button by fxid()
    val doContinue: Button by fxid()

    val inputText = SimpleStringProperty()
    val spText = SimpleStringProperty()
    val spfText = SimpleStringProperty()
    val cpuText = SimpleStringProperty()

    val debugger = Debugger2(this)

    val data = FXCollections.observableArrayList<String>()

    override fun onDock() {
        currentWindow?.onHidingProperty()?.onChangeOnce {
            debugger.shouldRun = false
            exit()
        }
    }

    override fun onBeforeShow() {
        super.onBeforeShow()

        stepOver.setOnAction {
            processCommand("n")
        }
        stepInto.setOnAction {
            processCommand("z")
        }
        doContinue.setOnAction {
            processCommand("x")
        }

        spDump.bind(spText)
        spfDump.bind(spfText)
        cpuDump.bind(cpuText)
        commandLine.bind(inputText)
        commandLine.setOnAction {
            val command = commandLine.text
            commandLine.text = ""
            processCommand(command)
        }
        debugList.items = data


//        debugList.setCellFactory {
//            object: ListCell<String>() {
//                override fun updateItem(item: String?, empty: Boolean) {
//                    super.updateItem(item, empty)
//
//                    if(item != null) {
//                        text = item
//                        font = Font("Consolas", 12.0)
//                    }
//                }
//            }
//        }

        debugger.start()

    }


    private fun processCommand(line: String) {
        val tokens = line.split(" ").map { it.trim() }

        when (tokens[0]) {
            "quit" -> {
                debugger.shouldRun = false
                exit()
            }
            "lbreak" -> {
                debugger.setLineBreakpoint(tokens)
            }
            else -> {
                debugger.sendCommandAsync(line)
            }
        }
    }


    fun exit() {
        Platform.exit()
        exitProcess(0)
    }
}
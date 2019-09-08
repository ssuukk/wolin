package pl.qus.wolin.components

import java.lang.Exception
import java.util.*

class AssignEntry {
    internal lateinit var left: Zmienna
    internal lateinit var right: Zmienna
    var isArray: Boolean = false
}

class AssignStack : Stack<AssignEntry>() {
    var assignLeftSideVar: Zmienna
        get() = peek().left
        set(value) { peek().left = value }

    var assignRightSideFinalVar: Zmienna
        get() = peek().right
        set(value) { peek().right = value }

    var arrayAssign: Boolean
        get() = peek().isArray
        set(value) { peek().isArray = value }

    val processingLeftSide: Boolean
        get() {
            val leftOk = try {
                assignLeftSideVar
                true
            } catch (ex: Exception) { false }
            val rithBlank = try {
                assignLeftSideVar
                false
            } catch (ex: Exception) { true }

            return leftOk && rithBlank
        }
}

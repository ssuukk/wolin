package pl.qus.wolin.components

import java.util.*

class AssignStack : Stack<Triple<Zmienna, Zmienna, Boolean>>() {
    val assignLeftSideVar: Zmienna
        get() = peek().first

    val assignRightSideFinalVar: Zmienna
        get() = peek().second

    val arrayAssign: Boolean
        get() = peek().third
}

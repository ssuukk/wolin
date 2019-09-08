package pl.qus.wolin.components

import pl.qus.wolin.SpecStack

open class Klasa(val name: String)
{
    val children = mutableListOf<Klasa>()

    val uniqId get() = heap.peek().immediateValue

    val heap = SpecStack("HEAP")

    open fun hasChild(childName: String): Boolean = children.any { it.name == childName || it.hasChild(childName) }

    fun toHeapAndVariablary(zmienna: Zmienna) {
        if (!heap.any { it.name == zmienna.name })
            heap.push(zmienna)
    }
}

class AnyKlasa(): Klasa("any") {
    override fun hasChild(dummy: String): Boolean = true
}
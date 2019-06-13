package pl.qus.kotlinek.components

import pl.qus.kotlinek.SpecStack

class Klasa(val name: String)
{
    val children = mutableListOf<Klasa>()

    val uniqId get() = heap.peek().immediateValue

    val heap = SpecStack("HEAP")

    fun hasChild(childName: String): Boolean = children.any { it.name == childName || it.hasChild(childName) }

    fun toHeapAndVariablary(zmienna: Zmienna) {
        if (!heap.any { it.name == zmienna.name })
            heap.push(zmienna)
    }
}
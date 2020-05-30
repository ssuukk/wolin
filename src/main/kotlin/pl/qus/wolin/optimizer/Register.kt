package pl.qus.wolin.pl.qus.wolin.optimizer

import pl.qus.wolin.PseudoAsmParser

class Register (
    var numer: Int = -1,
    var wielkość: Int = -1,
    var canBeRemoved: Boolean = true, // czy naprawdę można go usunąć
    var argContext: List<PseudoAsmParser.ArgContext>? = null, // jaką zawiera wartość
    var targetContext: PseudoAsmParser.TargetContext? = null, // jaką zawiera wartość
    var name: String = ""
){
    override fun toString(): String {
        return "reg $name $numer, canBeRemoved=$canBeRemoved, content1=${argContext?.getOrNull(0)?.text}, content2=${argContext?.getOrNull(1)?.text}"
    }
}

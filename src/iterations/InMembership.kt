package iterations

fun isLetter (c : Char) : Boolean =  (c in 'a'..'z' || c in 'A'..'Z')
fun isNotDigit (c :Char) : Boolean = (c !in '0'..'9')

fun main (args :Array<String>){
    println (isLetter ('q') )
    println (isNotDigit ('q') )
    println (recognize('&'))
}

fun recognize (c : Char) = when (c){
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter."
    else -> "I don't know..."
}
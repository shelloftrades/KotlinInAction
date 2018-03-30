package smartcasts

import smartcasts.ExpressIF.*

fun eval (e: ExpressIF) : Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval (e.right) + eval (e.left)
        else -> throw IllegalArgumentException ("Unknown expression")
    }

fun evalWithLogging (e: ExpressIF) : Int =
    when (e) {
        is Num -> {
            println ("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging (e.left)
            val right = evalWithLogging (e.right)
            println ("sum: $left + $right ")
            left + right
        }
        else -> throw IllegalArgumentException ("Unknown expression")
    }

fun main( args: Array<String>) {
    println (eval (Sum (Sum (Num (1), Num (2)), Num (4) ) ) )
    println (evalWithLogging (Sum (Sum (Num (1), Num (2)), Num (4) ) ) )
}
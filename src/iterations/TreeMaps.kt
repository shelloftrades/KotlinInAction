package iterations

import java.util.*

val binaryReps = TreeMap<Char, String>()

fun main (args :Array<String>) {
    for (c in 'A'..'F') {  // traverse from A -> F
        val binary = Integer.toBinaryString (c.toInt())   // converts ASCII code to Binary
        binaryReps[c] = binary        // insert key, values in the map
    }

    for ((key, value) in binaryReps ) {   // retrieves value from the TreeMap
        println ("$key = $value")
    }
}
package collections

import collections.joinToString


val set = hashSetOf(1, 7, 53, 54, 78, 95)
val morelist = arrayListOf(1, 7, 53, 88, 99, 100, 42)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

val strings = listOf("first", "second", "fourteenth")
val numbers = listOf(1, 14, 2, 89, 56, -11, 352)



fun main (args :Array<String>) {
    val list = listOf (1, 2, 3)

    println (morelist.max())
    println (morelist.last())

    // Any collections will do.
    println (strings.joinToString (strings))
    println (numbers.joinToString (numbers) )
    println (list.joinToString (list, "; ", "(", ")" ))
    println (set.joinToString (set, "; ", "(", ")" ))

    println (strings.last ())
    println (numbers.last ())
    println (set.javaClass)
    println (list.javaClass)
    println (map.javaClass)

    println (set)
    println (list)
    println (map)
    println (strings)
    println (numbers)

}
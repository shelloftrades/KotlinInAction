package collections

fun main (args: Array<String>) {
    
    val list = listOf(2, 4, 6, 8)
    
    val parm_list = listOf ("args: ", *args) //varargs, unpacking in kotlin
    println (parm_list)

    val maps = mapOf (1 to "one", 7 to "seven", 53 to "fifty-three") // "to" is an infix call


}
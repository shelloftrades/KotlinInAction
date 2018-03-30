package functionalApis

fun main (args : Array<String>) {

    val list = listOf (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    print(list.filter { it % 2 == 0 })
}
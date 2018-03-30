class Person1 (
        val name : String,
        val isMarried : Boolean
)

fun main (args: Array<String>) {
    val person = Person1("Philip", true)

    println(person.name)
    println(person.isMarried)
}
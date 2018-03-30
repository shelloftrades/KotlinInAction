data class Sample (
        val name: String,
        val age: Int? = null
)

fun main (args : Array<String>) {
    val persons = listOf (  Sample ("Juan"),
                            Sample ("Anna", 34),
                            Sample ("Shiela", 26),
                            Sample ("Aoki", 195)
                )
    // Lambda expression
    val oldest = persons.maxBy { it.age ?: 0 }
    println ("The oldest is: $oldest")
}
package lambdas

data class MyPerson (
        val name: String,
        val age: Int,
        val weight: Int? = null,  // kilogram
        val height: Int? = null  // centimeters
) {

}


fun printMessagesWithPrefix (messages :Collection<String>, prefix :String) {
    
    // Takes as an argument a lambda specifying what do with each element.
    messages.forEach {
        println ("$prefix $it") // Access the prefix parameter in the lambda.
    }
}

fun printProblemCounts (responses : Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    
    responses.forEach {
        if (it.startsWith ("4")) {
            clientErrors++
        }
        else if (it.startsWith ("5")) {
            serverErrors++
        }
    }
    println ("$clientErrors client errors, $serverErrors server errors")
}


fun MyPerson.isAdult() = age >= 21

fun salute() = println("hola shiela")

fun sendEmail(p :MyPerson, msg : String){
    println("Hi $p, im sending a $msg to your email")
}

val sum = {x :Int, y : Int -> x * y }

fun main (args : Array<String>) {
    // calls the lambda directly
    { println (79) } ()
    run {println (32)}

    // calls the lambda stored in the variable
    println (sum (5, -65))

    val persons = listOf (
            MyPerson ("Juan", 11),
            MyPerson ("Anna", 34, 89, 175 ),
            MyPerson ("Vincent", 26, 55, 165),
            MyPerson ("Hiroake", 106, 42, 145 ),
            MyPerson ("Sebastian", 59, 77, 180 ),
            MyPerson ("Ching", 19, 54, 150 ),
            MyPerson ("Mark", 15, 61, 153)
    )

    // Lambda expression
    val oldest = persons.maxBy { it.age ?: 0 }  // Equals to: val old = persons.maxBy ({ per : MyPerson -> per.age })

    println("$oldest")


    //val namesCombine = persons.joinToString(" ", transform = {p :MyPerson -> p.name } )
    val namesCombine = persons.joinToString (" ") { p :MyPerson -> p.name }
    println(namesCombine)

    // lambdas with multiple statements:
    val sum = { x :Int, y :Int ->
        println ("Computing the sum of $x and $y...")
        x + y
    }
    println (sum (10, 64))

    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Errors: ")

    val responses = listOf ("200 OK",
                            "418 I'm a teapot",
                            "500 Internal Server Error")
    printProblemCounts(responses)

    var counter = 0 // non-final variables
    val inc = { counter++ } // the reference of the wrapper is stored in a lambda to be "captured"


//    val agehere = MyPerson::age
//    val sameAge = {person :MyPerson -> person.age} // lambdas that does the same as above
 //   run (::salute)
    val action =  { person : MyPerson, message :String -> sendEmail (person, message)}

    val nextaction = ::sendEmail


    val createPersion = ::MyPerson
    val p = createPersion ("toto", 2, 1, 0)
    print(p)


}



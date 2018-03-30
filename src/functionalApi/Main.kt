package functionalApi

/**
 * Data members: people and list of numbers.
 */
val people =  listOf(
        Person("Alice", 9),
        Person("Bob", 31),
        Person("Maria", 40)
)
val list = listOf(1, 2, 4, 7, 9, 14, 28)

/**
 * Main method
 */
fun main (args : Array<String>){
    filterList()
    mapTheList()
    olderThan30()
    listNamesOnly()
    namesOlderThan50()
    oldestPerson()
    oldestPersonName()

    people.map(Person::name).filter { it.startsWith("A") }

}
fun oldestPersonName(){
    print("oldestPersonName:")
    val maxAge = people.maxBy(Person::age)
    people.filter { it.age.equals(maxAge) }.map(Person::name)

    println()
}

fun oldestPerson(){
    print("oldestPerson:")
    // return the oldest person on the group
    println(people.maxBy{ it.age })
}

fun namesOlderThan50() {

    print("namesOlderThan50:")
    // lists print the names older than 50
    println(people.filter { it.age >=30 }.map { it.name })

}

fun listNamesOnly(){

    print("listNamesOnly:")
        // list only the names of people from the list
    println(people.map { it.name })
    println(people.map(Person::name))
    println(people.map(Person::age))
}

fun olderThan30(){

    print("olderThan30:")
    // wanna keep people older than 30
    println( people.filter { it.age > 30 })
}

fun filterList(){

    print("filterList:")
    // filter - does not change elements of the list
    println(list.filter { it % 2 == 0 })

}

fun mapTheList(){
    print("mapHere:")
    // map - transforms elements
    println(list.map { it *3 })
}
package iterations


fun fixBuzz (i: Int) : String = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 5 == 0  -> "Buzz"
    i % 3 == 0  -> "Fizz"
    else -> "$i"
    
}



fun main (args :Array<String>){
    for (i in 1..100) {
        print ("${fixBuzz (i)}, ")
    }

    for (i in 100 downTo 10 step 3) {
        print( "${fixBuzz(i)}, " )
    }
}
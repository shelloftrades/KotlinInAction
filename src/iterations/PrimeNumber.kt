package iterations

fun isPrimeNumber (x :Int) : Boolean {
    val midrange :Int = x / 2
    for ( i in 2..midrange ){
        if (x % i == 0)
            return false
    }
    return true
}

fun main (args: Array<String>) {
    println ("3 isPrime? ${isPrimeNumber(3)}")
    println ("4 isPrime? ${isPrimeNumber(4)}")
    println ("5 isPrime? ${isPrimeNumber(5)}")
    println ("6 isPrime? ${isPrimeNumber(6)}")
    println ("7 isPrime? ${isPrimeNumber(7)}")
    println ("10 isPrime? ${isPrimeNumber(10)}")
}
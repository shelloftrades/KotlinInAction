package exception

import java.io.BufferedReader
import java.io.StringReader

fun main (args :Array<String>) {
    val reader = BufferedReader (StringReader ("239") )
    println ( readNumber (reader))

    val reader2 = BufferedReader (StringReader ("not a number") )
    readNumber_2 (reader2)
    readNumber_3 (reader2)
}


fun readNumber_3 (reader :BufferedReader) {
    val number = try {
        Integer.parseInt (reader.readLine())
    }
    catch (e :NumberFormatException) {
        null
    }
    println (number)
}

fun readNumber_2 (reader :BufferedReader) {
    val number = try {
        Integer.parseInt (reader.readLine())
    }
    catch (e :NumberFormatException) {
        return
    }
    println (number)
}

fun readNumber (reader :BufferedReader) : Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt (line)
    }
    catch (e :NumberFormatException) {
        return null
    }
    finally {
        reader.close ()
    }
}
    



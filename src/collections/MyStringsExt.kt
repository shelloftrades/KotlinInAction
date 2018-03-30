package collections

/**
 * My very own extension-method for String - Kotlin. There's no need to have "String" source code.
 *
 * The receiver type is the type on which the extension is defined,
 * and the receiver, object is the instance of the type.
 *
 * - receiver type = String
 * - receiver object = this object
 *
 */

fun String.lastChar () : Char = get (length - 1)   // removed "this" in get() & length.

// Declaring a mutable  extension property of StringBuilder class.
var StringBuilder.lastChar :Char
    get() = get(length - 1)
    set (value :Char) {
        println ("Kotlin".lastChar())
        
        val strbuild = StringBuilder("Kotlin?")
        strbuild.lastChar = '!'
        println (strbuild)
        
        
        //The quick brown foix jumps
    }



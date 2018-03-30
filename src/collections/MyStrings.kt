// Annotations to specify classname at JVM
@file:JvmName ("StringFunctions")

package collections

var opCount = 0

val UNIX_LINE_SEPARATOR = "\n"

fun reportOperationCount () {
    opCount ++
}

fun reportOperation () {
    println ("Operation performed $opCount times.")
}

/***
 * A method that prints out collections using default separator, prefix, and postfix for readability.
 *  To make this method a part of Collection<T> class in Kotlin, "Collection <T>" is added.
 */

fun <T> Collection<T>.joinToString (
      collection :Collection <T>,
      separator :String = ", ",
      prefix :String = "",
      postFix :String = ""
) : String {
    
    val result = StringBuilder (prefix)
    
    for ((index, element) in collection.withIndex()) {
        if (index > 0)
            result.append (separator)
        result.append (element)
    }
    
    result.append (postFix)
    return result.toString ()
}

/***
 * A method that prints out collections using default separator, prefix, and postfix for readability.
 * Called in TopLevelJava
 */
fun <T> oldJoinToString (
      collection :Collection <T>,
      separator :String = ", ",
      prefix :String = "",
      postFix :String = ""
) : String {
    
    val result = StringBuilder (prefix)
    
    for ((index, element) in collection.withIndex()) {
        if (index > 0)
            result.append (separator)
        result.append (element)
    }
    
    result.append (postFix)
    reportOperationCount()
    return result.toString ()
}



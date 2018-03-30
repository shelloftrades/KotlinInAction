package colorful

import colorful.Color.*

fun main (args: Array<String>) {
    
    println (Color.RED.rgb())
    println (getMnemonic(Color.BLUE))
    println (getWarmth(Color.INDIGO))
    println (mixOptimized( YELLOW, RED ))
}

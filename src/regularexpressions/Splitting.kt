package regularexpressions

fun main (args : Array<String>) {

    println (mydollars)
    println ("${kotlinLogo.trimMargin (".")}\n")

    parsePathWithRegex("D:\\02  My Documents\\02 bookish\\Python\\A Course in Machine Learningl.pdf")
    parsePath("D:\\03_HubbleSpace\\Lightroom_Set-Up.exe")

    // in java, it won't work
    print ("split: ")
    println ("12.345-6.A".split ("."))

    // These 2 have same results.
    print ("regex: ")
    println ("12.345-6.A".split ("\\.|-".toRegex()))

    print ("several delim: ")
    println ("12.345-6.A".split (".", "-" ))
}


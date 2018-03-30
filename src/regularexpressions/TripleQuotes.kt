package regularexpressions

val kotlinLogo = """|  //
                    .| //
                    .|/  \"""

val mydollars = """${'$'}99.23"""

fun parsePathWithRegex (path : String) {
    // (.+) :Any character pattern
    val regex = """(.+)\\(.+)\.(.+)""".toRegex()  // remember the syntax, very important when using regex!
    val matchresult = regex.matchEntire (path)

    if (matchresult != null) {
        val (directory, filename, extension) = matchresult.destructured
        println ("-->Dir: $directory, name: $filename, ext: $extension")
    }
}

fun parsePath (path :String) {
    val directory = path.substringBeforeLast ("\\")
    val fullName = path.substringAfterLast("\\")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println (">>>Dir: $directory, name: $fileName, ext: $extension")
}
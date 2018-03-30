package geometry.examples

import geometry.shapes.createRandomRectangle

fun main (args: Array<String>) {
    println(createRandomRectangle().isSquare)
    println(createRandomRectangle().height)
    println(createRandomRectangle().width)
}
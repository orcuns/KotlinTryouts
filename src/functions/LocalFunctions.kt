package functions



/**
 * Created by orcun on 10/8/2017.
 */

fun main(args: Array<String>) {

    printArea(90,20)
}


fun printArea(width: Int, Height: Int) {
    fun calculateArea() = width * Height
    val area = calculateArea()
    println("The area is $area")
}


// TOP LEVEL FUNCTION
fun foo(mustBeGreaterThanTEN: Int) {
    require(mustBeGreaterThanTEN > 10, {"number should be greater than  10"})

}

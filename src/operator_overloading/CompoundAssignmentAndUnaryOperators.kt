package operator_overloading

/**
 * Created by orcun on 10/14/2017.
 */

fun main(args: Array<String>) {

    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)


    println(-point)


}


data class Point(val x: Int, val y: Int){
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }


    operator fun unaryMinus(): Point {
        return Point(-x, -y)
    }
}
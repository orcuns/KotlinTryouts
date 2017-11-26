import java.util.*

/**
 * Created by orcun on 8/6/2017.
 */

fun main(args: Array<String>) {

    val minutesInYear: Double = (60 * 24 * 365).toDouble()
    var input = Scanner(System.`in`)

    print("Input the number of minutes: ")

    val min = input.nextDouble()
//    val min = 12345678

    val years = (min / minutesInYear).toLong()
    val days = (min / 60.0 / 24.0).toInt() % 365

    println("$min minutes is approximately $years years and $days days")
}
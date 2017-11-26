package control_flow

/**
 * Created by orcun on 10/1/2017.
 */

fun main(args: Array<String>) {

    var a:Int = 5
    var b = 6
    var max = 0

    if (a < b)
        max = b
    else
        max = a

    println(max)


    val max2 = if (a < b) b else a
    println(max2)


    a = 10
    b = -11 * -1
    val max3: Any = if (a > b) {
        print("Choose a")
        " = $a"
    } else {
        print("Choose b")
        b
    }
    println(max3)


}
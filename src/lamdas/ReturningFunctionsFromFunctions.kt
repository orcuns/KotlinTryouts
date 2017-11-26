package lamdas

/**
 * Created by orcun on 11/19/2017.
 */



fun bar(): (String) -> String = { str -> str.reversed() }

fun main(args: Array<String>) {

    val reversi = bar()
    println(reversi("origami"))
    println(reversi("arigato"))

    println()

    val mod = modula(2)
    println(mod(13))

    println()

    val ints = listOf(1, 2, 3, 4, 5, 6)
    val odd = ints.filter(modula(1))
    val evens = ints.filter(mod)
    val mod3 = ints.filter(modula(3))

    println("odd items = $odd")
    println("even items = $evens")
    println("mod3 items = $mod3")

    println()

    val number1: Int = 10
    val number2: Int = 13
    val innerFunction = greater(number1)
    val result = innerFunction(number2)
    println("$number1 is greater than $number2 = $result")

}


fun modula(k: Int): (Int) -> Boolean = { it % k == 0}

fun greater(k: Int): (Int) -> Boolean = { it < k }

val sum3: (Int, Int) -> Int = { x, y -> x + y}
val sum1 = fun(x: Int, y: Int): Int {
    return x + y
}


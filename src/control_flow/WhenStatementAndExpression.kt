package control_flow

import java.lang.Integer.parseInt


/**
 * Created by orcun on 10/1/2017.
 */

fun main(args: Array<String>) {

    var x: Any = "french"

    val y:Any = when (x) {
        "English" -> {
            println("How are you")
            12
        }

        "French" -> println("Comment ca va?")

        else -> {
            println("WTF is this language?")
            5
        }
    }
    println(y)




    x = 1
    when (x) {
        0, 1, 2 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }




    x = 2132
    val s = "2132"
    when (x) {
        parseInt(s) -> println("s encodes x")
        else -> println("s does not encode x")
    }




    x = "Tim"
    val names = listOf("John", "Sarah", "Tim", "Margot")
    when (x) {
        in names -> println("I know that name!")
        // gives error not same type
//        !in 1..10 ->  println("x is outside the range")
        is String -> println(x.length)
        else -> println("none of the above")
    }




    val x1:Any = "Margot"
    when (x1) {
        in 1..10 -> println("x1 is in the range")
        in names -> println("x1 is a String")
        !in 10..20 -> println("x1 is outside the range")
        else -> println("none of the above")
    }




    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("pre")
        else -> false
    }
    println(hasPrefix("PREMATURE".toLowerCase()))




    x = 123 * -1
    when {
        x % 2 == 1 -> println("x is odd")
        x % 2 == 0 -> println("x is even")
        else -> println("x is funny")
    }


    println()
    println("------------*-------------")
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

class MyClass() {}

fun cases(obj: Any) {
    when (obj) {
        "Hello", "hello" -> println("Greeting")
        1 -> println("One")
        is Long -> println("Long")
        !is String -> println("not a String")
        else -> println("Unknown")
    }

}

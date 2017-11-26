/**
 * Created by orcun on 9/23/2017.
 */

fun main(args: Array<String>) {


    val price = """${'$'}99.9"""
    println(price)

    fun lineGap() = println("-----------0-----------")


// compile time ERROR
//    val x: String? = null
//    var y: String = x

            // compile time ERROR
//    fun strLenSafe(s: String?) = s.length


    val x1 : String? = null
    val x2: String? = "abc"
    val x3: String? = "abcd"


    fun strLenSafe(s: String): Int = s.length


    fun strLenSafe(s: String?): Int = if(s != null) s.length else 0
    println(strLenSafe(x1))
    println(strLenSafe(x2))
    println(strLenSafe(x3))
    lineGap()


    fun strLenSafe2(s: String?): Int? = s?.length
    println(strLenSafe2(x1))
    println(strLenSafe2(x2))
    println(strLenSafe2(x3))
    lineGap()


    val nullTest = null
    fun strLenSafe3(s: String?): String = s?.toUpperCase() ?: "nullString"
    println(strLenSafe3(x1))
    println(strLenSafe3(x2))
    println(strLenSafe3(x3))
    lineGap()



}
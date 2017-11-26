/**
 * Created by orcun on 9/10/2017.
 */


fun main(args: Array<String>) {

    val str1: String = "Red is my favorite color"
    val str2: String = "Orange is my favorite color"

    val startStr = "Red"

    val starts1:Boolean = str1.startsWith(startStr)
    val starts2:Boolean = str2.startsWith(startStr)


    println("$str1 starts with $startStr ? $starts1")
    println("$str2 starts with $startStr ? $starts2")

}
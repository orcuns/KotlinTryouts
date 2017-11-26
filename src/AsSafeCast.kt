/**
 * Created by orcun on 9/23/2017.
 */

fun main(args: Array<String>) {


    fun length(any: Any?): Int {
        val string = any as? String
        return string?.length ?: -1
    }

    fun length2(any: Any?): Int? {
        val string = any as? String
        return string?.length
    }

    println(length(null))
    println(length("OMG"))
    println(length(123))
    println()
    println(length2(null))
    println(length2("OMG"))
    println(length2(123))



}
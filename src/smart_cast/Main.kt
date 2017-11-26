package smart_cast

// Extension Function test
import functions.lastChary as last

/**
 * Created by orcun on 9/10/2017.
 */

fun main(args: Array<String>) {

    val string1 = "jason"
    val intExample = 2

    println(getStringLength(string1))
    println(getStringLength(intExample))


    // Extension Function test
    val c = "kotlin".last()
    println(c)

}


fun getStringLength(obj:Any): Int? {

    if (obj is String)
        return obj.length

    return null
}
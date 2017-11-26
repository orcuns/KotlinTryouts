/**
 * Created by orcun on 9/23/2017.
 */

fun main(args: Array<String>) {

    if (args.size < 2) {
        println("No numbers supplied!")
    } else {
        val x = parseInt(args[0])
        val y = parseInt(args[1])

        // classic if check
        if (x != null && y != null) {
            println("classic if check")
            println(x * y)
        }
        else
            println("At least one item is null")

        // Elvis operator
        x ?: return println("X item is null")
        y ?: return println("Y item is null")
        println("Elvis operator: ${x * y}")


        // Not null Assertion
        println("Not null Assertion: ${x!! * y!!}")



        val jason: String? = "jason"
        println()
        println(jason?.toUpperCase())
        println(jason!!.toUpperCase())

    }
}

fun parseInt(s: String): Int? {
    try {
        return s.toInt()
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return null
}

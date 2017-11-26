package functions

/**
 * Created by orcun on 10/8/2017.
 */


fun main(args: Array<String>) {

    multiPrint("holy cow", "Holy bomb", "cassini space ship")

    multiPrint("Start", "holy cow", "Holy bomb", "cassini space ship", suffix = "Stop")

    val stringArray = arrayOf("1","2","3","4","5")

    multiPrint(*stringArray)

}


fun multiPrint(vararg strings: String) {

    for (string in strings)
        println(string)

}

fun multiPrint(prefix: String, vararg strings: String, suffix: String) {

    for (string in strings)
        println(string)

}


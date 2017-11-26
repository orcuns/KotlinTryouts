/**
 * Created by orcun on 8/6/2017.
 */


fun main(args: Array<String>) {

    val message: String

    message = "BANANA"

    val test = 13

    for (c in message) {
        println(c)
    }


    val messages: String  = """
                        |BANANAss
    HOJDUR |omg
            |kac para la bu = ${'$'}99.9 ;test=$test
""".trimMargin()

    println(messages)




}
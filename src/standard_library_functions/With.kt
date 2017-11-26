package standard_library_functions

/**
 * Created by orcun on 10/14/2017.
 */

fun main(args: Array<String>) {

    println(alphabet())
    println(alphabetWith())


}


fun alphabet(): String {
    val result = StringBuilder()

    for (letter in 'A'..'Z'){
        result.append(letter)
    }

    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabetWith() = with(StringBuilder()) {

    for (letter in 'A'..'Z') {
        append(letter)
    }

    append("\nNow I know the alphabet!")
    toString()
}
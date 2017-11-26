package standard_library_functions

/**
 * Created by orcun on 10/14/2017.
 */

fun main(args: Array<String>) {

    println("before lazy call")

    val lazyString = lazy { readFromDatabase() }

    println("after lazy call")

    val resultLazyString = lazyString.value
    println("lazy call value is done, result = $resultLazyString")



}

fun readFromDatabase(): String {

    println("DATABASE VALUES")
    return "OMG"
}


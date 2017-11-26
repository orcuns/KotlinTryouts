package standard_library_functions

/**
 * Created by orcun on 10/14/2017.
 */


fun main(args: Array<String>) {



    neverEmpty(true)
    neverEmpty(false)

    neverEmpty("12")
    neverEmpty("")


}

fun neverEmpty(str: String) {
    require(str.isNotEmpty(), { "String should not be empty"})
    println(str)

}

fun neverEmpty(bb: Boolean) {
    assert(bb, { "Boolean should not be empty"})
    println(bb)

    check(bb, { "Boolean should not be empty" })


}


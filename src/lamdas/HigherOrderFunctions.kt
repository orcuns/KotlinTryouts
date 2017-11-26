package lamdas

/**
 * Created by orcun on 11/19/2017.
 */

// Function Type
fun foo(str: String, fn: (String) -> String): Unit {
    val applied = fn(str)
    println(applied)
}

fun foo(str: String, asd: String, fn: (String) -> String): Unit {
    val applied = fn(str)
    println(applied)
    println(asd)
}

fun main(args: Array<String>) {

    foo("thanks", fn = { "test" })
    foo("orcun", fn = { it })
    foo("aloha", { it.reversed() })

    foo("abba", "OMG",
            fn = {
                it.reversed()
                it.toUpperCase()
            })

    println()
    println()

    val people = listOf(Person("Alice", 33), Person("Caid", 31))

    val eldestPerson = people.maxBy { it.age }
    println(eldestPerson?.name)

    // without any syntax shortcuts
    println(people.maxBy ({ p: Person -> p.age }))

    // can remove a lambda expression out of parenthesis if its the last argument
    // in a function call, only argument so it can be placed after parenthesis
    println(people.maxBy() { p: Person -> p.age })

    // When the lambda is the only argument to a function, you can also remove the empty parenthesis from the call
    println(people.maxBy { p -> p.age })

    // finally use it, if the type can be inferred
    println(people.maxBy { it.age })

}

data class Person(val name: String, val age: Int)
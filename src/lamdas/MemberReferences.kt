package lamdas

/**
 * Created by orcun on 11/19/2017.
 */


fun salute() = println("Salute!")


fun main(args: Array<String>) {

    val getAge = Person::age

    run(::salute)

    val createPerson = ::Person
    val p = createPerson("Bob", 33)
    println(p)

    println()

    val errors = listOf("403 Forbidden", "404 Not Found", "500 Internal Server Error")
    printMessagesWithPrefix(errors, "Error:")

    println()

    printProblemCounts(errors)
}

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach{ println("$prefix $it")}
}

fun printProblemCounts(responses: Collection<String>) {

    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        }
        else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

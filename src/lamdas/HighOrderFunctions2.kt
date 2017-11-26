package lamdas

/**
 * Created by orcun on 11/19/2017.
 */

fun lookForAlice(people: List<Person>) {
    people.forEach label@ {
        if (it.name == "Alice")
            return@label
        println("Alice might be somewhere")
    }
    println("Alice might be somewhere")
}

fun lookForCaid(people: List<Person>) {
    people.forEach {
        if (it.name == "Caid")
            return
        println("Caid might be somewhere")
    }
    println("Caid might be somewhere")
}

fun filterAdults(people: List<Person>): List<Person> {
    val result = people.filter {
        return@filter it.age > 18
    }
    return result
}

fun main(args: Array<String>) {

    val people = listOf(Person("Alice", 13), Person("Caid", 31))

    lookForAlice(people)
    lookForCaid(people)

    println()

    val adultPeople = filterAdults(people)
    println(adultPeople)

    println()
    for (i in 1..10) {
        loop@ for (j in 1..100) {
            if (i * 10 == j) {
                print("$j, ")
                break@loop
            }
        }
    }

    println()
    loop@ for (i in 1..10) {
       for (j in 1..100) {
            if (i * 10 == j) {
                print("$j, ")
                break@loop
            }
        }
    }

    println()
    for (i in 1..10) {
        for (j in 1..100) {
            if (i * 10 == j) {
                print("$j, ")
                break
            }
        }
    }
}


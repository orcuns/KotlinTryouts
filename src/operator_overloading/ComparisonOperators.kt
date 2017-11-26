package operator_overloading

/**
 * Created by orcun on 10/14/2017.
 */

fun main(args: Array<String>) {

    println(Points(10,20) == Points(10,20))
    println(Points(10,22) == Points(10,20))

    println(Points(10,22) != Points(10,20))
    println(Points(10,22) == null)


    println()
    println()

    val p1 = Person("Alice", "Simit")
    val p2 = Person("Alice", "Marley")

    println(p1 > p2)
    println(p1.compareTo(p2))
    println(p2.compareTo(p1))
    println(p2.compareTo(p2))


}


class Points(val x: Int, val y: Int)
{
    override fun equals(other: Any?): Boolean {

        if (other === this) {
            return true
        }
        if (other !is Points) {
            return false
        }

        return other.x == x && other.y == y
    }
}

class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::firstName, Person::lastName)
    }
}
package functions

/**
 * Created by orcun on 10/8/2017.
 */


fun main(args: Array<String>) {


    println("Kotlin".last())
    println("Kotlin".lastChary())
    println("Kotlin".lastChary)



}


fun String.lastChary(): Char = this.get(length - 1)


val String.lastChary: Char get() = get(length-1)


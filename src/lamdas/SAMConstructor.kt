package lamdas

/**
 * Created by orcun on 11/19/2017.
 */

fun main(args: Array<String>) {

    createAllDoneRunnable().run()
}

fun createAllDoneRunnable(): Runnable {

    return Runnable {
        println("ALL DONE!")
        println("Delay end, waited 1 seconds")
    }
}
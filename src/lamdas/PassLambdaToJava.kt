package lamdas

/**
 * Created by orcun on 11/19/2017.
 */

fun main(args: Array<String>) {

    val comp = Computation()
    comp.postponeComputation(5000){
        println("Delay end, waited 5 seconds")
    }

    comp.postponeComputation(3000, Runnable { println("Delay end, waited 3 seconds") })


    comp.postponeComputation(7000, { println("Delay end, waited 7 seconds") })


    comp.postponeComputation(1000, createAllDoneRunnable())


    val test: (() -> Unit) = { println("Delay end, waited 10 seconds") }
    comp.postponeComputation(10000, test)





}
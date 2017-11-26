package standard_library_functions

/**
 * Created by orcun on 10/14/2017.
 */


fun main(args: Array<String>) {


    val task = Runnable { println("Running1") }
    val thread = Thread(task)
    thread.isDaemon = true
    thread.start()


    // using apply
    val task2 = Runnable { println("Running2") }
    Thread(task2).apply { isDaemon = true }.start()




}
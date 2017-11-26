/**
 * Created by orcun on 9/23/2017.
 */


fun main(args: Array<String>) {


    for (arg in args) {
        println(arg)
    }

    for (i in args.indices) {
        println("$i - ${args[i]}")
    }

}
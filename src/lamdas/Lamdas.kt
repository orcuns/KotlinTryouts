package lamdas

/**
 * Created by orcun on 11/19/2017.
 */

fun main(args: Array<String>) {

    val printer = { println("I am a lamda")}
    run(printer)
    printer()

    val printMessage = { message: String -> println(message)}
    printMessage("hello")


    val sum = { x: Int, y: Int ->
        printMessage("This is awesome! \nSum of $x and $y is ")
        x + y}

    printMessage(sum(1, 2).toString())


    val sum1 = fun(x: Int, y: Int): Int {
        return x + y
    }

    val sum2 = fun(x: Int, y: Int): Int = x + y

    // Explicit Types
    val sum3: (Int, Int) -> Int = { x, y -> x + y}


    printMessage("sum1 is ${sum1(13,31)}")
    printMessage("sum2 is ${sum2(12,32)}")
    printMessage("sum3 is ${sum3(11,33)}")


    // Lambdaception
    val shell  = { { printMessage("YOU found the PEARL") } }
    val pearl = shell()
    pearl()


}
package standard_library_functions

import java.util.*


/**
 * Created by orcun on 10/14/2017.
 */


fun main(args: Array<String>) {


    val random = Random()
    val evenOrOdd = random.nextInt() % 2
    println("evenOrOdd? = $evenOrOdd")

    val asd: String?

    asd = if (evenOrOdd == 0) {
        "its Even"
    } else {
        null
    }


    asd?.let { sendEmail(it) }

}


fun sendEmail(email: String) {
    println(email)
}
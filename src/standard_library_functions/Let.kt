package standard_library_functions


/**
 * Created by orcun on 10/14/2017.
 */


fun main(args: Array<String>) {


    var asd = null

    asd?.let { sendEmail(it) }

}


fun sendEmail(email: String) {
    println(email)
}
/**
 * Created by orcun on 9/23/2017.
 */

fun main(args: Array<String>) {

    val nulllableName: String? = "george"
    val name: String = nulllableName!!


    fun ignoreNulls(s: String?) {
        val sNotNull = s!!
        println(sNotNull.length)
    }

}
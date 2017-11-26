package standard_library_functions

import java.nio.file.Paths

/**
 * Created by orcun on 10/14/2017.
 */

fun main(args: Array<String>) {

    val outPutPath = Paths.get("/user/home").run {

        val path = resolve("output")
        path.toFile().createNewFile()
        path
    }
}
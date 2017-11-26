package standard_library_functions

import java.nio.file.Files
import java.nio.file.Paths

/**
 * Created by orcun on 10/14/2017.
 */

fun main(args: Array<String>) {


    val input = Files.newInputStream(Paths.get("input.txt"))
    val byte = input.use { { input.read() } }

}
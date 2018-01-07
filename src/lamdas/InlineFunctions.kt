package lamdas

import java.nio.file.Files
import java.nio.file.Paths
import java.time.LocalDateTime

/**
 * Created by orcun on 11/26/2017.
 */

fun main(args: Array<String>) {

    //textFile.txt -> src/assets/textFile.txt
    val comp = Computation()
    comp.startThreadSameTime({ threadInlineFunction() }, { threadHighOrderFunction() }, LocalDateTime.now())
}


fun threadInlineFunction() {
    val test2 = MyClass()
    println("Start Inline")
    val startNano2 = LocalDateTime.now().nano
    val text2 = test2.inlineGetText("assets/textFile.txt")
//    println("$text2 \nnumber of characters in text: ${text2.length} ")
    println("Finish Inline: chars=${text2.length} - ${(LocalDateTime.now().nano - startNano2)/100}")
}

fun threadHighOrderFunction() {
    val test = MyClass()
    println("Start")
    val startNano = LocalDateTime.now().nano
    val text = test.getText("assets/textFile2.txt")
//    println("$text \nnumber of characters in text: ${text.length} ")
    println("Finish: chars=${text.length} - ${(LocalDateTime.now().nano - startNano)/100}")
}


class MyClass {

    fun getText(fileName: String): String {

        val inputStream = Files.newInputStream(Paths.get(fileName))

        return withResource(inputStream) {
            inputStream.buffered().reader().readText()
        }
    }

    fun <T : AutoCloseable, U> withResource(resource: T, fn: (T) -> U): U {
        try {
            return fn(resource)
        }
        finally {
            resource.close()
        }
    }


    fun inlineGetText(fileName: String): String {

        val inputStream = Files.newInputStream(Paths.get(fileName))

        return inlineWithResource(inputStream) {
            inputStream.buffered().reader().readText()
        }
    }

    inline fun <T : AutoCloseable, U> inlineWithResource(resource: T, fn: (T) -> U): U {
        try {
            return fn(resource)
        }
        finally {
            resource.close()
        }
    }
}
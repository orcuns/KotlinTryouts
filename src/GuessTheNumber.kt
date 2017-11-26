import java.util.*

/**
 * Created by orcun on 10/1/2017.
 */

fun main(args: Array<String>) {

    val secretNumber:Int = (Math.random() * 999 + 1).toInt()
    print(secretNumber)

    val keyboard = Scanner(System.`in`)
    var guess:Int

    do {

        println("Enter a guess between (1-1000)")
        guess = keyboard.nextInt()

        when {
            guess == secretNumber -> println("Your guess is correct!!")
            guess < secretNumber -> println("Your guess is smaller than the secrect number")
            guess > secretNumber -> println("Your guess is greater than the secret number")
        }

    }
    while (guess != secretNumber)
}
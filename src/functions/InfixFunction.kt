package functions

/**
 * Created by orcun on 10/8/2017.
 */

class InfixFunction {

    var balance = 0
    infix fun add(amount: Int) {
        this.balance += amount
    }


}


fun main(args: Array<String>) {

    val account = InfixFunction()

    // infix
    account add 100
    println(account.balance)

    account.add(100)
    println(account.balance)
}



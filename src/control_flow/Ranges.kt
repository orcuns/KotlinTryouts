package control_flow

/**
 * Created by orcun on 10/1/2017.
 */

fun main(args: Array<String>) {


    for (i in 1 until 10) {
        println(i)
    }

    println()


    for (i in 1..4  step 2) {
        println(i)
    }

    println()


    val asd = IntRange(1, 10)
    println("asd = $asd")

    for (k in asd) {
        for (j in 1..5) {
            print("${k * j}")
            print(if (j == 5) "." else ",")
        }
        println()
    }


    println()
    println()

    for (i in 1..10) {
        loop@  for (j in 1..5) {
            if (i == j) {
                break@loop
            } else {
                print("${i*j}, ")
            }
        }
        println()
    }

    println()
    println()

    for (i in 1..10) {
        for (j in 1..5) {
            if (i == j) {
                break
            } else {
                print("${i*j}, ")
            }
        }
        println()
    }

    println()
    println()


    goo(5)

    val ints = 0..14
    print(foo(ints))
    println()
    fooo (ints)
    println()
    foooo (ints)


}

fun foo(ints: IntRange):Boolean {
    ints.forEach {
        if (it == 0)
            return false // nonlocal return from inside lambda directly to the caller of foo()
        print("$it, ")
    }
    return true
}


fun fooo(ints: IntRange) {
    ints.forEach {
        if (it == 5)
            return@forEach
        print("$it, ")
    }
}

fun foooo(ints: IntRange) {
     for (i in 1..2) {
         loop@  for (j in 1..10) {
            if (i + 3 == j)
                break@loop
            print("i=$i, j=$j, ")
        }
        println()
    }
}

fun goo(mustGreaterThanTen: Int) {
    require(mustGreaterThanTen > 10, {"OMG WHAT IS THIS"})
}


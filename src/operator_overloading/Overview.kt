package operator_overloading

/**
 * Created by orcun on 10/14/2017.
 */

fun main(args: Array<String>) {

    val test1 = MyClass(1, 2, 3, 4)
    val test2 = MyClass(4, 3, 2, 1)

    val m = test1 + test2



}


class MyClass(val a: Int, val b: Int,val c: Int ,val d: Int) {

    operator fun plus(myClass: MyClass): MyClass {
        return MyClass(a + myClass.a, b, c, d + myClass.d)
    }



}


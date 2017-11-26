
val testVAR : String = "OMG"
fun main(args: Array<String>) {
    println("Hello World!")


    println("Test JAVA METHOD in here")
    val javaMethod = TEST().test()
    println(javaMethod)



    if (args.size == 0) {
        println("PLS PASS DATA BIATCH!")
        return
    }

    //    println("Hello, ${args[0]}!")


    for (name in args) {
        println("Hello, $name!")
    }

    var testtt: Boolean
    testtt = args.isEmpty()

    val orcun:String
    if (testtt) {
        orcun = "orcun"
    }
    else {
        orcun = "sevsay"
    }
    println(orcun)
    println(testVAR)


}
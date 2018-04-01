fun main(args: Array<String>) {
    val program = Program()
    program.addTwoNumber(2, 2, object : MyInterface {

        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val myLambda: (Int) -> Unit = { s -> println(s) }
    // myLambda(55)

    val myLamda1: (Int, Int) -> Int = { s1, s2 -> s1 + s2 }
    //println(myLamda1(4, 5))

    program.addTwoNumberLambda(1, 1, myLambda)
    println(program.addTwoNumberLambdaReturn(2, 100, myLamda1))
}
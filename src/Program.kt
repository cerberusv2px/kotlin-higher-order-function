class Program {

    fun addTwoNumberLambda(val1: Int, val2: Int, action: (Int) -> Unit) {
        val sum = val1 + val2
        action(sum)
    }

    fun addTwoNumberLambdaReturn(a: Int, b: Int, action: (Int, Int) -> Int): Int {
        return action(a, b)
    }

    fun addTwoNumber(val1: Int, val2: Int, action: MyInterface) {
        val sum = val1 + val2
        action.execute(sum)
    }
}
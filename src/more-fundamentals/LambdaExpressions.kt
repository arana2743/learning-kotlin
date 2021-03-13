// Lambda expression is a function with no name

fun main() {
    // lambda function for adding 2 numbers
    var sum: (Int, Int) -> Int = { a: Int, b: Int -> a+b }
    println(sum(2,10))

    // lambda function for product of 2 numbers
    var multiply = { a:Int, b:Int -> println(a*b) }
    multiply(20,33)
}
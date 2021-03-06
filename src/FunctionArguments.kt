fun main() {
    myFunction()
    println(addUp(2, 10))
    println(avgUp(21.0, 50.0))
}

fun addUp(a: Int, b: Int) : Int {
    return a+b
}

fun avgUp(a: Double, b: Double) : Double {
    return (a+b)/2
}

fun myFunction() {
    println("Called from myFunction")
}
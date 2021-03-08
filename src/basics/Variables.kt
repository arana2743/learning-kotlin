// two types of variable types
// var - which can be changed later on
// val - which cannot be changed later on

fun main() {
    var value = 10
    val name = "John Doe"

    value = 30
    println(value)
    // name = "Doe" // will give error : val cannot be reassigned
    println(name)
}


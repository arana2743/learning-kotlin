// assigning default values to variables
// when given value is null
fun main() {
    var nullableName: String? = null

    // assigning above Name to below name variable
    // using ==> "?:" - Elvis Operator
    var userName = nullableName ?: "Guest"
    println(userName)
}
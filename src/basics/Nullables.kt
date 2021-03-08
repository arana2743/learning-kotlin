fun main() {
    var name: String = "John"
    // name = null -> compilation error
    var nullableName: String? = "John"
    nullableName = null
    println(name)
    println(nullableName)

    var len = name.length
    var len2 = nullableName?.length

    println(len)
    println(len2)

    // let allows to execute code only when 
    // variable is not null
    nullableName?.let { println("$nullableName")}
}
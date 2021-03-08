fun main() {
    for(num in 1..10){
        print("$num ")
    }
    println("")
    // another way of writing
    for (num in 1 until 10 step 3) {
        print("$num ")
    }
    println("")
    //another way of writing
    for (num in 10 downTo 1 step 2) {
        print("$num ")
    }
    println("")
    var count=0
    for (x in 0..9) {
        for (y in 0..9) {
            // println("Result = ${x * y}")
            count++
        }
    }
    println(count)
}
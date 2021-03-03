// in Kotlin we have when-block statements
// which is an alternate to switch-case available in other languages

fun main() {
    var season = 500
    when (season) {
        1 -> println("Season is 1")
        2 -> println("Season is 2")
        5 -> {
            // can be mulit-line block as well
            println("Fall")
            println("Another statement")
        }
        else -> println("Ahh, invalid season!")
    }

    // another example
    var month = 2
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Ahh, invalid month!")
    }

    //another example
    var x: Any = 13.37
    when(x) {
        is Int -> println("$x is an integer")
        is Float -> println("$x is float")
        is Double -> println("$x is double")
        is String -> println("$x is a string")
        else -> println("$x is none of the above")
    }
}

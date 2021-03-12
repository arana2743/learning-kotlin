interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is breaking.")
    }
}

class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable {

    var range: Double = 0.0

    override fun drive(): String {
        return "Driving the interface drive method."
    }


    fun extendRange(amount: Double) {
        if(amount>0) {
            range += amount
        }
    }

    fun drive(distance: Double) {
        println("Drove for $distance KMs")
    }
}

fun main() {
    var myCar = Car(250.0, "A3", "Audi")
    println(myCar.drive())
}
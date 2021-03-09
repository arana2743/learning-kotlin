fun main() {
    var myCar = Car()
    myCar.brand = "mercedes"
    myCar.maxSpeed = 100
    println("Owner is : ${myCar.owner}")
    println("brand is : ${myCar.brand}")
    println("MaxSpeed is : ${myCar.maxSpeed}")
    // will give exception since setter of model is private
    // myCar.model = "M3" 
    println("Model is : ${myCar.model}")
}

class Car() {
    // with lateinit - we don't have to initialise the variable
    lateinit var owner: String

    var brand: String = "bmw"
        get() {
            return field.toUpperCase()
        }
        set(value) {
            field = value
        }

    var maxSpeed: Int = 250
        get() = field
        set(value) {
            if (value>=0) {
                field = value
            } else if (value <0) {
                throw IllegalArgumentException("maxSpeed cannot be negative")
            }
        } 

    var model: String = "M5"
        private set
    init {
        this.owner = "John"
    }
}
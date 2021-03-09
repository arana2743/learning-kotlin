fun main() {
    var person1 = Person("Den", "Dane", 45)
    // var person2 = Person()
    person1.hobby = "skateboard"
    person1.stateHobby()
}

class Person(firstName: String = "John", lastName: String = "Doe") {
    // Member variables - Properties
    var _firstName: String? = null
    var _lastName: String? = null
    var _age: Int? = null
    var hobby = "watch Netflix"

    init {
        println("Initialised a new Person object with " + "firstName = $firstName and lastName = $lastName"
        )
    }

    // secondary constructor - specific to Kotlin only
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
        this._firstName = firstName
        this._lastName = lastName
        this._age = age
        println("Initialised a new Person object with " + "firstName = ${this._firstName} ,lastName = ${this._lastName} and age = ${this._age}"
        )
    }

    // Member functions - Methods
    fun stateHobby() {
        println("${this._firstName}'s hobby is $hobby")
    }
}
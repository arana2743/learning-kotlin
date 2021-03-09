data class User(val id: Long, var name: String)

fun main() {
    var user1 = User(1, "Michael")
    user1.name = "John"
    // because data class has toString built-in method so below works as well
    println(user1)
    val user2 = User(12, "Wick")
    var user3 = User(1, "John")
    println(user2)

    // we can even compare 2 objects - here of User type
    println(user1.equals(user2))
    println(user1.equals(user3))


    // in data class we can also copy an object to another object
    var updateUser = user1.copy(id=10)
    println(updateUser)

    // object properties can also be fetched by below for data class
    println(updateUser.component1())
    println(updateUser.component2())

    // object destructuring
    var (id, name) = updateUser
    println("id : $id, name: $name")

}


package aula_20_classes_de_dados

class UserClass(val name: String, val age: Int)

data class UserDataClass(val name: String, val age: Int)

fun main() {

    val userClass = UserClass(name = "João", age = 20)
    val userDataClass = UserDataClass(name = "João 2", age = 21)

    // toString

    println(userClass.toString())
    println(userDataClass.toString())

    // equals

    val jose = UserDataClass(name = "José", age = 30)
    val maria = UserDataClass(name = "Maria", age = 40)
    val jose2 = UserDataClass(name = "José", age = 30)

    val userClass2 = userClass

    println(jose == jose2)
    println(userClass == userClass2)

    // copy

    val copyMaria = maria.copy(age = 50)

    println(copyMaria)

    // destructuring

    val (name, age) = jose

    println(name)
    println(age)
}
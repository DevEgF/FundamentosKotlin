package aula_32_destructuring

data class Person(val name: String, val lastName: String, val age: Int)

class Animal(val name: String, val age: Int) {
    operator fun component1() = name
    operator fun component2() = age
}

fun main() {

    val (joseName, joseLastName, joseAge) = Person(name = "José", lastName = "Silva", age = 40)

    val (a, b) = Pair<String, String>("a", "b")

    val (c, d, e) = Triple<Int, Boolean, Double>(10, false, 5.0)

    joseAge
    joseName
    joseLastName
    a
    b
    c
    d
    e

    val (animalName, animalAge) = Animal(name = "Cachorro", age = 3)
}
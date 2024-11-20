package aula_13_funcoes_ordem_superior

fun sum(a: Int, b: Int): Int = a + b

fun subtract(a: Int, b: Int): Int = a - b

fun multiply(a: Int, b: Int): Int = a * b

fun mathOperation(a: Int, b: Int, mathOperation: (Int, Int) -> Int): Int {
    return mathOperation(a, b)
}

fun main() {

    val divide = { a: Int, b: Int -> a / b }

    println(mathOperation(a = 10, b = 5, ::sum))
    println(mathOperation(a = 10, b = 5, ::subtract))
    println(mathOperation(a = 10, b = 5, ::multiply))
    println(mathOperation(a = 10, b = 5, divide))
}
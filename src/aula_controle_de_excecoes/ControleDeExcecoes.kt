package aula_controle_de_excecoes

fun main() {
    // try/catch

    var x: Int = 1

    x = try {
        // código desejado a ser executado pelo programa
        1 / 0
        // throw InvalidParameterExceptio()
        // println(x)
    } catch (e: ArithmeticException) {
        // caso uma exceção ao bloco try aconteça
        println("Erro de expressào aritmética.")
        3
    } catch (e: Exception) {
        println("Erro genérico.")
        4
    }

    println(x)
}
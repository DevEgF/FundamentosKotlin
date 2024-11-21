package aula_33_typealiases

typealias Operation = (Int, Int) -> Int

fun mathOperartion(a: Int, b: Int, operation: Operation): Int {
    return operation(a, b)
}

typealias NomeDoAluno = String
typealias NotasDosAluno = List<Int>

typealias MapaDeEstudantes = Map<NomeDoAluno, NotasDosAluno>

fun processaNotas(mapaDeEstudantes: MapaDeEstudantes) {
    for ((nome, notas) in mapaDeEstudantes) {
        println("Estudante : $nome | Notas : ${notas.joinToString()}")
    }
}

fun main() {

    val estudantes: MapaDeEstudantes = mapOf(
        "Alice" to listOf(5, 6, 8),
        "Bruno" to listOf(4, 7, 9),
    )

    processaNotas(mapaDeEstudantes = estudantes)
}
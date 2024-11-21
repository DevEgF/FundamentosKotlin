package aula_34_validacoes_de_argumentos

// required

fun dividir(a: Int, b: Int): Int {
    require(b != 0) { "O divisor não pode ser zero." } // IllegalArgumentException
    return a / b
}

// requiredNotNull

fun imprimirNome(nome: String?) {
    val nomeNaoNulo = requireNotNull(nome) { "O nome de usuário não foi definido até o momento." } // IllegalArgumentException
    println("Nome: $nomeNaoNulo")
}

// check

fun processarListaNotas(lista: List<Int>) {
    check(lista.isNotEmpty()) { "A lista não pode ser processada. Não há nenhum item inserido." } // IllegalStateException
    println("Processando a lista de tamanho ${lista.size}...")
    check(lista.all{ it != 0}) { "O aluno foi reprovado devido a possuir uma nota 0." } // IllegalStateException
    println("A média é ${lista.sum() / lista.size}...")
}


fun main() {

//    dividir(1, 2)
//    dividir(3 ,0)

//    imprimirNome("Bernardo")
//    imprimirNome(null)

    processarListaNotas(listOf(1, 3, 4, 6))
    processarListaNotas(listOf(1, 3, 0, 6))
    processarListaNotas(emptyList())

}
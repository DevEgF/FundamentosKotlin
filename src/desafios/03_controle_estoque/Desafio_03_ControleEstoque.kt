package desafios.`03_controle_estoque`

// 1) estruturar a definição de produto = criar a
// data class Produto estruturar o estoque de produtos
// = class EstoqueDeProdutos

// 2) construir o menu (visualmente)

// 3) funções de input de dados - produtos (int, double, string)

// 4) lógica de execução de ações do menu

data class Produto(
    val id: Int,
    val nome: String,
    val preco: Double,
    val quantidade: Int
)

interface Estoque<T> {
    fun inserir(item: T)
    fun deletar(id: Int): Boolean
    fun atualizar(item: T): Boolean
    fun buscar(id: Int): T?
    fun buscarTodos(): List<T>
}

class EstoqueDeProdutos: Estoque<Produto> {
    private val listaProdutos = mutableListOf<Produto>()

    override fun inserir(item: Produto) {
        listaProdutos.add(item)
    }

    override fun deletar(id: Int): Boolean {
        return listaProdutos.removeIf { it.id == id }
    }

    override fun buscar(id: Int): Produto? {
        return listaProdutos.find { it.id == id }
    }

    override fun buscarTodos(): List<Produto> {
        return listaProdutos.toList()
    }

    override fun atualizar(item: Produto): Boolean {
        if (listaProdutos.removeIf { it.id == item.id }) {
            listaProdutos.add(item)
            return true
        } else
            return false
    }

}

fun inserirProdutos(): Produto {
    var id: Int? = null
    println("Insira o ID do produto:")
    while (id == null) {
        print("-> ")
        id = readlnOrNull()?.toIntOrNull()
        if (id == null) {
            println("O ID inserido é inválido. Tente novamente.")
        }
    }

    var nome: String? = null
    println("Insira o NOME do produto:")
    while (nome == null) {
        print("-> ")
        nome = readlnOrNull()
        if (nome == null) {
            println("O NOME inserido é inválido. Tente novamente.")
        }
    }

    var preco: Double? = null
    println("Insira o PREÇO do produto:")
    while (preco == null) {
        print("-> R$ ")
        preco = readlnOrNull()?.toDoubleOrNull()
        if (preco == null) {
            println("O PREÇO inserido é inválido. Tente novamente.")
        }
    }

    var quantidade: Int? = null
    println("Insira a QUANTIDADE do produto em estoque:")
    while (quantidade == null) {
        print("-> ")
        quantidade = readlnOrNull()?.toIntOrNull()
        if (quantidade == null) {
            println("A QUANTIDADE inserida é inválida. Tente novamente.")
        }
    }

    return Produto(
        id = id,
        nome = nome,
        preco = preco,
        quantidade = quantidade
    )
}

fun main() {
    val estoqueDeProdutos = EstoqueDeProdutos()

    var acao: Int? = null
    while(acao != 5) {
        // https://tableconvert.com/ascii-generator
        println(
            """
        +---------------------------------+
        |  CONTROLE DE ESTOQUE - PRODUTOS |
        +---------------------------------+
        |  1 - Adicionar                  |
        |  2 - Atualizar                  |
        |  3 - Deletar                    |
        |  4 - Buscar                     |
        |  5 - Sair                       |
        +---------------------------------+
        """
        )
        println("LISTA ATUAL DE PRODUTOS EM ESTOQUE:")
        println(
            estoqueDeProdutos.buscarTodos().joinToString(
                separator = "\n"
            ).ifEmpty { "Nenhum produto foi adicionado ao estoque até o momento." })
        println("-> ")
        acao = readlnOrNull()?.toIntOrNull()

        when(acao) {
            1 -> {

            }
            2 -> {

            }
            3 -> {

            }
            4 -> {

            }
            5 -> {
                println("Obrigado. Volte sempre!")
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    }
}
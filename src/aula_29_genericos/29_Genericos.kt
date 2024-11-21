package aula_29_genericos

fun <Item> printItem(item: Item) {
    println(item)
}

data class Product(val name: String, val amount: Int)

class Container<T>(val itens: List<T>) : ItemsPrinter<T> {
    fun showItems() {
        println(
            """
                Itens do container:
                ${itens.joinToString()}
            """.trimIndent()
        )
    }

    override fun printItem(item: T) {
        println("Item: $item")
    }
}

interface ItemsPrinter<T> {
    fun printItem(item: T)
}

fun <T> List<T>.secondOrNull(): T? {
    return if (this.size >= 2) this[1] else null
}

fun <T: Comparable<T>> findMax(a: T, b: T): T {
    return if (a > b) a else b
}

fun main() {

    printItem(item = "Kotlin")

    printItem(item = true)

    printItem(item = 1)

    printItem(item = object {
        val name: String = "Kotlin"
        val x: Double = 100.0
    })

    val container1 = Container(
        itens = listOf(
            Product(name = "Laranja", amount = 10),
            Product(name = "Maçã", amount = 20)
        )
    )

    container1.showItems()

    val container2 = Container(
        itens = listOf("Laranja", "Maçã")
    )

    container2.showItems()
    container2.printItem(item = container2.itens.first())

    val productList = listOf(
        Product(name = "Laranja", amount = 10),
        Product(name = "Maçã", amount = 20)
    )

    val productList2 = listOf(
        Product(name = "Laranja", amount = 10)
    )

    println(productList.secondOrNull())
    println(productList2.secondOrNull())

    println(findMax(a = "hello", b = "kotlin"))
    println(findMax(a = 10, b = 100))

}
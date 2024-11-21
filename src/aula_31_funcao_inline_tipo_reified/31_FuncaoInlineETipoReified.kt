package aula_31_funcao_inline_tipo_reified

inline fun executeAction(action1: () -> Unit, action2: () -> Unit, action3: () -> Unit) {
    println("Iniciando a ação...")
    action1()
    action2()
    action3()
    println("Finalizando a ação...")
}

inline fun<reified T> printTypeName() {
    println(T::class.simpleName)
}

open class Drink(val name: String)

class Juice : Drink(name = "Suco")
class Soda : Drink(name = "Refrigerante")
class Coffee : Drink(name = "Café")

class Cup<out T: Drink>(val drink: T, val amount: Int)

inline fun<reified T: Drink> serveDrink(cup: Cup<T>) {
    println("[${T::class.simpleName}] Servindo a bebida ${cup.drink.name} de quantidade ${cup.amount} ml.")
}

fun main() {

    println("Iniciando a ação...")
    println("Executando ação1...")
    println("Executando ação2...")
    println("Executando ação3...")
    println("Finalizando a ação...")

    printTypeName<String>()
    printTypeName<Int>()

    val juice = Juice()
    val juiceCup = Cup(drink = juice, amount = 500)

    serveDrink(cup = juiceCup)
}
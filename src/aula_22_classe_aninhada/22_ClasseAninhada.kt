package aula_22_classe_aninhada

data class Car(val model: String, val year: Int) {

    object Engine {

        data class Fuel(val typeName: String){

            fun fuelCar() {
                println("Abastecendo o carro com $typeName")
            }
        }

        fun start() {
            println("Ligando...")
        }
    }
}

fun main() {

    val car = Car("Chevrolet Onix", year = 2021)
    val carEngine = Car.Engine

    val engine = Car.Engine

    val fuelType = Car.Engine.Fuel(typeName = "Gasolina")

}
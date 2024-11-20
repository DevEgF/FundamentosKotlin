package aula_03_detalhes_tipos_dados

fun main() {

    val age: Int = 20

    // adicionar meses em formato decimal ao inteiro da idade (converter idade em um tip de dado numérico flutuante)

    var ageDouble: Double = age.toDouble()

    val monthPercent: Double = 1.0 / 12

    println("ageDouble = $ageDouble monthPercent = $monthPercent")

    // 2 meses depois

    ageDouble += 2 * monthPercent

    println("ageDouble updated = $ageDouble")

    // mostrar a idade em formato string com padrão "A idade é X anos."

    val ageText: String = "A idade é " + ageDouble.toString().plus(" anos.")

    println(ageText)

    println(ageText.uppercase())
    println(ageText.lowercase())
}
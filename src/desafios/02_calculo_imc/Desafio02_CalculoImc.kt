package desafios.`02_calculo_imc`

import desafios.`02_calculo_imc`.ClassificacaoIMC.Companion.gerarClassificacao
import kotlin.math.pow

fun validarPeso(peso: Double?): Boolean =
    !(peso == null || peso < 0 || peso > 300)


fun validarAltura(altura: Double?): Boolean =
    !(altura == null || altura < 0 || altura > 3)

fun calculaImc(peso: Double, altura: Double): Double =
    peso / altura.pow(2)

fun classificaImc(imc: Double): String {
    return when {
        imc < 18.5 -> "Abaixo do peso"
        imc in 18.5..24.9 -> "Peso normal"
        imc in 25.0..29.9 -> "Sobrepeso"
        imc in 30.0..34.9 -> "Obesidade grau I"
        imc in 35.0..39.9 -> "Obesidade grau II"
        imc > 39.9 -> "Obesidade grau III"
        else -> "Desconhecido"
    }
}

enum class ClassificacaoIMC(val descricao: String) {
    DESCONHECIDO("Desconhecido"),
    ABAIXO_DO_PESO("Abaixo do peso"),
    PESO_NORMAL("Peso normal"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE_GRAU_I( "Obesidade grau I"),
    OBESIDADE_GRAU_II("Obesidade grau II"),
    OBESIDADE_GRAU_III( "Obesidade grau III");

    companion object {
        fun gerarClassificacao(imc: Double): ClassificacaoIMC {
            return when {
                imc < 18.5 -> ABAIXO_DO_PESO
                imc in 18.5..24.9 -> PESO_NORMAL
                imc in 25.0..29.9 -> SOBREPESO
                imc in 30.0..34.9 -> OBESIDADE_GRAU_I
                imc in 35.0..39.9 -> OBESIDADE_GRAU_II
                imc > 39.9 -> OBESIDADE_GRAU_III
                else -> DESCONHECIDO
            }
        }
    }
}

fun main() {

    println("Bem vindo ao cálculo de IMC!")
    println("Informe o seu peso (em kg):")
    println("-> ")

    val peso = readlnOrNull()?.toDoubleOrNull()

    if (!validarPeso(peso = peso)) {
        println("O valor de peso inserido é inválido")
        return
    }

    println("Informe a sua altura (em m):")
    println("-> ")
    val altura = readlnOrNull()?.toDoubleOrNull()

    if (!validarAltura(altura = altura)) {
        println("O valor de altura inserido é invalido")
    }

    val imc = calculaImc(peso = peso!!, altura = altura!!)

    val classificaçãoIMC = gerarClassificacao(imc = imc)

    println("O seu IMC é ${"%.1f".format(imc)} e a sua classificação é: '${classificaçãoIMC.descricao}'.")

}
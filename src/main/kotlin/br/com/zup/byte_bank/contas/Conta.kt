package br.com.zup.byte_bank.contas

// No Kotlin, ao declarar o construtor, é possivel fazer diretamente declarando também as variaveis
abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
) {
    var saldoConta = 0.0
        protected set

    // Companion Object é uma object declaration que faz possivel com que o objeto seja acessivel nas classes filhas
    // porém, só pode ser alterado na classe mae
    companion object Contador {
        var total = 0
            private set

    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldoConta += valor
        }
    }

    abstract fun saca(valor: Double)
}
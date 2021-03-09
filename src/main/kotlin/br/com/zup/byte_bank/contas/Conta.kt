package br.com.zup.byte_bank.contas

// No Kotlin, ao declarar o construtor, é possivel fazer diretamente declarando também as variaveis
abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
) {
    var saldoConta = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldoConta += valor
        }
    }

    abstract fun saca(valor: Double)
}
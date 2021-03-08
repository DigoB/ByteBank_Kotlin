package br.com.zup.byte_bank

// No Kotlin, ao declarar o construtor, é possivel fazer diretamente declarando também as variaveis
abstract class Conta(
    val titular: String,
    val numeroConta: Int
) {
    var saldoConta = 0.0
        // O kotlin trabalha com o bloqueio de set ou get tornando-os privados
        protected set


    fun deposita(valor: Double) {
        if (valor > 0) {
            saldoConta += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldoConta >= valor) {
            saldoConta -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}
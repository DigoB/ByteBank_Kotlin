package br.com.zup.byte_bank

// No Kotlin, ao declarar o construtor, é possivel fazer diretamente declarando também as variaveis
open class Conta(
    val titular: String,
    val numeroConta: Int
) {
    var saldoConta = 0.0
        // O kotlin trabalha com o bloqueio de set ou get tornando-os privados
        private set


    fun deposita(valor: Double) {
        if (valor > 0) {
            saldoConta += valor
        }
    }

    open fun saca(valor: Double) {
        if (saldoConta >= valor) {
            saldoConta -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldoConta >= valor) {
            saldoConta -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}
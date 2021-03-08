package br.com.zup.byte_bank

abstract class ContaTransferivel(
    titular: String,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldoConta >= valor) {
            saldoConta -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}
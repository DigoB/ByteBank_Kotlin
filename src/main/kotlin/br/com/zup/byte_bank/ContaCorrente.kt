package br.com.zup.byte_bank

class ContaCorrente(
    titular: String,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (saldoConta >= valor) {
            saldoConta -= valorComTaxa
        }

    }
}

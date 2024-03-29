package br.com.zup.byte_bank.contas

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : ContaTransferivel(
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
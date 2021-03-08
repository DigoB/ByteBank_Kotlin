package br.com.zup.byte_bank.contas

import br.com.zup.byte_bank.funcionarios.Cliente

class ContaCorrente(
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

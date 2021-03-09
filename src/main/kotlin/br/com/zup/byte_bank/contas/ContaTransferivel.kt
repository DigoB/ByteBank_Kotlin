package br.com.zup.byte_bank.contas

import br.com.zup.byte_bank.exceptions.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {

    fun transfere(valor: Double, destino: Conta) {
        if (saldoConta >= valor) {
            saldoConta -= valor
            destino.deposita(valor)
        } else {
            throw SaldoInsuficienteException()
        }
    }

}
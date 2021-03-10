package br.com.zup.byte_bank.contas

import br.com.zup.byte_bank.exceptions.FalhaAutenticacaoException
import br.com.zup.byte_bank.exceptions.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldoConta >= valor) {
            saldoConta -= valor
            destino.deposita(valor)
        } else {
            throw SaldoInsuficienteException(mensagem = "Saldo insuficiente! Saldo atual: $saldoConta")
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException(mensagem = "Senha incorreta!")
        }
    }

}
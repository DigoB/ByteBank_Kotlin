package br.com.zup.byte_bank.contas

import br.com.zup.byte_bank.contas.Conta
import br.com.zup.byte_bank.funcionarios.Cliente

class ContaSalario(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saca(valor: Double) {
        if(this.saldoConta >= valor){
            this.saldoConta -= valor
        }
    }
}
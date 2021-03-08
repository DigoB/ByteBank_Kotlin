package br.com.zup.byte_bank.contas

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
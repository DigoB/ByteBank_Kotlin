package br.com.zup.byte_bank

class ContaSalario(
    titular: String,
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
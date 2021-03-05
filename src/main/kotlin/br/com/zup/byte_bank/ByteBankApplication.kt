package br.com.zup.byte_bank

fun main() {
    println("Bem vindo ao Byte Bank!")

    val contaCorrente = ContaCorrente(
        titular = "Alguem",
        numeroConta = 1000
    )

    val contaPoupanca = ContaPoupanca(titular = "OutroAlguem", numeroConta = 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo conta corrente: ${contaCorrente.saldoConta}")
    println("Saldo conta corrente: ${contaPoupanca.saldoConta}")

    println("---------------------------------------------------------------")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo conta corrente após saque: ${contaCorrente.saldoConta}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldoConta}")

    println("---------------------------------------------------------------")

    contaCorrente.transfere(200.0,contaPoupanca)
    println("Saldo conta corrente após transferencia da conta poupança: ${contaCorrente.saldoConta}")
    println("Saldo conta poupança após transferencia da conta corrente: ${contaPoupanca.saldoConta}")

}

package br.com.zup.byte_bank

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alguem",
        numeroConta = 1000
    )

    val contaPoupanca = ContaPoupanca(titular = "OutroAlguem", numeroConta = 1001)

    val contaSalario = ContaSalario(titular = "Anyone", numeroConta = 1002)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("Saldo conta corrente: ${contaCorrente.saldoConta}")
    println("Saldo conta corrente: ${contaPoupanca.saldoConta}")
    println("Saldo conta salario: ${contaSalario.saldoConta}")

    println("---------------------------------------------------------------")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("Saldo conta corrente apos saque: ${contaCorrente.saldoConta}")
    println("Saldo conta poupança apos saque: ${contaPoupanca.saldoConta}")
    println("Saldo conta salario apos saque: ${contaSalario.saldoConta}")

    println("---------------------------------------------------------------")

    contaCorrente.transfere(200.0, contaPoupanca)
    println("Saldo conta corrente após transferencia da conta poupança: ${contaCorrente.saldoConta}")
    println("Saldo conta poupança após transferencia da conta corrente: ${contaPoupanca.saldoConta}")


}
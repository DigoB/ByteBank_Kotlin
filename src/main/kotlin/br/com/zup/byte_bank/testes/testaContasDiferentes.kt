package br.com.zup.byte_bank

import br.com.zup.byte_bank.contas.*
import br.com.zup.byte_bank.contas.Conta.Contador.total

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Rodrigo", cpf = "111.111.111-11", senha = 1),
        numeroConta = 1000
    )

    val contaPoupanca = ContaPoupanca(
        Cliente(
            nome = "Rodrigo",
            cpf = "111.111.111-11",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua A",
            )
        ), numeroConta = 1001
    )

    val contaSalario = ContaSalario(
        Cliente(
            nome = "Alguem",
            cpf = "222.222.222-22",
            senha = 2
        ), numeroConta = 1002
    )

    val outraContaPoupanca = ContaPoupanca(
        Cliente(
            nome = "Tal",
            cpf = "111.111.111-11",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua A",
            )
        ), numeroConta = 1003
    )

    println("Nome do titular conta corrente: ${contaCorrente.titular.nome}")
    println("Cpf titular conta corrente: ${contaCorrente.titular.cpf}")
    println("Logradouro do titular conta poupanca: ${contaPoupanca.titular.endereco.logradouro}")

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

    println("---------------------------------------------------------------")

    println("Total de contas criadas:")
    println(total)


}
package br.com.zup.byte_bank

import br.com.zup.byte_bank.contas.*
import jdk.internal.vm.compiler.word.LocationIdentity.init

fun main() {

    testaContasDiferentes()

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

    println("Total de contas: $totalContas")

}
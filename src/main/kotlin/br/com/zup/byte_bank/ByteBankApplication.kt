package br.com.zup.byte_bank

import br.com.zup.byte_bank.contas.*
import br.com.zup.byte_bank.funcionarios.Autenticavel

fun main() {

    // Correcao do push anterior, o que é considerado uma classe anonima é o object declaration, não expression

//    val objeto = object : Autenticavel {
//        val nome: String = "Alguem"
//        val cpf: String = "111.111.111-11"
//        val senha: Int = 1
//
//        override fun autentica(senha: Int) = this.senha == senha
//    }
//
//    println("Nome cliente: ${objeto.nome}")
//    println("Cpf cliente: ${objeto.cpf}")
//    println("------------------------------------------------")


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

    println("-----------------------------------------------")
    println("Total de contas: ${Conta.total}")

}
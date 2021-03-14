package br.com.zup.byte_bank

import br.com.zup.byte_bank.contas.Cliente
import br.com.zup.byte_bank.contas.ContaPoupanca
import br.com.zup.byte_bank.contas.Endereco

fun main() {


}

fun testaRun() {
    // Conta poupança tendo rendimento mensal

    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal: $taxaMensal")


    val contaPoupanca = ContaPoupanca(Cliente(nome = "ALguem", cpf = "111.111.111-11", senha = 1234), 1000)
    contaPoupanca.run {
        deposita(1000.0)
        saldoConta * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento mensal: $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo: Double = contaPoupanca.saldoConta
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Rendimento anual: $rendimentoAnual")
}

fun testaWtih() {
    with(Endereco()) {
        logradouro = "Rua A"
        numero = 1000
        bairro = "Bairro A"
        cidade = "Cidade A"
        estado = "SP"
        complemento = "A"
        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }

    run { }
}

fun testaLet() {
    // Usando high order function, não precisa declarar as variaveis de endereço e enderecoEmMaiusculo
    // O .let já se encarrega de fazer isso automaticamente
    Endereco(logradouro = "rua vergueiro", numero = 1000)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let { enderecoEmMaiusculo ->
            println(enderecoEmMaiusculo)
        }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter { endereco -> endereco.complemento.isNotEmpty() }
        .let { enderecosComComplemento ->
            println(enderecosComComplemento)
        }
}


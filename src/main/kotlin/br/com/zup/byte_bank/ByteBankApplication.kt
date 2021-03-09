package br.com.zup.byte_bank

import br.com.zup.byte_bank.contas.Endereco

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua A")
    val logradouro: String? = enderecoNulo?.logradouro

    // Let é um scope function, traz a funcao para dentro dele e faz a verificacao do nulo sem usar a safe call
    enderecoNulo?.let {
        println(it.logradouro.length)
    }
}











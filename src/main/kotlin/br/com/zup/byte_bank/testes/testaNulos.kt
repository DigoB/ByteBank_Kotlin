package br.com.zup.byte_bank.testes

import br.com.zup.byte_bank.contas.Endereco
import java.lang.IllegalStateException

fun testaNulos() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua A", complemento = "Predio")
    val logradouro: String? = enderecoNulo?.logradouro

    // Let é um scope function, traz a funcao para dentro dele e faz a verificacao do nulo sem usar a safe call
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =

        // ?: Elvis Operator, força o programa a nao devolver nulo, vai devolver o valor da variável
            // ou o numero zero caso seja nulo
            it.complemento?.length ?: throw IllegalStateException("Complemento nao pode ser nulo")
        println(tamanhoComplemento)
    }

    teste("")
    teste(1)
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int
}
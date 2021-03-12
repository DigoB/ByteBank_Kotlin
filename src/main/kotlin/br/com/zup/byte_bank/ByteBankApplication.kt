package br.com.zup.byte_bank

import br.com.zup.byte_bank.contas.Endereco
import java.sql.DriverManager.println

fun main() {

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


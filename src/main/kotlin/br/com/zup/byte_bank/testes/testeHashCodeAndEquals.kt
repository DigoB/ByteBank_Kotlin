package br.com.zup.byte_bank.testes

import br.com.zup.byte_bank.contas.Endereco

class testeHashCodeAndEquals {

    fun testeHashCodeAndEquals() {
        val endereco = Endereco(
            logradouro = "Rua Tal",
            numero = 100,
            complemento = "A",
            bairro = "Algum",
            cidade = "Alguma",
            estado = "Algum",
            cep = "000000-000"
        )
        val outroEndereco = Endereco(
            logradouro = "Rua Alguma",
            numero = 1002,
            complemento = "B",
            bairro = "Tal",
            cidade = "Tal",
            estado = "Tal",
            cep = "11111-111"
        )

        println(endereco.equals(endereco))
        println(outroEndereco.equals(outroEndereco))
        println("---------------------------------------")
        println(endereco.equals(outroEndereco))
        println(outroEndereco.equals(endereco))
        println("---------------------------------------")
        println(endereco.hashCode())
        println(outroEndereco.hashCode())
        println("---------------------------------------")
        println(endereco.toString())
        println("---------------------------------------")
        println(outroEndereco.toString())

        // O tipo "Any", reconhece e trabalha com todos os tipos
        fun imprime(valor: Any) {
            println(valor)
        }

        // Exemplo do any, onde é usado Int, Double e String com o mesmo tipo
        imprime(1)
        imprime(1.0)
        imprime("Teste")

        // Dessa forma, é possivel utilizar o any para trazer as classes do projeto
        val teste: Any = imprime(endereco)
        println(teste)
    }
}
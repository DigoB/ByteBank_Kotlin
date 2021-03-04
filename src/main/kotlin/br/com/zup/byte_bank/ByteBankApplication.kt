package br.com.zup.byte_bank

fun main() {
    println("Bem vindo ao Byte Bank!")

    for (i in 1..5) {
        // O kotlin identifica implicitamente o tipo da variavel, nesse caso, uma String
        val titular = "Rodrigo $i"

        // Para deixar explicito o tipo da variavel, é da seguinte forma
        val numeroConta: Int = 1000 + i

        // Para uma variavel que pode ser alterada, utilizamos o var, quando não vai ser alterada, usamos o val
        var saldoConta = 10 + i

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldoConta")

    }

    // ---------------------------------------------------------------------------

    // Faz o for de forma decrescente pulando de 2 em 2
    for (i in 5 downTo 1 step 2) {

        // Faz uma pausa na posicao 4, se colocar continue no lugar do break, ele pula  4
        if (i == 4) {
            break
        }
        val titular = "Rodrigo $i"

        val numeroConta: Int = 1000 + i

        var saldoConta = 10 + i

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldoConta")

        // ---------------------------------------------------------------------------

        var i = 0
        while (i < 5) {
            val titular = "Rodrigo $i"

            val numeroConta: Int = 1000 + i

            var saldoConta = 10 + i
            println("Titular: $titular")
            println("Número da conta: $numeroConta")
            println("Saldo da conta: $saldoConta")
            // Faz a contagem do i + 1 e evita looping infinito
            i++

        }

//    testaCondicoes(saldoConta)

    }

    // Criado para separar as funcoes de condicao
    fun testaCondicoes(saldoConta: Double) {

        if (saldoConta > 0.0) {
            println("Saldo da conta é positivo!")
        } else if (saldoConta == 0.0) {
            println("Saldo da conta é neutro")
        } else {
            println("Saldo da conta é negativo")
        }

        // Funcao When, faz a mesma coisa que o if acima

        when {
            saldoConta > 0.0 -> {
                println("Saldo da conta é positivo!")
            }
            saldoConta == 0.0 -> {
                println("Saldo da conta é neutro")
            }
            else -> {
                println("Saldo da conta é negativo")
            }
        }
    }
}

package br.com.zup.byte_bank

fun main() {
    println("Bem vindo ao Byte Bank!")

    // O kotlin identifica implicitamente o tipo da variavel, nesse caso, uma String
    val titular = "Rodrigo"

    // Para deixar explicito o tipo da variavel, é da seguinte forma
    val numeroConta: Int = 1000

    // Para uma variavel que pode ser alterada, utilizamos o var, quando não vai ser alterada, usamos o val
    var saldoConta = 0.0
    saldoConta = 200.0

    // O Kotlin altera automaticamente a expressao "saldoConta = saldoConta + 100 para a expressao abaixo
    // seguindo a boa pratica
    saldoConta += 100

    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo da conta: $saldoConta")

    if(saldoConta > 0.0) {
        println("Saldo da conta é positivo!")
    } else if(saldoConta == 0.0) {
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

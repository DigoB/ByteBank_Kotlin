package br.com.zup.byte_bank

fun main() {
    println("Bem vindo ao Byte Bank!")

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numeroConta = 1000
    contaAlex.saldoConta = 200.0

    println("Titular da conta: ${contaAlex.titular}")
    println("Numero da conta: ${contaAlex.numeroConta}")
    println("Saldo da conta: ${contaAlex.saldoConta}")
    println("---------------------------------------------------------")

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numeroConta = 1001
    contaFran.saldoConta = 300.0

    println("Titular da conta: ${contaFran.titular}")
    println("Numero da conta: ${contaFran.numeroConta}")
    println("Saldo da conta: ${contaFran.saldoConta}")

    println("---------------------------------------------------------")
    println("Depositando na conta do Alex:")
    contaAlex.deposita(50.0)
    println("Saldo atualizado: ${contaAlex.saldoConta}")
    println("---------------------------------------------------------")
    println("Depositando na conta da Fran:")
    contaFran.deposita(70.0)
    println("Saldo atualizado: ${contaFran.saldoConta}")
    println("---------------------------------------------------------")
    println("Sacando da conta do Alex")
    contaAlex.saca(250.0)
    println("Saldo atualizado: ${contaAlex.saldoConta}")
    println("---------------------------------------------------------")
    println("Sacando da conta da Fran")
    contaFran.saca(100.0)
    println("Saldo atualizado: ${contaFran.saldoConta}")
    println("---------------------------------------------------------")
    println("Teste saque em excesso Alex")
    contaAlex.saca(100.0)
    println("Saldo atualizado: ${contaAlex.saldoConta}")
    println("---------------------------------------------------------")
    println("Teste saque em excesso Fran")
    contaFran.saca(500.0)
    println("Saldo atualizado: ${contaFran.saldoConta}")


}

class Conta() {
    var titular = ""
    var numeroConta = 0
    var saldoConta = 0.0

    fun deposita(valor: Double) {
        saldoConta += valor
    }

    fun saca(valor: Double) {
        if(saldoConta >= valor){
            saldoConta -= valor
        }
    }
}

fun testaLacos() {
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

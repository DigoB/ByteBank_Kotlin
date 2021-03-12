package br.com.zup.byte_bank.testes

fun testaIdades() {
    // Verificando maior idade de uma lista pelo caminho ruim
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if (idade3 > idade4) {
        idade3
    } else {
        idade4
    }

    println("Maior idade: $maiorIdade")

    println("-----------------------------------------------------------------------")

    // Criando array de idades, a cada novo dado deve aumentar o numero do tamanho do array
    val idades = IntArray(5)
    idades[0] = 16
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20
    idades[4] = 50

    var maiorIdade2 = 0
    for (idade in idades) {
        if (idade > maiorIdade2) {
            maiorIdade2 = idade
        }
    }
    println("Maior idade: $maiorIdade2")

    println("-----------------------------------------------------------------------")

    // Dessa forma, declara os elementos do array diretamente, e não é necessário aumentar o tamanho do mesmo
    val idades2: IntArray = intArrayOf(25, 19, 33, 20, 50, 55)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20
    idades[4] = 50

    var maiorIdade3 = Int.MIN_VALUE
    for (idade in idades2) {
        if (idade > maiorIdade3) {
            maiorIdade3 = idade
        }
    }

    // Faz o mesmo que a funcao acima automaticamente
    val idades3: IntArray = intArrayOf(25, 19, 33, 20, 50, 55)
    val maiorIdade4 = idades3.maxOrNull()
    println("Maior idade abreviada: $maiorIdade4")


    // "forEach" trabalha com o array em forma de função ao invés de loop como o "for"
    var menorIdade = Int.MAX_VALUE
    idades2.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    // Faz o mesmo que a funcao acima automaticamente
    val idade5: IntArray = intArrayOf(25, 19, 33, 20, 50, 55)
    val menorIdade2 = idade5.minOrNull()
    println("Menor idade abreviada: $menorIdade2")

    println("Maior idade: $maiorIdade3")
    println("Menor idade: $menorIdade")

    println("-----------------------------------------------------------")
    println("-----------------------------------------------------------")

    // Calcula a média dos valores do indice
    val media = idades.average()
    println("Média: $media")

    println("-----------------------------------------------------------")
    println("-----------------------------------------------------------")
    val maioresDeIdade = idades.all { it > 18 }
    println("Todos Maiores? $maioresDeIdade")
}
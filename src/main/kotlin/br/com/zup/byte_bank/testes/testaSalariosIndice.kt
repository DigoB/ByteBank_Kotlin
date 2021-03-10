package br.com.zup.byte_bank.testes

fun testaSalariosIndice() {
    val salarios: DoubleArray = doubleArrayOf(1000.0, 2000.0, 3000.0, 4000.0, 5000.0)

    val aumento = 1.1
//    var indice = 0
//    for (salario in salarios) {
//        salarios[indice] = salario * aumento
//        indice++
//    }
//    println(salarios.contentToString())
//
//    // Tem o mesmo efeito do exemplo acima, mas não precisa implementar a logica de adição manualmente
//    for (indice in salarios.indices) {
//        salarios[indice] = salarios[indice] * aumento
//    }
//    println(salarios.contentToString())

    // Já traz tanto o salario como o indice dele, é uma implementacao que implementa as duas acima em uma só
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())
}
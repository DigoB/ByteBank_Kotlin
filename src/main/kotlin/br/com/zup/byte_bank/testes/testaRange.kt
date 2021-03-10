package br.com.zup.byte_bank.testes

fun testaRange() {
    val serie = 0..10
    // O "it " traz o resultado
    serie.forEach { print("$it ") }
    println()
    println("-------------------------------------")

    val numerosPares = 0..10 step 2
    numerosPares.forEach { print(" $it ") }
    println()
    println("-------------------------------------")

    // until percorre a lista sem contar o valor 10
    val numerosParesUntil = 0 until 10 step 2
    numerosParesUntil.forEach { print("$it ") }

    println()
    println("-------------------------------------")

    val numerosParesReverso = 10 downTo 0 step 2
    numerosParesReverso.forEach { println("$it ") }

    println()
    println("-------------------------------------")
    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    println()
    println("-------------------------------------")

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}
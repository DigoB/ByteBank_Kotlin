package br.com.zup.byte_bank

fun main() {

    testaComportamentosConta()
    println("----------------------------------------------------")
    println("Inicio da funcao main")
    funcao1()
}

fun funcao1() {
    println("Inicio da funcao 1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        println("ClassCastException foi pegada")
        e.printStackTrace()
    }
    println("Fim da funcao 1")
}

fun funcao2() {
    println("Inicio da funcao 2")
    for (i in 1..5) {
        print(i)
        val endereco = Any()
    }
    println("Fim da funcao 2")
}









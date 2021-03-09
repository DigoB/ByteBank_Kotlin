package br.com.zup.byte_bank

import br.com.zup.byte_bank.contas.Endereco
import java.lang.ClassCastException

fun main() {
    println("Inicio da funcao main")
    funcao1()
    println("Fim da funcao main")
}

fun funcao1() {
    println("Inicio da funcao 1")
    funcao2()
    println("Fim da funcao 1")
}

fun funcao2() {
    try {
        for (i in 1..5) {
            println(i)
            val endereco = Any()
            endereco as Endereco
        }
    } catch (e: ClassCastException) {
        println("Nao é possivel fazer cast da classe!")
    }

    println("Fim da funcao 2")
}







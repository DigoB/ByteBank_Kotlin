package br.com.zup.byte_bank

fun main() {
    println("Bem vindo ao Byte Bank!")

    val funcionario = Funcionario(
        nome = "Rodrigo",
        cpf = "111.111.111-11",
        salario = 1000.0,
        tipo = 0
    )

    println("Nome: ${funcionario.nome}")
    println("Cpf: ${funcionario.cpf}")
    println("Salario: ${funcionario.salario}")

    println("Bonificacao: ${funcionario.bonificacao()}")
}
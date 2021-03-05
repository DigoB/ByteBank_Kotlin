package br.com.zup.byte_bank

fun main() {
    println("Bem vindo ao Byte Bank!")

    val funcionario = Funcionario(
        nome = "Rodrigo",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )

    println("Nome: ${funcionario.nome}")
    println("Cpf: ${funcionario.cpf}")
    println("Salario: ${funcionario.salario}")

    println("Bonificacao: ${funcionario.bonificacao()}")

    val gerente = Gerente(
        nome = "Alguem",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println ("Nome: ${gerente.nome}")
    println ("Cpf: ${gerente.cpf}")
    println ("Salario: ${gerente.salario}")

    println ("Bonificacao: ${gerente.bonificacao()}")

    if (gerente.autentica(1234)){
        println("Autenticação feita com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

}
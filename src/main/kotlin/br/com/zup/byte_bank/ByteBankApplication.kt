package br.com.zup.byte_bank

fun main() {
    println("Bem vindo ao Byte Bank!")

    val funcionario = Funcionario(
        nome = "Funcionario ",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )

    println("Nome: ${funcionario.nome}")
    println("Cpf: ${funcionario.cpf}")
    println("Salario: ${funcionario.salario}")

    println("Bonificacao: ${funcionario.bonificacao}")

    println("---------------------------------------------------------")

    val gerente = Gerente(
        nome = "Gerente",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println ("Nome: ${gerente.nome}")
    println ("Cpf: ${gerente.cpf}")
    println ("Salario: ${gerente.salario}")

    println ("Bonificacao: ${gerente.bonificacao}")

    if (gerente.autentica(1234)){
        println("Autenticação feita com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

    println("---------------------------------------------------------")

    val diretor = Diretor(
        nome = "Diretor",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println ("Nome: ${diretor.nome}")
    println ("Cpf: ${diretor.cpf}")
    println ("Salario: ${diretor.salario}")

    println ("Bonificacao: ${diretor.bonificacao}")
    println("Valor PLR: ${diretor.plr}")

    if (gerente.autentica(4000)){
        println("Autenticação feita com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

}
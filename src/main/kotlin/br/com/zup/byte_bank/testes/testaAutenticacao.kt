package br.com.zup.byte_bank

import br.com.zup.byte_bank.funcionarios.Cliente
import br.com.zup.byte_bank.funcionarios.Diretor
import br.com.zup.byte_bank.funcionarios.Gerente
import br.com.zup.byte_bank.funcionarios.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Rodrigo",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )

    val diretor = Diretor(
        nome = "Alguem",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente(nome = "OutroAlguem",cpf = "333.333.333-33", senha = 1234)

    val login = SistemaInterno()
    println("-------------------------------------")
    login.entra(gerente, senha = 1000)
    println("-------------------------------------")
    login.entra(diretor, senha = 2000)
    println("-------------------------------------")
    login.entra(cliente, senha = 1234)
}
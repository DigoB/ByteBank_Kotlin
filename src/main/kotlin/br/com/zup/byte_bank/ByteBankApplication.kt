package br.com.zup.byte_bank

fun main() {

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

    val login = SistemaInterno()
    login.entra(gerente, senha = 1000)
    login.entra(diretor, senha = 2000)

}
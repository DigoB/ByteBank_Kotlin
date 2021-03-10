package br.com.zup.byte_bank

import br.com.zup.byte_bank.contas.ContaCorrente
import br.com.zup.byte_bank.contas.Cliente
import br.com.zup.byte_bank.exceptions.FalhaAutenticacaoException
import br.com.zup.byte_bank.exceptions.SaldoInsuficienteException

fun testaComportamentosConta() {
    // É possivel deixar explicito os parametros do construtor, isso é chamado de Label. Ver conta da Fran
    val contaAlex = ContaCorrente(
        Cliente(
            nome = "Rodrigo",
            cpf = "111.111.111-11",
            senha = 1
        ), numeroConta = 1000
    )

    contaAlex.deposita(200.0)

    println("Titular da conta: ${contaAlex.titular}")
    println("Numero da conta: ${contaAlex.numeroConta}")
    println("Saldo da conta: ${contaAlex.saldoConta}")
    println("---------------------------------------------------------")

    // Ao deixar os parametros explicitos, é possivel alterar a ordem do construtor no Kotlin
    val contaFran = ContaCorrente(
        numeroConta = 1001,
        titular = Cliente(nome = "Alguem", cpf = "222.222.222-22", senha = 2)
    )
    contaFran.deposita(300.0)

    println("Titular da conta: ${contaFran.titular}")
    println("Numero da conta: ${contaFran.numeroConta}")
    println("Saldo da conta: ${contaFran.deposita(200.0)}")

    println("---------------------------------------------------------")
    println("Depositando na conta do Alex:")
    contaAlex.deposita(50.0)
    println("Saldo atualizado: ${contaAlex.saldoConta}")
    println("---------------------------------------------------------")
    println("Depositando na conta da Fran:")
    contaFran.deposita(70.0)
    println("Saldo atualizado: ${contaFran.saldoConta}")
    println("---------------------------------------------------------")
    println("Sacando da conta do Alex")
    contaAlex.saca(50.0)
    println("Saldo atualizado: ${contaAlex.saldoConta}")
    println("---------------------------------------------------------")
    println("Sacando da conta da Fran")
    contaFran.saca(100.0)
    println("Saldo atualizado: ${contaFran.saldoConta}")
    println("---------------------------------------------------------")
    println("Teste saque em excesso Alex")
    contaAlex.saca(100.0)
    println("Saldo atualizado: ${contaAlex.saldoConta}")
    println("---------------------------------------------------------")
    println("Teste saque em excesso Fran")
    contaFran.saca(500.0)
    println("Saldo atualizado: ${contaFran.saldoConta}")
    println("---------------------------------------------------------")
    println("Efetuando transferencia da conta da Fran para a do Alex")

    try {
        contaFran.transfere(valor = 100.0, destino = contaAlex, senha = 2)
        println("Transferencia bem sucedida!")
    } catch (e: SaldoInsuficienteException) {
        println("Saldo insuficiente!")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferencia")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro inesperado!")
        e.printStackTrace()
    }

    println("Saldo Alex atualizado: ${contaAlex.saldoConta}")
    println("Saldo Fran atualizado: ${contaFran.saldoConta}")

    println("Falha na transferencia!")
    println("Saldo conta Alex: ${contaAlex.saldoConta}")
    println("Saldo conta Fran: ${contaFran.saldoConta}")
}
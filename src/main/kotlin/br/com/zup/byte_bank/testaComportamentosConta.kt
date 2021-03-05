package br.com.zup.byte_bank

fun testaComportamentosConta() {
    // É possivel deixar explicito os parametros do construtor, isso é chamado de Label. Ver conta da Fran
    val contaAlex = Conta(titular = "Alex", numeroConta = 1000)

    contaAlex.deposita(200.0)

    println("Titular da conta: ${contaAlex.titular}")
    println("Numero da conta: ${contaAlex.numeroConta}")
    println("Saldo da conta: ${contaAlex.saldoConta}")
    println("---------------------------------------------------------")

    // Ao deixar os parametros explicitos, é possivel alterar a ordem do construtor no Kotlin
    val contaFran = Conta(numeroConta = 1001, titular = "Fran")
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
    contaAlex.saca(250.0)
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
    if (contaFran.transfere(valor = 100.0, destino = contaAlex)) {
        println("Transferencia bem sucedida!")
        println("Saldo Alex atualizado: ${contaAlex.saldoConta}")
        println("Saldo Fran atualizado: ${contaFran.saldoConta}")
    } else {
        println("Falha na transferencia!")
        println("Saldo conta Alex: ${contaAlex.saldoConta}")
        println("Saldo conta Fran: ${contaFran.saldoConta}")
    }
}
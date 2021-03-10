package br.com.zup.byte_bank.contas

import br.com.zup.byte_bank.funcionarios.Autenticavel

// No Kotlin, ao declarar o construtor, é possivel fazer diretamente declarando também as variaveis
abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
) : Autenticavel{
    var saldoConta = 0.0
        protected set

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    // Companion Object é uma object declaration que faz possivel com que o objeto seja acessivel nas classes filhas
    // porém, só pode ser alterado na classe mae
    companion object Contador {
        var total = 0
            private set
    }

    init {
        println("Criando conta...")
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldoConta += valor
        }
    }

    abstract fun saca(valor: Double)
}
package br.com.zup.byte_bank.contas

// Variavel global, pode ser acessada e alterada em qualquer ponto do projeto
var totalContas = 0
    // Se for declarada como privado, será alterada globalmente dentro do arquivo, por todas as classes que ele tiver.
    private set

// No Kotlin, ao declarar o construtor, é possivel fazer diretamente declarando também as variaveis
abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
) {
    var saldoConta = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldoConta += valor
        }
    }

    init {
        totalContas++
    }

    abstract fun saca(valor: Double)
}
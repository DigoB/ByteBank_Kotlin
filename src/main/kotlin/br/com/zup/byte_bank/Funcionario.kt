package br.com.zup.byte_bank

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    abstract val bonificacao: Double

}
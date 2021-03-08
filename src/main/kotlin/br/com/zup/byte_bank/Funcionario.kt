package br.com.zup.byte_bank

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    // Função transformada em property, tem a mesma finalidade
    open val bonificacao: Double get() = salario * 0.1

}
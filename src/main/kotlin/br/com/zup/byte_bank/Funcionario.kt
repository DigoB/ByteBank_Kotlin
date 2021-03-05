package br.com.zup.byte_bank

class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    fun bonificacao(): Double {
        return salario * 0.1
    }
}
package br.com.zup.byte_bank.funcionarios

import br.com.zup.byte_bank.funcionarios.FuncionarioAdmin

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){
    override val bonificacao: Double get() = salario * 0.2

}
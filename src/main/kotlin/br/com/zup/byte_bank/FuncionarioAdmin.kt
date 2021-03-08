package br.com.zup.byte_bank

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
// Implementando a interface aqui na classe mae, as classes Diretor e Gerente nao precisam implementar novamente
), Autenticavel{

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}
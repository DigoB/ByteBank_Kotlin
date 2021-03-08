package br.com.zup.byte_bank.funcionarios

import br.com.zup.byte_bank.funcionarios.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
}
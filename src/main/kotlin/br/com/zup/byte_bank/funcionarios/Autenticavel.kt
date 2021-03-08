package br.com.zup.byte_bank.funcionarios

interface Autenticavel {

    fun autentica(senha: Int) : Boolean
}
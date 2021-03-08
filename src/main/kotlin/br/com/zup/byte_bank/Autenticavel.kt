package br.com.zup.byte_bank

interface Autenticavel {

    fun autentica(senha: Int) : Boolean
}
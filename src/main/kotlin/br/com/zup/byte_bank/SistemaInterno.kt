package br.com.zup.byte_bank

class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if(admin.autentica(senha)) {
            println("Bem vindo ao ByteBank!")
        } else {
            println("Falha na autenticacao")
        }
    }
}
package br.com.zup.byte_bank.contas

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var complemento: String = "",
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = ""


) {
    override fun toString(): String {
        return """
            Endereco(logradouro='$logradouro',
             numero=$numero,
              complemento='$complemento',
               bairro='$bairro',
                cidade='$cidade',
                 estado='$estado',
                  cep='$cep')
                  """.trimIndent()
    }
}



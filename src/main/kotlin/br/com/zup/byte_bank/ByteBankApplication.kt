package br.com.zup.byte_bank

import br.com.zup.byte_bank.functionTypes.testaFunctionTypeClasse
import br.com.zup.byte_bank.functionTypes.testaFunctionTypeReferencia

fun main() {

//    // Criando função anonima
//    // A criação é feita com o fun() depois de declarar o retorno, nesse caso, Unit
//    val minhaFuncaoLambda: () -> Unit = fun() {
//        println("Executa como lambda")
//    }
//    // Parenteses iniciando a variável transformada em função
//    println(minhaFuncaoLambda())

    testaFunctionTypeReferencia()
    testaFunctionTypeClasse()

}
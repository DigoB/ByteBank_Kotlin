package br.com.zup.byte_bank

import br.com.zup.byte_bank.functionTypes.testaFunctionTypeClasse
import br.com.zup.byte_bank.functionTypes.testaFunctionTypeReferencia

fun main() {

//     Criando função anonima
//     A criação é feita com o fun() depois de declarar o retorno, nesse caso, Unit
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println("Soma com funcao anonima: ${minhaFuncaoAnonima(20,10)}")

    // faz a mesma coisa que a função anonima, mas é menos expressiva
    // a, b são os apelidos dos numeros q são somados
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println("Soma com expressão lambda: ${minhaFuncaoLambda(15, 10)}")
    // Parenteses iniciando a variável transformada em função

    testaFunctionTypeReferencia()
    testaFunctionTypeClasse()

}
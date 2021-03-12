package br.com.zup.byte_bank.functionTypes

fun testaFuncaoAnonima() {
    //     Criando função anonima
//     A criação é feita com o fun() depois de declarar o retorno, nesse caso, Unit
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println("Soma com funcao anonima: ${minhaFuncaoAnonima(20, 10)}")
}

fun testaFuncaoLambda() {
    // faz a mesma coisa que a função anonima, mas é menos expressiva
    // a, b são os apelidos dos numeros q são somados
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println("Soma com expressão lambda: ${minhaFuncaoLambda(15, 10)}")
    // Parenteses iniciando a variável transformada em função

    testaFunctionTypeReferencia()
    testaFunctionTypeClasse()

    println("------------------------------------------------------")

    println("Calculo de bonificação com lambda usando Label")

    val calculadoraBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        salario + 100.0
    }
    println(calculadoraBonificacao(1100.0))
}
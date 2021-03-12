package br.com.zup.byte_bank.functionTypes

fun testaFunctionTypeClasse() {
    // Mesmo comportamento da variavel anterior, mas trabalhando com a classe Teste
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    // Parenteses novamente para executar a função
    println("Soma usando a classe: ${minhaFuncaoClasse(10, 10)}")
}

class Soma : (Int, Int) -> Int {
    // Método invoke necessário quando vamos usar uma classe como funcion type
    override fun invoke(a: Int, b: Int): Int = a + b

}

fun testaFunctionTypeReferencia() {
    // Criando uma function type
    // Os () determinam os parametros que podem ser recebidos no function type, quando não temos deixamos em branco
    // -> é para dividir entre os parametros e o tipo de retorno
    // :: faz referencia à função que vai ser iniciada
    val minhaFuncao: (Int, Int) -> Int = ::soma
    // Transformando a variavel "minhaFuncao" em uma função, os () executam a função
    println("Valor da soma: ${minhaFuncao(5, 10)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}
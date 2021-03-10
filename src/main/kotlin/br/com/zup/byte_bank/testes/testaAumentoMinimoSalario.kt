package br.com.zup.byte_bank.testes

import java.math.BigDecimal
import java.math.RoundingMode

fun testaAumentoMinimoSalario() {
    val salarios = Array<BigDecimal>(size = 5) { BigDecimal.ZERO }
    salarios[0] = "2000.43".toBigDecimal()
    salarios[1] = "1000.55".toBigDecimal()
    println(salarios.contentToString())


    // O Kotlin não possui função de array para o BigDecimal, por isso essa função foi criada
    // vararg possibilita passar argumentos variaveis em uma função, ou seja, não precisa colocar o tamanho do array
    fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
        // vararg sendo utilizado no valores.size
        return Array<BigDecimal>(valores.size) { i ->
            // Acessa cada valor no indice "i" e converte para BigDecimal
            valores[i].toBigDecimal()
        }
    }
    println("---------------------------------------------------------------")

    // Aplicacao da funcao bigDecimalArrayOf criada, facilitando a criação do Array
    val salariosRefatorado = bigDecimalArrayOf("2000.43", "1000.55", "5000.0", "10000.0")
    println(salariosRefatorado.contentToString())


    val aumento = "1.1".toBigDecimal()
    // Ao usar o .forEach, o array original era percorrido e alterado com os valores necessários,
    // Já usando o map, ele cria uma nova lista com os novos valores e mantém também o array original
    val salariosComAumento: Array<BigDecimal> = salariosRefatorado
        // setScale faz a limitação e arredondamento de casas decimais
        .map { salario ->
            // Logica para aumento minimo de salario de 500.00
            calculaAumento(salario, aumento)
        }
        .toTypedArray()

    println("---------------------------------------------------------------")
    println(salariosComAumento.contentToString())

    val somaDosSalarios = salariosComAumento.somatoria()
    println("---------------------------------------------------------------")
    println("Soma de todos os salarios: $somaDosSalarios")

    // Função para calcular o total de gastos com o aumento no período de 6 meses
    val meses = 6.toBigDecimal()
    // O fold, diferentemente do reduce, precisa receber um valor inicial, nesse caso "somaDosSalarios"
    val gastoTotal = salariosComAumento.fold(somaDosSalarios) { acumulador, valorSalario ->
        acumulador + (valorSalario * meses).setScale(2,RoundingMode.UP)
    }
    println("Gasto total em 6 meses: $gastoTotal")
}

private fun calculaAumento(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        salario * aumento.setScale(2, RoundingMode.UP)
    }

// Função criada para fazer a soma dos valores do array em BigDecimal
fun Array<BigDecimal>.somatoria(): BigDecimal {
    // "reduce", reduz todos os valores do array em um valor unico. Implementado para fazer isso por uma soma de valores
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}
package br.com.zup.byte_bank.testes

import br.com.zup.byte_bank.services.bigDecimalArrayOf
import br.com.zup.byte_bank.services.calculaAumento
import br.com.zup.byte_bank.services.media
import br.com.zup.byte_bank.services.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun testaAumentoSalarios() {
    val salarios = Array<BigDecimal>(size = 5) { BigDecimal.ZERO }
    salarios[0] = "2000.43"
        .toBigDecimal()
        .setScale(2, RoundingMode.UP)
    salarios[1] = "1000.55"
        .toBigDecimal()
        .setScale(2, RoundingMode.UP)
    println(salarios.contentToString())


    // O Kotlin não possui função de array para o BigDecimal, por isso essa função foi criada
    // vararg possibilita passar argumentos variaveis em uma função, ou seja, não precisa colocar o tamanho do array

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
            calculaAumento(salario, aumento).setScale(2, RoundingMode.UP)
        }
        .toTypedArray()

    println("---------------------------------------------------------------")
    println(salariosComAumento.contentToString())

    val somaDosSalarios = salariosComAumento
        .somatoria()
        .setScale(2, RoundingMode.UP)
    println("---------------------------------------------------------------")
    println("Soma de todos os salarios: $somaDosSalarios")

    // Função para calcular o total de gastos com o aumento no período de 6 meses
    val meses = 6.toBigDecimal()
    // O fold, diferentemente do reduce, precisa receber um valor inicial, nesse caso "somaDosSalarios"
    val gastoTotal = salariosComAumento.fold(somaDosSalarios) { acumulador, valorSalario ->
        acumulador + (valorSalario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto total em 6 meses: $gastoTotal")

    // sorted ordena os valores de forma crescente
    val salariosOrdenados = salariosComAumento.sorted()
    // TakeLast busca os tres ultimos valores do array, nesse caso, os tres maiores salarios
    // toTypedArray pois o takelast devolve um List, e não um Array
    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados
        .takeLast(3)
        .toTypedArray()
    val media = tresUltimosSalarios
        .media()
        .setScale(2,RoundingMode.UP)

    // Faz o mesmo que a função acima
    val media1 = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println("Media tres maiores salarios: $media")
    println("Media tres maiores salarios refatorado: $media1")

    println("--------------------------------")
    val mediaMenoresValores = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println("Media tres menores valores: $mediaMenoresValores")
}
package br.com.zup.byte_bank.services

import java.math.BigDecimal
import java.math.RoundingMode

// Função criada para fazer a soma dos valores do array em BigDecimal
fun Array<BigDecimal>.somatoria(): BigDecimal {
    // "reduce", reduz todos os valores do array em um valor unico. Implementado para fazer isso por uma soma de valores
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    // vararg sendo utilizado no valores.size
    return Array<BigDecimal>(valores.size) { i ->
        // Acessa cada valor no indice "i" e converte para BigDecimal
        valores[i].toBigDecimal()
    }
}

fun calculaAumento(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        salario * aumento.setScale(2, RoundingMode.UP)
    }

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}
package br.com.curso.model

import java.math.BigDecimal

data class VendaInput(
    val cliente: String,
    val veiculo: Long,
    val valor: BigDecimal,
    val quantidadedeParcelas: Int
)

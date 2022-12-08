package br.com.curso.model

import java.math.BigDecimal

@NoArg
data class VendaInput(
    var cliente: String,
    var veiculo: Long,
    var valor: BigDecimal,
    var quantidadedeParcelas: Int
)

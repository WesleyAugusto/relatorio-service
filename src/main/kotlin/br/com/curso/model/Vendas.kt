package br.com.curso.model

data class Vendas(
    val cliente: String,
    val veiculo: Veiculo,
    val venda: VendaInput,
    val parcelas: List<Parcela>
)


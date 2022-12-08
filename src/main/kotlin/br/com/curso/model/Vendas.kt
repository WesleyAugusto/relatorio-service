package br.com.curso.model

@NoArg
data class Vendas(
    var cliente: String,
    var veiculo: Veiculo,
    var venda: VendaInput,
    var parcelas: List<Parcela>
)


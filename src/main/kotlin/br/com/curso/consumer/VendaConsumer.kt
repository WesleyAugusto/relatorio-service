package br.com.curso.consumer

import br.com.curso.model.Vendas
import br.com.curso.service.VendaService
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaListener
class VendaConsumer(private val vendaService: VendaService) {

    @Topic("ms-vendas")
    fun recebervenda(@KafkaKey id: String, vendas: Vendas) {
        vendaService.create(vendas)
        println(vendas)

    }
}
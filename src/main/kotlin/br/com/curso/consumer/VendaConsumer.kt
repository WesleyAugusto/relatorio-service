package br.com.curso.consumer

import br.com.curso.model.Vendas
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaListener
class VendaConsumer() {

    @Topic("ms-vendas")
    fun recebervenda(@KafkaKey id: String, vendas: Vendas) {
        println(vendas)

    }
}
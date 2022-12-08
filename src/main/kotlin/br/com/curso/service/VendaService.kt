package br.com.curso.service

import br.com.curso.model.Vendas
import br.com.curso.repository.VendasRepository
import jakarta.inject.Singleton


@Singleton
class VendaService (private val vendasRespository:VendasRepository) {

    fun create (vendas: Vendas){
        vendasRespository.create(vendas)
    }
    fun getAll():List<Vendas>{
        return vendasRespository.getAll()
    }
}
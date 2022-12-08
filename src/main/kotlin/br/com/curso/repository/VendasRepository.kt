package br.com.curso.repository

import br.com.curso.model.Vendas
import com.mongodb.client.MongoClient
import com.mongodb.client.result.InsertOneResult
import jakarta.inject.Singleton


@Singleton
class VendasRepository(private val mongoClient:MongoClient) {

    fun create(venda:Vendas):InsertOneResult{
         return getConnection().insertOne(venda)

    }
    fun getConnection() = mongoClient.getDatabase("vendas").getCollection("vendas",Vendas::class.java)

    fun getAll():List<Vendas>{
        return getConnection().find().toList()
    }
}
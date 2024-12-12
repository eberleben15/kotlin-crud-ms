package com.example.kotlincrudms.service

import com.example.kotlincrudms.model.Product
import com.example.kotlincrudms.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(private val repository: ProductRepository) {

    fun getAllProducts(): List<Product> = repository.findAll()

    fun getProductById(id: Long): Product = repository.findById(id).orElseThrow { 
        IllegalArgumentException("Product not found") 
    }

    fun createProduct(product: Product): Product = repository.save(product)

    fun updateProduct(id: Long, product: Product): Product {
        val existingProduct = getProductById(id)
        return repository.save(existingProduct.copy(name = product.name, price = product.price))
    }

    fun deleteProduct(id: Long) = repository.deleteById(id)
}
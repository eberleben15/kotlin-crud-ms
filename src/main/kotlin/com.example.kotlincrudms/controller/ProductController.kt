package com.example.kotlincrudms.controller

import com.example.kotlincrudms.model.Product
import com.example.kotlincrudms.service.ProductService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(private val service: ProductService) {

    @GetMapping
    fun getAllProducts() = service.getAllProducts()

    @GetMapping("/{id}")
    fun getProductById(@PathVariable id: Long) = service.getProductById(id)

    @PostMapping
    fun createProduct(@RequestBody product: Product) = service.createProduct(product)

    @PutMapping("/{id}")
    fun updateProduct(@PathVariable id: Long, @RequestBody product: Product) =
        service.updateProduct(id, product)

    @DeleteMapping("/{id}")
    fun deleteProduct(@PathVariable id: Long) = service.deleteProduct(id)
}
package com.example.kotlincrudms.repository

import com.example.kotlincrudms.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long>
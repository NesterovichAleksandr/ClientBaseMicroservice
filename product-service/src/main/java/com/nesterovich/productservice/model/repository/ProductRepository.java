package com.nesterovich.productservice.model.repository;

import com.nesterovich.productservice.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

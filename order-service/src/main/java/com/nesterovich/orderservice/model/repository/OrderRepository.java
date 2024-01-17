package com.nesterovich.orderservice.model.repository;

import com.nesterovich.orderservice.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

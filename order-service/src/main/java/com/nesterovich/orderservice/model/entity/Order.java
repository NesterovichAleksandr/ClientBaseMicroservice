package com.nesterovich.orderservice.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "client_id")
    private Long clientId;
    @Column(name = "product")
    private String product;
}

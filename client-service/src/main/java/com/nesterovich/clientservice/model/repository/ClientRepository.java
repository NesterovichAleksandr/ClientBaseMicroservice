package com.nesterovich.clientservice.model.repository;

import com.nesterovich.clientservice.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

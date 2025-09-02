package com.tiagocosta.project_jpa_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagocosta.project_jpa_spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

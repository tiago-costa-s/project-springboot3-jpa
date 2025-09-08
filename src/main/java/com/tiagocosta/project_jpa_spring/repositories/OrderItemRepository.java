package com.tiagocosta.project_jpa_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagocosta.project_jpa_spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

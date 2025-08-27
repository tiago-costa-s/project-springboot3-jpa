package com.tiagocosta.project_jpa_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagocosta.project_jpa_spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

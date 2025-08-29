package com.tiagocosta.project_jpa_spring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tiagocosta.project_jpa_spring.entities.Order;
import com.tiagocosta.project_jpa_spring.entities.User;
import com.tiagocosta.project_jpa_spring.repositories.OrderRepository;
import com.tiagocosta.project_jpa_spring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "998888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "997777777", "123456");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:03:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-20T03:43:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-20T15:13:22Z"), u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}

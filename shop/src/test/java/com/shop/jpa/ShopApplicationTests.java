package com.shop.jpa;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.jpa.model.Customer;
import com.shop.jpa.model.CustomerRepository;
import com.shop.jpa.model.Order;
import com.shop.jpa.repository.OrderRepository;

@SpringBootTest
class ShopApplicationTests {

	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Test
	void contextLoads() {
		List<Order> list =orderRepository.findAll();
		System.out.println(list);
	}
	
	@Test
	void cs() {
		List<Customer> list =customerRepository.findAll();
		System.out.println(list);
	}

}

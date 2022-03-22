package com.shop.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.jpa.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}

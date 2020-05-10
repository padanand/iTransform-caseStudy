package com.order.management.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.order.management.entity.Order;


public interface OrderRepository extends MongoRepository<Order, String> {

	public List<Order> findByOrderStatus(String OrderStatus);
}

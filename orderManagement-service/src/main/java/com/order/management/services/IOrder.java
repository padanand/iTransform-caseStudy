package com.order.management.services;

import java.util.List;

import com.order.management.entity.Order;


public interface IOrder {

	public Order addCarDetails(Order order); 
	
	public List<Order> getAllOrder();
	
	public List<Order> getOrderByStatus(String orderStatus);
	
	
}

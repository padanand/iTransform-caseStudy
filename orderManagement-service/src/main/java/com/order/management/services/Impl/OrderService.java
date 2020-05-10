package com.order.management.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.management.entity.Order;
import com.order.management.repository.OrderRepository;
import com.order.management.services.IOrder;

@Service 
public class OrderService implements IOrder {

	@Autowired
	OrderRepository orderRepository;


	@Override
	public Order addCarDetails(Order order) {
		Order response = orderRepository.save(new Order
				(order.getCarPayment(),order.getWasher(),
						order.getOrderStatus(),order.getNotes(),
				 order.getOrderDate(),
				 order.getOrderEndDate()));
		
		return response;		
	}

	@Override
	public List<Order> getAllOrder() {
		List<Order> result = orderRepository.findAll();
		return result;
	}

	@Override
	public List<Order> getOrderByStatus(String orderStatus) {
		List<Order> result =  orderRepository.findByOrderStatus(orderStatus);
		return result;
	}
	

}

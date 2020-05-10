package com.order.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.management.entity.CarPayment;
import com.order.management.entity.Order;
import com.order.management.services.Impl.OrderService;


import org.apache.logging.log4j.Logger;

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.logging.log4j.LogManager;

@RestController
@RequestMapping("/order")
public class OrderManagementController {
	
	private static final Logger logger = LogManager.getLogger(OrderManagementController.class);
	
	@Autowired
	public OrderService orderService;
	
	@PostMapping(value = "/addOrder", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Order> addCarDetails(@RequestBody Order cardetails) {
		if (cardetails != null) {
			Order response = orderService.addCarDetails(cardetails);
			if (response != null) {
				return new ResponseEntity<Order>(response, HttpStatus.OK);
			}

		}
		return null;
	}
	
	//To display all order for Admin
	@GetMapping(value = "/getOrderDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Order>> getallOrder() {
		
		List<Order> response = orderService.getAllOrder();
			if (response != null) {
				
				return new ResponseEntity<List<Order>>(response,HttpStatus.OK);
			}
		
		return null;
	}
	
	@GetMapping(value = "/getOrderByStatus", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Order>> getOrderByStatus(@RequestParam String orderStatus) {
		
		List<Order> response = orderService.getOrderByStatus(orderStatus);
			if (response != null) {
				
				return new ResponseEntity<List<Order>>(response,HttpStatus.OK);
			}
		
		return null;
	}
}

package com.car.payment.management.controller;

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

import com.car.payment.management.entity.CarPayment;
import com.car.payment.management.entity.Customer;
import com.car.payment.management.services.Impl.CarPaymentService;

import org.apache.logging.log4j.Logger;

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.logging.log4j.LogManager;

@RestController
@RequestMapping("/carPayment")
public class CarPaymentController {
	
	private static final Logger logger = LogManager.getLogger(CarPaymentController.class);
	
	@Autowired
	public CarPaymentService carPaymentService;
	
	@PostMapping(value = "/addCardetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CarPayment> addCarDetails(@RequestBody CarPayment cardetails) {
		if (cardetails != null) {
			CarPayment response = carPaymentService.addCarDetails(cardetails);
			if (response != null) {
				return new ResponseEntity<CarPayment>(response, HttpStatus.OK);
			}

		}
		return null;
	}
	
	@GetMapping(value = "/getCarDetailbyId", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CarPayment>> getByCustomerId(@RequestParam String customerId) {
		if (customerId !=null) {
			List<CarPayment> response = carPaymentService.getByCustomerId(customerId);
			if (response != null) {
				
				return new ResponseEntity<List<CarPayment>>(response,HttpStatus.OK);
			}
		}
		return null;
	}
	

	@GetMapping(value = "/getCarDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CarPayment>> getByCustomer(@RequestBody  Customer customer) {
		if (customer !=null) {
			List<CarPayment> response = carPaymentService.getByCustomer(customer);
			if (response != null) {
				
				return new ResponseEntity<List<CarPayment>>(response,HttpStatus.OK);
			}
		}
		return null;
	}
}

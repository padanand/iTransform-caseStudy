package com.car.payment.management.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.payment.management.entity.CarPayment;
import com.car.payment.management.entity.Customer;
import com.car.payment.management.repository.CarPaymentRepository;
import com.car.payment.management.services.ICarPayment;

@Service 
public class CarPaymentService implements ICarPayment {

	@Autowired
	CarPaymentRepository carRepository;

	@Override
	public CarPayment addCarDetails(CarPayment cardetails) {
		
		
		CarPayment response = carRepository.save(new CarPayment
				(cardetails.getCustomer(),cardetails.getBrandName(),cardetails.getModel(),
				 cardetails.getColour(),cardetails.getCardNo(),
				 cardetails.getStatus(),
				 cardetails.getLocation()));
	
		return response;
	}

	public List<CarPayment> getByCustomer(Customer customer) {
		List<CarPayment> resultList = carRepository.findByCustomer(customer);
		return resultList;
	}
	
	public List<CarPayment> getByCustomerId(String customerId) {
		List<CarPayment> resultList = carRepository.findByCustomerId(customerId);
		return resultList;
	}
	

}

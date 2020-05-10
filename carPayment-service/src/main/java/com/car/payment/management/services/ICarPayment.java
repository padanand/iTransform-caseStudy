package com.car.payment.management.services;

import java.util.List;

import com.car.payment.management.entity.CarPayment;
import com.car.payment.management.entity.Customer;

public interface ICarPayment {

	public CarPayment addCarDetails(CarPayment cardetails);
	
	public List<CarPayment> getByCustomer(Customer customerId);
	
	List<CarPayment> getByCustomerId(String customerId);
}

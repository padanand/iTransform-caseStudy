package com.car.payment.management.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.car.payment.management.entity.CarPayment;
import com.car.payment.management.entity.Customer;

public interface CarPaymentRepository extends MongoRepository<CarPayment, String> {

	@Query("{'CarPayment.Customer':?0}")
	public List<CarPayment> findByCustomer(Customer Id);
	
	@Query("{'CarPayment.Customer._id':?0}")
	public List<CarPayment> findByCustomerId(String Id);
}

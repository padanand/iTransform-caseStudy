package com.car.payment.management.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.car.payment.management.entity.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

	
}

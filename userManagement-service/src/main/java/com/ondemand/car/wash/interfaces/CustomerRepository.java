package com.ondemand.car.wash.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ondemand.car.wash.entity.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

	
}

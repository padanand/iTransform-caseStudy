package com.order.management.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.order.management.entity.CarPayment;

public interface CarPaymentRepository extends MongoRepository<CarPayment, String> {

	
}

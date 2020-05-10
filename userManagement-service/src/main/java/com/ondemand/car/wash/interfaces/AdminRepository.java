package com.ondemand.car.wash.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ondemand.car.wash.entity.Admin;

@Repository
public interface AdminRepository extends MongoRepository<Admin, String> {

	
}

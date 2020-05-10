package com.ondemand.car.wash.interfaces;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ondemand.car.wash.entity.Washer;

//@Repository
public interface WasherRepository extends MongoRepository<Washer, String> {

	public Washer findByFirstName(String firstName);
	
	
}

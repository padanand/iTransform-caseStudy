package com.ondemand.car.wash.services.Impl;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import com.ondemand.car.wash.entity.Admin;
import com.ondemand.car.wash.entity.Customer;
import com.ondemand.car.wash.entity.Profile;
import com.ondemand.car.wash.entity.Washer;
import com.ondemand.car.wash.interfaces.AdminRepository;
import com.ondemand.car.wash.interfaces.CustomerRepository;
import com.ondemand.car.wash.interfaces.WasherRepository;
import com.ondemand.car.wash.services.IProfile;

@Service 
public class ProfileService implements IProfile {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	WasherRepository washerRepository;
	
	

	@Override
	public String createProfile(Profile profile) {
		String userId = null;
		if(profile.getRole().equalsIgnoreCase("customer")) {
			Customer response = customerRepository.save(new Customer(profile.getFirstName(),profile.getLastName(),profile.getContactNo(),profile.getEmailId(),profile.getPassword()));
			userId = response.getId();
		}
		else if(profile.getRole().equalsIgnoreCase("admin")) {
			Admin response = adminRepository.save(new Admin(profile.getFirstName(),profile.getLastName(),profile.getContactNo(),profile.getEmailId(),profile.getPassword()));
			userId = response.getId();
		}else if(profile.getRole().equalsIgnoreCase("washer")) {
			Washer response = washerRepository.save(new Washer(profile.getFirstName(),profile.getLastName(),profile.getContactNo(),profile.getEmailId(),profile.getPassword()));
			userId = response.getId();
		}
		
		return userId;
	}



	@Override
	public Profile findUser(Profile loginDetail) {
		Profile profile = new Profile();
		//int id = Integer.parseInt(loginDetail.getId().trim()); 
		if(loginDetail.getRole().equalsIgnoreCase("customer")) {
			Customer response = customerRepository.findById(loginDetail.getId()).get();
			//TODO password check and encryption
			profile.setFirstName(response.getFirstName());
			profile.setLastName(response.getLastName());
			profile.setContactNo(response.getContactNo());
			profile.setId(response.getId());
			profile.setEmailId(response.getEmailId());
					
		}
		else if(loginDetail.getRole().equalsIgnoreCase("admin")) {
			Admin response = adminRepository.findById(loginDetail.getId()).get();
			//TODO password check and encryption
			profile.setFirstName(response.getFirstName());
			profile.setLastName(response.getLastName());
			profile.setContactNo(response.getContactNo());
			profile.setId(response.getId());
			profile.setEmailId(response.getEmailId());
					
		}
		else if(loginDetail.getRole().equalsIgnoreCase("washer")) {
			Washer response = washerRepository.findByFirstName(loginDetail.getFirstName());			
			//Washer response = washerRepository.findById(loginDetail.getId()).get();
			//Washer response = washerRepository.findById(new ObjectId(loginDetail.getId()));
			//TODO password check and encryption
			profile.setFirstName(response.getFirstName());
			profile.setLastName(response.getLastName());
			profile.setContactNo(response.getContactNo());
			profile.setId(response.getId());
			profile.setEmailId(response.getEmailId());
					
		}
		
		return  profile;
	}
}

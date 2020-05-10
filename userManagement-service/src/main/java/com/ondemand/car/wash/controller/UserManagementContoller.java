package com.ondemand.car.wash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ondemand.car.wash.entity.Profile;
import com.ondemand.car.wash.services.IProfile;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController
@RequestMapping("/profile")
public class UserManagementContoller {

	private static final Logger logger = LogManager.getLogger(UserManagementContoller.class);
	
	@Autowired
	private IProfile profileService;
	
	@PostMapping(value = "/signUp", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> signUp(@RequestBody Profile profiledata) {
		if (profiledata != null) {
			String userId = profileService.createProfile(profiledata);
			if (userId != null) {
				return new ResponseEntity<>(userId ,HttpStatus.OK);
			}
		}
		return null;
	}
	
	@GetMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Profile> login(@RequestBody Profile loginDetail) {
		if (loginDetail.getId()!= null && loginDetail.getPassword() != null && loginDetail.getRole() != null ) {
			Profile response = profileService.findUser(loginDetail);
			if (response != null) {
				
				return new ResponseEntity<Profile>(response,HttpStatus.OK);
			}
		}
		return null;
	}
}

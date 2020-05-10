package com.ondemand.car.wash.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

@Document(collection = "Washer")
public class Washer {

	// Id annotation is not required since mongodb will identify implicitly with id
	// field
	@Id
	@Field("WasherId")
	private String id;

	
	@Field("FirstName")
	private String firstName;

	@Field("LastName")
	private String lastName;

	@Field("ContactNo")
	private double contactNo;

	@Field("EmailId")
	private String emailId;

	@Field("Password")
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getContactNo() {
		return contactNo;
	}

	public void setContactNo(double contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public Washer() {

	}

	@PersistenceConstructor
	public Washer(String firstName, String lastName, double contactNo, String emailId, String password) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.password = password;
		
	}

//	@PersistenceConstructor
//	public Washer(String id, String firstName, String lastName, double contactNo, String emailId, String password,
//			String role) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.contactNo = contactNo;
//		this.emailId = emailId;
//		this.password = password;
//		this.role = role;
//	}

}

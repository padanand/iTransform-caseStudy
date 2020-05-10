package com.ondemand.car.wash.entity;

public class Profile {

	private String id;
	
	private String firstName;

	private String lastName;

	private double contactNo;

	private String emailId;

	private String password;

	private String role;
	
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Profile() {

	}

	public Profile(String firstName, String lastName, double contactNo, String emailId, String password, String role) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.password = password;
		this.role = role;
	}

}

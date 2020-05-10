package com.car.payment.management.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

@Document(collection = "CarPayment")
public class CarPayment {

	@Id
	private String Id;

	// One to One with customer
	@Field("CutomerId")
	private Customer customer;

	@Field("BrandName")
	private String brandName;

	@Field("Model")
	private String model;

	@Field("Colour")
	private String colour;

	@Field("CardNumber")
	private String cardNo;

	@Field("Status")
	private String status;

	@Field("Location")
	private String location;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@PersistenceConstructor
	public CarPayment(String id, Customer customer, String brandName, String model, String colour, String cardNo,
			String status, String location) {
		super();
		Id = id;
		this.customer = customer;
		this.brandName = brandName;
		this.model = model;
		this.colour = colour;
		this.cardNo = cardNo;
		this.status = status;
		this.location = location;
	}

	@PersistenceConstructor
	public CarPayment(Customer customer, String brandName, String model, String colour, String cardNo, String status,
			String location) {
		super();
		this.customer = customer;
		this.brandName = brandName;
		this.model = model;
		this.colour = colour;
		this.cardNo = cardNo;
		this.status = status;
		this.location = location;
	}

	public CarPayment() {
		}

}

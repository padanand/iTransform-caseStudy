package com.order.management.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.ondemand.car.wash.entity.Washer;


@Document(collection = "Order")
public class Order {
	
	@Id
	private String Id;


	
	//OneToOne
	@Field("CarPaymentDetail")
	private CarPayment carPayment;

	@Field("Washer")
	private Washer washer;

//	@Field("ServiceDetail")
//	private Service service;

	@Field("OrderStatus")
	private String orderStatus;

	@Field("Notes")
	private String notes;

	@Field("OrderDate")
	private String orderDate;
	
	@Field("OrderEndDate")
	private String orderEndDate;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	
	public CarPayment getCarPayment() {
		return carPayment;
	}

	public void setCarPayment(CarPayment carPayment) {
		this.carPayment = carPayment;
	}

	public Washer getWasher() {
		return washer;
	}

	public void setWasher(Washer washer) {
		this.washer = washer;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderEndDate() {
		return orderEndDate;
	}

	public void setOrderEndDate(String orderEndDate) {
		this.orderEndDate = orderEndDate;
	}

	@PersistenceConstructor
	public Order(CarPayment carPayment, Washer washer, String orderStatus, String notes,
			String orderDate, String orderEndDate) {
		super();
		this.carPayment = carPayment;
		this.washer = washer;
		this.orderStatus = orderStatus;
		this.notes = notes;
		this.orderDate = orderDate;
		this.orderEndDate = orderEndDate;
	}

	@PersistenceConstructor
	public Order(String id, CarPayment carPayment, Washer washer, String orderStatus, String notes,
			String orderDate, String orderEndDate) {
		super();
		Id = id;		
		this.carPayment = carPayment;
		this.washer = washer;
		this.orderStatus = orderStatus;
		this.notes = notes;
		this.orderDate = orderDate;
		this.orderEndDate = orderEndDate;
	}
	
	
	public Order() {
		
	}
	
	
}

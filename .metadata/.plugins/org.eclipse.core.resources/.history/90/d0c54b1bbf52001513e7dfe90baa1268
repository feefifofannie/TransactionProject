package com.sapient.store.customers;

import com.sapient.store.orders.Order;
import com.sapient.store.payments.Payment;

public class Customer {
	private String name;
	private String address;
	private Order order;
	private Payment payment;
	
	public Customer(String name,String address){
		this.name=name;
		this.address=address;
		payment = new Payment();
		this.order=new Order(this, payment);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
}

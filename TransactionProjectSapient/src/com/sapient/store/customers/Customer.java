package com.sapient.store.customers;

import com.sapient.store.orders.Order;

public class Customer {
	private String name;
	private String address;
	private Order order;
	
	public Customer(String name,String address,Order order){
		this.name=name;
		this.address=address;
		this.order=order;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Object getAddress() {
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

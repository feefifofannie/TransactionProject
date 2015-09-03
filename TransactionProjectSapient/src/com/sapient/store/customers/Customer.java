package com.sapient.store.customers;

import com.sapient.store.orders.Order;

public class Customer {
	private Object name;
	private Object address;
	private Order order;
	
	public Customer(Object name,Object address,Order order){
		this.name=name;
		this.address=address;
		this.order=order;
	}
	
	public Object getName() {
		return this.name;
	}
	
	public void setName(Object name) {
		this.name = name;
	}
	
	public Object getAddress() {
		return this.address;
	}
	
	public void setAddress(Object address) {
		this.address = address;
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
}

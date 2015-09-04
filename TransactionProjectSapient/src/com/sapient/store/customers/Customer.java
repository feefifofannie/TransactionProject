package com.sapient.store.customers;

import java.util.ArrayList;
import java.util.List;

import com.sapient.store.inventory.Item;
import com.sapient.store.orders.*;
import com.sapient.store.payments.Payment;

public class Customer {
	private String name;
	private String address;
	private Order order;
	private Payment payment;
	
	public Customer(String name,String address, Payment payment){
		this.name=name;
		this.address=address;
		this.payment = payment;
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
	
	public void addItemToCart(Item item, Integer quantity) {
		//this adds Item to cart
		OrderDetail newOrderDetail = new OrderDetail(quantity, item);
		order.getOrderdetail().add(newOrderDetail);
	}
}

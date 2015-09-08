package com.sapient.store.customers;

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
		this.order=new Order(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name != null){
			this.name = name;
		}
	}
	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		if (payment instanceof Payment && payment !=null){
			this.payment = payment;
		}
	}

	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		if (address != null){
			this.address = address;
		}
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	public void setOrder(Order order) {
		if (order instanceof Order && order != null) {
			this.order = order;
		}
	}
	
	public void addItemToCart(Item item, Integer quantity) {
		//this adds Item to cart
		OrderDetail newOrderDetail = new OrderDetail(quantity, item);
		List<OrderDetail> temp = order.getOrderDetail();
		temp.add(newOrderDetail);
		order.setOrderDetail(temp);
	}
	
	public void makePayment(Payment custPayment){
		order.setPayment(custPayment);
	}
}

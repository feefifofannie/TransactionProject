package com.sapient.store.orders;

import com.sapient.store.customers.Customer;
import com.sapient.store.payments.Payment;

public class Order {
	private String date;
	private Object status;
	private Customer NewCustomer;
	private Payment payment;
	private OrderDetail orderdetail;
	
	public Object getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Object getStatus() {
		return status;
	}
	public void setStatus(Object status) {
		this.status = status;
	}
	public Customer getNewCustomer() {
		return NewCustomer;
	}
	public void setNewCustomer(Customer newCustomer) {
		NewCustomer = newCustomer;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public OrderDetail getOrderdetail() {
		return orderdetail;
	}
	public void setOrderdetail(OrderDetail orderdetail) {
		this.orderdetail = orderdetail;
	}
}

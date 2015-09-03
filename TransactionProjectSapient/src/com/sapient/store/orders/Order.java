package com.sapient.store.orders;

import java.util.Date;

import com.sapient.store.customers.Customer;
import com.sapient.store.payments.Payment;

public class Order {
	private Date date;
	private String status;
	private Customer NewCustomer;
	private Payment payment;
	private OrderDetail orderdetail;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
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
	public Double calcTax(){
		
	}
	public Double calcTotal(){
		
	}
	public Double calcTotalWeight(){
		
	}
}

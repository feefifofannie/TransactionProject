package com.sapient.store.orders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sapient.store.customers.Customer;
import com.sapient.store.payments.Payment;

public class Order {
	
	private Date date;
	private String status;
	private Customer newCustomer;
	private Payment payment;
    private List<OrderDetail> orderDetail;
	
	public Order(Customer customer) {
		this.newCustomer=customer;
		payment = customer.getPayment();
		date = new Date();
		String status = "Order Recieved";
		orderDetail = new ArrayList<OrderDetail>();
	}
	
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
		return newCustomer;
	}

	public void setNewCustomer(Customer newCustomer) {
		newCustomer = newCustomer;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<OrderDetail> getOrderdetail() {
		return orderDetail;
	}

	public void setOrderdetail(List<OrderDetail> orderdetail) {
		this.orderDetail = orderdetail;
	}

	

	public Double calcTotalPayment() {
		Double total = 0.0;
		for (OrderDetail od : orderDetail) {
			total += od.calcSubTotal();
		}
		return total;

	}

	public Double calcTotalWeight() {
		Double totalWeight = 0.0;
		for (OrderDetail od : orderDetail) {
			totalWeight += od.calcWeight();
		}
		return totalWeight;
	}
}

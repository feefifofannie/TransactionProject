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
    private List<OrderDetail> orderDetailList;
	
	public Order(Customer customer) {
		this.newCustomer=customer;
		payment = customer.getPayment();
		date = new Date();
		//String status = "Order Recieved";
		orderDetailList = new ArrayList<OrderDetail>();
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		if (date instanceof Date && date != null){
			this.date = date;
		}
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (status != null){
			this.status = status;
		}
	}

	public Customer getNewCustomer() {
		return newCustomer;
	}

	public void setNewCustomer(Customer newCustomer) {
		if (newCustomer instanceof Customer && newCustomer != null){
			this.newCustomer = newCustomer;
		}
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		if (payment instanceof Payment && payment != null){
			this.payment = payment;
		}
	}

	public List<OrderDetail> getOrderDetail() {
		return orderDetailList;
	}

	public void setOrderDetail(List<OrderDetail> orderDetail) {
		if (orderDetail instanceof List<?> && orderDetail != null) {
			this.orderDetailList = orderDetail;
		}
	}

	public Double calcTotalPayment() {
		Double total = 0.0;
		for (OrderDetail od : orderDetailList) {
			total += od.calcSubTotal();
		}
		return total;

	}

	public Double calcTotalWeight() {
		Double totalWeight = 0.0;
		for (OrderDetail od : orderDetailList) {
			totalWeight += od.calcWeight();
		}
		return totalWeight;
	}
}

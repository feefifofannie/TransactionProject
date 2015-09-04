package com.sapient.store.orders;

import java.util.Date;
import java.util.List;

import com.sapient.store.customers.Customer;
import com.sapient.store.payments.Payment;

public class Order {
	
	private Date date;
	private String status;
	private Customer NewCustomer;
	private Payment payment;
    private List<OrderDetail> orderDetail;

	private Double totalTax = 0.0;

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

	public List<OrderDetail> getOrderdetail() {
		return orderDetail;
	}

	public void setOrderdetail(List<OrderDetail> orderdetail) {
		this.orderDetail = orderdetail;
	}

	public Double calcTax() {
		for (OrderDetail od : orderDetail) {

			Double taxPercent = 10.0;
			if (od.getTaxStatus()) {
				totalTax += (od.calcSubTotal() * (taxPercent / 100));
			}
		}
		return totalTax;
	}

	public Double calcTotal() {
		Double total = 0.0;
		for (OrderDetail od : orderDetail) {
			total += od.calcSubTotal();
		}
		return total + totalTax;

	}

	public Double calcTotalWeight() {
		Double totalWeight = 0.0;
		for (OrderDetail od : orderDetail) {
			totalWeight += od.calcWeight();
		}
		return totalWeight;
	}
}

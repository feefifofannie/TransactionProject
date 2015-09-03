package com.sapient.store.payments;

import com.sapient.store.orders.Order;

public class Payment {
	private Double amount;
	private Order order;
	
	

	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
}

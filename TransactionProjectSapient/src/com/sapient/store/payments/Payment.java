package com.sapient.store.payments;

import com.sapient.store.orders.Order;

public class Payment {
	private Object amount;
	private Order order;
	
	

	public Object getAmount() {
		return amount;
	}
	public void setAmount(Object amount) {
		this.amount = amount;
	}
	public Order getOrder() {
		//Hello
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	// checking commit
	//order=2;
	}
}

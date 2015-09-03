package com.sapient.store.inventory;

import com.sapient.store.orders.OrderDetail;

public class Item {
	private Object shippingWeight;
	private Object description;
	private OrderDetail orderDetail;
	
	public Object getShippingWeight() {
		return shippingWeight;
	}
	public void setShippingWeight(Object shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	public Object getDescription() {
		return description;
	}
	public void setDescription(Object description) {
		this.description = description;
	}
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	
}

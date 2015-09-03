package com.sapient.store.inventory;

import com.sapient.store.orders.OrderDetail;

public class Item {
	private Double shippingWeight;
	private String description;
	private OrderDetail orderDetail;
	private Double itemPrice;
	public Double getShippingWeight() {
		return shippingWeight;
	}
	public void setShippingWeight(Double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	public Double getWeight(){
        	return shippingWeight;	
	}
	public Double getPriceforQuantity(){
		return itemPrice;
	}
	
	
}

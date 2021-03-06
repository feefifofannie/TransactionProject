package com.sapient.store.inventory;

import com.sapient.store.orders.OrderDetail;

public class Item {
	private Double shippingWeight;
	private String description;
	private OrderDetail orderDetail;
	private Double itemPrice;
	private boolean isTaxable;
	
	public Item(Double itemPrice, String description, Double shippingWeight, boolean isTaxable) {
		this.itemPrice = itemPrice;
		this.description = description;
		this.shippingWeight = shippingWeight;
		this.isTaxable = isTaxable;
	}
	
	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		if (itemPrice instanceof Double && itemPrice != null){
			this.itemPrice = itemPrice;
		}
	}

	public boolean isTaxable() {
		return isTaxable;
	}

	public void setTaxable(boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	public Double getShippingWeight() {
		return shippingWeight;
	}
	
	public void setShippingWeight(Double shippingWeight) {
		if (shippingWeight instanceof Double && itemPrice != shippingWeight){
			this.shippingWeight = shippingWeight;
		}
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		if (description instanceof String && description != null){
			this.description = description;
		}
	}
	
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}
	
	public void setOrderDetail(OrderDetail orderDetail) {
		if (orderDetail instanceof OrderDetail && orderDetail != null){
			this.orderDetail = orderDetail;
		}
	}
	
	public Double getWeight(){
        	return shippingWeight;	
	}
	
	public Double getPriceForQuantity(){
		return itemPrice;
	}
	
	
}

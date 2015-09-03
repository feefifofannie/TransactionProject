package com.sapient.store.orders;

import com.sapient.store.inventory.Item;

public class OrderDetail {
	private Object quantity;
	private Object taxStatus;
	private Order order;
	private Item item;
	
	public Object getQuantity() {
		return quantity;
	}
	public void setQuantity(Object quantity) {
		this.quantity = quantity;
	}
	public Object getTaxStatus() {
		return taxStatus;
	}
	public void setTaxStatus(Object taxStatus) {
		this.taxStatus = taxStatus;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
}

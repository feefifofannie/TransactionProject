package com.sapient.store.orders;

import com.sapient.store.inventory.Item;

public class OrderDetail {
	private Integer quantity;
	private boolean taxStatus;
	private Order order;
	private Item item;
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public boolean getTaxStatus() {
		return taxStatus;
	}
	public void setTaxStatus(boolean taxStatus) {
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
	public Double calcSubTotal(){
		return quantity*item.getPriceforQuantity();
	}
	public Double calcWeight(){
		return quantity*item.getWeight();
	}
}

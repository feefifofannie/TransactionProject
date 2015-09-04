package com.sapient.store.orders;

import com.sapient.store.inventory.Item;

public class OrderDetail {
	private Integer quantity;
	private boolean taxStatus;
	private Order order;
	private Item item;
	private Double totalTax=0.0;
	
	public OrderDetail(Integer quantity, Item item) {
		this.item=item;
		this.quantity=quantity;
		this.taxStatus=item.isTaxable();
	}
	
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
	
	public Double calcTax() {
		Double taxPercent = 0.1;
		if (taxStatus) {
			totalTax = (double) Math.round(item.getPriceForQuantity()*quantity*taxPercent);
		}
		return totalTax;
	}
	public Double calcSubTotal(){
		Double netPrice = quantity*item.getPriceForQuantity();
		return netPrice+totalTax;
	}
	public Double calcWeight(){
		return quantity*item.getWeight();
	}
}

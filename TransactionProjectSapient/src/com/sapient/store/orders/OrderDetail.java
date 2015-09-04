package com.sapient.store.orders;

import com.sapient.store.inventory.Item;

public class OrderDetail {
	private Integer quantity;
	private boolean taxStatus;
	private Order order;
	private Item item;
	private Double totalTax=0.0;
	
	public OrderDetail(Integer quantity, Item item) {
		totalTax = 0.0;
		this.item=item;
		this.quantity=quantity;
		this.taxStatus=item.isTaxable();
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		if (quantity>0) {
			this.quantity = quantity;
		}
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
		if (order instanceof Order && order != null) {
			this.order = order;
		}
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		if (item instanceof Item && item != null) {
			this.item = item;
		}
	}
	
	public Double calcTax() {
		Double taxPercent = 0.1;
		if (taxStatus) {
			totalTax = item.getPriceForQuantity()*quantity*taxPercent;
			double roundedTax = (double)Math.round(totalTax * 100) / 100;
			totalTax = roundedTax;
		}
		
		return totalTax;
	}
	public Double calcSubTotal(){
		Double netPrice = quantity*item.getPriceForQuantity();
		return netPrice+calcTax();
	}
	public Double calcWeight(){
		return quantity*item.getWeight();
	}
}

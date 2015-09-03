package com.sapient.store.payments;

public class Credit implements Authorization {
	private Object number;
	private Object type;
	private Object expDate;
	
	public Object getNumber() {
		return number;
	}
	public void setNumber(Object number) {
		this.number = number;
	}
	public Object getType() {
		return type;
	}
	public void setType(Object type) {
		this.type = type;
	}
	public Object getExpDate() {
		return expDate;
	}
	public void setExpDate(Object expDate) {
		this.expDate = expDate;
	}
	
	@Override
	public void authorized() {
		// TODO Auto-generated method stub
		
	}
	
}

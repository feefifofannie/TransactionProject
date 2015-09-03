package com.sapient.store.payments;

public class Check implements Authorization{
	private Object name;
	private Object bankID;
	
	public Object getName() {
		return name;
	}
	public void setName(Object name) {
		this.name = name;
	}
	public Object getBankID() {
		return bankID;
	}
	public void setBankID(Object bankID) {
		this.bankID = bankID;
	}
	
	@Override
	public void authorized() {
		// TODO Auto-generated method stub
		
	}
	
}

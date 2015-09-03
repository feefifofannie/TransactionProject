package com.sapient.store.payments;

public class Check implements Authorization{
	private String name;
	private Long bankID;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getBankID() {
		return bankID;
	}
	public void setBankID(Long bankID) {
		this.bankID = bankID;
	}
	
	@Override
	public void authorized() {
		// TODO Auto-generated method stub
		
	}
	
}

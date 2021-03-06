package com.sapient.store.payments;

public class Check extends Payment implements Authorization{
	private String name;
	private Long accountNumber;
	private Long routingNumber;
	
	public Check(String name,Long accountNumber,Long routingNumber){
		this.name=name;
		this.accountNumber=accountNumber;
		this.routingNumber=routingNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Long getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(Long routingNumber) {
		this.routingNumber = routingNumber;
	}
	
	@Override
	public boolean authorized() {
		// Only accept positive bank IDs that are 10 digits
		if ((accountNumber>0) && (Math.floor(Math.log10(accountNumber) + 1)==15)){
			if ((routingNumber>0) && (Math.floor(Math.log10(routingNumber) + 1)==9)){
				return true;
			}
		}
		return false;
	}
	
}

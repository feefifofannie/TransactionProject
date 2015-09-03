package com.sapient.store.payments;

import java.util.Date;

public class Credit implements Authorization {
	private String number;
	private String type;
	private Date expDate;
	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	
	@Override
	public void authorized() {
		// TODO Auto-generated method stub
		
	}
	
}

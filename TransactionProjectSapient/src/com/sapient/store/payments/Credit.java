package com.sapient.store.payments;

import java.util.Date;

public class Credit extends Payment implements Authorization {
	private Long number;
	private String type;
	private Date expDate;
	
	public Credit() {
		
	}
	public Credit(Long number,String type,Date expDate){
		this.number=number;
		this.type=type;
		this.expDate=expDate;
	}
	
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
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
	public boolean authorized() {
		// TODO Auto-generated method stub
		if ((number>0) && (Math.floor(Math.log10(number) + 1)==16)){
			if (type=="VISA" || type=="MASTERCARD" || type=="DISCOVER"){
				if (expDate.after(new Date())){
					return true;
				}
			}
		}
		return false;
	}
	
}

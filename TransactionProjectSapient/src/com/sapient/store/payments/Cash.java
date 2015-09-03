package com.sapient.store.payments;

public class Cash implements Authorization {
	private Double cashTendered;

	public Double getCashTendered() {
		return cashTendered;
	}

	public void setCashTendered(Double cashTendered) {
		this.cashTendered = cashTendered;
	}

	@Override
	public void authorized() {
		// TODO Auto-generated method stub
		
	}
	
}

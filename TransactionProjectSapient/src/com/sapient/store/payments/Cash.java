package com.sapient.store.payments;

public class Cash extends Payment {
	private Double cashTendered;

	public Double getCashTendered() {
		return cashTendered;
	}

	public void setCashTendered(Double cashTendered) {
		this.cashTendered = cashTendered;
	}
	
}

package com.sapient.store.payments;

public class Cash implements Authorization {
	private Object cashTendered;

	public Object getCashTendered() {
		return cashTendered;
	}

	public void setCashTendered(Object cashTendered) {
		this.cashTendered = cashTendered;
	}

	@Override
	public void authorized() {
		// TODO Auto-generated method stub
		
	}
	
}

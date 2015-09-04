package com.sapient.store.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.store.inventory.Item;
import com.sapient.store.orders.OrderDetail;

public class OrderDetailTest {
//int price, quantity , weight;
Item itemTest;
OrderDetail orderDetailTest;

	public OrderDetailTest() {
	}

	@Before
	public void setUp() throws Exception {
     itemTest=new Item(29.99,"Shirt",2.0, false);
     Integer testQuantity=3;
     orderDetailTest=new OrderDetail(testQuantity, itemTest);
     
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testcalcSubTotal() {
		Double expectedSubTotal=89.97;
		Double actualSubTotal=orderDetailTest.calcSubTotal();
        assertEquals(expectedSubTotal, actualSubTotal);	
		
		//fail("Not yet implemented");
	}
	public final void testcalcWeight(){
		Double expectedcalWeight=6.0;
		Double actualcalWeight=orderDetailTest.calcWeight();
		assertEquals(expectedcalWeight, actualcalWeight);	
	}
	public final void testcalcTax(){
		Double expectedcalcTax=8.997;
		Double actualcalcTax=orderDetailTest.calcTax();
		assertEquals(expectedcalcTax, actualcalcTax);	
	}

}

package com.sapient.store.test;

import static org.junit.Assert.*;
import com.sapient.store.inventory.Item;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {
	Item testItemObject;
	@Before
	public void setUp() throws Exception {
		testItemObject = new Item(24.99, "Reebok Tennis Shoes", 2.2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPrice() {
		Double expectedPrice = 24.99;
		assertEquals(expectedPrice, testItemObject.getPriceForQuantity());
	}
	
	@Test
	public void testGetShippingWeight() {
		Double expectedWeight = 2.2;
		assertEquals(expectedWeight, testItemObject.getWeight());
	}
	
	@Test
	public void testGetDescription() {
		String expectedDescription = "Reebok Tennis Shoes";
		assertEquals(expectedDescription, testItemObject.getDescription());
	}
}

package com.sapient.store.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.store.payments.Check;

public class CheckTest {

	Check check;

	public CheckTest() {
	}

	@Before
	public void setUp() throws Exception {
		check = new Check("name", 11L, 111L);
	}

	@After
	public void tearDown() throws Exception {
		check = null;
	}

	@Test
	public final void testForValidCheque() {
		check.setRoutingNumber(102345678L);
		check.setAccountNumber(102345454541231L);

		assertTrue(check.authorized());
	}

	@Test
	public final void testForInvalidAccountNumber() {
		check.setRoutingNumber(102345678l);
		check.setAccountNumber(-102345679867456l);

		assertFalse(check.authorized());

		check.setAccountNumber(103457989l);
		assertFalse(check.authorized());
	}

	@Test
	public final void testForInvalidRoutingNumber() {
		check.setRoutingNumber(-102345678l);
		check.setAccountNumber(102345454541231L);

		assertFalse(check.authorized());

		check.setAccountNumber(10234579L);
		assertFalse(check.authorized());
	}

}

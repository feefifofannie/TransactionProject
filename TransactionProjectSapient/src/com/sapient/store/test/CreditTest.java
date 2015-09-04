package com.sapient.store.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.store.payments.Credit;

public class CreditTest {

	
	Credit credit=new Credit();
	public CreditTest() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		credit=null;
	}

	@Test
	public final void testAuthorised() {
		boolean expectedResult=true;
		Date d=new Date(15/06/2022);
		credit.setNumber(1234567891011111L);
		credit.setType("VISA");
		credit.setExpDate(d);
	
		 boolean actualResult=credit.authorized();
		assertEquals(expectedResult, actualResult);
		
		
	}
	
	

}

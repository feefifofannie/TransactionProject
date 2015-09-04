package com.sapient.store.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;





import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.store.payments.Credit;

public class CreditTest {

	
	Credit credit;
	public CreditTest() {
	}

	@Before
	public void setUp() throws Exception {
		credit=new Credit();
	}

	@After
	public void tearDown() throws Exception {
		credit=null;
	}

	@Test
	public final void testAuthorisedForCorrectCreditCardDetails() throws ParseException {
	
		credit.setNumber(1234567891011111L);
	    credit.setType("VISA");
	    credit.setExpDate("2022-07-15");
		boolean expectedResult=true;
        boolean actualResult=credit.authorized();
		assertEquals(expectedResult, actualResult);
	
	}
	
	@Test
	public final void testAuthorisedForNegativeNumber() throws  ParseException {
	
	credit.setNumber(-1234567894634681L);
	credit.setType("VISA");
    credit.setExpDate("2022-07-15");
	boolean expectedResult=false;
    boolean actualResult=credit.authorized();
	assertEquals(expectedResult, actualResult);

    }
	
	
	@Test
	public final void testAuthorisedForExpiredCreditCard() throws ParseException {
	
	credit.setNumber(1234567894634681L);
	credit.setType("VISA");
    credit.setExpDate("2015-09-03");
	boolean expectedResult=false;
    boolean actualResult=credit.authorized();
	assertEquals(expectedResult, actualResult);

}
	
	@Test
	public final void testAuthorisedForWrongNoOfDigitsInNumber() throws ParseException {
	
	credit.setNumber(1234567894634L);
	credit.setType("VISA");
    credit.setExpDate("2015-09-03");
	boolean expectedResult=false;
    boolean actualResult=credit.authorized();
	assertEquals(expectedResult, actualResult);

}
}

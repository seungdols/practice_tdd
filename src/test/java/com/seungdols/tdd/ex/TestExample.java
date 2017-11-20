package com.seungdols.tdd.ex;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @PACKAGE com.seungdols.tdd.ex1
 * @Author seungdols
 * @Date 2017. 10. 16.
 */
public class TestExample {

	@Test
	public void testMultiplication_1장_테스트코드() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(5, five.getAmount());
	}

	@Test
	public void testMultiplication_2장_테스트코드() {
		Dollar five = new Dollar(5);
		Money product = five.times(2);
		assertEquals(10, product.getAmount());
		product = five.times(3);
		assertEquals(15, product.getAmount());
	}

	@Test
	public void testMultiplication_4장_테스트코드() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}

	@Test
	public void testMultiplication_Franc_5장_테스트코드() {
		Franc five = new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
	}

	@Test
	public void testMultiplication_Money_8장_테스트코드() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals( Money.dollar(15), five.times(3));
		assertEquals( Money.dollar(15), five.times(3));
		assertEquals( Money.dollar(15), five.times(3));
	}

	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(7)));
		assertFalse(Money.franc(6).equals(Money.franc(5)));
	}

	@Test
	public void testCurrency() throws Exception {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}


}

package com.seungdols.tdd.ex1;

import com.seungdols.tdd.ex.Dollar;
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
		assertEquals(10, five.amount);
	}

	@Test
	public void testMultiplication_2장_테스트코드() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}

	@Test
	public void testMultiplication_4장_테스트코드() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}

	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}



}

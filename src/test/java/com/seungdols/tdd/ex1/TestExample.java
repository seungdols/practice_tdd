package com.seungdols.tdd.ex1;

import com.seungdols.tdd.ex.Dollar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @PACKAGE com.seungdols.tdd.ex1
 * @Author seungdols
 * @Date 2017. 10. 16.
 */
public class TestExample {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}

	@Test
	public void testMultiplication_달러_생성만할경우() {
		Dollar five = new Dollar(5);
		assertEquals(5, five.amount);
	}


}

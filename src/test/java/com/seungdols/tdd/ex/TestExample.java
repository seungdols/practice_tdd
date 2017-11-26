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

//	@Test
//	public void testMultiplication_1장_테스트코드() {
//		Dollar five = new Dollar(5);
//		five.times(2);
//		assertEquals(5, five.getAmount());
//	}
//
//	@Test
//	public void testMultiplication_2장_테스트코드() {
//		Dollar five = new Dollar(5);
//		Money product = five.times(2);
//		assertEquals(10, product.getAmount());
//		product = five.times(3);
//		assertEquals(15, product.getAmount());
//	}
//
//	@Test
//	public void testMultiplication_4장_테스트코드() {
//		Dollar five = new Dollar(5);
//		assertEquals(new Dollar(10), five.times(2));
//		assertEquals(new Dollar(15), five.times(3));
//	}
//
//	@Test
//	public void testMultiplication_Franc_5장_테스트코드() {
//		Franc five = new Franc(5);
//		assertEquals(new Franc(10), five.times(2));
//		assertEquals(new Franc(15), five.times(3));
//	}

    @Test
    public void testMultiplication_Money_8장_테스트코드() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
        assertEquals(Money.dollar(15), five.times(3));
        assertEquals(Money.dollar(15), five.times(3));
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

//    @Test
//    public void testDifferentClassEquality() throws Exception {
//        // given
//
//        // when
//
//        // then
//        assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
//    }

    @Test
    public void testEquality_11장() throws Exception {
        // given

        // when

        // then
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));

    }

    @Test
    public void testSimpleAddion() throws Exception {

        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);

    }

    @Test
    public void testReplusReturnSum() throws Exception {
        // given
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        // when
        Sum sum = (Sum) result;
        // then
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }

    @Test
    public void testReduceSum() throws Exception {
        // given
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        // when
        Money result = bank.reduce(sum, "USD");
        // then
        assertEquals(Money.dollar(7), result);
    }

    @Test
    public void testReduceMoney() throws Exception {
        // given
        Bank bank = new Bank();
        // when
        Money result = bank.reduce(Money.dollar(1), "USD");
        // then
        assertEquals(Money.dollar(1), result);

    }

    @Test
    public void testReduceMoneyDifferentCurrency() throws Exception {
        // given
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        // when
        Money result = bank.reduce(Money.franc(2), "USD");
        // then
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testIdentityRate() throws Exception {
        // given

        // when

        // then
        assertEquals(1, new Bank().rate("USD", "USD"));
    }

    @Test
    public void testMixedAddition() throws Exception {
        // given
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        // when
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");
        // then
        assertEquals(Money.dollar(10), result);
    }

}

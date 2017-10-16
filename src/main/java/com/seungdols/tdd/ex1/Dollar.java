package com.seungdols.tdd.ex1;

/**
 * @PACKAGE com.seungdols.tdd.ex1
 * @Author seungdols
 * @Date 2017. 10. 16.
 */
public class Dollar {

	int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public void times(int multiplier) {
		amount = amount * multiplier;
	}
}

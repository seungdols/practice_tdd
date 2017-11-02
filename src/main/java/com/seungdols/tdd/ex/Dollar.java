package com.seungdols.tdd.ex;

/**
 * @PACKAGE com.seungdols.tdd.ex
 * @Author seungdols
 * @Date 2017. 10. 16.
 */
public class Dollar extends Money{

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Money times(int multiplier) {
		return new Dollar(this.amount * multiplier);
	}

}

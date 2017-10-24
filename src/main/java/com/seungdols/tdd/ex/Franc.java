package com.seungdols.tdd.ex;

/**
 * @PACKAGE com.seungdols.tdd.ex
 * @AUTHOR seungdols
 * @DATE 2017. 10. 24.
 */
public class Franc extends Money{

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int multipilier) {
		return new Franc(amount * multipilier);
	}

}

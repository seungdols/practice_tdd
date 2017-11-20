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

	public Money times(int multipilier) {
		return new Franc(amount * multipilier);
	}

	@Override
	public String currency() {
		return "CHF";
	}
}

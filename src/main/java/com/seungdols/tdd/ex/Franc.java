package com.seungdols.tdd.ex;

/**
 * @PACKAGE com.seungdols.tdd.ex
 * @AUTHOR seungdols
 * @DATE 2017. 10. 24.
 */
public class Franc {

	private int amount;

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int multipilier) {
		return new Franc(amount * multipilier);
	}

	public boolean equals(Object object) {
		Franc franc = (Franc) object;
		return amount == franc.amount;
	}
}

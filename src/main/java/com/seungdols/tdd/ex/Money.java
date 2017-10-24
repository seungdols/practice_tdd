package com.seungdols.tdd.ex;

/**
 * @PACKAGE com.seungdols.tdd.ex
 * @AUTHOR seungdols
 * @DATE 2017. 10. 24.
 */
public class Money {
	protected int amount;

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount;
	}

	public int getAmount() {
		return amount;
	}
}

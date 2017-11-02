package com.seungdols.tdd.ex;

/**
 * @PACKAGE com.seungdols.tdd.ex
 * @AUTHOR seungdols
 * @DATE 2017. 10. 24.
 */
public abstract class Money {
	protected int amount;

	public int getAmount() {
		return amount;
	}

	abstract Money times(int multiplier);

	public static Dollar dollar(int amount) {
		return new Dollar(amount);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}
}

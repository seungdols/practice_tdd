package com.seungdols.tdd.ex;

/**
 * @PACKAGE com.seungdols.tdd.ex
 * @AUTHOR seungdols
 * @DATE 2017. 10. 24.
 */
public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    abstract Money times(int multiplier);

    public static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public String currency() {
        return currency;
    }
}

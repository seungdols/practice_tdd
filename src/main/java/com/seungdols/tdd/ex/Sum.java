package com.seungdols.tdd.ex;

/**
 * @PACKAGE com.seungdols.tdd.ex
 * @AUTHOR seungdols
 * @DATE 2017. 11. 26.
 */
public class Sum implements Expression{

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    Money augend;
    Money addend;

    public Money reduce(Bank bank, String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}

package chap06.hotel_rate;

import java.util.Currency;

public class Money {
    final int amount;
    final Currency currency;

    Money(final int amount, final Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("金額が0以上ではありません");
        }

        if (currency == null) {
            throw new IllegalArgumentException("通貨を指定してください");
        }

        this.amount = amount;
        this.currency = currency;
    }

    public Money add(Money other) {
        final int added = amount + other.amount;
        return new Money(added, currency);
    }
}

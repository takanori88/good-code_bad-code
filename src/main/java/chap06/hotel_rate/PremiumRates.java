package chap06.hotel_rate;

import java.util.Currency;
import java.util.Locale;

public class PremiumRates implements HotelRates{
    @Override
    public Money fee() {
        return new Money(12000, Currency.getInstance(Locale.JAPAN));
    }

    @Override
    public Money busySeasonFee() {
        return fee().add(new Money(5000, Currency.getInstance(Locale.JAPAN)));
    }
}

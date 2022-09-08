package chap06.hotel_rate;

import java.util.Currency;
import java.util.Locale;

public class RegularRates implements HotelRates{

    @Override
    public Money fee() {
        return new Money(7000, Currency.getInstance(Locale.JAPAN));
    }

    @Override
    public Money busySeasonFee() {
        return fee().add(new Money(3000, Currency.getInstance(Locale.JAPAN)));
    }
}

package chap06.hotel_rate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumRatesTest {
    PremiumRates premiumRates = new PremiumRates();

    @Test
    void fee() {
        assertEquals(12000, premiumRates.fee().amount);
    }

    @Test
    void busySeasonFee() {
        assertEquals(17000, premiumRates.busySeasonFee().amount);
    }
}
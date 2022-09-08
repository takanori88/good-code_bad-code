package chap06.hotel_rate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularRatesTest {
    RegularRates regularRates = new RegularRates();

    @Test
    void fee() {
        assertEquals(7000, regularRates.fee().amount);
    }

    @Test
    void busySeasonFee() {
        assertEquals(10000, regularRates.busySeasonFee().amount);
    }
}
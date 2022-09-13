package chap08.v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularDiscountedPriceTest {

    @Test
    void init() {
        RegularPrice price1 = new RegularPrice(1000);
        RegularDiscountedPrice discountedPrice1 = new RegularDiscountedPrice(price1);
        RegularPrice price2 = new RegularPrice(300);
        RegularDiscountedPrice discountedPrice2 = new RegularDiscountedPrice(price2);
        assertEquals(600, discountedPrice1.amount);
        assertEquals(0, discountedPrice2.amount);
    }

}
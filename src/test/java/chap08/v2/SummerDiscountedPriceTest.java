package chap08.v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummerDiscountedPriceTest {

    @Test
    void init() {
        RegularPrice price1 = new RegularPrice(1000);
        SummerDiscountedPrice discountedPrice1 = new SummerDiscountedPrice(price1);

        RegularPrice price2 = new RegularPrice(200);
        SummerDiscountedPrice discountedPrice2 = new SummerDiscountedPrice(price2);

        assertEquals(700, discountedPrice1.amount);
        assertEquals(0, discountedPrice2.amount);
    }

}
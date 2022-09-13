package chap08.v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RegularPriceTest {
    @Test
    void init() {
        RegularPrice price = new RegularPrice(1000);
        assertEquals(1000, price.amount);
    }

    @Test
    void initException() {
        assertThrows(IllegalArgumentException.class, () -> new RegularPrice(-100));
    }

}
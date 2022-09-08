package chap06.policy_pattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SilverCustomerPolicyTest {
    PurchaseHistory history = new PurchaseHistory(10, 15, 0.001);
    SilverCustomerPolicy silverCustomerPolicy = new SilverCustomerPolicy();

    @Test
    void testComplyWithAll() {
        assertTrue(silverCustomerPolicy.complyWithAll(history));
    }
}
package chap06.policy_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldCustomerPolicyTest {
    PurchaseHistory history = new PurchaseHistory(500000, 100, 0.001);
    GoldCustomerPolicy goldCustomerPolicy = new GoldCustomerPolicy();

    @Test
    void complyWithAll() {
        assertTrue(goldCustomerPolicy.complyWithAll(history));
    }
}
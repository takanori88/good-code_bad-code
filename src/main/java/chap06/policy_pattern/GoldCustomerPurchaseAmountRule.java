package chap06.policy_pattern;

public class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule{
    @Override
    public boolean ok(PurchaseHistory history) {
        return 100000 <= history.totalAmount;
    }
}

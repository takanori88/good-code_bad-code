package chap06.policy_pattern;

public class ReturnRateRule implements ExcellentCustomerRule{
    @Override
    public boolean ok(PurchaseHistory history) {
        return history.returnRate <= 0.001;
    }
}

package chap06.policy_pattern;

public interface ExcellentCustomerRule {
    boolean ok(final PurchaseHistory history);
}

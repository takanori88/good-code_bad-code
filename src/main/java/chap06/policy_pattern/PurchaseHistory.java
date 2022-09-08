package chap06.policy_pattern;

public class PurchaseHistory {
    int totalAmount;
    int purchaseFrequencyPerMonth;
    double returnRate;

    PurchaseHistory(final int totalAmount, final int purchaseFrequencyPerMonth, final double returnRate) {
        this.totalAmount = totalAmount;
        this.purchaseFrequencyPerMonth = purchaseFrequencyPerMonth;
        this.returnRate = returnRate;
    }
}

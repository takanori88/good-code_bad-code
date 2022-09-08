package chap06.policy_pattern;


import java.util.HashSet;
import java.util.Set;

public class ExcellentCustomerPolicy {
    private final Set<ExcellentCustomerRule> ruleSet;

    ExcellentCustomerPolicy() {
        ruleSet = new HashSet<>();
    }

    void add(final ExcellentCustomerRule rule) {
        ruleSet.add(rule);
    }

    boolean complyWithAll(final PurchaseHistory history) {
        for (ExcellentCustomerRule each : ruleSet) {
            if (!each.ok(history)) return false;
        }
        return true;
    }
}

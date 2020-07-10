package org.kie.kogito.queries;

import java.util.List;
import java.util.Map;
import org.kie.kogito.rules.RuleUnitInstance;
import static java.util.stream.Collectors.toList;

public class LoanUnitQueryFindApproved implements org.kie.kogito.rules.RuleUnitQuery<List<org.kie.kogito.queries.LoanApplication>> {

    private final RuleUnitInstance<org.kie.kogito.queries.LoanUnit> instance;

    public LoanUnitQueryFindApproved(RuleUnitInstance<org.kie.kogito.queries.LoanUnit> instance) {
        this.instance = instance;
    }

    @Override
    public List<org.kie.kogito.queries.LoanApplication> execute() {
        return instance.executeQuery("FindApproved").stream().map(this::toResult).collect(toList());
    }

    private org.kie.kogito.queries.LoanApplication toResult(Map<String, Object> tuple) {
        return (org.kie.kogito.queries.LoanApplication) tuple.get("$l");
    }
}

package org.kie.kogito.queries;

import java.util.List;
import java.util.Map;
import org.kie.kogito.rules.RuleUnitInstance;
import static java.util.stream.Collectors.toList;

public class LoanUnitQueryFindNotApprovedIdAndAmount implements org.kie.kogito.rules.RuleUnitQuery<List<LoanUnitQueryFindNotApprovedIdAndAmount.Result>> {

    private final RuleUnitInstance<org.kie.kogito.queries.LoanUnit> instance;

    public LoanUnitQueryFindNotApprovedIdAndAmount(RuleUnitInstance<org.kie.kogito.queries.LoanUnit> instance) {
        this.instance = instance;
    }

    @Override
    public List<LoanUnitQueryFindNotApprovedIdAndAmount.Result> execute() {
        return instance.executeQuery("FindNotApprovedIdAndAmount").stream().map(this::toResult).collect(toList());
    }

    private LoanUnitQueryFindNotApprovedIdAndAmount.Result toResult(Map<String, Object> tuple) {
        return new Result((Integer) tuple.get("$amount"), (java.lang.String) tuple.get("$id"));
    }

    public static class Result {

        public Result(int $amount, String $id) {
            this.$amount = $amount;
            this.$id = $id;
        }

        private final int $amount;

        public int get$amount() {
            return $amount;
        }

        private final String $id;

        public String get$id() {
            return $id;
        }
    }
}

package org.kie.kogito.queries;

public class LoanUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<org.kie.kogito.queries.LoanUnit> {

    public LoanUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<org.kie.kogito.queries.LoanUnit> unit, org.kie.kogito.queries.LoanUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, org.kie.kogito.queries.LoanUnit value) {
        if (value.getLoanApplications() == null) {
            value.setLoanApplications(org.kie.kogito.rules.DataSource.createStore());
        }
        value.getLoanApplications().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("loanApplications")));
        runtime.setGlobal("loanApplications", value.getLoanApplications());
        runtime.setGlobal("maxAmount", value.getMaxAmount());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (LoanUnitQueryFindApproved.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new LoanUnitQueryFindApproved(this);
        if (LoanUnitQueryFindNotApprovedIdAndAmount.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new LoanUnitQueryFindNotApprovedIdAndAmount(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}

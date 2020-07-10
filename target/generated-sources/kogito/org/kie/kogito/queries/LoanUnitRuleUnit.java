package org.kie.kogito.queries;

import org.kie.api.runtime.KieSession;
import org.kie.kogito.rules.RuleEventListenerConfig;
import org.kie.kogito.rules.units.impl.AbstractRuleUnit;

@javax.inject.Singleton()
public class LoanUnitRuleUnit extends AbstractRuleUnit<LoanUnit> {

    public LoanUnitRuleUnit() {
        this(new org.kie.kogito.app.Application());
    }

    @javax.inject.Inject()
    public LoanUnitRuleUnit(org.kie.kogito.Application app) {
        super(app);
    }

    public org.kie.kogito.queries.LoanUnitRuleUnitInstance internalCreateInstance(LoanUnit value) {
        return new org.kie.kogito.queries.LoanUnitRuleUnitInstance(this, value, createLegacySession());
    }

    private KieSession createLegacySession() {
        KieSession ks = app.ruleUnits().ruleRuntimeBuilder().newKieSession(LoanUnit.class);
        ((org.drools.core.impl.StatefulKnowledgeSessionImpl) ks).setApplication(app);
        if (app.config() != null && app.config().rule() != null) {
            RuleEventListenerConfig ruleEventListenerConfig = app.config().rule().ruleEventListeners();
            ruleEventListenerConfig.agendaListeners().forEach(ks::addEventListener);
            ruleEventListenerConfig.ruleRuntimeListeners().forEach(ks::addEventListener);
        }
        return ks;
    }
}

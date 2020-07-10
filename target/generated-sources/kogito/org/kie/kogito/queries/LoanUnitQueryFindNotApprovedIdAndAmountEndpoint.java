package org.kie.kogito.queries;

import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.kie.kogito.rules.RuleUnit;
import org.kie.kogito.rules.RuleUnitInstance;
import static java.util.stream.Collectors.toList;

@Path("/find-not-approved-id-and-amount")
public class LoanUnitQueryFindNotApprovedIdAndAmountEndpoint {

    @javax.inject.Inject()
    RuleUnit<org.kie.kogito.queries.LoanUnit> ruleUnit;

    public LoanUnitQueryFindNotApprovedIdAndAmountEndpoint() {
    }

    public LoanUnitQueryFindNotApprovedIdAndAmountEndpoint(RuleUnit<org.kie.kogito.queries.LoanUnit> ruleUnit) {
        this.ruleUnit = ruleUnit;
    }

    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<LoanUnitQueryFindNotApprovedIdAndAmount.Result> executeQuery(org.kie.kogito.queries.LoanUnit unitDTO) {
        RuleUnitInstance<org.kie.kogito.queries.LoanUnit> instance = ruleUnit.createInstance(unitDTO);
        return instance.executeQuery(LoanUnitQueryFindNotApprovedIdAndAmount.class);
    }

    @POST()
    @Path("/first")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public LoanUnitQueryFindNotApprovedIdAndAmount.Result executeQueryFirst(org.kie.kogito.queries.LoanUnit unitDTO) {
        List<LoanUnitQueryFindNotApprovedIdAndAmount.Result> results = executeQuery(unitDTO);
        LoanUnitQueryFindNotApprovedIdAndAmount.Result response = results.isEmpty() ? null : results.get(0);
        return response;
    }
}

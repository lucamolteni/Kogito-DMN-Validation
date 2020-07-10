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

@Path("/find-approved")
public class LoanUnitQueryFindApprovedEndpoint {

    @javax.inject.Inject()
    RuleUnit<org.kie.kogito.queries.LoanUnit> ruleUnit;

    public LoanUnitQueryFindApprovedEndpoint() {
    }

    public LoanUnitQueryFindApprovedEndpoint(RuleUnit<org.kie.kogito.queries.LoanUnit> ruleUnit) {
        this.ruleUnit = ruleUnit;
    }

    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<org.kie.kogito.queries.LoanApplication> executeQuery(org.kie.kogito.queries.LoanUnit unitDTO) {
        RuleUnitInstance<org.kie.kogito.queries.LoanUnit> instance = ruleUnit.createInstance(unitDTO);
        return instance.executeQuery(LoanUnitQueryFindApproved.class);
    }

    @POST()
    @Path("/first")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public org.kie.kogito.queries.LoanApplication executeQueryFirst(org.kie.kogito.queries.LoanUnit unitDTO) {
        List<org.kie.kogito.queries.LoanApplication> results = executeQuery(unitDTO);
        org.kie.kogito.queries.LoanApplication response = results.isEmpty() ? null : results.get(0);
        return response;
    }
}

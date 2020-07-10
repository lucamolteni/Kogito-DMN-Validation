package org.kie.kogito.queries;

import java.util.*;
import org.drools.model.*;
import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import java.time.*;
import java.time.format.*;
import java.text.*;
import org.drools.core.util.*;
import org.kie.kogito.queries.LoanApplication;
import org.drools.model.Model;

public abstract class RulesF894883E1030542FEFCE9860F835B9B7 implements Model {

    public final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DateUtils.getDateFormatMask(),
                                                                                            Locale.ENGLISH);

    @Override
    public String getName() {
        return "org.kie.kogito.queries";
    }

    public static Date string_2_date(String s) {
        return GregorianCalendar.from(LocalDate.parse(s,
                                                      DATE_TIME_FORMATTER).atStartOfDay(ZoneId.systemDefault()))
                                .getTime();
    }

    @Override
    public List<org.drools.model.EntryPoint> getEntryPoints() {
        return Arrays.asList(D.entryPoint("loanApplications"));
    }

    @Override
    public List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    public static final org.drools.model.Global<org.kie.kogito.rules.DataStore> var_loanApplications = D.globalOf(org.kie.kogito.rules.DataStore.class,
                                                                                                                  "org.kie.kogito.queries",
                                                                                                                  "loanApplications");

    public static final org.drools.model.Global<Integer> var_maxAmount = D.globalOf(Integer.class,
                                                                                    "org.kie.kogito.queries",
                                                                                    "maxAmount");

    public static final org.drools.model.Query0Def queryDef_FindNotApprovedIdAndAmount = D.query("org.kie.kogito.queries",
                                                                                                 "FindNotApprovedIdAndAmount");

    public static final org.drools.model.Query0Def queryDef_FindApproved = D.query("org.kie.kogito.queries",
                                                                                   "FindApproved");

    List<org.drools.model.Global> globals = new ArrayList<>();

    List<org.drools.model.TypeMetaData> typeMetaDatas = Collections.emptyList();

    {
        globals.add(var_loanApplications);
        globals.add(var_maxAmount);
    }
}

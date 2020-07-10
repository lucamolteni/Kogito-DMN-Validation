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
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;

public class RulesF894883E1030542FEFCE9860F835B9B7_LoanUnitRuleMethods0 {

    /**
     * Rule name: SmallDepositApprove
     */
    public static org.drools.model.Rule rule_SmallDepositApprove() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "SmallDepositApprove").unit(org.kie.kogito.queries.LoanUnit.class)
                                                                  .build(D.pattern(var_$l).expr("8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                                (org.kie.kogito.queries.LoanApplication _this) -> org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getApplicant().getAge(),
                                                                                                                                                                                                                     20),
                                                                                                D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                 org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                 -1,
                                                                                                                 (org.kie.kogito.queries.LoanApplication _this) -> _this.getApplicant()
                                                                                                                                                                        .getAge(),
                                                                                                                 20),
                                                                                                D.reactOn("applicant")).expr("370B7E0FCDFC8A3C7B34041AAD66452B",
                                                                                                                             (org.kie.kogito.queries.LoanApplication _this) -> org.drools.modelcompiler.util.EvaluationUtil.lessThanNumbers(_this.getDeposit(),
                                                                                                                                                                                                                                            1000),
                                                                                                                             D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                              DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                              (org.kie.kogito.queries.LoanApplication _this) -> _this.getDeposit(),
                                                                                                                                              1000),
                                                                                                                             D.reactOn("deposit")).expr("C756ECFAB3372DF62FB33D616A3015EB",
                                                                                                                                                        (org.kie.kogito.queries.LoanApplication _this) -> org.drools.modelcompiler.util.EvaluationUtil.lessOrEqualNumbers(_this.getAmount(),
                                                                                                                                                                                                                                                                          2000),
                                                                                                                                                        D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                                                                         org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                         (org.kie.kogito.queries.LoanApplication _this) -> _this.getAmount(),
                                                                                                                                                                         2000),
                                                                                                                                                        D.reactOn("amount")),
                                                                         D.on(var_$l).execute((org.drools.model.Drools drools, org.kie.kogito.queries.LoanApplication $l) -> {
                                                                             {
                                                                                 {
                                                                                     {
                                                                                         ($l).setApproved(true);
                                                                                         drools.update($l,
                                                                                                       mask_$l);
                                                                                     }
                                                                                 }
                                                                             }
                                                                         }));
        return rule;
    }

    /**
     * Rule name: SmallDepositReject
     */
    public static org.drools.model.Rule rule_SmallDepositReject() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "SmallDepositReject").unit(org.kie.kogito.queries.LoanUnit.class)
                                                                 .build(D.pattern(var_$l).expr("8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                               (org.kie.kogito.queries.LoanApplication _this) -> org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getApplicant().getAge(),
                                                                                                                                                                                                                    20),
                                                                                               D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                -1,
                                                                                                                (org.kie.kogito.queries.LoanApplication _this) -> _this.getApplicant()
                                                                                                                                                                       .getAge(),
                                                                                                                20),
                                                                                               D.reactOn("applicant")).expr("370B7E0FCDFC8A3C7B34041AAD66452B",
                                                                                                                            (org.kie.kogito.queries.LoanApplication _this) -> org.drools.modelcompiler.util.EvaluationUtil.lessThanNumbers(_this.getDeposit(),
                                                                                                                                                                                                                                           1000),
                                                                                                                            D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                                             org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                             DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                             (org.kie.kogito.queries.LoanApplication _this) -> _this.getDeposit(),
                                                                                                                                             1000),
                                                                                                                            D.reactOn("deposit")).expr("BAB857FAD4CC698CC458B0F7A92C9D06",
                                                                                                                                                       (org.kie.kogito.queries.LoanApplication _this) -> org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getAmount(),
                                                                                                                                                                                                                                                                         2000),
                                                                                                                                                       D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                                                                        org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                        (org.kie.kogito.queries.LoanApplication _this) -> _this.getAmount(),
                                                                                                                                                                        2000),
                                                                                                                                                       D.reactOn("amount")),
                                                                        D.on(var_$l).execute((org.drools.model.Drools drools, org.kie.kogito.queries.LoanApplication $l) -> {
                                                                            {
                                                                                {
                                                                                    {
                                                                                        ($l).setApproved(false);
                                                                                        drools.update($l,
                                                                                                      mask_$l);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }));
        return rule;
    }

    /**
     * Rule name: LargeDepositApprove
     */
    public static org.drools.model.Rule rule_LargeDepositApprove() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LargeDepositApprove").unit(org.kie.kogito.queries.LoanUnit.class)
                                                                  .build(D.pattern(var_$l).expr("8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                                (org.kie.kogito.queries.LoanApplication _this) -> org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getApplicant().getAge(),
                                                                                                                                                                                                                     20),
                                                                                                D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                 org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                 -1,
                                                                                                                 (org.kie.kogito.queries.LoanApplication _this) -> _this.getApplicant()
                                                                                                                                                                        .getAge(),
                                                                                                                 20),
                                                                                                D.reactOn("applicant")).expr("0CC265FADCDC906830A28A36EE361EB5",
                                                                                                                             (org.kie.kogito.queries.LoanApplication _this) -> org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getDeposit(),
                                                                                                                                                                                                                                                  1000),
                                                                                                                             D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                                              org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                              DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                              (org.kie.kogito.queries.LoanApplication _this) -> _this.getDeposit(),
                                                                                                                                              1000),
                                                                                                                             D.reactOn("deposit")).expr("707D479969E8B848EF9C3113B0EF99EB",
                                                                                                                                                        var_maxAmount,
                                                                                                                                                        (org.kie.kogito.queries.LoanApplication _this, Integer maxAmount) -> org.drools.modelcompiler.util.EvaluationUtil.lessOrEqualNumbers(_this.getAmount(),
                                                                                                                                                                                                                                                                                             maxAmount),
                                                                                                                                                        D.betaIndexedBy(java.lang.Integer.class,
                                                                                                                                                                        org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                        (org.kie.kogito.queries.LoanApplication _this) -> _this.getAmount(),
                                                                                                                                                                        (Integer maxAmount) -> maxAmount),
                                                                                                                                                        D.reactOn("amount")),
                                                                         D.on(var_$l).execute((org.drools.model.Drools drools, org.kie.kogito.queries.LoanApplication $l) -> {
                                                                             {
                                                                                 {
                                                                                     {
                                                                                         ($l).setApproved(true);
                                                                                         drools.update($l,
                                                                                                       mask_$l);
                                                                                     }
                                                                                 }
                                                                             }
                                                                         }));
        return rule;
    }

    /**
     * Rule name: LargeDepositReject
     */
    public static org.drools.model.Rule rule_LargeDepositReject() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LargeDepositReject").unit(org.kie.kogito.queries.LoanUnit.class)
                                                                 .build(D.pattern(var_$l).expr("8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                               (org.kie.kogito.queries.LoanApplication _this) -> org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getApplicant().getAge(),
                                                                                                                                                                                                                    20),
                                                                                               D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                -1,
                                                                                                                (org.kie.kogito.queries.LoanApplication _this) -> _this.getApplicant()
                                                                                                                                                                       .getAge(),
                                                                                                                20),
                                                                                               D.reactOn("applicant")).expr("0CC265FADCDC906830A28A36EE361EB5",
                                                                                                                            (org.kie.kogito.queries.LoanApplication _this) -> org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getDeposit(),
                                                                                                                                                                                                                                                 1000),
                                                                                                                            D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                                             org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                             DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                             (org.kie.kogito.queries.LoanApplication _this) -> _this.getDeposit(),
                                                                                                                                             1000),
                                                                                                                            D.reactOn("deposit")).expr("9749F5AE083B9EE7BEB30A1033439430",
                                                                                                                                                       var_maxAmount,
                                                                                                                                                       (org.kie.kogito.queries.LoanApplication _this, Integer maxAmount) -> org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getAmount(),
                                                                                                                                                                                                                                                                                            maxAmount),
                                                                                                                                                       D.betaIndexedBy(java.lang.Integer.class,
                                                                                                                                                                       org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                                                       DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                       (org.kie.kogito.queries.LoanApplication _this) -> _this.getAmount(),
                                                                                                                                                                       (Integer maxAmount) -> maxAmount),
                                                                                                                                                       D.reactOn("amount")),
                                                                        D.on(var_$l).execute((org.drools.model.Drools drools, org.kie.kogito.queries.LoanApplication $l) -> {
                                                                            {
                                                                                {
                                                                                    {
                                                                                        ($l).setApproved(false);
                                                                                        drools.update($l,
                                                                                                      mask_$l);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }));
        return rule;
    }

    /**
     * Rule name: NotAdultApplication
     */
    public static org.drools.model.Rule rule_NotAdultApplication() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "NotAdultApplication").unit(org.kie.kogito.queries.LoanUnit.class)
                                                                  .build(D.pattern(var_$l).expr("C570E3A565BEB9D33B4F22270CB9FB39",
                                                                                                (org.kie.kogito.queries.LoanApplication _this) -> org.drools.modelcompiler.util.EvaluationUtil.lessThanNumbers(_this.getApplicant().getAge(),
                                                                                                                                                                                                               20),
                                                                                                D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                 org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                 -1,
                                                                                                                 (org.kie.kogito.queries.LoanApplication _this) -> _this.getApplicant()
                                                                                                                                                                        .getAge(),
                                                                                                                 20),
                                                                                                D.reactOn("applicant")),
                                                                         D.on(var_$l).execute((org.drools.model.Drools drools, org.kie.kogito.queries.LoanApplication $l) -> {
                                                                             {
                                                                                 {
                                                                                     {
                                                                                         ($l).setApproved(false);
                                                                                         drools.update($l,
                                                                                                       mask_$l);
                                                                                     }
                                                                                 }
                                                                             }
                                                                         }));
        return rule;
    }
}

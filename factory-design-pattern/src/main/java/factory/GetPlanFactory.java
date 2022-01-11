package main.java.factory;

import main.java.enums.PlanEnums;
import main.java.plan.*;

public class GetPlanFactory {

    public Plan getPlan (String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase(PlanEnums.DOMESTIC.name())) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase(PlanEnums.INTERNATIONAL.name())) {
            return new InternationalPlan();
        } else if (planType.equalsIgnoreCase(PlanEnums.COMMERCIAL.name())) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase(PlanEnums.INSTITUTIONAL.name())) {
            return new InstitutionalPlan();
        }
        return null;
    }
}

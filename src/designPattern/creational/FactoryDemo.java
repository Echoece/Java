package designPattern.creational;

// main class
public class FactoryDemo {
    public static void main(String[] args) {
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        String currentPlan = "Commercial";

        Plan plan = getPlanFactory.getPlan(currentPlan);
    }

}

// factory class
class GetPlanFactory {
    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTIC")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIAL")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONAL")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}


abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}

class DomesticPlan extends Plan {
    //@override
    public void getRate() {
        rate = 3.50;
    }
}

class CommercialPlan extends Plan {
    //@override
    public void getRate() {
        rate = 7.50;
    }
}

class InstitutionalPlan extends Plan {
    //@override
    public void getRate() {
        rate = 5.50;
    }
}

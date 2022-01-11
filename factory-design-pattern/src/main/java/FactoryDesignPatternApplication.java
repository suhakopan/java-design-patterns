package main.java;

import main.java.factory.GetPlanFactory;
import main.java.plan.Plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryDesignPatternApplication {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();
        System.out.println("Enter the number of units: ");
        int units = Integer.parseInt(br.readLine());

        Plan plan = planFactory.getPlan(planName);

        System.out.println("Bill amount for " + planName + " of " + units + " units is: ");
        plan.getRate();
        plan.calculateBill(units);
    }
}

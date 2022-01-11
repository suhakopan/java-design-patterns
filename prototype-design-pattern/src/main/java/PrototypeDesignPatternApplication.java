package main.java;

import main.java.domain.EmployeeRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDesignPatternApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Employee Id: ");
        int eId = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String eName = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String eAddress = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double eSalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        EmployeeRecord e1 = new EmployeeRecord(eId, eName, eSalary, eAddress);

        e1.getEmployee();
        System.out.println("\n");
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.getEmployee();
    }
}

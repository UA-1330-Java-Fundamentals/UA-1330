package com.softserve.edu.HW6_7_OOP_Part_2.Task_1;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxId;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxId, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    String getName() {
        return "Contract Employee";
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + getName() + ", Average Monthly Wage: " + calculatePay();
    }
}

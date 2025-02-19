package com.softserve.edu.HW6_7_OOP_Part_2.Task_1;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    String getName() {
        return "Salaried Employee";
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + getName() + ", Average Monthly Wage: " + calculatePay();
    }
}
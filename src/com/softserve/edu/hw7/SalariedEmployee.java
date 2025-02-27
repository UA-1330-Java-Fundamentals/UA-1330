package com.softserve.edu.hw7;

public class SalariedEmployee extends Employee implements Payment {
    protected String socialSecurityNumber;
    protected double fixedMonthlyPayment;

    public SalariedEmployee(String socialSecurityNumber, String name, String employeeId, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;

    }
    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return super.toString() + "average monthly wage= " + calculatePay() ;
    }
    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }
}

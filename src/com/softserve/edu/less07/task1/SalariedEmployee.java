package com.softserve.edu.less07.task1;

public class SalariedEmployee extends Employee implements Payment {
    private double socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, double socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public double getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(double socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment + ", avgSalary = " + calculatePay() +
                '}';
    }
}

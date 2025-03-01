package com.softserve.edu.homework_7.task_1;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String fullName, String employeeId, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(fullName, employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
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

    @Override
    public String toString() {
        return "Salaried employee: " + fullName
                + ", employee id: " + employeeId
                + ", social security number: " + socialSecurityNumber
                + ",\n\t\t\taverage monthly wage: " + calculatePay();
    }
}

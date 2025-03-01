package com.softserve.edu.HW7Interface;

public class SalariedEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private double monthSalary;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double monthSalary) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthSalary = monthSalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return monthSalary;
    }
}

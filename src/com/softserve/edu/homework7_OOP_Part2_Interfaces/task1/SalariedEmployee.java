package com.softserve.edu.homework7_OOP_Part2_Interfaces.task1;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double fixed_monthly_payment;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double fixed_monthly_payment) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixed_monthly_payment = fixed_monthly_payment;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setFixed_monthly_payment(double fixed_monthly_payment) {
        this.fixed_monthly_payment = fixed_monthly_payment;
    }

    @Override
    public double calculatePay() {
        return fixed_monthly_payment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", average_monthly_salary=" + fixed_monthly_payment +
                '}';
    }
}

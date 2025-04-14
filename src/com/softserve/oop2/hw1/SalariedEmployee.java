package com.softserve.oop2.hw1;
public class SalariedEmployee extends Employee implements Payment {

    private String employeeName;
    private String socialSecurityNumber;
    private double monthlyPayment;

    public SalariedEmployee(String employeeld, String name, String socialSecurityNumber, double monthlyPayment) {
        super(employeeld);
        this.employeeName = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlyPayment = monthlyPayment;
    }

    public String getName() {
        return employeeName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double calculatePay(){
       return monthlyPayment;
    }

    @Override
    public String toString() {
        return "Salaried Employee " +
                super.toString() + " " +
                "Name:" + employeeName +
                ", SocialSecurityNumber:" + socialSecurityNumber +
                ", Monthly Payment:" + monthlyPayment;
    }
}


package com.softserve.edu.HW7Interface;

public class ContractEmployee extends Employee implements Payment {

    private String federalTaxIdmember;
    private double  hourlyRate;
    private int numberOfHours;
    private double monthWage;

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, double hourlyRate, int numberOfHours) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    @Override
    public double calculatePay() {
        return monthWage = 1.0 * hourlyRate * numberOfHours;
    }
}

package com.softserve.edu.hw7;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdnumber;
    double hours;
    double rate;

    public ContractEmployee(String federalTaxIdnumber, String name, String employeeId, double hours, double rate) {
        super(employeeId, name);
        this.federalTaxIdnumber = federalTaxIdnumber;
        this.hours = hours;
        this.rate = rate;

    }
    @Override
    public double calculatePay() {
        return hours * rate;
    }

    @Override
    public String toString() {
        return super.toString() + "average monthly wage= " + calculatePay() ;
    }

    }


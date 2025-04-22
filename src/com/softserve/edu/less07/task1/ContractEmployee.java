package com.softserve.edu.less07.task1;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdmember;
    private int hourlyRate;
    private int numberOfHoursWorked;

    public ContractEmployee(String employeeId, String federalTaxIdmember, int hourlyRate, int numberOfHoursWorked) {
        super(employeeId);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked + ", avgSalary = " + calculatePay() +
                '}';
    }
}

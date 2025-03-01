package com.softserve.edu.homework_7.task_1;

public class ContractEmployee extends Employee {
    private String federalTaxIdMember;
    private double hourlyRate;
    private int numberOfHoursWorked;

    public ContractEmployee(String fullName, String employeeId, String federalTaxIdMember, double hourlyRate, int numberOfHoursWorked) {
        super(fullName, employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
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

    @Override
    public String toString() {
        return "Contract employee: " + fullName
                + ", employee id: " + employeeId
                + ", federal tax id member: " + federalTaxIdMember
                + ",\n\t\t\taverage monthly wage: " + calculatePay();
    }
}

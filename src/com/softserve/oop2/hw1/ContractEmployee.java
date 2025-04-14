package com.softserve.oop2.hw1;
public class ContractEmployee extends Employee implements Payment{
    private String contractorName;
    private String federalTaxIdMember;
    private double hourlyRate;
    private double numberOfHours;

    public ContractEmployee(String employeeld, String contractorName, String federalTaxIdMember, double hourlyRate, double numberOfHours) {
        super(employeeld);
        this.contractorName = contractorName;
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    public String getContractorName() {
        return contractorName;
    }

    public void setContractorName(String contractorName) {
        this.contractorName = contractorName;
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

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public String toString() {
        return "Contract Employee " +
                super.toString() + " " +
                "Name:" + contractorName +
                ", FederalTaxIdMember:" + federalTaxIdMember +
                ", Hourly Rate:" + hourlyRate +
                ", Number Of Hours:" + numberOfHours;
    }

    public double calculatePay(){
       return hourlyRate*numberOfHours;
    }
}


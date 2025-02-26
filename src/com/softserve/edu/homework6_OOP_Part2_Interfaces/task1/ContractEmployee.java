package com.softserve.edu.homework6_OOP_Part2_Interfaces.task1;

public class ContractEmployee extends Employee implements Payment {
    private double average_monthly_salary, hourly_rate, number_of_hours_worked;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String federalTaxIdMember, double number_of_hours_worked, double hourly_rate) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.number_of_hours_worked = number_of_hours_worked;
        this.hourly_rate = hourly_rate;
    }

    @Override
    public double calculatePay() {
        average_monthly_salary = hourly_rate * number_of_hours_worked;
        return average_monthly_salary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employeeId =" + employeeId +
                ", federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", average_monthly_salary=" + calculatePay() +
                '}';
    }


}

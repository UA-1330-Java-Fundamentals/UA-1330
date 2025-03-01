package com.softserve.edu.homework_7.task_1;

public abstract class Employee implements Payment, Comparable<Employee> {
    protected String fullName;
    protected String employeeId;

    public Employee(String fullName, String employeeId) {
        this.fullName = fullName;
        this.employeeId = employeeId;
    }

    @Override
    public int compareTo(Employee employee) {
        if (employee.calculatePay() != 0) {
            return Double.compare(employee.calculatePay(), this.calculatePay());
        } else {
            return 0;
        }
    }
}
package com.softserve.edu.HW7Interface;

public abstract class Employee implements Payment, Comparable<Employee> {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract double calculatePay();

    @Override
    public String toString() {
        return "EmployeeID: " + employeeId +
                ", name: " + name +
                ", averageMonthlySalary: " + calculatePay();
    }

    @Override
    public int compareTo(Employee nextEmployee) {
        return Double.compare(nextEmployee.calculatePay(), this.calculatePay());
    }
}

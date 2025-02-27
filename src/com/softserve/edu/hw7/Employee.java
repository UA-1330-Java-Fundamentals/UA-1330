package com.softserve.edu.hw7;

public abstract class Employee implements Payment, Comparable<Employee>  {
   protected String employeeId;
   protected String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Employee employee) {
        return Double.compare(employee.calculatePay(),calculatePay());
    }
}
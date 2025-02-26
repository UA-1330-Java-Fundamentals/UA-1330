package com.softserve.edu.homework6_OOP_Part2_Interfaces.task1;

import java.util.Objects;

///implements Comparable<Employee>
abstract class Employee implements Payment, Comparable<Employee> {
    protected String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }


    @Override
    public int compareTo(Employee employee) {
        return Double.compare(employee.calculatePay(), this.calculatePay());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(employeeId);
    }
}

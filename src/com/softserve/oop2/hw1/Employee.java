package com.softserve.oop2.hw1;
import java.util.Objects;

public abstract class Employee {
    private String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    @Override
    public String toString() {
        return "Id:" + employeeld;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeld, employee.employeeld);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(employeeld);
    }
}


package com.softserve.streams.homework;

import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Employee " +
                "name=" + name;
    }

    static Optional<String> mostPopularName(Stream< Employee> employees) {
        return null;
         // return employees.max(comparing(Employee::getName)).orElse();
       // return employees.stream().max(Comparator.comparing(Employee::getName));
         }
}

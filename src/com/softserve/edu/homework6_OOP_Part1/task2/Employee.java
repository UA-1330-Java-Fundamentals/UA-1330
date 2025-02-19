package com.softserve.edu.homework6_OOP_Part1.task2;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String report() {
        return String.format("Name: %s, Age %d, " + "Salary: \u2084 %.2f.", name, age, salary);
    }
}

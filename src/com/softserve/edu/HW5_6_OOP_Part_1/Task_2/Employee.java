package com.softserve.edu.HW5_6_OOP_Part_1.Task_2;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Конструктор класу Employee
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Метод для формування звіту про працівника
    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f.", name, age, salary);
    }
}
package com.softserve.edu.HW5_6_OOP_Part_1.Task_2;

public class Developer extends Employee {

    private String possition;

    public Developer(String name, int age, double salary, String possition) {
        super(name, age, salary);
        this.possition = possition;
    }

    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: \u20B4 %.2f",
                getName(), getAge(), possition, getSalary());
    }

}

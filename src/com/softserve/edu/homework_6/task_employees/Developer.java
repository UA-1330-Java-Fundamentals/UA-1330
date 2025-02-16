package com.softserve.edu.homework_6.task_employees;

public class Developer extends Employee{
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, " +
                "Position: %s, Salary: ₴%.2f.", super.getName(), super.getAge(), position, super.getSalary());
    }
}

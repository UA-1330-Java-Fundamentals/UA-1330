package com.softserve.edu.hw6.second_task;

public class Developer extends Employee {
    String position;
    public Developer(String position, String name, int age, double salary) {
        super(name, age, salary);
        this.position = position;
    }
    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, " +
                "Salary: \u20B4 %.2f.", name, age, position, salary);

    }

    public static void main(String[] args) {
        Employee employee = new Employee("Olga", 18, 20.000);
        Developer developer = new Developer("Java dev", "Oleg", 32, 23.99);
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}

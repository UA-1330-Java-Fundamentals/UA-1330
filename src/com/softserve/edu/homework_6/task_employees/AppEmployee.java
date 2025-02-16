package com.softserve.edu.homework_6.task_employees;

public class AppEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Tania", 24, 52888.99);
        System.out.println(employee.report());

        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java Developer");
        System.out.println(developer.report());
    }
}

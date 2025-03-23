package com.softserve.edu.hw6.Task2;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Ivan", 30, 25000.50);
        Developer dev = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(emp.report());
        System.out.println(dev.report());
    }
}

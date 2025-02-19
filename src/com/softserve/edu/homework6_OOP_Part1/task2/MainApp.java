package com.softserve.edu.homework6_OOP_Part1.task2;

public class MainApp {
    public static void main(String[] args) {

        Employee employee = new Employee("John", 45, 45000.00);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer") ;

        System.out.println(employee.report());
        System.out.println(developer.report());
//        developer.report();
    }
}

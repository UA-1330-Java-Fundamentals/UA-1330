package com.softserve.err.homework2;

public class ApplDeveloper {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", 39, 350.0);
        Employee developer = new Developer("Mike", 39, 350.0, "Sales manager");

        System.out.println("Information about employee" + employee.report());
        System.out.println("Information about developer" + developer.report());;
    }
}

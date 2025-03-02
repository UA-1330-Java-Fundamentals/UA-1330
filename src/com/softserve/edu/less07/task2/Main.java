package com.softserve.edu.less07.task2;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Mykola", 19, 3000.03, "middle");
        System.out.println(developer.report());
        Employee employee = new Employee("Mike", 23, 500.00);
        System.out.println(employee.report());
    }
}

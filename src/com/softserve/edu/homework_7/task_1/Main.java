package com.softserve.edu.homework_7.task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new SalariedEmployee("Kate Middleton", "330098", "234-45-0981", 3489.98),
            new ContractEmployee("Megan Fox", "330234", "32-2124444", 34.56, 160),
            new SalariedEmployee("Jenna Coleman", "340001", "789-12-2345", 1000.08),
            new ContractEmployee("Jenna Ortega", "339987", "35-4561230", 20.7, 80)
        };

        Arrays.sort(employees);

        System.out.println("Sorted employees: ");
        int count = 0;
        for (Employee employee : employees) {
            System.out.println("\t" + (++count) + ". " + employee);
        }
    }
}

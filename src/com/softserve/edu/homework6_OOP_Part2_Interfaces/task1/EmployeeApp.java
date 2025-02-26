package com.softserve.edu.homework6_OOP_Part2_Interfaces.task1;

import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee [] employees = new Employee[3];

        employees[0] = new SalariedEmployee("#001", "SSN001", 3000);
        employees[1] = new ContractEmployee("#002", "FTID01", 48, 20.50);
        employees[2] = new SalariedEmployee("#003", "SSN002", 4000);

        Arrays.sort(employees);

        for (Employee empl : employees){
            System.out.println(empl);
        }

    }
}

package com.softserve.edu.hw7;

import java.util.Arrays;

public class AppEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("67-877", "Bleg", "89m7", 12.50, 9.88),
                new ContractEmployee("67-777", "Aleg", "8997", 12.10, 78.88),
                new ContractEmployee("67-777", "Dleg", "8p97", 9.50, 99.88),
                new SalariedEmployee("3343-33", "Can", "123", 134.55)
        };

        for (var employee : employees) {
            System.out.println("Oridinal " + employee);
        }

      Arrays.sort (employees);

        for (var employee : employees) {
            System.out.println("Sorted " + employee);
        }
    }
}

package com.softserve.edu.HW7Interface;

import java.util.Arrays;

public class MainEmployeeContract_Salaried {
    public static void main(String[] args) {
        Employee[] employee = {
                new SalariedEmployee("01", "Ivan", "305301", 0),
                new ContractEmployee("02", "Petro", "02344565", 200, 160),
                new SalariedEmployee("03", "Kate", "111302", 15000),
                new SalariedEmployee("04", "Nick", "222303", 50000),
                new ContractEmployee("05", "Michael", "02344005", 150, 100),
                new ContractEmployee("06", "Irina", "023479776", 250, 180),
                new ContractEmployee("07", "Silvia", "02348756", 200, 120),
                new ContractEmployee("08", "Ted", "02367654345", 180, 140),
                new SalariedEmployee("09", "Ron", "3332201", 27000)};

        System.out.println("Default array: ");
        for (Employee each: employee) {
            System.out.println(each);
        }
        Arrays.sort(employee);
        System.out.println("--------------------");
        System.out.println("Sorted array by salary: ");

        for (Employee each: employee) {
            System.out.println(each);
        }
    }
}

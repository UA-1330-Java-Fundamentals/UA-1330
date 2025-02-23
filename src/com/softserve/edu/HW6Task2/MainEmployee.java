package com.softserve.edu.HW6Task2;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Nick", 37, 20000);
        Developer developer1 = new Developer("Oleg", 45, 40000, "junior java developer");

        System.out.println(employee1.report());
        System.out.println(developer1.report());
    }
}

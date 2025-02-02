package com.softserve.oop;

public class AppEmployee {
    public static void main(String[] args) {
        Employee empl1 = new Employee();
        empl1.setName("Alice");
        empl1.setRate(10);
        empl1.setHours(10);

        Employee empl2 = new Employee("Jack", 10);
        empl2.setHours(10);

        Employee empl3 = new Employee("Nick", 10, 10);

        System.out.println("Employee 1: " + empl1);
        System.out.println("Employee 2: " + empl2);
        System.out.println("Employee 3: " + empl3);

        System.out.println("Total sum for employees equals to : " + Employee.totalSum);


      //  System.out.println("Employee's total salary :" + totalSalary);
    }
}

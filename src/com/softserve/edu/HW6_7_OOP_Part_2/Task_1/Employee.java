package com.softserve.edu.HW6_7_OOP_Part_2.Task_1;

public abstract class Employee {

    String employeeId;

    Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    abstract String getName();



}

package com.softserve.edu.homework_3;

public class Employee {
    private String name;
    private double rate;
    private double hours;

    public static double totalSum = 0;

    public Employee() {
        this.name = "Name Surname";
        this.rate = 0.0;
        this.hours = 0.0;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public Employee(String name) {
        this.name = name;
        this.rate = 0.0;
        this.hours = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\tRate: " + rate + "\tHours: " + hours +
                "\tSalary: " + getSalary() + "\tBonuses: " + getBonuses();
    }
}


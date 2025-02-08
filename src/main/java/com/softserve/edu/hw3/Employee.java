package com.softserve.edu.hw3;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static double totalSum = 0;

    public Employee() { // default constructor
        this.name = "Unknown";
        this.rate = 0;
        this.hours = 0;
    }

    public Employee(String name, int rate, int hours) { // constructor with parametres
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void display(){
        System.out.println("Employee name: " + name);
        System.out.println("Employee rate: " + rate);
        System.out.println("Employee hours: " + hours);

    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    @Override
    public String toString(){
        return "Employee name: " + name + ", employee rate: " + rate + ", employee hours: " + hours;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 10, 50);
        Employee emp2 = new Employee("James", 8, 25);
        Employee emp3 = new Employee("Bruce", 9, 50);
        System.out.println("Total salary sum: " + Employee.totalSum);
    }
}

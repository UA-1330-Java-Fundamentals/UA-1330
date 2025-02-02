package com.softserve.oop;

public class Employee {
    public static final double BONUS_RATE = 0.1;// 10% from salary
    private String name;
    private int rate;
    private int hours;

    static double totalSum = 0.0;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        setRate(rate);

    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);

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
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();

        totalSum -= oldSalary;
        totalSum += newSalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();

        totalSum -= oldSalary;
        totalSum += newSalary;

    }

    public static double getTotalSum() {
        return (1 + BONUS_RATE )* totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                " , salary=" + getSalary() +
                " , bonuses=" + getBonuses() +
                '}';
    }

    public int getSalary(){
        return getRate()*getHours();
    }

    public double getBonuses(){
        return getSalary()*BONUS_RATE;
    }


}

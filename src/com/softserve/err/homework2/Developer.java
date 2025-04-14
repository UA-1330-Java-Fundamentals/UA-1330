package com.softserve.err.homework2;

public class Developer extends Employee{
   private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String report(){
        // Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
        return (super.report() + " Position:" + position);
    }
}
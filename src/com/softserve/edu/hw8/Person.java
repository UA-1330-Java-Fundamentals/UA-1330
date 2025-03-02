package com.softserve.edu.hw8;

public abstract class Person  {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    void info() {
        System.out.println("First name: " + fullName.firstName + ", Last name: " + fullName.lastName + ", Age: " + age);
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public FullName getFullName() {
        return fullName;
    }

    public abstract String activity();


}

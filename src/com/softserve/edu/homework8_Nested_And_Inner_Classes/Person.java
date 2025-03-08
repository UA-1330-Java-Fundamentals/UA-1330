package com.softserve.edu.homework8_Nested_And_Inner_Classes;

abstract class Person {
    FullName fullName;
    private int age;


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
    }

    public abstract String activity();
}

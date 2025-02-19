package com.softserve.edu10inner;

public class AppStudent {
    private String name;
    private int age;

    public AppStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        //
        AppStudent student = new AppStudent("Ostap", 22);
        System.out.println("student0 = " + student);
        //
        AppStudent student1 = new AppStudent("Oles'", 19) {
            @Override
            public String toString() {
                return "name = " + getName() + ", age = " + getAge();
            }
        };
        System.out.println("student1 = " + student1);
    }
}
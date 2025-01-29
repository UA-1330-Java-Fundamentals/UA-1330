package com.softserve.edu03oop1;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    //
    private static int count = 0;

    public Student() {
        firstName = "";
        lastName = "";
        age = 0;
        count++;
        System.out.println("Constructor public Student() DONE");
    }

    public Student(String firstName, String lastName, int age) {
        //this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        count++;
        System.out.println("Constructor public Student(String firstName, String lastName, int age) DONE");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getCount() {
        return count;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) { // Logical And
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "\tStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

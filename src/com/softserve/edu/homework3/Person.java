package com.softserve.edu.homework3;
//Homework 3 OOP Introduction
import java.util.Scanner;

    class Person {
    private String firstName;
    private String lastName;
    private int birthYear;


    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = 0;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge(int currentYear) {
        return currentYear - this.birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Birth Year: " + this.birthYear);
    }

    public void changeName(String firstName, String lastName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }
    public static void main(String[] args) {
        Person[] people = new Person[5];


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            people[i] = new Person();
            people[i].input();
        }

        System.out.println("\nPerson details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nPerson " + (i + 1) + " details:");
            people[i].output();
            System.out.println("Age: " + people[i].getAge(2025));
        }
    }
}


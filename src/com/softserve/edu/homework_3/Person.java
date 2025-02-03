package com.softserve.edu.homework_3;

import java.util.Scanner;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this.lastName = "Name";
        this.firstName = "LastName";
        this.birthYear = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public int getAge() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
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
        System.out.println("\nName: " + firstName + "\tLast name: " + lastName +
                "\tBirth Year: " + birthYear);
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

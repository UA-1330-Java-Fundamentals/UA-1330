package com.softserve.edu.HW2;
import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    //public static final int CURRENT_YEAR = 2025;
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge(){
        int currentYear = LocalDate.now().getYear();
        return currentYear - this.birthYear;
    }

    public void input(Scanner scanner, int personNumber) {
        System.out.println("Input firstName for person " + personNumber + ": ");
        this.setFirstName(scanner.nextLine());

        System.out.println("Input lastName for person " + personNumber + ": " );
        this.setLastName(scanner.nextLine());

        System.out.println("Input birthYear for person " + personNumber + ": " );
        this.setBirthYear(Integer.parseInt(scanner.nextLine()));
    }
    public void output(int personNumber) {
        System.out.printf("Person %d: %s %s, birthYear is %d, age is %d%n",
                personNumber,
                this.getFirstName(),
                this.getLastName(),
                this.getBirthYear(),
                this.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}

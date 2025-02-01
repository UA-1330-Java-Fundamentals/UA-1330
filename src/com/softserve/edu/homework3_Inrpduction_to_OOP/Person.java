package com.softserve.edu.homework3_Inrpduction_to_OOP;

/*
Create Console Application  and add class called Person to the project. Class Person should consist of:
 - three private fields: firstName, lastName and birthYear (the birthday year);
 - properties for access to these fields;
 - default constructor and constructor with 2 parameters (first and last names);
 - Methods:
 ----- (**) getAge() - to calculate the age of a person;
 -----input() - to input information about the person;
 -----output() - to output information about the person;
 -----changeName(String fn, String ln) - to change the first name or/and last name.

In the main() method create 5 objects of Person type and input information about them to console.
 */

import java.util.Scanner;

public class Person {
    private String firstName, lastName;
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
        int currentYear = 2025;
        return currentYear - getBirthYear();
    }

    public void output() {
        System.out.println("\nPersons info: \n" +
                "First name: " + firstName + '\n' +
                "Last name: " + lastName + '\n' +
                "Birth year:" + birthYear + '\n' +
                "User age: " + getAge());
    }


    public void intput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, set users  FirstName  : ");
        setFirstName(scan.nextLine());
        System.out.print("Please, set users  LastName  : ");
        setLastName(scan.nextLine());
        System.out.print("Please, set users  BirthYear  : ");
        setBirthYear(scan.nextInt());
    }

    public void changeName(String fn, String ln) {
        if (!fn.isEmpty()) setFirstName(fn);
        if (!ln.isEmpty()) setLastName(ln);
    }

    public static void main(String[] args) {

        Person person1 = new Person("Juls", "Formus");
        person1.setBirthYear(1992);
        System.out.println(person1.getAge());
        person1.output();

        Person person2 = new Person("Ama", "Mirthful");
        person2.setBirthYear(2000);
        System.out.println(person1.getAge());
        person2.output();

        Person person3 = new Person("Skoll", "Hearth");
        person3.setBirthYear(1921);
        System.out.println(person1.getAge());
        person3.output();

        Person person4 = new Person("Rollo", "Skald");
        person4.setBirthYear(1987);
        System.out.println(person1.getAge());
        person4.output();

        Person person5 = new Person("Vidar", "Oddvarr");
        person5.setBirthYear(1964);
        System.out.println(person1.getAge());
        person5.output();

        //Add your own person
        Person person6 = new Person();
        person6.intput();
        person6.output();
    }
}

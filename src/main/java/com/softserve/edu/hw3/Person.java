package com.softserve.edu.hw3;
import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.birthYear = 0;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
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
        int thisYear = Year.now().getValue();
        return (thisYear - birthYear);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        lastName = sc.nextLine();
        System.out.print("Enter birth year: ");
        birthYear = sc.nextInt();
    }

    public void output() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", "Smith", 1995);
        Person person2 = new Person("James", "Sunderland", 1975);
        Person person3 = new Person("Ivan", "Smith", 1997);
        Person person4 = new Person();
        Person person5 = new Person();

        System.out.println("Enter info about person 4");
        person4.input();
        System.out.println("Enter info about person 5");
        person5.input();
    
    }
}

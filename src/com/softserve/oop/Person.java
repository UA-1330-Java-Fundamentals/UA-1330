package com.softserve.oop;
import java.time.Year;
import java.util.Scanner;

import static java.lang.System.in;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

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
        if (birthYear > 1900 && birthYear< 2026){
            this.birthYear = birthYear;
        }
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        int year = Year.now().getValue();
        return  year - getBirthYear();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void input(String prompt1, String prompt2 , String prompt3){
        Scanner sc = new Scanner(in);
        System.out.print(prompt1);
        setFirstName(sc.nextLine());
        System.out.print(prompt2);
        setLastName(sc.nextLine());
        System.out.print(prompt3);
        setBirthYear(sc.nextInt());
    }

    public void changeName(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
    }

    public void output() {
        System.out.println("Person's  data : " +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", birthYear=" + getBirthYear());
    }


}

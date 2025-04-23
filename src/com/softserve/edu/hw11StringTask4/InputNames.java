package com.softserve.edu.hw11StringTask4;

import java.util.Scanner;

public class InputNames {
    private String name;
    private String surname;

    public InputNames() {}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void readInput(Scanner sc){
        System.out.print("Enter your name: ");
        name = sc.nextLine().trim();

        System.out.print("Enter your surname: ");
        surname = sc.nextLine().trim();
    }
}

package com.softserve.edu.hw8;

public class FullName implements Cloneable {
    String firstName;
    String lastName;

    public FullName(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public FullName clone() throws CloneNotSupportedException {
    return (FullName) super.clone();
    }
}

package com.softserve.edu10clon;

public class AppPeople {

    public static void main(String[] args) throws Exception {
        People people = new People("Ivan", 20);
        System.out.println("people = " + people);
        //
        // Create Copy
        //People people2 = new People("Ivan", 20);
        //People people2 = new People(people);
        People people2 = people.clone();
        //
        //people2.setAge(21);
        System.out.println("people2 = " + people2);
    }
}

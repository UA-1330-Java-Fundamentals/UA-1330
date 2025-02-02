package com.softserve.oop;

public class AppPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFirstName("Peter");
        p1.setLastName("Parker");
        p1.setBirthYear(2001);
        p1.output();
        System.out.println("A person's " + p1.getFirstName() + " " + p1.getLastName() + " age is "+ p1.getAge());

        Person p2 = new Person("Julia" , "Test");
        p2.setBirthYear(1985);
        p2.output();


        Person p3 = new Person("Tony" , "Stark");
        p3.setBirthYear(1990);
        p3.output();
        p3.changeName("Lex","Luthor");
        System.out.println("I changed name ! Now I'm " + p3.getFirstName() + " " + p3.getLastName());

        Person p4 = new Person("Klark" , "Kent");
        p4.setBirthYear(1999);
        p4.output();

        Person p5 = new Person();
        p5.input("Enter you first name ", "Enter your last name ", "Enter your birth year " );
        System.out.println("New user was created :");
        p5.output();

    }
}

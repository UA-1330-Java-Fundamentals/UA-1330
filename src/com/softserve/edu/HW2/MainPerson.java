package com.softserve.edu.HW2;
import java.util.Scanner;

public class MainPerson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person();
        person1.input(scanner, 1);
        person1.output(1);

        Person person2 = new Person();
        person2.input(scanner, 2);
        person2.output(2);

        Person person3 = new Person();
        person3.input(scanner, 3);
        person3.output(3);

        Person person4 = new Person();
        person4.input(scanner, 4);
        person4.output(4);

        Person person5 = new Person();
        person5.input(scanner, 5);
        person5.output(5);


        //code just to see Constructor's work
//        Person person2 = new Person("Nick", "Petrovich");
//        person2.setBirthYear(2000);
//        person2.output(2);
//
//        Person person3 = new Person();
//        person3.setFirstName("Tom");
//        person3.setLastName("Loyd");
//        person3.setBirthYear(1950);
//        person3.output(3);

        // output all entered
        System.out.println();
        person1.output(1);
        person2.output(2);
        person3.output(3);
        person4.output(4);
        person5.output(5);

        scanner.close();

    }
}

package com.softserve.edu.homework_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Example #1
        Student student1 = new Student("John", 8.5);
        Student student2 = new Student("Alice", 9.0);
        Student student3 = new Student("Bob", 7.5);

        System.out.println("Student Information:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("\nAverage Rating of All Students: " + Student.avgRating(student1, student2, student3));

        System.out.println("\nIs " + student1.getName() + " better than " + student2.getName() + "? " +
                student1.betterStudent(student2));

        //Practical Task #1
        double number1 = NumberOperations.getNumber("\nEnter the first number: ");
        double number2 = NumberOperations.getNumber("Enter the second number: ");

        double sum = NumberOperations.getTotal(number1, number2);
        double average = NumberOperations.getAverage(number1, number2);

        System.out.println("The sum " + number1 + " and " + number2 + " is " + sum);
        System.out.println("The average " + number1 + " and " + number2 + " is " + average);

        //Practical Task #2
        Employee employee1 = new Employee("John", 25.0, 40.0);
        Employee employee2 = new Employee("Alice", 30.0, 35.0);
        Employee employee3 = new Employee("Bob", 22.0, 45.0);

        System.out.println();
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("\nTotal salary: " + Employee.totalSum);

        //Homework #1
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Input side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Input side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Input side 3: ");
        double side3 = scanner.nextDouble();

        System.out.println("The area of the triangle is " + TriangleAreaCalculator.calculateTheAreaOfTriangle(side1, side2, side3));

        //Homework #2
        System.out.println();
        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Input the third number: ");
        int thirdNumber = scanner.nextInt();

        System.out.println("The smallest number is " + SmallestNumberFinder.findTheSmallestNumber(firstNumber, secondNumber, thirdNumber));

        //Homework #3
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        System.out.println("\nEnter information for the first person: ");
        person1.input();

        System.out.println("\nEnter information the second person: ");
        person2.input();

        System.out.println("\nEnter information the third person: ");
        person3.input();

        System.out.println("\nEnter information the fourth person: ");
        person4.input();

        System.out.println("\nEnter information the fifth person: ");
        person5.input();

        System.out.println("\nInformation of all people:");
        person1.output();
        System.out.println("Age: " + person1.getAge());

        person2.output();
        System.out.println("Age: " + person2.getAge());

        person3.output();
        System.out.println("Age: " + person3.getAge());

        person4.output();
        System.out.println("Age: " + person4.getAge());

        person5.output();
        System.out.println("Age: " + person5.getAge());

        System.out.println("\nChanging name of the first person: ");
        person1.changeName("Bob", "Marley");
        person1.output();

        scanner.close();
    }
}

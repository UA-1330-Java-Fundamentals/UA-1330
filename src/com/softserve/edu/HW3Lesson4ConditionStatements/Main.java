package com.softserve.edu.HW3Lesson4ConditionStatements;

import java.util.Scanner;

import static com.softserve.edu.HW3Lesson4ConditionStatements.HTTPErrors.nameOfHTTPErrors;

public class Main {
    public static void main(String[] args) {

        /* 1. Write a program that prompts the user to input three float numbers. The program should check
        if all three numbers fall within the range of -5 and 5 (inclusive). If all three numbers are within this range,
        the program should output a message indicating that they belong to the range [-5, 5]. If any of the numbers are outside the specified range,
        the program should output a message indicating that not all numbers belong to the range [-5, 5].
        Please note that the range includes the values -5 and 5 as well.*/

        System.out.println("HM #1 ");

        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;

        System.out.println("Input three number");

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();


        System.out.println(CheckRange.checkRange(n1, n2, n3));

        /* 2. Write a program that prompts the user to input three integer numbers.
        The program should determine the maximum and minimum values among the three numbers and output them to the console.*/

        System.out.println("HM #2 ");

        int num1, num2, num3;

        System.out.println("Input three number");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.println("Maximum value among the three numbers is: " + MinAndMaxNumber.maxNamber(num1, num2, num3));
        System.out.println("Minimum value among the three numbers is: " + MinAndMaxNumber.minNamber(num1, num2, num3));




        /* 3. Write a program that prompts the user to input a number representing an HTTP error (e.g., 400, 401, 402, etc.).
        The program should use an enum called HTTPError to map the input number to the corresponding name of the error and output it.*/

        System.out.println("HM #3 ");

        System.out.println("Input a number of HTTP error: ");

        int errorCode = sc.nextInt();
        String errorName = nameOfHTTPErrors(errorCode);
        System.out.println("HTTP Error " + errorCode + ": " + errorName);



        /*  4.* Create a class named Faculty and input the information about the number of students (using the console) and the current season (using enum).
        Each season must have a name in English (use the constructor). In the main() method, check the correctness of the code.
        Here, a season can signify a time of year (winter, spring, summer, autumn). In the context of this task, it can correspond to a certain semester.
        For example, autumn could be the first semester, spring - the second, and summer - the vacation period. Winter may correspond to the period of winter exams.*/

        System.out.println("HM #4 ");


        int studentsAmount;
        System.out.print("Input the number of students in faculty: ");
        studentsAmount = sc.nextInt();

        if (studentsAmount > 0) {
            int seasonChoice;
            System.out.println("Enter the number of the current season.");
            seasonChoice = sc.nextInt();

            Faculty.Season season = null;
            switch (seasonChoice) {
                case 1 -> season = Faculty.Season.WINTER;
                case 2 -> season = Faculty.Season.SPRING;
                case 3 -> season = Faculty.Season.SUMMER;
                case 4 -> season = Faculty.Season.AUTUMN;
                default -> System.out.println("Invalid choice.");
            }

            Faculty faculty = new Faculty(studentsAmount, season);

            System.out.println(faculty + " " + season.getDescription());
        } else {
           return;
        }

        sc.close();


        /* 5.*  Create a class called Dog that has the following fields: name, breed, age.

                Declare enum for field breed.
        In main() method  create three instances of type Dog.
        Check if there are no two dogs with the same name;
        Output the name and the breed of the oldest dog.  */

        System.out.println("HM #5 ");


        Dog dog1 = new Dog("Max", Dog.Breed.LABRADOR, 5);
        Dog dog2 = new Dog("Buddy", Dog.Breed.BEAGLE, 8);
        Dog dog3 = new Dog("Maxi", Dog.Breed.BULLDOG, 9);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        String sameName = Dog.nameChecker(dog1, dog2, dog3) ? " Yes, there are dogs with the same name." : "No, all the names are different.";
        System.out.println("Are there any dogs with the same name?\n" + sameName);

        Dog oldestDog = Dog.getOldesDog(dog1, dog2, dog3);
        System.out.println("The oldest dog is: " + oldestDog.getName() + ", breed: " + oldestDog.getBreed() + ", age: " + oldestDog.getAge());
    }
}

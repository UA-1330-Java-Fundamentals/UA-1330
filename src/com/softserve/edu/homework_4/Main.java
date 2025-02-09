package com.softserve.edu.homework_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Homework #1: Write a program that prompts the user to input three float numbers. The program should check if all three numbers
        fall within the range of -5 and 5 (inclusive). If all three numbers are within this range, the program should output a
        message indicating that they belong to the range [-5, 5]. If any of the numbers are outside the specified range, the
        program should output a message indicating that not all numbers belong to the range [-5, 5]. Please note that the range
        includes the values -5 and 5 as well.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float firstFloatNumber;
        float secondFloatNumber;
        float thirdFloatNumber;

        System.out.print("Input the first float number: ");
        firstFloatNumber = Float.parseFloat(br.readLine());

        System.out.print("Input the second float number: ");
        secondFloatNumber = Float.parseFloat(br.readLine());

        System.out.print("Input the third float number: ");
        thirdFloatNumber = Float.parseFloat(br.readLine());

        System.out.println(RangeChecker.checkNumberInRange(firstFloatNumber, secondFloatNumber, thirdFloatNumber));

        /*Homework #2: Write a program that prompts the user to input three integer numbers. The program should determine the
        maximum and minimum values among the three numbers and output them to the console.*/

        int firstIntegerNumber;
        int secondIntegerNumber;
        int thirdIntegerNumber;

        System.out.print("\nInput the first integer number: ");
        firstIntegerNumber = Integer.parseInt(br.readLine());

        System.out.print("Input the second integer number: ");
        secondIntegerNumber = Integer.parseInt(br.readLine());

        System.out.print("Input the third integer number: ");
        thirdIntegerNumber = Integer.parseInt(br.readLine());

        System.out.println(MinimumAndMaximumChecker.determineMinimumAndMaximumNumber(firstIntegerNumber,
                secondIntegerNumber, thirdIntegerNumber));

        /*Homework #3: Write a program that prompts the user to input a number representing an HTTP error (e.g., 400, 401, 402, etc.). The
        program should use an enum called HTTPError to map the input number to the corresponding name of the error and
        output it.*/

        int httpErrorNumber;

        System.out.print("\nInput input a number representing an HTTP error: ");
        httpErrorNumber = Integer.parseInt(br.readLine());

        System.out.println("HTTP error for the code " + httpErrorNumber
                + " is: " + ErrorType.HTTPError.returnHTTPError(httpErrorNumber));

        /*Homework #4: Create a class named Faculty and input the information about the number of students (using the console) and the
        current season (using enum). Each season must have a name in English (use the constructor). In the main() method,
        check the correctness of the code. Here, a season can signify a time of year (winter, spring, summer, autumn). In the
        context of this task, it can correspond to a certain semester. For example, autumn could be the first semester, spring -
        the second, and summer - the vacation period. Winter may correspond to the period of winter exams*/

        int studentsAmount;
        System.out.print("\nInput the number of students in faculty: ");
        studentsAmount = Integer.parseInt(br.readLine());

        if (studentsAmount > 0) {
            int seasonChoice;
            System.out.println("Choose the current season: ");
            System.out.println("1. Winter");
            System.out.println("2. Spring");
            System.out.println("3. Summer");
            System.out.println("4. Autumn");
            System.out.print("Your choice: ");
            seasonChoice = Integer.parseInt(br.readLine());

            Faculty.Season season = null;
            switch (seasonChoice) {
                case 1 -> season = Faculty.Season.WINTER;
                case 2 -> season = Faculty.Season.SPRING;
                case 3 -> season = Faculty.Season.SUMMER;
                case 4 -> season = Faculty.Season.AUTUMN;
                default -> System.out.println("Invalid choice for season.");
            }

            Faculty faculty = new Faculty(studentsAmount, season);
            System.out.println();
            System.out.println(faculty);
        } else {
            System.out.println("The number of students must be greater than 0.");
        }

    /*Homework #5: Create a class called Dog that has the following fields: name, breed, age.
    • Declare enum for field breed.
    • In main() method create create three instances of type Dog.
        o Check if there are no two dogs with the same name;
        o Output the name and the breed of the oldest dog*/

        System.out.println("\nHomework #5");
        Dog firstDog = new Dog("Tom", Dog.Breed.POODLE, 7);
        Dog secondDog = new Dog("Jack", Dog.Breed.SHIBA_INU, 2);
        Dog thirdDog = new Dog("Tom", Dog.Breed.GERMAN_SHEPHERD, 15);

        System.out.println(firstDog);
        System.out.println(secondDog);
        System.out.println(thirdDog);

        if (firstDog.equals(secondDog)) {
            System.out.println("\nThe first dog and the second dog have the same name.");
        } else if (firstDog.equals(thirdDog)) {
            System.out.println("\nThe first dog and the third dog have the same name.");
        } else {
            System.out.println();
        }

        System.out.println("The Oldest " + Dog.getTheOldestDog(firstDog, secondDog, thirdDog));
    }
}

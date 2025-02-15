package com.softserve.edu.homework5_ArraysLoops;

import java.util.Scanner;

/*
Create a do-while loop that prompts the user to enter two numbers and calculates their
sum. After displaying the result, the program should ask the user if they want to perform
the operation again. If the user inputs a positive response, the loop should repeat;
otherwise, it should terminate.
 */
public class TwoNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userResponse;

        do {
            System.out.print("Enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = scanner.nextInt();

            int sum = number1 + number2;
            System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

            System.out.print("Do you want to perform the operation again? (yes/no): ");
            userResponse = scanner.next();

        } while (userResponse.equalsIgnoreCase("yes"));

        System.out.println("Program terminated.");
        scanner.close();
    }
}

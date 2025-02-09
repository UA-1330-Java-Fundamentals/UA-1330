/**
 * Create a do-while loop that prompts the user to enter two numbers and calculates their
 * sum. After displaying the result, the program should ask the user if they want to perform
 * the operation again. If the user inputs a positive response, the loop should repeat;
 * otherwise, it should terminate.
 */
package com.softserve.edu.homework_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileSumOfTheNumbersCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber;
        int secondNumber;

        boolean isContinue;
        do {
            System.out.print("Enter the first number: ");
            firstNumber = Integer.parseInt(br.readLine());
            System.out.print("Enter the second number: ");
            secondNumber = Integer.parseInt(br.readLine());

            System.out.println("\nSum of the numbers is: " + (firstNumber + secondNumber));

            System.out.print("\nDo you want to continue? (y/n): ");
            String response = br.readLine();

            if (response.equals("y")) {
                isContinue = true;
            } else {
                isContinue = false;
            }
        } while (isContinue);
    }
}

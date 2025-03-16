/*
Create a method readNumber(int start, int end), that read from console integer number
and return it, if it is in the range [start...end]. If an invalid number or non-number text is
read, the method should throw an exception.

Using this method write a method main(), that must enter 10 numbers:
a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 10
*/
package com.softserve.edu.homework_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberRangeValidator {

    // Method to read a number within a specific range
    public static int readNumber(int start, int end) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        try {
            int number = Integer.parseInt(input.trim());

            if (number < start || number > end) {
                throw new Exception("Number must be in the range [" + start + "..." + end + "].");
            }

            return number;
        } catch (NumberFormatException e) {
            throw new Exception("Invalid input! The number should be integer.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int start = 1;
        int end = 100;

        System.out.println("Enter 10 increasing numbers in the range [" + start + "..." + end + "]:");

        try {
            for (int i = 0; i < 10; i++) {
                while (true) {
                    System.out.print("Enter number #" + (i + 1) + ": ");
                    int number = readNumber(start, end);

                    if (i > 0 && number <= numbers[i - 1]) {
                        System.out.println("Number must be greater than the previous number {" + numbers[i - 1] + "}. Please," +
                                " try again.");
                    } else {
                        numbers[i] = number;
                        break;
                    }
                }
            }

            // Display the entered numbers
            System.out.print("\nYou entered: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

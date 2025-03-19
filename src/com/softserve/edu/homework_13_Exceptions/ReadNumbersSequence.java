package com.softserve.edu.homework_13_Exceptions;

/*
Create a method readNumber(int start, int end), that read from console integer number
and return it, if it is in the range [start...end]. If an invalid number or non-number text is
read, the method should throw an exception.
Using this method write a method main(), that must enter 10 numbers:
a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

 */

import java.util.Scanner;

public class ReadNumbersSequence {
    public static int readNumber(int start, int end) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in the range [" + start + "..." + end + "]: ");

        try {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < start || num > end) {
                throw new Exception("Number out of range! Expected range: [" + start + "..." + end + "]");
            }
            return num;
        } catch (NumberFormatException e) {
            throw new Exception("Invalid input! Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int start = 2; // Accordingly requirement first entered number should be greater than 1
        int nextIntGreaterThan = 0;

        try {
            for (int i = 0; i < 10; i++) {
                int current = readNumber(start, 99);

                // Validate strictly increasing order
                if (current <= nextIntGreaterThan) {
                    throw new Exception("Numbers must be in strictly increasing order.");
                }

                numbers[i] = current;
                nextIntGreaterThan  = current;

            }

            System.out.println("You entered valid numbers: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
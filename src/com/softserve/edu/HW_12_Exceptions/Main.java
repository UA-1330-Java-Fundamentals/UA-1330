package com.softserve.edu.HW_12_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {



    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }



    public static void main(String[] args) {

        //1. Create div() method, which calculates the dividing of two double type numbers. In main() method input 2 double numbers and call this method. Catch all exceptions.

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = div(num1, num2);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        //2. Create a method readNumber(int start, int end), that read from console integer number and return it, if it is in the range [start...end]. If an invalid number or non-number text is read, the method should throw an exception.
        //    Using this method write a method main(), that must enter 10 numbers:
        //	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100


        System.out.println("Enter 10 numbers in increasing order within the range (1, 100):");
        int[] numbers = new int[10];
        int prev = 0;
        for (int i = 0; i < 10; i++) {
            while (true) {
                int num = readNumber(prev + 1, 99);
                if (num > prev) {
                    numbers[i] = num;
                    prev = num;
                    break;
                } else {
                    System.out.println("Each number must be greater than the previous one.");
                }
            }
        }
        System.out.println("Entered numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }


        //3*. Refactor your previous homework (1-7) and try to handle all possible exceptions in your code.
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.print("Enter a number in range [" + start + "..." + end + "]: ");
                number = scanner.nextInt();
                if (number < start || number > end) {
                    throw new IllegalArgumentException("Number is out of range.");
                }
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

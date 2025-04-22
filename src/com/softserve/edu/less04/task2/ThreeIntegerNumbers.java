package com.softserve.edu.less04.task2;

import java.util.Scanner;

//2
public class ThreeIntegerNumbers {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number_1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number_2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int number_3 = scanner.nextInt();
        if (number_1 > number_2) {
            max = number_1;
        } else if (number_2 > number_3) {
            max = number_2;
        } else if (number_3 > number_1) {
            max = number_3;
        }
        if (number_1 < number_2) {
            min = number_1;
        } else if (number_2 < number_3) {
            min = number_2;
        } else if (number_3 < number_1) {
            min = number_3;
        }
        System.out.println("max = " + max + "\n" + "min = " + min);
        scanner.close();
    }
}

//corrected code
class ThreeIntegerNumbersCorrected {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = promptNumber(scanner, "Enter the first number: ");
        int number2 = promptNumber(scanner, "Enter the second number: ");
        int number3 = promptNumber(scanner, "Enter the third number: ");

        if (areAllEqual(number1, number2, number3)) {
            System.out.println("All numbers are equal");
        } else {
            int max = findMax(number1, number2, number3);
            int min = findMin(number1, number2, number3);

            System.out.println("max = " + max + "\nmin = " + min);
        }
        scanner.close();
    }

    /**
     * Method to prompt the user to enter a number
     *
     * @param scanner scanner to read input
     * @param message message to display to the user
     * @return the number entered by the user
     */
    public static int promptNumber(Scanner scanner, String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            scanner.next();// clear the buffer
            System.out.print(message);
        }
        return scanner.nextInt();
    }

    /**
     * Method to find the maximum number
     *
     * @param a first number
     * @param b second number
     * @param c third number
     * @return the maximum number
     */
    private static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    /**
     * Method to find the minimum number
     *
     * @param a first number
     * @param b second number
     * @param c third number
     * @return the minimum number
     */
    private static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    /**
     * Method to check if all numbers are equal
     * @param a first number
     * @param b second number
     * @param c third number
     * @return true if all numbers are equal, false otherwise
     */
    public static boolean areAllEqual(int a, int b, int c) {
        return a == b && b == c;
    }
}

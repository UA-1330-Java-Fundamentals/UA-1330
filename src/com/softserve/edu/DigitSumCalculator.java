package com.softserve.edu;

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = in.nextInt();

        int SumOfDigits = calculateDigitSum(inputNumber);
        System.out.println("The sum of digits is " + SumOfDigits);
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;

        int count = 0;
        if (number >= 100 && number <= 999) {
            while (number > 0) {
                int digit = number % 10;
                sum = sum + digit;
                count++;
                System.out.println("Digit " + count + "is " + digit);
                number = number / 10;
            }
        }
        else {
            // Handle the error if the number is not three digits
            throw new IllegalArgumentException("The input number is not a three-digit number.");
        }
        return sum;
    }
}
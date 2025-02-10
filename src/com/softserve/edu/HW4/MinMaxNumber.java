/*
Write a program that prompts the user to input three integer numbers.
The program should determine the maximum and minimum values
among the three numbers and output them to the console.

 */
package com.softserve.edu.HW4;

public class MinMaxNumber {
    public static int findMin(int number1, int number2, int number3) {
        return Math.min(number1, Math.min(number2, number3));
    }
    public static int findMax(int number1, int number2, int number3) {
        return Math.max(number1, Math.max(number2, number3));
    }
}

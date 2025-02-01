package com.softserve.edu;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double inputNumber = input.nextInt();

        System.out.print("Square root of number: " + calculateSquareRoot(inputNumber));

        System.out.println("The Square of number: " + calculateSquare(inputNumber));

        System.out.print("The Cube of number: " + calculateCube(inputNumber));
    }





    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }
    public static double calculateSquare(double number) {
        return Math.pow(number, 2);
    }
    public static double calculateCube(double number) {
        return Math.pow(number, 3);
    }
}

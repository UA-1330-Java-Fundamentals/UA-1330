package com.softserve.edu.homework_13_Exceptions;
/*
Create div() method, which calculates the dividing of two double type numbers. In main()
method input 2 double numbers and call this method. Catch all exceptions.

 */

import java.util.Scanner;

public class PredictDivErrors {
    public static double div(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {


        try ( Scanner scanner = new Scanner(System.in);){
            // Input two double numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Call the div method
            double result = div(num1, num2);
            System.out.println("The result of division is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

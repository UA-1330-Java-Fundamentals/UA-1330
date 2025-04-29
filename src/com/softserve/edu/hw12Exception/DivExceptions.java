package com.softserve.edu.hw12Exception;
//Create div() method, which calculates the dividing of two double type numbers.
// In main() method input 2 double numbers and call this method. Catch all exceptions.

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter first number: ");
                String inputA = sc.nextLine();
                inputA = inputA.replace(",", ".");
                double a = Double.parseDouble(inputA);

                System.out.println("Enter second number: ");
                String inputB = sc.nextLine();
                inputB =inputB.replace(",", ".");
                double b = Double.parseDouble(inputB);

                double result = div(a,b);
                System.out.println("Result: " + result);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input. Please, repeat and enter a double format number");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error:" + e.getMessage());
            }
        }
    }

    public static double div(double a, double b) {
        if (b!=0) {
            return a/b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}

/*
Create div() method, which calculates the dividing of two double type numbers. In main()
method input 2 double numbers and call this method. Catch all exceptions.
*/
package com.softserve.edu.homework_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleNumbersDivider {
    public static double div(double firstNumber, double secondNumber) throws ArithmeticException {
        if (secondNumber == 0) {
            throw new ArithmeticException("The second number can't be zero!");
        }
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the first number: ");
            double firstNumber = Double.parseDouble(reader.readLine().trim());

            System.out.print("Enter the second number: ");
            double secondNumber = Double.parseDouble(reader.readLine().trim());

            double result = div(firstNumber, secondNumber);
            System.out.printf("Result of division is: " + result);

        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error: " + arithmeticException.getMessage());
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Error: " + numberFormatException.getMessage());
        } catch (IOException ioException) {
            System.out.println("Error: " + ioException.getMessage());
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}

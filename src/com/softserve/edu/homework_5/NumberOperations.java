/**
 * Create a program that prompts the user to enter:
 * • 5 integer numbers and find:
 * o position of second positive number;
 * o minimum value and its position in the array.
 * o calculate the product of all entered even numbers (exclude 0 from even if entered by user)
 */
package com.softserve.edu.homework_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];

        System.out.println("Enter 5 integer numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int positiveNumberCount = 0;
        int positionOfSecondPositiveNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveNumberCount++;
                if (positiveNumberCount == 2) {
                    positionOfSecondPositiveNumber = i;
                    break;
                }
            }

        }
        System.out.println("Position of second positive number is: " + positionOfSecondPositiveNumber);

        int minValue = array[0];
        int minValuePosition = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minValuePosition = i;
            }
        }
        System.out.println("Minimum value is: " + minValue + " and its position is: " + minValuePosition);

        int productOfEvenNumbers = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                productOfEvenNumbers = productOfEvenNumbers * array[i];
            }
        }
        System.out.println("Product of all even numbers is: " + productOfEvenNumbers);
    }
}

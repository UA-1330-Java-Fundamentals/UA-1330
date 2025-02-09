/**
 * Create a program that prompts the user to enter:
 * • 10 integers numbers and calculates the sum of the first five elements if they are
 * positive, or the product of the last five elements if they are not and output the result
 */
package com.softserve.edu.homework_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersSumCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];

        System.out.println("Enter 10 integer numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        boolean positiveNumbersChecker = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] <= 0) {
                positiveNumbersChecker = false;
                break;
            }
        }

        int sum = 0;
        int product = 1;
        if (positiveNumbersChecker) {
            for (int i = 0; i < array.length / 2; i++) {
                sum += array[i];
            }
            System.out.println("Sum of positive numbers is: " + sum);
        } else {
            for (int i = array.length / 2; i < array.length; i++) {
                product = product * array[i];
            }
            System.out.println("Product of the last 5 numbers is: " + product);
        }
    }
}

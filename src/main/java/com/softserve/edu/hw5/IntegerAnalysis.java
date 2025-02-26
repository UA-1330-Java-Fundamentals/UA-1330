package com.softserve.edu.hw5;
import java.util.Scanner;

public class IntegerAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int secondPositiveIndex = -1;
        int minValue = Integer.MAX_VALUE;
        int minPosition = -1;
        int productOfEvens = 1;
        boolean hasEven = false;

        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        int positiveCount = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    secondPositiveIndex = i;
                }
            }

            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minPosition = i;
            }

            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                productOfEvens *= numbers[i];
                hasEven = true;
            }
        }

        // Output results
        if (secondPositiveIndex != -1) {
            System.out.println("Position of the second positive number: " + secondPositiveIndex);
        } else {
            System.out.println("There is no second positive number.");
        }

        System.out.println("Minimum value: " + minValue + ", Position: " + minPosition);

        if (hasEven) {
            System.out.println("Product of all entered even numbers (excluding 0): " + productOfEvens);
        } else {
            System.out.println("No even numbers were entered.");
        }

        sc.close();
    }
}

package com.softserve.loopsandarrays;

import java.util.Scanner;

public class FiveNumbers {

    public static int[] enterNumbers(Scanner sc) {
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static String secondPositive(int[] numbers) {
        int positiveNumber = 0;
        int counter = 0;
        int positivePosition = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0 && counter<2) {
                positiveNumber = numbers[i];
                positivePosition = i;
                counter++;
            }

        }
        return (counter == 2) ?"The second positive element is " + (positivePosition + 1) + "th element" +
                " with value " + positiveNumber : "Second positive number not found";

    }

    public static String maxValueAndPosition(int[] numbers) {
        int max = numbers[0];
        int maxindex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxindex = i;
            }
        }
            return "The maximum value " + max + " has " + " element #" + (maxindex + 1);

    }

    public static double productOfElements(int[] numbers) {
        double product = 1;

        for (int number : numbers) {
            if (number == 0) {
                continue;
            }
            product *= number;
        }
        return product;

    }
}

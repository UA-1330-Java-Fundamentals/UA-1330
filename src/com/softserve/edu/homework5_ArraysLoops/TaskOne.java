package com.softserve.edu.homework5_ArraysLoops;

import java.util.Arrays;
import java.util.Scanner;

/*
 Create a program (in different java documents) that prompts the user to enter:
• a month number and calculates the number of days in that month based on an array
that contains the number of days in each month.
• 10 integers numbers and calculates the sum of the first five elements if they are
positive, or the product of the last five elements if they are not and output the result.
• 5 integer numbers and find:
    o position of second positive number;
    o minimum value and its position in the array.
    o calculate the product of all entered even numbers (exclude 0 from even if entered by
user).
 */

public class TaskOne {

    /*
     Create a program (in different java documents) that prompts the user to enter:  a month number and calculates the number of days
     in that month based on an array
     that contains the number of days in each month.
     */
    public void getDaysAmountPerMonth() {
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Please provide number of month for getting amount of days in it :");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        System.out.println("The " + month + " month has = " + monthDays[month - 1] + " days in it");
    }

    /*
    Create a program (in different java documents) that prompts the user to enter:  10 integers numbers and calculates the sum
    of the first five elements if they are  positive, or the product of the last five elements if they are not and output the result.
 */
    public void getSumOrProductOfElements() {
        int[] numbers = new int[10];
        int sum = 0;
        int product = 1;
        System.out.println("Please provide numbers for calculations :");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Set numner " + (i + 1) + "  = ");

            numbers[i] = scan.nextInt();
        }

        for (int k = 0; k < numbers.length / 2; k++) {
            if (numbers[k] > 0) {
                sum = sum + numbers[k];
            } else {
                sum = 0;
                break;
            }
        }

        for (int j = numbers.length - 1; j > numbers.length - 6; j--) {
            product = product * numbers[j];
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        if (sum > 0) {
            System.out.println("\nSum of first 5 elements = " + sum);
        } else {
            System.out.println("\nProduct of last 5 elements = " + product);
        }
    }

    /*
 Create a program (in different java documents) that prompts the user to enter: 5 integer numbers and find:
    o position of second positive number;
    o minimum value and its position in the array.
    o calculate the product of all entered even numbers (exclude 0 from even if entered by user).
 */
    public void processFiveNumbers() {
        int[] numbers = new int[5];
        System.out.println("Please provide five numbers for processing :");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Set numner " + (i + 1) + "  = ");
            numbers[i] = scan.nextInt();
        }

        int min = numbers[0];
        int secondPositive = 0;
        int countPositive = 0;
        int minPosition = 0;
        int secondPositivePosition = 0;
        int productOfEvens = 1;
        boolean hasEvenNumbers = false;

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                minPosition = i;
            }

            if (numbers[i] > 0) {
                countPositive++;
                if (countPositive == 2) {
                    secondPositive = numbers[i];
                    secondPositivePosition = i;
                }
            }


            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                productOfEvens *= numbers[i];
                hasEvenNumbers = true;

            }
        }
        System.out.println("Second positive number = " + secondPositive + " and located in position # " + secondPositivePosition);
        System.out.println("Min number = " + min + " and located in position # " + minPosition);
        System.out.println("Product of all even bumbers = " + productOfEvens);

    }
}

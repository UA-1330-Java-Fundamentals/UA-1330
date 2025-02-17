package com.softserve.edu.hw5.firsttask;

import java.util.Scanner;

public class NumberArrayProcessor {

    public static int findSecondPositiveNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
                if (count == 2) {
                    return i;
                    }
                }
            }
            return 0;
        }
        //
        public static int findMinimumValue(int[] array) {
            int minimum = array[0];
            int position = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < minimum) {
                    position = i;
                }
            }
            return position;
        }
        //
        public static int calculateProductOfEvenNumbers(int[] array) {
            int product = 1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 && array[i] != 0) {
                    product = product * array[i];
                }
            }
            return product;
        }
        //
        public static int readNumberFromInput(String prompt, Scanner sc) {
            System.out.println(prompt);
            return sc.nextInt();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numbers = new int[5];
            numbers[0] = readNumberFromInput("Input the first number", sc);
            numbers[1] = readNumberFromInput("Input the second number", sc);
            numbers[2] = readNumberFromInput("Input the third number", sc);
            numbers[3] = readNumberFromInput("Input the fourth number", sc);
            numbers[4] = readNumberFromInput("Input the fifth number", sc);
            sc.close();

            int product = calculateProductOfEvenNumbers(numbers);
            if (product == 1) {
                System.out.println("No even numbers were entered");
            } else {
                System.out.println("The product of all even numbers is: " + product);
            }

            int minimumValueIndex = findMinimumValue(numbers);
            System.out.println("The position of the minimum number is " + (minimumValueIndex +1) + " .The minimum value is " + numbers[minimumValueIndex]);

            int secondPositiveNumber = findSecondPositiveNumber(numbers);
            if (secondPositiveNumber == 0) {
                System.out.println("The second positive number is not found");
            } else if (secondPositiveNumber> 0) {
                System.out.println("The position of the second positive number is " + (secondPositiveNumber + 1));
            }
        }
    }


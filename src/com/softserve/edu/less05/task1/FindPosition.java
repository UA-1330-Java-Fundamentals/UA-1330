package com.softserve.edu.less05.task1;

import java.util.Arrays;
import java.util.Scanner;

/*
Create a program (in different java documents) that prompts the user to enter:
5 integer numbers and find:
o position of second positive number;
o minimum value and its position in the array.
o calculate the product of all entered even numbers (exclude 0 from even if entered by
user).
*/

public class FindPosition {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int NUMBERS = 5;

    public static void main(String[] args) {
        int[] numbers = new int[NUMBERS];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = promptParameters();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int counter = 0;
        int position = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                position = i;
                counter++;
                if (counter == 2) {
                    break;
                }
            }
        }
        if (counter == 2) {
            System.out.println("position of second positive number is " + (position + 1) + " place");
        } else {
            System.out.println("positive number < 2");
        }
        int min = numbers[0];
        position = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                position = i;
            }
        }
        System.out.println("minimum value = " + min + " and position in the array " + (position + 1));
        //int x = Arrays.binarySearch(numbers, numbers[2]);
        int multiplier = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (isEven(numbers[i])) {
                if (numbers[i] == 0) {
                    continue;
                }
                multiplier *= numbers[i];
            }

        }
        System.out.println("the multiplier of all entered even numbers (exclude 0) " + multiplier);
        SCANNER.close();
    }

    /**
     * @param number element of array
     * @return flag positive number
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }

    /**
     * @param number element of array
     * @return flag add number
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Prompt the user to enter 10 integer numbers
     *
     * @return the number
     */
    public static int promptParameters() {
        System.out.println("Please, enter int number : ");
        return SCANNER.nextInt();
    }
}

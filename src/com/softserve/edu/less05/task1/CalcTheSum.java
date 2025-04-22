package com.softserve.edu.less05.task1;

import java.util.Scanner;

/*
Create a program (in different java documents) that prompts the user to enter:
• 10 integers numbers and calculates the sum of the first five elements if they are
positive, or the product of the last five elements if they are not and output the result.
*/
public class CalcTheSum {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int NUMBERS = 10;
    private static final int HALF_NUMBERS = 5;

    public static void main(String[] args) {
        int[] numbers = new int[NUMBERS];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = promptParameters();
        }
        int sum = 0;
        boolean allPositive = false;
        for (int i = 0; i < HALF_NUMBERS; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
                allPositive = true;
            } else {
                allPositive = false;
                break;
            }
        }

        if (allPositive) {
            System.out.println("The sum of the first five elements if they are positive " + sum);
        } else {
            int multiplier = 1;
            for (int i = HALF_NUMBERS; i < numbers.length; i++) {
                multiplier *= numbers[i];
            }
            System.out.println("The multiplier of the last five elements " + multiplier);

        }
        SCANNER.close();
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

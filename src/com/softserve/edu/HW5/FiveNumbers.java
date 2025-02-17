package com.softserve.edu.HW5;
/*
5 integer numbers and find:
- position of second positive number;
- minimum value and its position in the array.
- calculate the product of all entered even numbers (exclude 0 from even if entered by user).
 */
import java.util.Scanner;

public class FiveNumbers {
    //Method to create an Array from 10 int numbers
    public static int[] createArray() {
        int[] numbersArray;
        numbersArray = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer numbers: ");
        for (int i = 0; i < 5; i++) {
            numbersArray[i] = sc.nextInt();
        }
        return numbersArray;
    }
    public static int getPositionSecondPositive (int[] numbersArray) {
        int counterPositiveNumbers = 0;
        int position = 0;
        for (int i = 0; i < 5; i++) {
            if (numbersArray[i] >= 0) {
                counterPositiveNumbers++;
                if (counterPositiveNumbers == 2) {
                    position = i + 1;
                }
            }
        }
        return position;
    }
}

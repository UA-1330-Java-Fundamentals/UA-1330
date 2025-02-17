package com.softserve.edu.HW5;
/*
Create a program (in different java documents) that prompts the user to enter:
10 integers numbers and calculates the sum of the first five elements
if they are positive, or the product of the last five elements
if they are not and output the result.

 */
import java.util.Scanner;

public class GetSumAndProduct {
    //Method to create an Array from 10 int numbers
    public static int[] createArray() {
        int[] numbersArray;
        numbersArray = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integer numbers: ");
        for (int i = 0; i < 10; i++) {
            numbersArray[i] = sc.nextInt();
        }
        return numbersArray;
    }
    //Method to check if first 5 numbers are positive
    public static boolean checkOnPositive(int[] numbersArray) {
        boolean checkResult = true;
        for (int i = 0; i < 5; i++) {
            if (numbersArray[i] < 0) {
                checkResult = false;
                break;
            }
        }
        return checkResult;
    }
    //Method to calculate Sum if the first 5 numbers are positive, otherwise - calculate Product
    public static int getSumOrProduct(int[] numbersArray) {
        int sum = 0;
        int product = 1;
        boolean isPositive = checkOnPositive(numbersArray);

        if (isPositive) {
            for (int i =0; i < 5; i++) {
                sum += numbersArray[i];
            }
        } else {
            for (int i = 5; i < 10; i++) {
                product *= numbersArray[i];
            }
        }
    return isPositive ? sum : product;
    }
}

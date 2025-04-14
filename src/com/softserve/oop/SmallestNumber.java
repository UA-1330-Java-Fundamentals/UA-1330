package com.softserve.oop;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number :");
        int s1 = sc.nextInt();

        System.out.print("Input second number :");
        int s2 = sc.nextInt();

        System.out.print("Input third number :");
        int s3 = sc.nextInt();

        int min = smallestNumber(s1, s2, s3);//

        System.out.println("Triangle area equals : " + min);//Not correct output message
        System.out.println("The smallest number is : " + smallestFromThreeNumbers(s1, s2, s3));//Correct output message
    }

    public static int smallestNumber(int a, int b, int c) {
        int min = a;
        if (min > b) {
            min = b;
        } else if (min > c) {
            min = c;
        }
        return min;
    }

    //Another way to solve this task

    /**
     * Find the smallest number from three numbers
     *
     * @param num1
     * @param num2
     * @param num3
     * @return the smallest number
     */
    public static int smallestFromThreeNumbers(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
}


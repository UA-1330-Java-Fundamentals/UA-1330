package com.softserve.hw1;
import java.util.Scanner;
import java.math.*;

public class PresentationTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int num1 = sc.nextInt();

        System.out.print("Enter second number:");
        int num2 = sc.nextInt();

        System.out.print("Enter third number:");
        int num3 = sc.nextInt();

        float avg = (float) (num1 + num2 + num3) /3;
        System.out.printf("The average for number %s, %s and %s is: %f" , num1, num2, num3, avg);

        sc.close();

    }
}


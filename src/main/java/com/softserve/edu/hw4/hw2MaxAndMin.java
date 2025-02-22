package com.softserve.edu.hw4;
import java.util.Scanner;

public class hw2MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter 2nd number: ");
        float num2 = sc.nextFloat();
        System.out.println("Enter 3rd number: ");
        float num3 = sc.nextFloat();

        float min_num = Math.min(num1, Math.min(num2, num3));
        float max_num = Math.max(num1, Math.max(num2, num3));

        System.out.printf("Entered numbers are: %.2f, %.2f and %.2f\n", num1, num2, num3);
        System.out.println("Min value is: " + min_num);
        System.out.println("Max value is: " + max_num);
    }
}

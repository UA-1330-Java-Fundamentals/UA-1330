package com.softserve.edu.hw5;
import java.util.Scanner;

public class SumOrProductCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        int product = 1;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            }
        }

        boolean allNotPositive = sum == 0;
        if (allNotPositive) {
            for (int i = 5; i < 10; i++) {
                product *= numbers[i];
            }
            System.out.println("Product of the last five elements: " + product);
        } else {
            System.out.println("Sum of the first five positive elements: " + sum);
        }

        sc.close();
    }
}

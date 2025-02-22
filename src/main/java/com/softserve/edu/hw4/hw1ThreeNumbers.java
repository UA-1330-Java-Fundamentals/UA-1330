package com.softserve.edu.hw4;
import java.util.Scanner;

public class hw1ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter 2nd number: ");
        float num2 = sc.nextFloat();
        System.out.println("Enter 3rd number: ");
        float num3 = sc.nextFloat();
        int range_counter = 0;

        if ((num1 >= -5) && (num1 <= 5)) {
            range_counter++;
        } else {
            range_counter += 0;
        }

        if ((num2 >= -5) && (num2 <= 5)) {
            range_counter++;
        } else {
            range_counter += 0;
        }

        if ((num3 >= -5) && (num3 <= 5)) {
            range_counter++;
        } else {
            range_counter += 0;
        }

        if (range_counter == 3) {
            System.out.println("All entered numbers are belong to the [-5:5] range.");
        } else {
            System.out.println("Not all entered numbers are belong to the [-5:5] range");
        }
        sc.close();
    }
}

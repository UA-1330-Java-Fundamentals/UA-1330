package com.softserve.edu.less04.task2;

import java.util.Scanner;
//2
public class ThreeIntegerNumbers {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number_1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number_2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int number_3 = scanner.nextInt();
        if (number_1 > number_2) {
            max = number_1;
        } else if (number_2 > number_3) {
            max = number_2;
        } else if (number_3 > number_1) {
            max = number_3;
        }
        if (number_1 < number_2) {
            min = number_1;
        } else if (number_2 < number_3) {
            min = number_2;
        } else if (number_3 < number_1) {
            min = number_3;
        }
        System.out.println("max = " + max + "\n" + "min = " + min);
        scanner.close();
    }
}

package com.softserve.edu.HW4;

import java.util.Scanner;

public class MainMinMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        System.out.println("Min number is: " + MinMaxNumber.findMin(number1, number2, number3));
        System.out.println("Max number is: " + MinMaxNumber.findMax(number1, number2, number3));
        sc.close();
    }
}

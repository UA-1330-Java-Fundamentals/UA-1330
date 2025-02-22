package com.softserve.edu.hw4;
import java.util.Scanner;

public class practicalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();
        int odd_counter = 0;
        if (num1 % 2 > 0) {
            odd_counter++;
        } 
        if (num2 % 2 > 0) {
            odd_counter++;
        } 
        if (num3 % 3 > 0) {
            odd_counter++;
        } 
        System.out.println("Odd numbers count: " + odd_counter);
        sc.close();
}
}

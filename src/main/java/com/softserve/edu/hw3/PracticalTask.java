package com.softserve.edu.hw3;
import java.util.Scanner;

public class PracticalTask {
    public static void main(String[] args) {
        double num1 = getNumber("Enter the first number: ");
        double num2 = getNumber("Enter the second number: ");
        double total = getTotal(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + total);
        double average = getAverage(num1, num2);
        System.out.println("The average from " + num1 + " and " + num2 + " is " + average);
    }
    
    public static double getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextDouble();
    }

    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }
}


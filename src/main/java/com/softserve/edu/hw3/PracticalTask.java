package com.softserve.edu.hw3;
import java.util.Scanner;

public class PracticalTask {
    public static void main(String[] args) {
        double num1 = getNumber("Enter the first number: ");
        double num2 = getNumber("Enter the second number: ");
        double total = getTotal(num1, num2);
        System.out.println("The total sum of the 2 numbers is: " + total);
    }
    
    public static double getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }
}


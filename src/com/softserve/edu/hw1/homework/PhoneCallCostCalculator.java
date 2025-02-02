package com.softserve.edu.hw1.homework;

import java.util.Scanner;
public class PhoneCallCostCalculator {
    public static void main (String[] args) {
        float c1;
        float c2;
        float c3;
        float t1;
        float t2;
        float t3;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the cost per minute of first call:");
        c1 = scanner.nextFloat();
        System.out.println("Enter the cost per minute of second call:");
        c2 = scanner.nextFloat();
        System.out.println("Enter the cost per minute of third call:");
        c3 = scanner.nextFloat();
        System.out.println("Enter the duration of first call:");
        t1 = scanner.nextFloat();
        System.out.println("Enter the duration of second call:");
        t2 = scanner.nextFloat();
        System.out.println("Enter the duration of third call:");
        t3 = scanner.nextFloat();
        float cost1 = c1 * t1;
        float cost2 = c2 * t2;
        float cost3 = c3 * t3;
        float totalCost = cost1 + cost2 + cost3;
        System.out.println("The cost of first call is: " + cost1);
        System.out.println("The cost of second call is: " + cost2);
        System.out.println("The cost of third call is :" + cost3);
        System.out.println("The total cost is: " + totalCost);
    }
}

package com.softserve.edu;

import java.util.Scanner;


class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost per minute of three calls: ");
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int c3 = scanner.nextInt();

        System.out.println("Enter the duration of each call: ");
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();

        int cost1 = c1 * t1;
        int cost2 = c2 * t2;
        int cost3 = c3 * t3;

        System.out.println("The cost of call 1: " + cost1);
        System.out.println("The cost of call 2: " + cost2);
        System.out.println("The cost of call 3: " + cost3);

        int totalCost = cost1 + cost2 + cost3;
        System.out.println("Total cost: " + totalCost);

    }
}
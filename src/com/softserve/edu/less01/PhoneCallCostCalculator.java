package com.softserve.edu.less01;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost per minute c1 (double) > 0.0");
        double c1 = sc.nextDouble();
        System.out.println("Enter the cost per minute c2 (double) > 0.0 ");
        double c2 = sc.nextDouble();
        System.out.println("Enter the cost per minute c3 (double) > 0.0 ");
        double c3 = sc.nextDouble();

        System.out.println("Enter the duration t1 (int, in minutes) > 0");
        int t1 = sc.nextInt();
        System.out.println("Enter the duration t2 (int, in minutes) > 0");
        int t2 = sc.nextInt();
        System.out.println("Enter the duration t3 (int, in minutes) > 0");
        int t3 = sc.nextInt();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3;
        System.out.println("cost1 =  " + cost1);
        System.out.println("cost2 =  " + cost2);
        System.out.println("cost3 =  " + cost3);
        System.out.println("totalCost =  " + totalCost);
        sc.close();

    }
}

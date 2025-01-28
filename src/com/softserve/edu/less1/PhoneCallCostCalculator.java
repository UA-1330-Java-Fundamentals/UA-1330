package com.softserve.edu.less1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        double c1;
        double c2;
        double c3;
        int t1;
        int t2;
        int t3;
        double cost1,cost2,cost3;
        double totalCost;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost per minute c1 (double) > 0.0");
        c1 = sc.nextDouble();
        System.out.println("Enter the cost per minute c2 (double) > 0.0 ");
        c2 = sc.nextDouble();
        System.out.println("Enter the cost per minute c3 (double) > 0.0 ");
        c3 = sc.nextDouble();

        System.out.println("Enter the duration t1 (int, in minutes) > 0");
        t1 = sc.nextInt();
        System.out.println("Enter the duration t2 (int, in minutes) > 0");
        t2 = sc.nextInt();
        System.out.println("Enter the duration t3 (int, in minutes) > 0");
        t3 = sc.nextInt();
        cost1 = c1 * t1;
        cost2 = c2 * t2;
        cost3 = c3 * t3;
        totalCost = cost1 + cost2 + cost3;
        System.out.println("cost1 =  " + cost1);
        System.out.println("cost2 =  " + cost2);
        System.out.println("cost3 =  " + cost3);
        System.out.println("totalCost =  " + totalCost);
        sc.close();

    }
}

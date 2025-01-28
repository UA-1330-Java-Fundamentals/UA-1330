package com.softserve.hw1;
import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        int c1,c2,c3;
        int t1, t2,t3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter call cost for Country #1:");
        c1 = sc.nextInt();
        System.out.print("Enter call duration for Country #1:");
        t1 = sc.nextInt();
        int cost1 = c1 * t1;

        System.out.print("Enter call cost for Country #2:");
        c2 = sc.nextInt();
        System.out.print("Enter call duration for Country #2:");
        t2 = sc.nextInt();
        int cost2 = c2 * t2;

        System.out.print("Enter call cost for Country #3:");
        c3 = sc.nextInt();
        System.out.print("Enter call duration for Country #3:");
        t3 = sc.nextInt();
        int cost3 = c3 * t3;

        int totalCost = cost1 + cost2 + cost3;

        System.out.println("Coast for call in Country#1 is:" + cost1);
        System.out.println("Coast for call in Country#2 is:" + cost2);
        System.out.println("Coast for call in Country#3 is:" + cost3);
        System.out.println("Total calls cost is: " + totalCost);

        sc.close();
    }
}

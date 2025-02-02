package com.softserve.edu.homework1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input cost per minute for the call 1: ");
        double c1 = in.nextDouble();
        System.out.print("Input cost per minute for the call 2: ");
        double c2 = in.nextDouble();
        System.out.print("Input cost per minute for the call 3: ");
        double c3 = in.nextDouble();
        System.out.print("Input the duration of call 1: ");
        double t1 = in.nextDouble();
        System.out.print("Input the duration of call 2: ");
        double t2 = in.nextDouble();
        System.out.print("Input the duration of call 3: ");
        double t3 = in.nextDouble();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        System.out.println("The cost of 1 call= " + cost1 + " The cost of 2 call= " + cost2 + " The cost of 3 call= " + cost3);
        double totalCost = cost1 + cost2 + cost3;
        System.out.println("TotalCost= " + totalCost);
    }
}

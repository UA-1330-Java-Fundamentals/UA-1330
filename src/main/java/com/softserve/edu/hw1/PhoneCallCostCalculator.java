package com.softserve.edu.hw1;
import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost per minute for the 1st call: ");
        float c1 = sc.nextFloat();
        System.out.print("Enter the duration of the 1st call: ");
        int t1 = sc.nextInt();

        System.out.print("Enter cost per minute for the 2nd call: ");
        float c2 = sc.nextFloat();
        System.out.print("Enter the duration of the 2nd call: ");
        int t2 = sc.nextInt();

        System.out.print("Enter cost per minute for the 3rd call: ");
        float c3 = sc.nextFloat();
        System.out.print("Enter the duration of the 3rd call: ");
        int t3 = sc.nextInt();

        float cost1 = c1 * t1;
        float cost2 = c2 * t2;
        float cost3 = c3 * t3;
        float totalCost = cost1 + cost2 + cost3;

        System.out.printf("Cost of the 1st call: %.2f\n", cost1);
        System.out.printf("Cost of the 2nd call: %.2f\n", cost2);
        System.out.printf("Cost of the 3rd call: %.2f\n", cost3);
        System.out.printf("Total cost of all calls: %.2f\n", totalCost);

    }
}

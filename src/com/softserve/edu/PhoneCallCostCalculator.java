package org.example;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        int c1,c2,c3;
        int t1,t2,t3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost per minute for 1 call : ");
        c1 = sc.nextInt();
        System.out.print("Enter cost per minute for 2 call : ");
        c2 = sc.nextInt();
        System.out.print("Enter cost per minute for 3 call : ");
        c3 = sc.nextInt();
        System.out.println("Enter duration of 1 call : ");
        t1 = sc.nextInt();
        System.out.println("Enter duration of 2 call : ");
        t2 = sc.nextInt();
        System.out.println("Enter duration of 3 call : ");
        t3 = sc.nextInt();
        int cost1 = c1*t1;
        int cost2 = c2*t2;
        int cost3 = c3*t3;
        int total = cost1+cost2+cost3;
        System.out.println("Total cost : "+total);
        System.out.println(" Cost for 1 call : "+cost1);
        System.out.println(" Cost for 2 call : "+cost2);
        System.out.println(" Cost for 3 call : "+cost3);





    }
}

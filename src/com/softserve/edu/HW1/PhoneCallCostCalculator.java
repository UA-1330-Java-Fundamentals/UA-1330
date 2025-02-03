package com.softserve.edu.HW1;

import java.util.Scanner;

public class PhoneCallCostCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int c1, c2, c3, t1, t2, t3, cost1, cost2, cost3 ,totalCost  ;

        System.out.println("Enter the price per minute of the first second and third call");

        c1 = scanner.nextInt();
        c2 = scanner.nextInt();
        c3 = scanner.nextInt();

        System.out.println("Enter the duration of the first second and third call");

        t1 = scanner.nextInt();
        t2 = scanner.nextInt();
        t3 = scanner.nextInt();

        cost1 = calculateCost(c1,t1);
        cost2 = calculateCost(c2,t2);
        cost3 = calculateCost(c3,t3);

        totalCost = calculateTotalCost(cost1, cost2, cost3);

        System.out.printf(
                          "Result: \n"+
                          "Сost of the first call: %d \n" +
                          "Сost of the second call: %d \n"+
                          "Сost of the third  call: %d \n"+
                          "Total cost of all call: %d ", cost1, cost2, cost3, totalCost );

    }

    public static int calculateCost(int c, int t){

        return c * t;

    }


    public static int calculateTotalCost(int cost1, int cost2, int cost3){

        return cost1 + cost2 + cost3;

    }

}

package com.softserve.edu.HW1;
/*
Task 3: Calculate the Cost of Phone Calls (Medium)
Your goal is to create a Java program that calculates the cost of three phone calls made from different countries, based on user input for the cost per minute and the duration of each call. The program should prompt the user to input the values for the cost per minute (c1, c2, c3) and the duration (t1, t2, t3) for each of the three phone calls. These values must be obtained directly from the user via the console.
Steps:
Create a class named PhoneCallCostCalculator.
In the main method, declare variables c1, c2, c3 for the cost per minute of each call, and t1, t2, t3 for the duration of each call.
Prompt the user to input the values for c1, c2, c3, t1, t2, and t3.
Calculate the cost of each call using the formulas cost1 = c1 * t1, cost2 = c2 * t2, and cost3 = c3 * t3.
Calculate the total cost of all calls using totalCost = cost1 + cost2 + cost3.
Output the cost of each call and the total cost to the console.
 */
import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //double c1;        //cost per 1 min for 1st Country
        //double c2;        //cost per 1 min for 2nd Country
        //double c3;        //cost per 1 min for 3dst Country
        //double t1;        //duration of the 1st call
        //double t2;        // duration of the 2d call
        //double t3;        //duration of the 3d call
        //input c1-c3 cost per minute

        System.out.println("Input the value c1 for the cost per minute from the 1st Country (UAH)");
        double c1 = sc.nextDouble();
        System.out.println("Input the value c2 for the cost per minute from the 2nd Country (UAH)");
        double c2 = sc.nextDouble();
        System.out.println("Input the value c3 for the cost per minute from the 3d Country (UAH)");
        double c3 = sc.nextDouble();

        //input t1-t3 duration for each call
        System.out.println("Input the value t1 = 1st call duration, sec");
        double t1 = sc.nextDouble();
        System.out.println("Input the value t2 = 2nd call duration, sec");
        double t2 = sc.nextDouble();
        System.out.println("Input the value t3 = 3d call duration, sec");
        double t3 = sc.nextDouble();

        double cost1= c1*(t1/60);
        double cost2= c2*(t2/60);
        double cost3= c3*(t3/60);
        double totalCost = (cost1+cost2+cost3);
        double roundedtotalCost = Math.round(totalCost*100.0)/100.0;

        //Output each call cost and total cost for all calls
        System.out.println("Cost for 1st call is " + cost1);
        System.out.println("Cost for 1st call is " + cost2);
        System.out.println("Cost for 1st call is " + cost3);
        //System.out.println("Total cost is " + String.format("%.2f", totalCost)); //second option of round
        System.out.println("Total cost is " + roundedtotalCost);

        sc.close();

    }

}

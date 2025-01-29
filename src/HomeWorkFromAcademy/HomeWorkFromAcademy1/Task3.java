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

package HomeWorkFromAcademy.HomeWorkFromAcademy1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float c1, c2, c3;
        float t1, t2, t3;

        System.out.println("Введіть ціну першої телефонної розмови за хвилину(Приклад: 1,3; 1.0): ");
        c1 = sc.nextFloat();

        System.out.println("Введіть ціну другої телефонної розмови за хвилину(Приклад: 1,3; 1.0): ");
        c2 = sc.nextFloat();

        System.out.println("Введіть ціну третьої телефонної розмови за хвилину(Приклад: 1,3; 1.0): ");
        c3 = sc.nextFloat();

        System.out.println("Введіть тривалість першої телефонної розмови (Приклад: 1,3; 1.0): ");
        t1 = sc.nextFloat();

        System.out.println("Введіть тривалість другої телефонної розмови (Приклад: 1,3; 1.0): ");
        t2 = sc.nextFloat();

        System.out.println("Введіть тривалість третьої телефонної розмови (Приклад: 1,3; 1.0): ");
        t3 = sc.nextFloat();

        float cost1 = c1 * t1;
        float cost2 = c2 * t2;
        float cost3 = c3 * t3;

        float totalCost = cost1 + cost2 + cost3;

        System.out.println("Ціна першої розмови: " + cost1 + ", \n" + "Ціна другої розмови: " + cost2 + ", \n" + "Ціна третьої розмови: " + cost3 + ", \n" + "Ціна в сумі: " + totalCost);

        sc.close();
    }
}

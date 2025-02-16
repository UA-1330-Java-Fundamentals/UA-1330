package com.softserve.edu.hw;
import java.util.Scanner;
import java.io.IOException;

public class PhoneCallCostCalculator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pleas enter price for call c1 : ");
        int c1 = sc.nextInt();
        System.out.println("You entered price for call c1 : " + c1);

        System.out.println("Pleas enter price for call c2 : ");
        int c2 = sc.nextInt();
        System.out.println("You entered price for call c2 : " + c2);

        System.out.println("Pleas enter price for call c3 : ");
        int c3 = sc.nextInt();
        System.out.println("You entered price for call c3 : " + c3);

        System.out.println("Pleas enter time of call for t1 : ");
        int t1 = sc.nextInt();
        System.out.println("You entered time of call for t1 : " + t1);

        System.out.println("Pleas enter time of call for t2 : ");
        int t2 = sc.nextInt();
        System.out.println("You entered time of call for t2 : " + t2);

        System.out.println("Pleas enter time of call for t3 : ");
        int t3 = sc.nextInt();
        System.out.println("You entered time of call for t3 : " + t3);

        int cost1 = c1 * t1;
        System.out.println("The cost call of c1 = " + cost1);

        int cost2 = c2  * t2;
        System.out.println("The cost of call c2 = " + cost2);

        int cost3 =c3 *  t3;
        System.out.println("The cost of call c3 = " + cost3);

        int totalCost =  cost1 + cost2 + cost3;
        System.out.println("The total cost is : " +  totalCost);


    }

}






package com.softserve.loopsandarrays;

import java.util.Scanner;

public class DoWhileWork {

    public static String sumOfEnteredNumbers(Scanner sc) {

                System.out.print("Enter  first number:");
                int first = sc.nextInt();
                System.out.print("Enter  second number:");
                int second = sc.nextInt();
                return " The sum of " + first +" and "
                        + second + " is " + (first + second);
            }


}

package com.softserve.edu.HW5Task2;

import java.util.Scanner;

public class MainDoWhileSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 2 numbers: ");
            double number1 = sc.nextDouble();
                        double number2 = sc.nextDouble();
            double sum = DoWhileSum.getSum(number1, number2);
            System.out.println("Sum of the " + number1 + " and "+  number2 + " is "+ sum);
            }
        while (DoWhileSum.isContinue(sc));
        sc.close();
    }
}

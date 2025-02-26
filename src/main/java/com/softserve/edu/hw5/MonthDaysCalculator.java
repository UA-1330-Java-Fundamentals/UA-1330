
package com.softserve.edu.hw5;
import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter a month number (1-12): ");
        int month = sc.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("Number of days in month " + month + ": " + daysInMonth[month - 1]);
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }

        sc.close();
    }
}

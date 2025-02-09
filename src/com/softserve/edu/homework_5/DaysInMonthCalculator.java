/**
 * Create a program that prompts the user to enter:
 * • a month number and calculates the number of days in that month based on an array
 * that contains the number of days in each month
 */
package com.softserve.edu.homework_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaysInMonthCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int monthNumber;
        System.out.print("Enter the month number (1-12): ");
        monthNumber = Integer.parseInt(br.readLine());

        if (monthNumber >= 1 && monthNumber <= 12) {
            int days = daysInMonths[monthNumber - 1];
            System.out.println("The number of days in month " + monthNumber + " is: " + days);
        } else {
            System.out.println("Invalid month number. Please enter a value between 1 and 12.");
        }
    }
}

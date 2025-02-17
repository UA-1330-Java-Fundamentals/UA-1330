package com.softserve.edu.HW5;

import java.util.Scanner;

public class MainGetDayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number you want to know the number of days of:");
        int monthNumber = sc.nextInt();
        System.out.println("For entered " + monthNumber + " Month, the quantity days is " + GetDaysOfMonth.getNumberDaysOfMonth(monthNumber));
    sc.close();
    }

}

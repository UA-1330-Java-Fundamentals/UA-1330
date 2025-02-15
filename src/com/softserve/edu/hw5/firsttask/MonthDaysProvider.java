package com.softserve.edu.hw5.firsttask;

import java.util.Scanner;

public class MonthDaysProvider {
    public static void main(String[] args) {
        System.out.print("Enter the number of month: ");
        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();

        System.out.println("This month has: " + calculateDaysInMonth(monthNumber) + " days");
        sc.close();
    }

        public static int calculateDaysInMonth (int monthNumber){
            int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return a[monthNumber - 1];
        }
    }


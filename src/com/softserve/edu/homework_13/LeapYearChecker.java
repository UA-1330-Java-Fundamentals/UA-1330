package com.softserve.edu.homework_13;

import java.time.DateTimeException;
import java.time.LocalDate;

public class LeapYearChecker {

    public static void main(String[] args) {
        int year1 = 2024; // Leap year
        int year2 = 2025; // Not a leap year

        System.out.println(year1 + " is a leap year: " + LocalDate.ofYearDay(year1, 1).isLeapYear());
        System.out.println(year2 + " is a leap year: " + LocalDate.ofYearDay(year2, 2).isLeapYear());
    }
}
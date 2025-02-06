package com.softserve.edu.ConditionalStatements;

public class YearDaysCalculator {
    public static int calculateDaysInYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be more than 0");
        }

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return 366;
        }
        else {
            return 365;
        }
    }
}
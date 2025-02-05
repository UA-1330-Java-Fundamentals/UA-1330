package com.softserve.edu.homework_4.tasks_from_quiz;

public class YearDaysCalculator {
    public static int calculateDaysInYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be more than 0");
        } else if (year % 4 != 0) {
            return 365;
        } else if (year % 100 != 0) {
            return 366;
        } else if (year % 400 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}
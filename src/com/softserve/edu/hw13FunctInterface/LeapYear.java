package com.softserve.edu.hw13FunctInterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        LocalDate date = LocalDate.of(year, 1, 1);
        return date.lengthOfYear() == 366;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2012)); // a leap year
        System.out.println(isLeapYear(2024)); // a leap year
        System.out.println(isLeapYear(2025)); //NOT a leap year
        System.out.println(isLeapYear(2000)); // a leap year
    }
}

/*
Create variable LocalDate birthday and set to that variable date your birthday.
Create method that take as a parameter object LocalDate and print the day of the week
and what was the day of the week after 6 months and what was the day of the week after
12 months.
*/
package com.softserve.edu.homework_13;

import java.time.LocalDate;

public class BirthDayOperator {
    public static void printDays(LocalDate date) {
        System.out.println("My birthday, " + date + ", was on " + date.getDayOfWeek().toString());

        System.out.println("Six months after my birthday, it was " + date.plusMonths(6)
                + " and it was " + date.plusMonths(6).getDayOfWeek());

        System.out.println("Twelve months after my birthday, it was " + date.plusMonths(12)
                + " and it was " + date.plusMonths(12).getDayOfWeek());
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2001, 1, 4);
        printDays(birthday);
    }
}

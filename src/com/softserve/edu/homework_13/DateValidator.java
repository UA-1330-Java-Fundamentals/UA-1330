/*
Create method to validate date according to format "mm.dd.yy"
*/
package com.softserve.edu.homework_13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator {
    public static boolean isValidDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String date1 = "01.31.25";
        String date2 = "31.04.25";  // Invalid date

        System.out.println(date1 + " is valid date: " + isValidDate(date1));
        System.out.println(date2 + " is valid date: " + isValidDate(date2));
    }
}

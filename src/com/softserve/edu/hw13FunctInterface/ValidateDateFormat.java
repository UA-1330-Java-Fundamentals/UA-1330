package com.softserve.edu.hw13FunctInterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidateDateFormat {
    public static void main(String[] args) {
        boolean test0 = isValidationDate("02.29.2024"); //valid
        boolean test1 = isValidationDate("05.01.2025"); //valid
        boolean test2 = isValidationDate("29.02.2024"); //first should be month - there is a day
        boolean test3 = isValidationDate("02.31.2024"); //february doesn't contain 31 day
        boolean test4 = isValidationDate("Feb.29.2024"); //incorrect format
        boolean test5 = isValidationDate("23/02/2024"); //incorrect format
    }

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM.dd.yyyy");

    static boolean isValidationDate (String dateString) {
        try {
            LocalDate date = LocalDate.parse(dateString, dtf);
            boolean isValid = dateString.equals(date.format(dtf));
            if (isValid) {
                System.out.println("This date " + dateString + " is valid");
            } else {
                System.out.println("This date " + dateString + " is NOT valid");
            }
            return isValid;
        } catch (DateTimeParseException e) {
            System.out.println("This date " + dateString + " is NOT valid");
            return false;
        }
    }
}

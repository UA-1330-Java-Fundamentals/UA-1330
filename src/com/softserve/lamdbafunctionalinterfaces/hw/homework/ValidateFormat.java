package com.softserve.lamdbafunctionalinterfaces.hw.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ValidateFormat {

    public static void validateFormat(String enteredDate) {

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            LocalDate date = LocalDate.parse(enteredDate, formatter);
            String formattedDate = date.format(formatter);
            int month = date.getMonthValue();
            int day = date.getDayOfMonth();
            int year = date.getYear();
            if(month<0 || month>12){
                System.out.println("You've entered incorrect month");
            } else if(day<0 || day>31){
                System.out.println("You've entered incorrect day of month");
            }
            else if(year<1900 || year> 2030){
                System.out.println("You've entered incorrect day of month");
            }
            System.out.println("Entered date is correct " + formattedDate);
        } catch (DateTimeParseException e) {
            System.out.println("Wrong date format " + e.getMessage());
        }
    }

}

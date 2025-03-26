package homework13;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
Create method which take year as a parameter and return true if year is a leap.

Conditions for determining a leap year:
A year divisible by 4 is a leap year.
A year divisible by 100 is not a leap year unless it is divisible by 400.
A year divisible by 400 is always a leap year.
 */
public class LeapYear {
    /*
    static boolean isLeapYear(int year){
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be more than 0");
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

     */
    static boolean isLeapYear(int year){
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be more than 0");
        }
        return Year.of(year).isLeap();
    }


    public static void main(String[] args) {
        System.out.println(isLeapYear(2028));
        System.out.println(isLeapYear(2025));
        System.out.println(isLeapYear(10));
        System.out.println(isLeapYear(-15));



    }
}

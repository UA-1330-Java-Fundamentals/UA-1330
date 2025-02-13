package com.softserve.loopsandarrays;
import java.util.Scanner;

public class NumberOfDays {

    public static String numberOfDaysInMonth(Scanner sc, String prompt) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print(prompt);
        int number = sc.nextInt();
        if (number >= 1 && number <= 12) {
            return "The number of days in " + number  +
                    " month is :" + monthDays[number - 1];
        }
        return "Incorrect month number";
    }
}
package com.softserve.edu.less05.task1;

import java.util.Scanner;

/*
Create a program (in different java documents) that prompts the user to enter:
• a month number and calculates the number of days in that month based on an array
that contains the number of days in each month.
*/
public class DayOfMonth {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MIN_DATE = 1;
    private static final int MAX_DATE = 12;

    public static void main(String[] args) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = promptParameters();
        if ((day >= MIN_DATE) && (day <= MAX_DATE)) {
            day--;
        } else {
            throw new IllegalArgumentException("The number of months is out of range " + day);
        }
        System.out.println("the number of day is : " + monthDays[day]);
        SCANNER.close();
    }

    /**
     * Prompt the user to enter the number of the month
     *
     * @return the number
     */
    public static int promptParameters() {
        System.out.println("Please, enter int number of the month : ");
        return SCANNER.nextInt();
    }
}

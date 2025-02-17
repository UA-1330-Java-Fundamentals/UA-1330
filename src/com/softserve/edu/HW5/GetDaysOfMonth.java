package com.softserve.edu.HW5;
/*
Create a program (in different java documents) that prompts the user to enter:
a month number and calculates the number of days in that month based on an
array that contains the number of days in each month.

 */
public class GetDaysOfMonth {
    public static int getNumberDaysOfMonth(int monthNumber) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;
        if ((monthNumber < 1) || (monthNumber > 12)) {
            throw new IllegalArgumentException("Entered Month number should be more than 0 and till 12 included");
        } else {
            result = monthDays[monthNumber - 1];
        }
        return result;
    }
}

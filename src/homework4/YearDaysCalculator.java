package homework4;

/*
Create a method calculateDaysInYear in the YearDaysCalculator class that takes a year as an input parameter
and returns the number of days in that year. The method should determine whether the year is a leap year
or a common year and return 366 days for leap years and 365 days for common years.

Conditions for determining a leap year:
A year divisible by 4 is a leap year.
A year divisible by 100 is not a leap year unless it is divisible by 400.
A year divisible by 400 is always a leap year.
 */

public class YearDaysCalculator {

    public static int calculateDaysInYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be more than 0");
        }

        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 == 0) {
            return 365;
        } else if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }


    }
}

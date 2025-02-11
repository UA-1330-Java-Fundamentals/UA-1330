package com.softserve.edu.HW4_5_Arrays_Loops;

public class TaskOne {
    public static int getIumberDaysInMonthLeapYear(int number) {
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return daysInMonth[number - 1];

    }

    public static int getIumberDaysInMonthNOTLeapYear(int number) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return daysInMonth[number - 1];

    }

    public static double sumOrProductCalculator(int[] mas) {

        int sum = 0, product = 1;
        ;
        boolean allPositive = true;

        for (int i = 0; i < 5; i++) {
            if (mas[i] <= 0) {
                allPositive = false;
                break;
            }
        }

        if (allPositive) {
            for (int i = 0; i < 5; i++) {
                sum += mas[i];
            }
            return sum;
        } else {
            for (int i = 5; i < 10; i++) {
                product *= mas[i];
            }
            return product;
        }

    }


}

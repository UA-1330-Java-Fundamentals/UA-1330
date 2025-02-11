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

    public static int getPoditionOfMinimslValue(int[] numbers) {
        int minValue = numbers[0];
        int minIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static double getProductOfPositiveNumber(int[] numbers) {

        int evenProduct = 1;
        boolean hasEven = false;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                evenProduct *= numbers[i];
                hasEven = true;
            }
        }
        if (hasEven == false) {
            System.out.println("the array does not have a even number");
            return 0;
        }
        return evenProduct;
    }


    public static int getSecondPositive(int[] numbers) {// Finding the position of the second positive number
        int positiveCount = 0;
        int secondPositiveIndex = -1;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    secondPositiveIndex = i;
                    break;
                }
            }
        }

        if (secondPositiveIndex == -1) {
            return -1;
        }
        return secondPositiveIndex;
    }


}

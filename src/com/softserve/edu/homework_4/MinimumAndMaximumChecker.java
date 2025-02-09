package com.softserve.edu.homework_4;

public class MinimumAndMaximumChecker {
    public static String determineMinimumAndMaximumNumber(int firstNumber, int secondNumber, int thirdNumber) {
        //Determine the minimum number
        String minimumResult;
        if ((firstNumber < secondNumber) && (firstNumber < thirdNumber)) {
            minimumResult = "\nThe minimum number is " + firstNumber;
        } else if ((secondNumber < firstNumber) && (secondNumber < thirdNumber)) {
            minimumResult = "\nThe minimum number is " + secondNumber;
        } else {
            minimumResult = "\nThe minimum number is " + thirdNumber;
        }

        //Determine the maximum number
        String maximumResult;
        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            maximumResult = "\nThe maximum number is " + firstNumber;
        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            maximumResult = "\nThe maximum number is " + secondNumber;
        } else {
            maximumResult = "\nThe maximum number is " + thirdNumber;
        }

        return minimumResult + maximumResult;
    }
}
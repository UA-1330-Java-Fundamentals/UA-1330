package com.softserve.edu.homework_3;

public class SmallestNumberFinder {
    public static int findTheSmallestNumber (int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            return firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}

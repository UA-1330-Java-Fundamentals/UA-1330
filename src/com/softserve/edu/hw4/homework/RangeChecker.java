package com.softserve.edu.hw4.homework;

import java.util.Scanner;

public class RangeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float firstNumber = readNumberFromInput("Input the first number", sc);
        float secondNumber = readNumberFromInput("Input the second number", sc);
        float thirdNumber = readNumberFromInput("Input the third number", sc);
        sc.close();

        System.out.println(checkIfNumbersInRange(firstNumber, secondNumber, thirdNumber));
    }

    public static float readNumberFromInput(String prompt, Scanner sc) {
        System.out.println(prompt);
        return sc.nextFloat();
    }

    public static String checkIfNumbersInRange(float firstNumber, float secondNumber, float thirdNumber) {
        if (firstNumber <= 5 && firstNumber >= -5 && secondNumber <= 5 && secondNumber >= -5 && thirdNumber <= 5 && thirdNumber >= -5) {
            return "Numbers belong to the range [-5, 5]";
        } else if (firstNumber > 5 || firstNumber < -5 || secondNumber > 5 || secondNumber < -5 || thirdNumber > 5 || thirdNumber < -5 ) {
            return "Not all numbers belong to the range [-5, 5]";
        }
        return "Error message";
    }
}

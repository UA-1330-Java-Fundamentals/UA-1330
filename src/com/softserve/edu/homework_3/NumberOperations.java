package com.softserve.edu.homework_3;

import java.util.Scanner;

public class NumberOperations {
    public static double getTotal(double number1, double number2) {
        return number1 + number2;
    }

    public static double getAverage(double number1, double number2) {
        return (number1 + number2) / 2;
    }

    public static double getNumber(String number) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(number);
        return scanner.nextDouble();
    }
}

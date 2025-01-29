package com.softserve.edu.hw1;

import java.util.Scanner;

public class AverageNumber {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        float firstNumber = scanner.nextFloat();
        System.out.println("Input second number:");
        float secondNumber = scanner.nextFloat();
        System.out.println("Input third number:");
        float thirdNumber = scanner.nextFloat();
        float average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Average is: " + average);

    }
}

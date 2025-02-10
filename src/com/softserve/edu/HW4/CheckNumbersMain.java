package com.softserve.edu.HW4;

import java.util.Scanner;

public class CheckNumbersMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 float number, please:");

        //code to process any options: if the entered float number with , or with .
        float num1 = parseFloat(scanner.nextLine());
        float num2 = parseFloat(scanner.nextLine());
        float num3 = parseFloat(scanner.nextLine());

        CheckNumbers.checkNumberInRange(num1, num2, num3);

        scanner.close();
    }

    private static float parseFloat(String input) {
        return Float.parseFloat(input.replace(',','.'));
    }

}

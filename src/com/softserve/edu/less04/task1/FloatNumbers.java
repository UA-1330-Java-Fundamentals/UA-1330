package com.softserve.edu.less04.task1;

import java.util.Scanner;

//1
public class FloatNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the double number in the range [-5, 5]");
        double number = sc.nextDouble();
        //in code better to use method to check if number in range
        if (number >= -5 && number <= 5) {//its magic numbers, better to use constants
            System.out.println("The number is " + number + "\nIt belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
        sc.close();
    }
}

//corrected code
class NumberInRange {
    private static final double MIN_RANGE = -5; //constant for min range
    private static final double MAX_RANGE = 5; //constant for max range

    public static double promptParameters(Scanner scanner) {
        double number;
        while (true) {
            System.out.print("Please, enter a double number: ");
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid double number.");
                scanner.next();
            }
        }
        return number;
    }


    public static boolean isNumberInRange(double number) {
        return number >= MIN_RANGE && number <= MAX_RANGE;
    }
}

class NumberInRangeRunner {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double number = NumberInRange.promptParameters(SCANNER);

        if (NumberInRange.isNumberInRange(number)) {
            System.out.println("The number is " + number + "\nIt belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }
}
package com.softserve.edu.less2.task2;

import java.util.Scanner;


/*2. Write Java console application with method to find the smallest number among three integer numbers. Example of*/
public class Main2Task2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        SmallestNumber smallestnumber = new SmallestNumber();
        int number1 = promptParameters();
        smallestnumber.setFirstNumber(number1);
        int number2 = promptParameters();
        smallestnumber.setSecondNumber(number2);
        int number3 = promptParameters();
        smallestnumber.setThirdNumber(number3);
        System.out.println("The smallest number = " + compareNumbers(smallestnumber));
        SCANNER.close();

    }

    public static int compareNumbers(SmallestNumber smallestnumber) {
        int result = 0;
        if (smallestnumber.getFirstNumber() < smallestnumber.getSecondNumber()) {
            result = smallestnumber.getFirstNumber();
        }
        else if (smallestnumber.getSecondNumber() < smallestnumber.getThirdNumber()) {
            result = smallestnumber.getSecondNumber();
        }
        else if (smallestnumber.getThirdNumber() < smallestnumber.getFirstNumber()) {
            result = smallestnumber.getThirdNumber();
        }
        return result;
    }

    public static int promptParameters() {
        System.out.println("Please, enter the int number : ");
        return SCANNER.nextInt();
    }

}

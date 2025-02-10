package com.softserve.edu.less2.task2;

import java.util.Scanner;


/*2. Write Java console application with method to find the smallest number among three integer numbers. Example of*/
public class Main2Task2 {//its bad name for class, better to use SmallestNumberRunner
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
        } else if (smallestnumber.getSecondNumber() < smallestnumber.getThirdNumber()) {
            result = smallestnumber.getSecondNumber();
        } else if (smallestnumber.getThirdNumber() < smallestnumber.getFirstNumber()) {
            result = smallestnumber.getThirdNumber();
        }
        return result;
    }

    public static int promptParameters() {
        System.out.println("Please, enter the int number : ");
        return SCANNER.nextInt();
    }

}

class SmallestNumberUtil {
    /**
     * Method to find the smallest number among three integer numbers
     * @param firstNumber is integer
     * @param secondNumber is integer
     * @param thirdNumber is integer
     * @return the smallest number
     */
    public static int findSmallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (!isDifferentNumbers(firstNumber, secondNumber, thirdNumber)) {
            throw new IllegalArgumentException("Numbers should be different");
        }
        return Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
    }

    /**
     * Prompt the user to enter the number
     * @param scanner scanner to read input
     * @return the number
     */
    public static int promptParameters(Scanner scanner) {
        System.out.println("Please, enter the int number : ");
        return scanner.nextInt();
    }

    /**
     * Check if the numbers are different
     * @param firstNumber is integer
     * @param secondNumber is integer
     * @param thirdNumber is integer
     * @return true if the numbers are different
     */
    private static boolean isDifferentNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber;
    }

    public static void main(String[] args) {// викликати краще в окремому класі, але я зробила разом для простоти
        Scanner sc = new Scanner(System.in);
        int firstNumber = promptParameters(sc);
        int secondNumber = promptParameters(sc);
        int thirdNumber = promptParameters(sc);
        System.out.println("The smallest number is: " + findSmallestNumber(firstNumber, secondNumber, thirdNumber));
    }
}
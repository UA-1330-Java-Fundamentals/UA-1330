package com.softserve.edu.hw12Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReaderNumber {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int readNumber(int start, int end) {
        try {
            int inputNumber = SCANNER.nextInt();
            if (inputNumber < start || inputNumber > end) {
                throw new IllegalArgumentException("Error: Number is out of allowed range from " + start + " to " + end);
            }
            return inputNumber;

        } catch (InputMismatchException e) {
            SCANNER.nextLine();
            throw new InputMismatchException("Incorrect input. Allowed only integer number.");
        }
    }
}

package com.softserve.loopsandarrays;

import java.util.Scanner;

public class ApplGuessingGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int guess;
        int randomNumber;

        do {
            randomNumber = GuessingGame.generateRandomNumber();
            guess = GuessingGame.enterNumber(sc, "Enter any number from 1 to 10: ");
            System.out.println(GuessingGame.compareTwoNumbers(randomNumber,guess));

        } while (guess != randomNumber);

        sc.close();
    }
}

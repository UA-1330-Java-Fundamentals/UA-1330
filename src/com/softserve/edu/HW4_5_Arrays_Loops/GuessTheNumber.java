package com.softserve.edu.HW4_5_Arrays_Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void guessTheNumber(){

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = rand.nextInt(10) + 1;
        int userGuess = 0;

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }
        sc.close();



    }


}

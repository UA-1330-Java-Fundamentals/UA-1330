/**
 * Create a program that generates a random number and prompts to the user to guess
 * what the number is. If the user's guess is higher than the random number, the program
 * should display "Too high, try again." If the user's guess is lower than the random number,
 * the program should display "Too low, try again." The program should use a loop that
 * repeats until the user correctly guesses the random number.
 */
package com.softserve.edu.homework_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumberGenerator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int randomNumber = (int) (Math.random() * 100);
        //System.out.println("Random number is: " + randomNumber);

        boolean hasUserGuessed = false;
        int userGuess = 0;
        while (!hasUserGuessed) {
            System.out.print("\nEnter your guess: ");
            userGuess = Integer.parseInt(br.readLine());

            if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("You guessed the number!");
                hasUserGuessed = true;
            }
        }
    }
}
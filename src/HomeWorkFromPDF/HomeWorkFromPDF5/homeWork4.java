/*
Create a program that generates a random number and prompts to the user to guess
what the number is. If the user's guess is higher than the random number, the program
should display "Too high, try again.
" If the user's guess is lower than the random number,
the program should display "Too low, try again.
" The program should use a loop that
repeats until the user correctly guesses the random number.
*/

package HomeWorkFromPDF.HomeWorkFromPDF5;

import java.util.Scanner;

public class homeWork4 {

    public static String guess(int randomNumber, int userGuess) {
        if (userGuess > randomNumber) {
            return "Ваше число завелике, спробуйте менше.";
        } else if (userGuess < randomNumber) {
            return "Ваше число замаленьке, спробуйте більше.";
        } else {
            return "Ви вгадали, правильна відповідь: " + randomNumber;
        }
    }

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        int number;
        boolean guessed = false;

        while (!guessed) {
            System.out.println("Введіть число: ");
            number = sc.nextInt();

            String guessReturn = guess(randomNumber, number);
            System.out.println(guessReturn);
            if (guessReturn.contains("Ви вгадали")) {
                guessed = true;
            }
        }
    }
}


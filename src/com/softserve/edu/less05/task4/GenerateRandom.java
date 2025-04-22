package com.softserve.edu.less05.task4;

import java.util.Random;
import java.util.Scanner;
/*
* Create a program that generates a random number and prompts to the user to guess
what the number is. If the user's guess is higher than the random number, the program
should display "Too high, try again." If the user's guess is lower than the random number,
the program should display "Too low, try again." The program should use a loop that
repeats until the user correctly guesses the random number.
*
Создайте программу, которая генерирует случайное число и предлагает пользователю угадать.
какое это число. Если предположение пользователя превышает случайное число, программа
должно появиться сообщение «Слишком высоко, попробуйте еще раз». Если предположение пользователя меньше случайного числа,
программа должна отобразить «Слишком низко, попробуйте еще раз». Программа должна использовать цикл, который
повторяется до тех пор, пока пользователь правильно не угадает случайное число.
*/

public class GenerateRandom {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(0,10);
        System.out.println("random number = " + random);
        while (true) {
            int resultUser = promptParameters();
            if (random == resultUser) {
                System.out.println("You are win!");
                break;
            } else if (random > resultUser) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Too high, try again");
            }
        }
        SCANNER.close();
    }

    /**
     * @return number input by user
     */
    public static int promptParameters() {
        System.out.println("Enter the int number : ");
        return SCANNER.nextInt();
    }
}

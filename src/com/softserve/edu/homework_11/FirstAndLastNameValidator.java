/*
Create a console application that validates user input for their first and last name, ensuring that
they only contain English letters, spaces, and hyphens. If the input data is incorrect, prompt the user
to re-enter the data. Upon successful entry of the user's first and last names, generate a random
greeting message that includes the user's name.
To validate the user input, utilize String class methods, control loops, and regular expressions.
Generate the random greeting message (use printf() method for output) by creating an array of
phrases that contain various text options with the user's name inserted.
*/
package com.softserve.edu.homework_11;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstAndLastNameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "^[A-Za-z]+([ -][A-Za-z]+)*$";
        Pattern p = Pattern.compile(pattern);

        String firstName;

        while (true) {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine();

            Matcher m = p.matcher(firstName);
            if (!firstName.isEmpty() && m.matches()) {
                break;
            } else {
                System.out.println("\nInvalid first name. Please use only English letters, spaces, or hyphens.\n");
            }
        }

        String lastName;
        while (true) {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine();

            Matcher m = p.matcher(lastName);
            if (!lastName.isEmpty() && m.matches()) {
                break;
            } else {
                System.out.println("\nInvalid last name. Please use only English letters, spaces, or hyphens.\n");
            }
        }


        // Print the random greeting using printf
        String[] greetings = {
                "Good to see you again, %s!",
                "Hey, %s! What's up?",
                "Hi %s! How's it going?",
                "Greetings, %s! Welcome back!",
                "Yo %s! Long time no see!"
        };

        Random random = new Random();
        int index = random.nextInt(greetings.length);

        String name = firstName + " " + lastName;
        System.out.printf("\n" + greetings[index], name);
        System.out.println();

        scanner.close();
    }
}

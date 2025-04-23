package com.softserve.edu.hw11StringTask4;
//Create a console application that validates user input for their first and last name,
// ensuring that they only contain English letters, spaces, and hyphens.
// If the input data is incorrect, prompt the user to re-enter the data.
// Upon successful entry of the user's first and last names,
// generate a random greeting message that includes the user's name.
//To validate the user input, utilize String class methods, control loops, and regular expressions.
// Generate the random greeting message (use printf() method for output) by creating
// an array of phrases that contain various text options with the user's name inserted.

import java.util.Scanner;

import static com.softserve.edu.hw11StringTask4.Validation.validate;

public class ValidationInputMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InputNames input = new InputNames();

        while (true) {
            input.readInput(sc);

            if (Validation.validate(input)) {
                Greeting.greet(input.getName(), input.getSurname());
                break;
            } else {
                System.out.println("Your input name or surname are incorrect, name could only contain: English letters, spaces, and hyphens (not at the start or end).");
                System.out.println("Name and surname must start with a capital letter");
                System.out.println("Please reenter correct Name and Surname.");
            }
        };

        sc.close();
    }
}

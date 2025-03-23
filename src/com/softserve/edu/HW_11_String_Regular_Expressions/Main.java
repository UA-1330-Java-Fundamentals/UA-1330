package com.softserve.edu.HW_11_String_Regular_Expressions;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        //1. The task involves inputting a sentence of five words through the console. The following actions
        //must be performed:
        //• Identify the longest word in the sentence and display it on the console.
        //• Determine the number of letters in the longest word.
        //• Display the second word of the sentence in reverse order on the console.

        // Тестовий текст:
        // один два три чотира пять
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with exactly five words: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");


        if (words.length != 5) {
            System.out.println("Error: The sentence must contain exactly five words.");
            return;
        }

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        // Reversing the second word
        String secondWord = words[1];
        String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();

        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWord.length());
        System.out.println("Second word in reverse order: " + reversedSecondWord);




        //2. Іnput a sentence that contains words separated by more than one space on the console. The
        //goal is to replace all consecutive spaces with a single space. For instance, if you entered the
        //sentence "I am learning Java Fundamental", the expected result should be "I am learning
        //Java Fundamental ".

        //Тестовий текст:
        //I am    learning    Java      Fundamental


        System.out.println("Input a sentence that contains words separated by more than one space on the console:");
        String input = scanner.nextLine();


        // Заміна всіх послідовностей пробілів на один пробіл
        String normalized = input.trim().replaceAll("\\s+", " ");

        System.out.println("Результат: " + normalized);


        //3. The task requires implementation of a pattern to match US currency format, which includes a
        //dollar sign ($) followed by any number of digits, a dot, and two digits after the dot. The next step
        //is to input a text containing several instances of US currency format via the console. Finally,
        //display all the occurrences of US currency format on the console screen.

        //The prices are $25.99, $100.00, and $5.50. Some incorrect values: $20, $9.999, and $1.5.



        // Введення тексту
        System.out.println("Enter a text containing US currency values:");
        String input1 = scanner.nextLine();


        String regex = "\\$\\d+\\.\\d{2}";// Регулярний вираз для формату валюти США: $123.45

        Pattern pattern = Pattern.compile(regex);   // Створюємо об'єкт шаблону

        pattern.matcher(input1)
                .results()  // Отримуємо Stream<MatchResult>
                .map(match -> match.group()) // Отримуємо знайдені значення
                .forEach(System.out::println); // Виводимо їх


        //4*. Create a console application that validates user input for their first and last name, ensuring that
        //they only contain English letters, spaces, and hyphens. If the input data is incorrect, prompt the user
        //to re-enter the data. Upon successful entry of the user's first and last names, generate a random
        //greeting message that includes the user's name.
        //To validate the user input, utilize String class methods, control loops, and regular expressions.
        //Generate the random greeting message (use printf() method for output) by creating an array of
        //phrases that contain various text options with the user's name inserted.


        String firstName = getValidInput(scanner, "Enter your first name: ");
        String lastName = getValidInput(scanner, "Enter your last name: ");

        scanner.close(); // Закриваємо Scanner

        // Створення випадкового привітання
        String[] greetings = {
                "Hello, %s %s! Nice to meet you!",
                "Welcome, %s %s! Have a great day!",
                "Hi there, %s %s! Hope you're doing well!",
                "Good to see you, %s %s! Stay awesome!",
                "Hey, %s %s! Wishing you all the best!"
        };

        // Випадковий вибір привітання
        Random random = new Random();
        String randomGreeting = greetings[random.nextInt(greetings.length)];

        // Вивід привітання
        System.out.printf(randomGreeting + "%n", firstName, lastName);

    }

    private static String getValidInput(Scanner scanner, String message) {
        String input;
        while (true) {
            System.out.print(message);
            input = scanner.nextLine().trim();

            // Перевірка регулярним виразом
            if (input.matches("[A-Za-z -]+")) {
                return input; // Коректне введення
            }
            System.out.println("Invalid input. Please use only English letters, spaces, and hyphens.");
        }
    }

}

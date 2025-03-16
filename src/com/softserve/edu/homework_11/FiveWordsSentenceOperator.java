/*
1. The task involves inputting a sentence of five words through the console. The following actions
must be performed:
• Identify the longest word in the sentence and display it on the console.
• Determine the number of letters in the longest word.
• Display the second word of the sentence in reverse order on the console.
*/
package com.softserve.edu.homework_11;

import java.util.Scanner;

public class FiveWordsSentenceOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        String[] words;
        String longestWord = "";

        while (true) {
            System.out.println("Please enter a sentence with exactly five words: ");

            input = scanner.nextLine();
            words = input.split("\\s+");

            if (words.length == 5) {
                break;
            } else {
                System.out.println("The sentence must contain exactly 5 words. Please try again.\n");
            }
        }

        System.out.println("\nYou entered: \"" + input + "\"");
        scanner.close();

        //Find the longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: \"" + longestWord + "\"");

        //Reverse the second word
        StringBuilder secondWord = new StringBuilder();
        secondWord.append(words[1]);
        System.out.println("Reversed version of the word \"" + words[1] + "\" is: \"" + secondWord.reverse() + "\"");
    }
}

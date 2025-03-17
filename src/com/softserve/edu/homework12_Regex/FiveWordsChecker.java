package com.softserve.edu.homework12_Regex;

/*
The task involves inputting a sentence of five words through the console. The following actions
must be performed:
• Identify the longest word in the sentence and display it on the console.
• Determine the number of letters in the longest word.
• Display the second word of the sentence in reverse order on the console
 */

import java.util.Scanner;

public class FiveWordsChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with exactly five words:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+"); // Splits by spaces or any other character
        if (words.length != 5) {
            System.out.println("Please ensure you enter exactly five words!");
            return;
        }

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of longest word: " + longestWord.length());

        // Step 4: Reverse the second word
        String secondWord = words[1];
        String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();
        System.out.println("Second word reversed: " + reversedSecondWord);
    }
}

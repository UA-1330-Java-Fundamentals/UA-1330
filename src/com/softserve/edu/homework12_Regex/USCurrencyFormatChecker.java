package com.softserve.edu.homework12_Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class USCurrencyFormatChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a numbers that match US currency format:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+"); // Splits by spaces or any other character

        String regex = "\\$[0-9]+\\.[0-9]{2}";

        List<String> matchingWords = new ArrayList<>();

        for (String word : words) {
            if (word.matches(regex)) {
                matchingWords.add(word);
            }
        }

        if (matchingWords.isEmpty()) {
            System.out.println("There is no numbers that match US currency pattern");
        } else {
            System.out.println("Here is a list of numbers that match US currency pattern: \n" + matchingWords);
        }

    }

}

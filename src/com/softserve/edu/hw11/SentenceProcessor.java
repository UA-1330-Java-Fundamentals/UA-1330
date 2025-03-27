package com.softserve.edu.hw11;

import java.util.Scanner;

public class SentenceProcessor {
    public static void main(String[] args) {
        System.out.println("Enter a sentence of 5 words");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        String[] arr = text.split(" ");
        //
        String longWord = arr[0];
        for (String word : arr) {
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }
        int length = longWord.length();
        System.out.println("The longest word is: " + longWord);
        System.out.println("The number of letters in the longest word: " + length);
        //
        String secondWord = arr[1];
        StringBuilder str = new StringBuilder(secondWord);
        str.reverse();
        System.out.println(str);
    }
}

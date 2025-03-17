package com.softserve.edu.homework12_Regex;

import java.util.Scanner;

/*
Іnput a sentence that contains words separated by more than one space on the console. The
goal is to replace all consecutive spaces with a single space. For instance, if you entered the
sentence "I am learning Java Fundamental", the expected result should be "I am learning
Java Fundamental "
 */

public class ReplaceConsecutiveSpacesInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with exactly five words:");
        String sentence = scanner.nextLine();

        String result = sentence.replaceAll("\\s+", " ");

        System.out.println(result);
    }
}

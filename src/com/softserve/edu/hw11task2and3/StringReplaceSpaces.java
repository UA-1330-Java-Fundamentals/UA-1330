package com.softserve.edu.hw11task2and3;
//Іnput a sentence that contains words separated by more than one space on the console.
// The goal is to replace all consecutive spaces with a single space. For instance,
// if you entered the sentence "I    am    learning     Java    Fundamental",
// the expected result should be "I am learning Java Fundamental ".

import java.util.Scanner;

public class StringReplaceSpaces {
    public static void main(String[] args) {
        System.out.println("Іnput a sentence that contains words separated by more than one space:");
        Scanner sc = new Scanner(System.in);
        String initialSentence = sc.nextLine();
        System.out.println("Initial sentence: " + initialSentence);

        String newString = initialSentence.replaceAll("\\s+", " ");
        System.out.println("The sentence after replacemant: " + newString);
    }
}

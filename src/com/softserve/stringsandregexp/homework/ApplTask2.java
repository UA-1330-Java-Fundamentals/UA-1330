package com.softserve.stringsandregexp.homework;

import java.util.Scanner;

public class ApplTask2 {
    public static void main(String[] args) {
        System.out.print("Enter a sentence with duplicated whitespaces:");
        Scanner sc = new Scanner(System.in);
        String enteredSentence =sc.nextLine();
        System.out.println("Initial sentence : " + enteredSentence);
        enteredSentence = enteredSentence.replaceAll(" +", " ");
        System.out.println("Sentence without duplicated whitespaces " + enteredSentence);
    }
}

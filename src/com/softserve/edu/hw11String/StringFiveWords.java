package com.softserve.edu.hw11String;

import java.util.Scanner;

import static com.softserve.edu.hw11String.LongestWord.findLongestWord;
import static com.softserve.edu.hw11String.SecondWordReversed.secondWord;

public class StringFiveWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mySentence;
        String[] words;

        while (true) {
            System.out.println("Enter the sentence from 5 words: ");
            mySentence = sc.nextLine();
            words = mySentence.trim().split("\\s+");

            if (words.length == 5) {
                break;
            } else {
                System.out.println("You entered only " + words.length + ". Please reentered 5 words");
            }
        }
        System.out.println("Entered sentence: " + mySentence);
        findLongestWord(mySentence);
        secondWord(mySentence);
    }
}

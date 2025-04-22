package com.softserve.edu.hw11String;

public class LongestWord {
    //Split sentence to words
    public static void findLongestWord(String mySentence) {
        String[] words = mySentence.split(" ");

        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("The longest word is: " + longestWord);
        System.out.println("The number of letters in the longest word: " + longestWord.length());
    }
}

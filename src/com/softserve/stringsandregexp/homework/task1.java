package com.softserve.stringsandregexp.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task1 {

    public static String[] InputFiveWords(){
        System.out.println("Enter a sentence consists of 5 words.");
        Scanner sc = new Scanner(System.in);
        String[] currentWord = new String[5];
        int[] wordsLength = new int[5];

        for (int i=0; i<5; i++){
            System.out.print("Enter " + (i+1) + " word:");
            currentWord[i] =sc.nextLine();
        }
        return currentWord;
    }

    public static String ConvertListToString(String[] array){
        StringBuffer sa = new StringBuffer();
        for (String s : array) {
            sa.append((s + " "));
        }
        return sa.toString();
    }

    public static void FindMaxWordLength(String[] array){
        int max = array[0].length();
        int maxWordNumber =0;
        StringBuffer sb= new StringBuffer();

        for(int i=1; i< array.length; i++){
            if (array[i].length()> max){
                max=array[i].length();
                maxWordNumber = i;
            }

        }
        System.out.println("Longest word is "+ array[maxWordNumber] + " with length " + max );
    }
    public static String ReverseSecondWord(String[] array){
       array[1] = reverseWord(array[1]);
       return array[1];
    }

    public static String reverseWord(String word){
        char s[] = word.toCharArray();
        String buf= "";
        StringBuffer sa = new StringBuffer();
        for (int i=s.length-1; i>=0; i--){
            sa.append(s[i]);
        }
        return sa.toString();
    }
}

package com.softserve.stringsandregexp.homework;


import java.util.Arrays;

public class ApplTask1 {
    public static void main(String[] args) {
        String[] listOfWords =  task1.InputFiveWords();
        System.out.println("You entered next sentence:" + task1.ConvertListToString(listOfWords));
        task1.FindMaxWordLength(listOfWords);
        System.out.println(task1.ReverseSecondWord(listOfWords));
    }
}

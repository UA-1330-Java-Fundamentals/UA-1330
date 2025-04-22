package com.softserve.edu.hw11String;

public class SecondWordReversed {
      public static void secondWord(String mySentence) {
          String[] words = mySentence.split(" ");
          String secondWord = words[1];
          String reversed = new StringBuilder(secondWord).reverse().toString();
          System.out.println("Second word reversed: " + reversed);
      }
}

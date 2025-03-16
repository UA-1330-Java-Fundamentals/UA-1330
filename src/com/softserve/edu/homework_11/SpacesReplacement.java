/*
Input a sentence that contains words separated by more than one space on the console. The
goal is to replace all consecutive spaces with a single space. For instance, if you entered the
sentence "I am learning Java Fundamental", the expected result should be "I am learning
Java Fundamental ".
*/
package com.softserve.edu.homework_11;

import java.util.Scanner;

public class SpacesReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence with consecutive spaces:");
        String input = scanner.nextLine();

        System.out.println("\n" + input.replaceAll("\\s+", " "));

        scanner.close();
    }
}

/*
The task requires implementation of a pattern to match US currency format, which includes a
dollar sign ($) followed by any number of digits, a dot, and two digits after the dot. The next step
is to input a text containing several instances of US currency format via the console. Finally,
display all the occurrences of US currency format on the console screen
*/
package com.softserve.edu.homework_11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USCurrencyFormatMatcher {
    public static void main(String[] args) {
        //String text = "Your total will be $123.89. You have given $200.00. Your change is $76.11.";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text containing several instances of US currency format: ");
        String text = scanner.nextLine();

        String pattern = "\\$\\d+\\.\\d{2}\\b";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        boolean found = false;
        while (m.find()) {
            System.out.println("Found currency: " + m.group());
            found = true;
        }

        if (!found) {
            System.out.println("No US currency format found in the input.");
        }

        scanner.close();
    }
}

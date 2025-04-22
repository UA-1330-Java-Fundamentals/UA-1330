package com.softserve.edu.hw11task2and3;
//The task requires implementation of a pattern to match US currency format,
// which includes a dollar sign ($) followed by any number of digits, a dot,
// and two digits after the dot.
// The next step is to input a text containing several instances of US currency format via the console.
// Finally, display all the occurrences of US currency format on the console screen.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 texts with US currency value: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        ArrayList<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);

        String pattern = "\\b\\$\\d+\\.\\d{2}\\b";
        Pattern p = Pattern.compile(pattern);

        int countMatches = 0;

        for (String current : list) {
            countMatches += findCurrencyInText(current, p);
        }

        if (countMatches == 0) {
            System.out.println("There is no any matches");
        }
    }

    public static int findCurrencyInText(String text, Pattern pattern) {
        Matcher m = pattern.matcher(text);
        // m.find to search the next matching in the text; return true when match is found
        //m.group for search all matching at whole
        int countMatches = 0;
        while (m.find()) {
            System.out.println("Match currency is found: " + m.group());
            countMatches++;
        }
        return countMatches;
    }
}

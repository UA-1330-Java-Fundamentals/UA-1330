package com.softserve.edu.hw11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String reg = "\\$\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(reg);
        Matcher match = pattern.matcher(text);

        while (match.find()) {
            System.out.println(text.substring(match.start(), match.end()) + "*");
        }
    }
}
package com.softserve.stringsandregexp.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void CheckFromat(){
        String pattern = "\\$\\d+\\.\\d{1,2}";
        Pattern p = Pattern.compile(pattern);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a price:");
        String price = sc.nextLine();
        Matcher m = p.matcher(price);
        if (m.matches()) {
            System.out.println("You've entered price in correct format");
        } else {
            System.out.println("Price format is incorrect");
        }
    }
}

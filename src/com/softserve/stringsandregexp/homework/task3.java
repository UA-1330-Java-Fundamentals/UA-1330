package com.softserve.stringsandregexp.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void CheckFromat(){//checkFormat
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
/*
The method returns true or false, making it more versatile.
The validation is separated from input/output operations, adhering to the single responsibility principle.
If you need to allow the price as part of the string, it's better to use find()
*/

/*

public class Task3 {
    public static boolean checkFormat(String price) {
        String pattern = "\\$\\d+\\.\\d{1,2}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(price);
        return m.matches();//or m.find()
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a price: ");
        String price = sc.nextLine();
        
        if (checkFormat(price)) {
            System.out.println("You've entered price in correct format");
        } else {
            System.out.println("Price format is incorrect");
        }
        
        sc.close();
    }
}
*/

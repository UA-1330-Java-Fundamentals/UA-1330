package com.softserve.stringsandregexp.homework;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static String GenerateGreetings(){
        List<String> greetingsList = new ArrayList<String>();
        greetingsList.add("Hello");
        greetingsList.add("Hi");
        greetingsList.add("Ola");
        greetingsList.add("Bonjour");
        int rnd = new Random().nextInt(greetingsList.size());
        return greetingsList.get(rnd);
    }

    public static void CheckLastFirstNames() {
        Scanner sc = new Scanner(System.in);
        String pattern = "\\s*\\w+\\s*\\-*";
        Pattern p = Pattern.compile(pattern);

        while(true) {
            System.out.print("Enter your first name:");
            String firstName = sc.nextLine();
            System.out.print("Enter your last name:");
            String lastName = sc.nextLine();
            Matcher m = p.matcher(firstName);
            String greeting = GenerateGreetings();
            Matcher mLastName = p.matcher(lastName);
            if (m.matches() && mLastName.matches()) {
                System.out.println("You've entered your last and first names in correct format");
                System.out.printf("%s to you, %s" ,greeting,firstName);
                break;
            }
            else
            {
                System.out.println("Invalid input.");
                System.out.println("Please enter the you last and first name again again:");
            }
        }
    }
}

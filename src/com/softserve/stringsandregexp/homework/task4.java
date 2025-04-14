package com.softserve.stringsandregexp.homework;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {//Task4
    /*
    A new Random object is created each time the method is called.
    This is inefficient and may lead to repetition due to identical initial seed values if calls happen quickly. 
    It's better to declare Random as a static class variable.
    */
    public static String GenerateGreetings(){ // method names start with lowercase
        List<String> greetingsList = new ArrayList<String>();
        greetingsList.add("Hello");
        greetingsList.add("Hi");
        greetingsList.add("Ola");
        greetingsList.add("Bonjour");
        int rnd = new Random().nextInt(greetingsList.size());
        return greetingsList.get(rnd);
    }
/*
Regular expression:

Allows digits (\w includes [a-zA-Z0-9_]), which may be undesirable for names.
Allows underscores (_), which are also uncommon in names.
\-* at the end looks unusual—names typically don’t end with multiple hyphens.

*/
    public static void CheckLastFirstNames() {//checkFirstAndLastNames
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
/*
public class Task4 {
    private static final Random RANDOM = new Random();

    public static String generateGreetings() {
        List<String> greetingsList = new ArrayList<>(List.of("Hello", "Hi", "Ola", "Bonjour"));
        return greetingsList.get(RANDOM.nextInt(greetingsList.size()));
    }

    public static boolean checkFirstAndLastNames(String firstName, String lastName) {
        String pattern = "[a-zA-Z]+-?[a-zA-Z]*";
        Pattern p = Pattern.compile(pattern);
        Matcher mFirst = p.matcher(firstName.trim());
        Matcher mLast = p.matcher(lastName.trim());
        return mFirst.matches() && mLast.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName, lastName;

        while (true) {
            System.out.print("Enter your first name: ");
            firstName = sc.nextLine();
            System.out.print("Enter your last name: ");
            lastName = sc.nextLine();

            if (checkFirstAndLastNames(firstName, lastName)) {
                String greeting = generateGreetings();
                System.out.println("You've entered your last and first names in correct format");
                System.out.printf("%s to you, %s %s%n", greeting, firstName, lastName);
                break;
            } else {
                System.out.println("Invalid input.");
                System.out.println("Please enter your first and last name again:");
            }
        }
        sc.close();
    }
}
*/

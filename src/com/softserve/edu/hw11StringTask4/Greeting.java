package com.softserve.edu.hw11StringTask4;

import java.util.Random;

public class Greeting {
    private static final String[] GREETINGS = {
            "Hello, %s %s! Nice to meet you!",
            "Welcome, %s %s! Have a great day!",
            "Greetings, %s %s! Hope you're doing well!",
            "Hey there, %s %s! Glad you're here!",
            "Good to see you, %s %s! Let's get started!"
    };

    public static void greet(String name, String surname) {
        Random rand = new Random();
        int index = rand.nextInt(GREETINGS.length);
        System.out.printf(GREETINGS[index] + "%n", name, surname);
    }
}


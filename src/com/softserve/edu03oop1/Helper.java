package com.softserve.edu03oop1;

public class Helper {
    private static String message;
    private static String str = "Hello Java!";

    static {
        System.out.println("Static block static {...} done, str = " + str);
    }

    public Helper() {
        System.out.println("Constructor Helper() done");
    }

    public static void setMessage(String message) {
        Helper.message = message;
    }

    public static void print() {
        System.out.println(message);
    }
}

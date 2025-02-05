package com.softserve.edu;

import java.util.Scanner;


public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println ("Where do you live, " + name + "?");
        String address = scanner.next();

        System.out.println ("Name: " + name + ", " + "Address: " + address);


    }
}
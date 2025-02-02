package com.softserve.edu.homework1;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = in.next();
        System.out.printf("Where do you live, %s?: ", name);
        String address = in.next();
        System.out.println("Name: " + name + ", Address: " + address);
    }
}

package com.softserve.edu.hw1;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        System.out.printf("Where do you live, %s? ", name);
        String address = scanner.nextLine();
        System.out.printf("Name: %s, address: %s", name, address);
        scanner.close();
    }
}

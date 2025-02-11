package com.softserve.edu.HW1;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, address;//аналогічно до попередніх завдань, краще оголошувати змінні там де вони використовуються
        System.out.println("What is your name? ");
        name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        address = scanner.nextLine();
        System.out.printf("Name: [%s], Adress:[%s] ", name, address);
    }
}

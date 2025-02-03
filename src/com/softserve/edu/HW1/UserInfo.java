package com.softserve.edu.HW1;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String  name, address;


        System.out.println("What is your name? ");
        name = scanner.nextLine();

        System.out.println("Where do you live, " + name + "?");
        address = scanner.nextLine();

        System.out.printf("Name: [%s], Adress:[%s] ", name, address);

    }

}

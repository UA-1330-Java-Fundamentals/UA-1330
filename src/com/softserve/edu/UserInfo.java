package org.example;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        String name;
        String adress;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wthat's your name? : ");
        name = scanner.nextLine();
        System.out.print("Wthat's your address, "+name+": ");
        adress = scanner.nextLine();
        System.out.println("Name : "+name+"\nAdress : "+adress );

    }
}

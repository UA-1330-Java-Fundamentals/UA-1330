package com.softserve.edu.hw;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is Your nane ?");
        String name = sc.nextLine();
        System.out.println("Its OK! "  +  name);

        System.out.println("Where are You live ?" + name);
        String address = sc.nextLine();
        System.out.println("Its Ok! " +  name +   " You live on: "   +  address);

        sc.close();


    }
}

package com.softserve.hw1;
import java.util.Scanner;

public class UserInfoIO {
    public static void main(String[] args) {
     String name;
     String address;

    Scanner sc = new Scanner(System.in);
    System.out.print("What is your name?");
    name = sc.nextLine();
    System.out.printf("Where do you live, %s ?",name);
    address = sc.nextLine();
    System.out.printf("Name: %s, Address: %s", name,address);
    sc.close();

    }
}

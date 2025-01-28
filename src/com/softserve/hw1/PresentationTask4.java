package com.softserve.hw1;
import java.util.Scanner;

public class PresentationTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How are you?");
        String answer = sc.nextLine();

        System.out.printf("You are %s", answer);

        sc.close();
    }
}

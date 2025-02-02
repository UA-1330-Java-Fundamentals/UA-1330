package com.softserve.edu.hw1.practicaltasks;

import java.util.Scanner;

public class QuestionAnswer {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = scanner.nextLine();
        System.out.print("You are " + answer);
    }
}

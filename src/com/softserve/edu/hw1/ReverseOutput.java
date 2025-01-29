package com.softserve.edu.hw1;

import java.util.Scanner;

public class ReverseOutput {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text:");
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        System.out.println("Output text:\n" + third );
        System.out.println(second);
        System.out.print(first);
    }
}

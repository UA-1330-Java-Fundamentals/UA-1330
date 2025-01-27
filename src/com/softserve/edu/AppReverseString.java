package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AppReverseString {
    public static void main(String[] args) throws IOException {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string = ");
        String str = sc.nextLine();
        System.out.println("Origin string = " + str);
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse string = " + reverse);
        */
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input text = ");
        String text = br.readLine();
        System.out.println("Origin text = " + text);
        //
        System.out.print("Input age = ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("age = " + (age + 1) );
        //
        System.out.print("Input double = ");
        double t = Double.parseDouble(br.readLine());
        System.out.println("t = " + (t + 1));
        */
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text = ");
        String text = sc.nextLine();
        System.out.println("Origin text = " + text);
        //
        System.out.print("Input age = ");
        int age = sc.nextInt();
        System.out.println("age = " + (age + 1) );
        //
        System.out.print("Input double = ");
        double t = sc.nextDouble();
        System.out.println("t = " + (t + 1));
        //
        sc.nextLine();
        System.out.print("Input text = ");
        text = sc.nextLine();
        System.out.println("new text = " + text);
    }
}
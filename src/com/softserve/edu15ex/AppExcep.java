package com.softserve.edu15ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AppExcep {

    //public static void main(String[] args) throws Exception {
    public static void main(String[] args) {
        System.out.print("type num = ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int k = Integer.parseInt(br.readLine()); //  which type of problem???
        //} catch (IOException e) {
        } catch (Exception e) {
            System.out.println("Error found, Continue executing, error message: " + e.getMessage());
            System.out.println("stack trace:");
            for (int i = 0; i < e.getStackTrace().length; i++) {
                System.out.println("\tat " + e.getStackTrace()[i]);
            }
        } finally {
            System.out.println("finally done");
        }
        //
        System.out.println("i / j :");
        int i = 4;
        int j = 0;
        //System.out.println("Result: " + (i / j));  //  which type of problem???
        System.out.println("Result: " + (1.0 * i / j));  //  which type of problem???
        //
        System.out.println("a[2] :");
        int[] a = new int[2]; // a[0], a[1]
        a[2] = 0;    //  which type of problem???
    }

}


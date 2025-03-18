package com.softserve.exceptions.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumber {

    public static void readNumber(int start, int end) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number in range between 1 and 100:");
        try {
            int number = Integer.parseInt(br.readLine());
            if (number > start && number < end) {
                System.out.println("The entered number " + number +
                        " is in range between start:" + start + " and end: " + end);
            } else {
                throw new MyCustomException("Entered number out or start and end range");
            }
        } catch (MyCustomException e) {
            System.out.println("Entered number out or start and end range");
        } catch (NumberFormatException e) {
            System.out.println("Non-numeric value or incorrect number was entered");
        }
    }
    /*
    public static void readNumber(int start, int end) throws IOException {
        if (start >= end) {
            throw new IllegalArgumentException("Start must be less than end");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.printf("Enter a number in range between %d and %d: ", start, end);
                try {
                    int number = Integer.parseInt(br.readLine().trim());
                    if (number > start && number < end) {
                        System.out.printf("The entered number %d is in range between start:%d and end:%d%n",
                                number, start, end);
                        break;
                    } else {
                        throw new MyCustomException(
                                "Number " + number + " is out of range (" + start + " to " + end + ")");
                    }
                } catch (MyCustomException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Error: Non-numeric value or incorrect number was entered");
                }
            }
        }
    }
    */
}


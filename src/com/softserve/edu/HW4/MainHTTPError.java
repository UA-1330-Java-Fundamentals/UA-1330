package com.softserve.edu.HW4;

import java.util.Scanner;

public class MainHTTPError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP error code you wish know:");
        int enteredCode = scanner.nextInt();

        String errorName = HTTPError.ClientErrors.getErrorByCode(enteredCode);

        if (errorName == null) {
            System.out.println(enteredCode + " is unknown or undescribed in this mothod error");
        } else {
            System.out.println(enteredCode + " is an error: " + errorName);
        }

    }
}



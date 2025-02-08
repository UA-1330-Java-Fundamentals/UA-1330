package com.softserve.edu.homework4_Condition_Statement;

import java.util.Scanner;

/*
Write a program that prompts the user to input a number representing an HTTP error (e.g., 400, 401, 402, etc.).
The program should use an enum called HTTPError to map the input number to the corresponding name of the error
and output it.
 */

public class HttpStatusCodesInformator {
    enum HTTPError {
        BAD_REQUEST("400"),
        UNAUTHORIZED("401"),
        PAYMENT_REQUIRED("402"),
        FORBIDDEN("403"),
        NOT_FOUND("404"),
        METHOD_NOT_ALLOWED("405");

        private String code;

        HTTPError(String code) {
            this.code = code;
        }
    }

    public static void getInfoAboutError() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, set error code that you get : ");

        switch (scan.nextLine()) {
            case "400" -> {
                System.out.println(HTTPError.BAD_REQUEST.name());
            }
            case "401" -> {
                System.out.println(HTTPError.UNAUTHORIZED.name());
            }
            case "402" -> {
                System.out.println(HTTPError.PAYMENT_REQUIRED.name());
            }
            case "403" -> {
                System.out.println(HTTPError.FORBIDDEN.name());
            }
            case "404" -> {
                System.out.println(HTTPError.NOT_FOUND.name());
            }
            case "405" -> {
                System.out.println(HTTPError.METHOD_NOT_ALLOWED.name());
            }
            default -> System.out.println("Unknown status code");
        }

    }

    public static void main(String[] args) {
        getInfoAboutError();
    }
}

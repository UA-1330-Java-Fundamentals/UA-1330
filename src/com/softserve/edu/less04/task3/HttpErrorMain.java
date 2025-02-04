package com.softserve.edu.less04.task3;

import java.util.Scanner;
//3
public class HttpErrorMain {
    public static void main(String[] args) {
        HttpError httpError;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the following error: ");
        int error = scanner.nextInt();
        httpError = switch (error) {
            case 400 -> HttpError.BAD_REQUEST;
            case 401 -> HttpError.UNAUTHORIZED;
            case 402 -> HttpError.PAYMENT_REQUIRED;
            default -> HttpError.BAD_REQUEST;
        };
        System.out.print("The name of error is " + httpError);
        scanner.close();
    }
}

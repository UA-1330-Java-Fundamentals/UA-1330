package com.softserve.edu.hw4;

import java.util.Scanner;

import com.softserve.edu.hw4.hw3HTTPerrors.HTTPError;

public class hw3HTTPerrors {
    public enum HTTPError {
        CONTINUE,
        SWITCHING_PROTOCOLS,
        OK,
        CREATED,
        ACCEPTED,
        NO_CONTENT,
        MULTIPLE_CHOICES,
        BAD_REQUEST,
        UNAUTHORIZED,
        FORBIDDEN,
        NOT_FOUND,
        INTERNAL_SERVER_ERROR,
        BAD_GATEWAY
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter HTTP code: ");
        int http = sc.nextInt();
        HTTPError code;

        switch (http) {
            case 100:
                code = HTTPError.CONTINUE;
                System.out.println("100 " + HTTPError.CONTINUE);
                break;
            case 101:
                code = HTTPError.SWITCHING_PROTOCOLS;
                System.out.println("101 " + HTTPError.SWITCHING_PROTOCOLS);
                break;
            case 200:
                code = HTTPError.OK;
                System.out.println("200 " + HTTPError.OK);
                break;
            case 201:
                code = HTTPError.CREATED;
                System.out.println("201 " + HTTPError.CREATED);
                break;
            case 202:
                code = HTTPError.ACCEPTED;
                System.out.println("202 " + HTTPError.ACCEPTED);
                break;
            case 204:
                code = HTTPError.NO_CONTENT;
                System.out.println("204 " + HTTPError.NO_CONTENT);
                break;
            case 300:
                code = HTTPError.MULTIPLE_CHOICES;
                System.out.println("300 " + HTTPError.MULTIPLE_CHOICES);
                break;
            case 400:
                code = HTTPError.BAD_REQUEST;
                System.out.println("400 " + HTTPError.BAD_REQUEST);
                break;
            case 401:
                code = HTTPError.UNAUTHORIZED;
                System.out.println("401 " + HTTPError.UNAUTHORIZED);
                break;
            case 403:
                code = HTTPError.FORBIDDEN;
                System.out.println("403 " + HTTPError.FORBIDDEN);
                break;
            case 404:
                code = HTTPError.NOT_FOUND;
                System.out.println("404 " + HTTPError.NOT_FOUND);
                break;
            case 500:
                code = HTTPError.INTERNAL_SERVER_ERROR;
                System.out.println("500 " + HTTPError.INTERNAL_SERVER_ERROR);
                break;
            case 502:
                code = HTTPError.BAD_GATEWAY;
                System.out.println("502 " + HTTPError.BAD_GATEWAY);
                break;
            default:
                code = null;
                System.out.println("Enter different code");
                break;
        }
        sc.close();
    }
}

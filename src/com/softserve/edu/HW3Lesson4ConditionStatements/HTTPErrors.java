package com.softserve.edu.HW3Lesson4ConditionStatements;//package name should be in lowercase

public class HTTPErrors {
    public static String nameOfHTTPErrors(int n) {
        return switch (n) {
            case 400 -> HTTPError.BAD_REQUEST.toString();
            case 401 -> HTTPError.UNAUTHORIZED.toString();
            case 402 -> HTTPError.PAYMENT_REQUIRED.toString();
            case 403 -> HTTPError.FORBIDDEN.toString();
            case 404 -> HTTPError.NOT_FOUND.toString();
            case 500 -> HTTPError.INTERNAL_SERVER_ERROR.toString();
            case 501 -> HTTPError.NOT_IMPLEMENTED.toString();
            case 502 -> HTTPError.BAD_GATEWAY.toString();
            case 503 -> HTTPError.SERVICE_UNAVAILABLE.toString();
            default -> "Unknown error code"; // Якщо код не знайдено
        };
    }

    enum HTTPError {
        BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, INTERNAL_SERVER_ERROR, NOT_IMPLEMENTED, BAD_GATEWAY, SERVICE_UNAVAILABLE
    }


}
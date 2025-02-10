package com.softserve.edu.HW3Lesson4ConditionStatements;

public class HTTPErrors {
    public static String nameOfHTTPErrors(int n) {
        switch (n) {
            case 400:
                return HTTPError.BAD_REQUEST.toString();
            case 401:
                return HTTPError.UNAUTHORIZED.toString();
            case 402:
                return HTTPError.PAYMENT_REQUIRED.toString();
            case 403:
                return HTTPError.FORBIDDEN.toString();
            case 404:
                return HTTPError.NOT_FOUND.toString();
            case 500:
                return HTTPError.INTERNAL_SERVER_ERROR.toString();
            case 501:
                return HTTPError.NOT_IMPLEMENTED.toString();
            case 502:
                return HTTPError.BAD_GATEWAY.toString();
            case 503:
                return HTTPError.SERVICE_UNAVAILABLE.toString();
            default:
                return "Unknown error code"; // Якщо код не знайдено
        }
    }

    enum HTTPError {
        BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, INTERNAL_SERVER_ERROR, NOT_IMPLEMENTED, BAD_GATEWAY, SERVICE_UNAVAILABLE
    }


}
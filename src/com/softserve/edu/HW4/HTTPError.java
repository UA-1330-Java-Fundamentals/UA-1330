package com.softserve.edu.HW4;

public class HTTPError {
    public enum ClientErrors {
        BAD_REQUEST(400, "BAD_REQUEST"),
        UNAUTHORIZED(401, "UNAUTHORIZED"),
        PAYMENT_REQUIRED(402, "PAYMENT_REQUIRED"),
        FORBIDDEN(403, "FORBIDDEN"),
        NOT_FOUND(404, "NOT_FOUND"),
        METHOD_NOT_ALLOWED(405, "METHOD_NOT_ALLOWED"),
        NOT_ACCEPTABLE(406, "NOT_ACCEPTABLE"),
        PROXY_AUTHENTICATION_REQUIRED(407, "PROXY_AUTHENTICATION_REQUIRED"),
        REQUEST_TIMEOUT(408, "REQUEST_TIMEOUT"),
        CONFLICT(409, "CONFLICT"),
        GONE(410, "CONFLICT");

        private final int code;
        private final String errorName;


        ClientErrors(int code, String errorName) {
            this.code = code;
            this.errorName = errorName;
        }

        public int getCode() {
            return code;
        }

        public String getErrorName() {
            return errorName;
        }

        public static String getErrorByCode(int code) {
            for (ClientErrors error : ClientErrors.values()) {
                if (error.getCode() == code) {
                    return error.getErrorName();
                }
            }
            return null;
        }
    }
}


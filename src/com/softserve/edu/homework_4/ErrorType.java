package com.softserve.edu.homework_4;

public class ErrorType {
    enum HTTPError {
        BAD_REQUEST,
        UNAUTHORIZED,
        PAYMENT_REQUIRED,
        FORBIDDEN,
        NOT_FOUND,
        METHOD_NOT_ALLOWED,
        NOT_ACCEPTABLE,
        PROXY_AUTHENTICATION_REQUIRED,
        REQUEST_TIMEOUT,
        CONFLICT,
        GONE,
        LENGTH_REQUIRED,
        PRECONDITION_FAILED,
        CONTENT_TOO_LARGE,
        URI_TOO_LONG,
        UNSUPPORTED_MEDIA_TYPE,
        RANGE_NOT_SATISFIABLE,
        EXPECTATION_FAILED,
        I_AM_A_TEAPOT,
        MISDIRECTED_REQUEST,
        UNPROCESSABLE_CONTENT,
        LOCKED,
        FAILED_DEPENDENCY,
        TOO_EARLY,
        UPGRADE_REQUIRED,
        PRECONDITION_REQUIRED,
        TOO_MANY_REQUESTS,
        REQUEST_HEADER_FIELDS_TOO_LARGE,
        UNAVAILABLE_FOR_LEGAL_REASONS,
        INTERNAL_SERVER_ERROR,
        NOT_IMPLEMENTED,
        BAD_GATEWAY,
        SERVICE_UNAVAILABLE,
        GATEWAY_TIMEOUT,
        HTTP_VERSION_NOT_SUPPORTED,
        VARIANT_ALSO_NEGOTIATES,
        INSUFFICIENT_STORAGE,
        LOOP_DETECTED,
        NOT_EXTENDED,
        NETWORK_AUTHENTICATION_REQUIRED;

        public static String returnHTTPError(int code) {
            return switch (code) {
                case 400 -> BAD_REQUEST.toString();
                case 401 -> UNAUTHORIZED.toString();
                case 402 -> PAYMENT_REQUIRED.toString();
                case 403 -> FORBIDDEN.toString();
                case 404 -> NOT_FOUND.toString();
                case 405 -> METHOD_NOT_ALLOWED.toString();
                case 406 -> NOT_ACCEPTABLE.toString();
                case 407 -> PROXY_AUTHENTICATION_REQUIRED.toString();
                case 408 -> REQUEST_TIMEOUT.toString();
                case 409 -> CONFLICT.toString();
                case 410 -> GONE.toString();
                case 411 -> LENGTH_REQUIRED.toString();
                case 412 -> PRECONDITION_FAILED.toString();
                case 413 -> CONTENT_TOO_LARGE.toString();
                case 414 -> URI_TOO_LONG.toString();
                case 415 -> UNSUPPORTED_MEDIA_TYPE.toString();
                case 416 -> RANGE_NOT_SATISFIABLE.toString();
                case 417 -> EXPECTATION_FAILED.toString();
                case 418 -> I_AM_A_TEAPOT.toString();
                case 421 -> MISDIRECTED_REQUEST.toString();
                case 422 -> UNPROCESSABLE_CONTENT.toString();
                case 423 -> LOCKED.toString();
                case 424 -> FAILED_DEPENDENCY.toString();
                case 425 -> TOO_EARLY.toString();
                case 426 -> UPGRADE_REQUIRED.toString();
                case 428 -> PRECONDITION_REQUIRED.toString();
                case 429 -> TOO_MANY_REQUESTS.toString();
                case 431 -> REQUEST_HEADER_FIELDS_TOO_LARGE.toString();
                case 451 -> UNAVAILABLE_FOR_LEGAL_REASONS.toString();
                case 500 -> INTERNAL_SERVER_ERROR.toString();
                case 501 -> NOT_IMPLEMENTED.toString();
                case 502 -> BAD_GATEWAY.toString();
                case 503 -> SERVICE_UNAVAILABLE.toString();
                case 504 -> GATEWAY_TIMEOUT.toString();
                case 505 -> HTTP_VERSION_NOT_SUPPORTED.toString();
                case 506 -> VARIANT_ALSO_NEGOTIATES.toString();
                case 507 -> INSUFFICIENT_STORAGE.toString();
                case 508 -> LOOP_DETECTED.toString();
                case 510 -> NOT_EXTENDED.toString();
                case 511 -> NETWORK_AUTHENTICATION_REQUIRED.toString();
                default -> "Unknown error code";
            };
        }
    }
}

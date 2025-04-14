package com.softserve.conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


enum HTTPError {//Naming for constants should be in uppercase and underscore
    BAD_REQUEST(400, "Bad request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOTFOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    BAD_GATEWAY(502, "Bad Gateway"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    GATEWAY_TIMEOUT(504, "Gateway Timeout"),
    HTTP_NOT_SUPPORTED(505, "HTTP Version Not Supported");

    private int errCode;
    private String errDesc;


    private HTTPError(int errCode, String errDesc) {
        this.errCode = errCode;
        this.errDesc = errDesc;
    }

    public int getErrCode() {
        return errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }

    @Override
    public String toString() {
        return "You received next error: " +
                "Error Code: " + errCode +
                ", Error Description: " + errDesc + '\'';
    }

    static HTTPError getByCode(int code) {
        return switch (code) {
            case 400 -> BAD_REQUEST;
            case 401 -> UNAUTHORIZED;
            case 402 -> PAYMENT_REQUIRED;
            case 403 -> FORBIDDEN;
            case 404 -> NOTFOUND;
            case 500 -> INTERNAL_SERVER_ERROR;
            case 501 -> NOT_IMPLEMENTED;
            case 502 -> BAD_GATEWAY;
            case 503 -> SERVICE_UNAVAILABLE;
            case 504 -> GATEWAY_TIMEOUT;
            case 505 -> HTTP_NOT_SUPPORTED;
            default -> throw new IllegalArgumentException("The error with such code number "
                    + code + " does not exist");
        };
    }
}
public class ErrorApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the error code you've received: ");

        int enteredVal = Integer.parseInt(br.readLine());

        HTTPError errorReceived;
        if (enteredVal > 400 && enteredVal < 599) {
            errorReceived = HTTPError.getByCode(enteredVal);
            System.out.println("You got error " + errorReceived.getErrCode() + " with text "
                    + errorReceived.getErrDesc());
        } else System.out.println("The code you've received does not belong to an error");
    }
}

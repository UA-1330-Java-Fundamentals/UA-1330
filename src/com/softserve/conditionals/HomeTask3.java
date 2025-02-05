package com.softserve.conditionals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


enum HTTPError{
    BADREQUEST(400,"Bad request"),
    UNAUTHORIZED(401,"Unauthorized"),
    PAYMENREQUIRED(402,"Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOTFOUND(404, "Not Found"),
    INTERNALSERVERERROR(500, "Internal Server Error"),
    NOTIMPLEMENTED(501 , "Not Implemented" ),
    BADGATEWAY(502 , "Bad Gateway"),
    SERVICEUNAVAILBLE(503,"Service Unavailable"),
    GATEWAYTIMEOUT(504, "Gateway Timeout"),
    HTTPNOTSUPPORTED(505, "HTTP Version Not Supported");

    private int errCode;
    private String errDesc;


    private HTTPError(int errCode,String errDesc){
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

    static HTTPError getByCode(int code){
            return switch(code){
                case 400 -> BADREQUEST;
                case 401 -> UNAUTHORIZED;
                case 402 -> PAYMENREQUIRED;
                case 403 -> FORBIDDEN;
                case 404 -> NOTFOUND;
                case 500 -> INTERNALSERVERERROR;
                case 501 -> NOTIMPLEMENTED;
                case 502 -> BADGATEWAY;
                case 503 -> SERVICEUNAVAILBLE;
                case 504 -> GATEWAYTIMEOUT;
                case 505 -> HTTPNOTSUPPORTED;
                default -> throw new IllegalArgumentException("The error with such code number "
                                      + code + " does not exist");
            };
        }

}

public class HomeTask3 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the error code you've received");

        int enteredVal = Integer.parseInt(br.readLine());

        HTTPError errorReceived;
        if (enteredVal > 400 && enteredVal < 599){
            errorReceived = HTTPError.getByCode(enteredVal);
            System.out.println("You got error " + errorReceived.getErrCode() + " with text "
                    + errorReceived.getErrDesc() );
        }
         else System.out.println("The code you've received does not belong to an error");
    }
}

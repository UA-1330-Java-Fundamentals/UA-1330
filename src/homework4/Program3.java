package homework4;

import java.util.Scanner;


     enum HTTPError {
       BAD_REQUEST(400, "Bad Request"),
       UNAUTHORIZED(401, "Unauthorized"),
       PAYMENT_REQUIRED(402, "Payment Required"),
       FORBIDDEN(403, "Forbidden"),
       NOT_FOUND(404, "Not Found"),
       METHOD_NOT_ALLOWED(405, "Method Not Allowed");


       private final int code;
       private final String description;

       HTTPError(int code, String description) {
           this.code = code;
           this.description = description;
       }

       public int getCode() {
           return code;
       }

       public String getDescription() {
           return description;
       }

       public static HTTPError getByCode(int code) {
           for (HTTPError error : HTTPError.values()) {
               if (error.getCode() == code) {
                   return error;
               }
           }
           return null;
       }
   }



   public class Program3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the error number: ");
        int errorCode = scanner.nextInt();

        HTTPError error  = HTTPError.getByCode(errorCode);

        if (error != null) {
            System.out.println("HTTP Error " + error.getCode() + ": " + error.getDescription());
        } else {
            System.out.println("Error code not recognized.");
        }
    }
}

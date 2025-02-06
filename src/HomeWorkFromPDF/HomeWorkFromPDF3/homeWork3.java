/*
3. Write a program that prompts the user to input a number representing an HTTP error (e.g., 400, 401, 402, etc.). The
program should use an enum called HTTPError to map the input number to the corresponding name of the error and
output it.
*/

package HomeWorkFromPDF.HomeWorkFromPDF3;

import java.util.Scanner;

enum HTTPError {
    OK, NOTFOUND, INTERNALSERVERERROR, BADREQUEST
}

class homeWork3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HTTPError httpError;
        System.out.println("Введіть значення помилки: ");
        int HTTPErrorByUser = sc.nextInt();

        httpError = switch (HTTPErrorByUser){
            case 200 -> HTTPError.OK;
            case 404 -> HTTPError.NOTFOUND;
            case 500 -> HTTPError.INTERNALSERVERERROR;
            case 400 -> HTTPError.BADREQUEST;
            default -> null;
        };
        System.out.print(httpError);
    }
}

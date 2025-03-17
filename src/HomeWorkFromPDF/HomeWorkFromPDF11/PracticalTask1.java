/*
Input two String variables. Verify if the first variable is a substring of the second variable. For
instance, if you entered "SoftServe" and "SoftServe Academy", the expected result should be
true.
*/

package HomeWorkFromPDF.HomeWorkFromPDF11;

import java.util.Scanner;

public class PracticalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str2.contains(str1)){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        sc.close();
    }
}

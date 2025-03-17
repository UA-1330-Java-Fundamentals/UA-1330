/*
Input the last name, first name, and middle name as String variables on the console. The
following outputs will be displayed on the console:
• Last name and initials
• First name
• First name, middle name, and last name.
*/

package HomeWorkFromPDF.HomeWorkFromPDF11;

import java.util.Scanner;

public class PracticalTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scanedString = sc.nextLine();

        String[] splitedString = scanedString.split(" ");

        String lastName = splitedString[0];
        String firstName = splitedString[1];
        String middleName = splitedString[2];

        System.out.println("Last name and initials: " + lastName + " " + firstName.charAt(0) + ". " + middleName.charAt(0) + ".");
        System.out.println("First name: " + firstName);
        System.out.println("First name, middle name, and last name: " + firstName + " " + middleName + " " + lastName);

        sc.close();
    }
}

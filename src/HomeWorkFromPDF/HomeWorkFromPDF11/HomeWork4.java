/*
Create a console application that validates user input for their first and last name, ensuring that
they only contain English letters, spaces, and hyphens. If the input data is incorrect, prompt the user
to re-enter the data. Upon successful entry of the user's first and last names, generate a random
greeting message that includes the user's name.
*/

package HomeWorkFromPDF.HomeWorkFromPDF11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = "";
        String lastName = "";

        String regex = "^[a-zA-Z\\s-]+$";

        boolean validInput = false;
        while (!validInput) {
            System.out.println("Введіть своє ім'я: ");
            firstName = sc.nextLine();
            Pattern pt = Pattern.compile(regex);
            Matcher matcherFirstName = pt.matcher(firstName);

            if (matcherFirstName.matches()) {
                validInput = true;
            } else {
                System.out.println("Невірний формат імені. Спробуйте ще раз.");
            }
        }

        validInput = false;
        while (!validInput) {
            System.out.println("Введіть своє прізвище: ");
            lastName = sc.nextLine();
            Pattern pt = Pattern.compile(regex);
            Matcher matcherLastName = pt.matcher(lastName);

            if (matcherLastName.matches()) {
                validInput = true;
            } else {
                System.out.println("Невірний формат прізвища. Спробуйте ще раз.");
            }
        }

        String greeting = "Вітаю";
        System.out.printf("%s, %s %s!%n", greeting, firstName, lastName);

    }
}

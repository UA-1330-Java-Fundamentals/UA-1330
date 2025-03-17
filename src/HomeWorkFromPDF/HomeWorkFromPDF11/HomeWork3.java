/*
The task requires implementation of a pattern to match US currency format, which includes a
dollar sign ($) followed by any number of digits, a dot, and two digits after the dot. The next step
is to input a text containing several instances of US currency format via the console. Finally,
display all the occurrences of US currency format on the console screen.
*/

package HomeWorkFromPDF.HomeWorkFromPDF11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть суму: ");

        String value = sc.nextLine();
        String regex = "\\$\\d+(\\.\\d{2})?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        sc.close();
    }
}

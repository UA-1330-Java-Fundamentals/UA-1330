package homework11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
The task requires implementation of a pattern to match US currency format, which includes a
dollar sign ($) followed by any number of digits, a dot, and two digits after the dot. The next step
is to input a text containing several instances of US currency format via the console. Finally,
display all the occurrences of US currency format on the console screen.

 */
public class ImplementationOfPattern {
    // (\$(\d*)\\.\d\d)

    public static void main(String[] args) {
        String pattern = "\\$\\d+\\.\\d\\d";
        var scan = new Scanner(System.in);
        System.out.println("Enter text containing several instances of US currency format: ");
        var text = scan.nextLine();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }

        scan.close();
    }
}
/*
If you enter text without any matches, the program simply exits without a message. 
You could add a message like "No matches found."
Although the program is simple and fully meets the requirements, 
it's better practice to extract logic into methods rather than implementing everything directly in main. 
This approach makes the program more flexible and easier to test.
*/

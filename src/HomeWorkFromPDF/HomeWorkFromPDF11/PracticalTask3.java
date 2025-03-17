/*
The task requires validation of usernames using regular expressions. The username should be
between 3 to 15 characters and can contain only Latin alphabet, numbers, and underscores. To
accomplish this, input five different usernames in the main method and output a message to the
console indicating whether each of the entered names is valid or not.
*/

package HomeWorkFromPDF.HomeWorkFromPDF11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalTask3 {
    public static void main(String[] args) {
        String pattern = "^[a-zA-Z0-9_]{3,15}$";

        String[] names = {"Adam", "Адам", "Bob_123", "abc", "1234567890123456", "ab"};

        Pattern p = Pattern.compile(pattern);
        for( String name : names){
            Matcher m = p.matcher(name);
            if (m.matches()){
                System.out.println("Пароль є коректним: " + name);
            }
        }

    }
}

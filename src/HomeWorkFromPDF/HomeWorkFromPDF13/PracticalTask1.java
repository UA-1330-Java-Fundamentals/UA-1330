/*
Show which today is a day of a week
*/

package HomeWorkFromPDF.HomeWorkFromPDF13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.util.Locale;

public class PracticalTask1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", new Locale("uk"));

        System.out.println("Сьогоднв такий день тижня: " + localDate.format( formatter));
    }
}

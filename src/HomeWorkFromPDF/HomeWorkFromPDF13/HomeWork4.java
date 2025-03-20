/*
Create variable LocalDate birthday and set to that variable date your birthday.
Create method that take as a parameter object LocalDate and pring the day of the week
and what was the day of the week after 6 months and what was the day of the week after
12 months.
*/

package HomeWorkFromPDF.HomeWorkFromPDF13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HomeWork4 {
    public static void localDateOperation(LocalDate localDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", new Locale("uk"));

        System.out.println("День тижня коли було ваше дн: " + localDate.format(formatter));

        System.out.println("День тижня коли було ваше дн 6 місяців по тому: " + localDate.plusMonths(6).format(formatter));
        System.out.println("День тижня коли було ваше дн 12 місяців по тому: " + localDate.plusMonths(12).format(formatter));
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.parse("2006-03-18");

        localDateOperation(birthday);
    }

}

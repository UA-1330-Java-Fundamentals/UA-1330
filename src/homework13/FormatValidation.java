package homework13;
/*
Create method to validate date according to format "mm.dd.yy"
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FormatValidation {

    static boolean isValidDate(String dateString){
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM.dd.yy");

        LocalDate date;
        try{
            date = LocalDate.parse(dateString, dtf);
        } catch (DateTimeParseException e) {
            return false;
        }
        return dateString.equals(date.format(dtf));


    }

    public static void main(String[] args) {
        System.out.println(isValidDate("02.29.24"));
        System.out.println(isValidDate("29.02.24"));
        System.out.println(isValidDate("02.31.24"));
        System.out.println(isValidDate("Feb.29.24"));
    }
}

/*
Create method to validate date according to format "mm.dd.yy"
*/

package HomeWorkFromPDF.HomeWorkFromPDF13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HomeWork2 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");

        System.out.println(ld.format(formatter));
    }
}

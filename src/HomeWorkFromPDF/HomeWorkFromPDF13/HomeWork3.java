/*
Create method which take year as a parameter and return true if year is a leap
*/

package HomeWorkFromPDF.HomeWorkFromPDF13;

import java.time.LocalDate;

public class HomeWork3 {
    public static void checkLeapYear(LocalDate ld) {
        if(ld.isLeapYear()){
            System.out.println("Ого " + ld + " є високосним!!!");
        } else {
            System.out.println("Йой " + ld + " не є високосним!!!");
        }
    }
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        LocalDate localDate1 = LocalDate.parse("2020-11-27");

        checkLeapYear(localDate);
        checkLeapYear(localDate1);
    }
}

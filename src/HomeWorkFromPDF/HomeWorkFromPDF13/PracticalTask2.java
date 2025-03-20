/*
Show a date of first Monday for current month
*/

package HomeWorkFromPDF.HomeWorkFromPDF13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class PracticalTask2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(localDate.with(firstMonInMonth));
    }
}

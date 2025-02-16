package ConditionalStataments_HW;

public class YearDaysCalculator {
    public static int calculateDaysInYear(int year)
    {
        if(year%400==0)
        {
            return 366;
        }
        else if (year%4==0 && year%100!=0)
        {
            return 365;
        }
        else
        {
            return 366;
        }


    }
}

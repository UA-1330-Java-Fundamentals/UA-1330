import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator {
    public static boolean isValidDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yy");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidDate("12-31-12"));
        System.out.println(isValidDate("12.31.12"));
        System.out.println(isValidDate("99.99.99"));
    }
}

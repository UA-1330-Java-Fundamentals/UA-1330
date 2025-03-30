import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Birthday {
    LocalDate birthday;

    public Birthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static String dayOfTheWeeks (LocalDate birthday) {
        DayOfWeek dayweek = birthday.getDayOfWeek();
        System.out.println(birthday);
        System.out.println("Day of the week to your birthday: " + dayweek );
        LocalDate past6 = birthday.plusMonths(6);
        DayOfWeek dayweek6month = past6.getDayOfWeek();
        System.out.println(past6);
        System.out.println("Day of the week after 6 months to your birthday: " + dayweek6month );
        LocalDate past12 = birthday.plusMonths(12);
        DayOfWeek dayweek12month = past12.getDayOfWeek();
        System.out.println(past12);
        System.out.println("Day of the week after 12 months to your birthday: " + dayweek12month );
        return "";
    }

    public static void main(String[] args) throws ParseException {
        Birthday myBirthday = new Birthday(LocalDate.of(1998, 9, 9));
        myBirthday.setBirthday(LocalDate.of(1996, 10, 11));
        //System.out.println(myBirthday.getBirthday());
        System.out.println(dayOfTheWeeks(myBirthday.getBirthday()));
        System.out.println(dayOfTheWeeks(LocalDate.of(2023, 12, 12)));
    }
}

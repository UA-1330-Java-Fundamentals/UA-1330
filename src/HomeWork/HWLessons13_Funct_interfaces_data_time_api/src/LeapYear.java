import java.time.Year;
import java.util.Scanner;

public class LeapYear {


    public static boolean isValidYear (int year) {
        boolean isLeap = Year.isLeap(year);
        if (isLeap == true) {
            System.out.println("This year is leap " + year);
            return true;
        } else {
            System.out.println("This year is not leap " + year);
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        isValidYear(year);
        sc.close();
    }
}

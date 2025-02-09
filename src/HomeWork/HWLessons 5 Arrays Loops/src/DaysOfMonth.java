import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of month? ");
        int monthNumber = sc.nextInt();

        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Wrong number");
        } else {
            int days = calculateNumbersOfDays(monthDays, monthNumber);
            System.out.println("This month have " + days + " days");
        }
        sc.close();
    }

    public static int calculateNumbersOfDays(int monthDays[], int monthNumber) {
        return monthDays[monthNumber - 1];
    }
}



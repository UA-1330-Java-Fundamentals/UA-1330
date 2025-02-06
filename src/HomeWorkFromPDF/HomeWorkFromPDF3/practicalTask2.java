/*
Enter the number of the day of the week from the console. Output the name of the day of the week in two languages.
Output the result to the console.
*/

package HomeWorkFromPDF.HomeWorkFromPDF3;

import java.util.Scanner;

public class practicalTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Введіть номер дня тижня: ");
            int numberOfTheDay = sc.nextInt();

            switch (numberOfTheDay) {
                case 1:
                    System.out.println("Понеділок - Monday");
                    break;
                case 2:
                    System.out.println("Вівторок - Tuesday");
                    break;
                case 3:
                    System.out.println("Середа - Wednesday");
                    break;
                case 4:
                    System.out.println("Четвер - Thursday");
                    break;
                case 5:
                    System.out.println("Пятниця - Friday");
                    break;
                case 6:
                    System.out.println("Субота - Saturday");
                    break;
                case 7:
                    System.out.println("Неділя - Sunday");
                    break;
                default:
                    System.out.println("Це не день тижня(");
            }
        }
    }
}

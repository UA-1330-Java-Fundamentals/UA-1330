/*Write a program that reads three strings and outputs them
in the reverse order, each on a new line.*/

package HomeWorkFromPDF.HomeWorkFromPDF1;

import java.util.Scanner;

public class HomeWorkFromPDF1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Заповніть, будь ласка, перший стрінг: ");
        String first = sc.nextLine();

        System.out.println("Заповніть, будь ласка, другий стрінг: ");
        String second = sc.nextLine();

        System.out.println("Заповніть, будь ласка, третій стрінг: ");
        String third = sc.nextLine();

        System.out.println("Третій стрінг, котрий тепер перший: " + third);
        System.out.println("Другий стрінг, котрий тепер другий: " + second);
        System.out.println("Перший стрінг, котрий тепер третій: " + first);

        /*Або, щоб не хард кодити, можна створити масив, в який при кожному введені ми на початок добавляємо елементи, а після усього ми будемо циклом читати усі елементи, але поки це дуже складно, на пайтоні легше було б), тож лишаю так!*/

        sc.close();
    }
}


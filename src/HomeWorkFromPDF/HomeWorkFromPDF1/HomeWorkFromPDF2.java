/*Write a program that takes three numbers from console as input
to calculate and print output the average of the numbers*/

package HomeWorkFromPDF.HomeWorkFromPDF1;

import java.util.Scanner;

public class HomeWorkFromPDF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перше число: ");
        int firstNumber = sc.nextInt();

        System.out.println("Введіть друге число: ");
        int secondNumber = sc.nextInt();

        System.out.println("Введіть третє число: ");
        int thirdNumber = sc.nextInt();

        int commonNumber = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Середнє значення з трьох що ввів коистувач є: " + commonNumber);

        sc.close();
    }
}

